package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007J-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0010\u0010\u000eJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0011\u0010\u000eJ-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u0012\u0010\u000eJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/material/TextFieldColors;", "", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "textColor", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "backgroundColor", "placeholderColor", "error", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "labelColor", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "isError", "leadingIconColor", "trailingIconColor", "indicatorColor", "cursorColor", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TextFieldColors {
    @NotNull
    State<Color> backgroundColor(boolean z, Composer composer, int i);

    @NotNull
    State<Color> cursorColor(boolean z, Composer composer, int i);

    @NotNull
    State<Color> indicatorColor(boolean z, boolean z3, @NotNull InteractionSource interactionSource, Composer composer, int i);

    @NotNull
    State<Color> labelColor(boolean z, boolean z3, @NotNull InteractionSource interactionSource, Composer composer, int i);

    @NotNull
    State<Color> leadingIconColor(boolean z, boolean z3, @NotNull InteractionSource interactionSource, Composer composer, int i);

    @NotNull
    State<Color> placeholderColor(boolean z, Composer composer, int i);

    @NotNull
    State<Color> textColor(boolean z, Composer composer, int i);

    @NotNull
    State<Color> trailingIconColor(boolean z, boolean z3, @NotNull InteractionSource interactionSource, Composer composer, int i);
}
