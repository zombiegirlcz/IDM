package androidx.compose.foundation.interaction;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/foundation/interaction/FocusInteraction$Unfocus", "", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "focus", "<init>", "(Landroidx/compose/foundation/interaction/FocusInteraction$Focus;)V", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "getFocus", "()Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FocusInteraction$Unfocus implements Interaction {

    @NotNull
    private final FocusInteraction$Focus focus;

    public FocusInteraction$Unfocus(@NotNull FocusInteraction$Focus focusInteraction$Focus) {
        this.focus = focusInteraction$Focus;
    }

    @NotNull
    public final FocusInteraction$Focus getFocus() {
        return this.focus;
    }
}
