package ani.saikou.settings

import java.io.Serializable

data class CurrentReaderSettings(
    var direction: Directions = Directions.TOP_TO_BOTTOM,
    var layout: Layouts = Layouts.CONTINUOUS,
    var padding: Boolean = true,
    var keepScreenOn: Boolean = false,
) : Serializable {

    enum class Directions {
        TOP_TO_BOTTOM, RIGHT_TO_LEFT, BOTTOM_TO_TOP, LEFT_TO_RIGHT;

        override fun toString(): String {
            return when (super.ordinal) {
                TOP_TO_BOTTOM.ordinal -> "Top to Bottom"
                RIGHT_TO_LEFT.ordinal -> "Right to Left"
                BOTTOM_TO_TOP.ordinal -> "Bottom to Top"
                LEFT_TO_RIGHT.ordinal -> "Left to Right"
                else                  -> "Wha"
            }
        }

        companion object {
            operator fun get(value: Int) = values().firstOrNull { it.ordinal == value }
        }
    }

    enum class Layouts {
        PAGED, CONTINUOUS_PAGED, CONTINUOUS;

        override fun toString(): String {
            return when (super.ordinal) {
                PAGED.ordinal            -> "Paged"
                CONTINUOUS_PAGED.ordinal -> "Continuous Paged"
                CONTINUOUS.ordinal       -> "Continuous"
                else                     -> "Wha"
            }
        }

        companion object {
            operator fun get(value: Int) = values().firstOrNull { it.ordinal == value }
        }
    }
}

