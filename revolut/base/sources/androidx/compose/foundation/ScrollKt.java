package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import e1.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001aQ\u0010\u0013\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "initial", "Landroidx/compose/foundation/ScrollState;", "rememberScrollState", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/ui/Modifier;", "state", "", "enabled", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "reverseScrolling", "verticalScroll", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;Z)Landroidx/compose/ui/Modifier;", "isScrollable", "isVertical", "useLocalOverscrollFactory", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "scroll", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZZZLandroidx/compose/foundation/OverscrollEffect;)Landroidx/compose/ui/Modifier;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ScrollKt {
    @NotNull
    public static final ScrollState rememberScrollState(int i, Composer composer, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464256199, i2, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:70)");
        }
        Object[] objArr = new Object[0];
        Saver<ScrollState, ?> saver = ScrollState.INSTANCE.getSaver();
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(i)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new i(i, 0);
            composer.updateRememberedValue(objRememberedValue);
        }
        ScrollState scrollState = (ScrollState) RememberSaveableKt.rememberSaveable(objArr, saver, (Function0) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return scrollState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrollState rememberScrollState$lambda$0$0(int i) {
        return new ScrollState(i);
    }

    private static final Modifier scroll(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z3, boolean z4, boolean z6, OverscrollEffect overscrollEffect) {
        Orientation orientation = z4 ? Orientation.Vertical : Orientation.Horizontal;
        return (z6 ? ScrollableAreaKt.scrollableArea$default(modifier, scrollState, orientation, z3, z, flingBehavior, scrollState.getInternalInteractionSource(), null, 64, null) : ScrollableAreaKt.scrollableArea$default(modifier, scrollState, orientation, overscrollEffect, z3, z, flingBehavior, scrollState.getInternalInteractionSource(), null, 128, null)).then(new ScrollingLayoutElement(scrollState, z, z4));
    }

    public static /* synthetic */ Modifier scroll$default(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z3, boolean z4, boolean z6, OverscrollEffect overscrollEffect, int i, Object obj2) {
        return scroll(modifier, scrollState, z, flingBehavior, z3, z4, z6, (i & 64) != 0 ? null : overscrollEffect);
    }

    @NotNull
    public static final Modifier verticalScroll(@NotNull Modifier modifier, @NotNull ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z3) {
        return scroll$default(modifier, scrollState, z3, flingBehavior, z, true, true, null, 64, null);
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z3, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            flingBehavior = null;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        return verticalScroll(modifier, scrollState, z, flingBehavior, z3);
    }
}
