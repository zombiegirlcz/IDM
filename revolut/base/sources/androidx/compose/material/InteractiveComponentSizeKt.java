package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import uz8.s;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b\"\u0014\u0010\u0001\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/Modifier;", "minimumInteractiveComponentSize", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "LocalMinimumInteractiveComponentEnforcement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumInteractiveComponentEnforcement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumInteractiveComponentEnforcement$annotations", "()V", "LocalMinimumTouchTargetEnforcement", "getLocalMinimumTouchTargetEnforcement", "getLocalMinimumTouchTargetEnforcement$annotations", "Landroidx/compose/ui/unit/DpSize;", "J", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class InteractiveComponentSizeKt {

    @NotNull
    private static final ProvidableCompositionLocal<Boolean> LocalMinimumInteractiveComponentEnforcement;

    @NotNull
    private static final ProvidableCompositionLocal<Boolean> LocalMinimumTouchTargetEnforcement;
    private static final long minimumInteractiveComponentSize;

    static {
        ProvidableCompositionLocal<Boolean> providableCompositionLocalStaticCompositionLocalOf = CompositionLocalKt.staticCompositionLocalOf(new s(11));
        LocalMinimumInteractiveComponentEnforcement = providableCompositionLocalStaticCompositionLocalOf;
        LocalMinimumTouchTargetEnforcement = providableCompositionLocalStaticCompositionLocalOf;
        float f = 48;
        minimumInteractiveComponentSize = DpKt.m3307DpSizeYgX7TsA(Dp.m3297constructorimpl(f), Dp.m3297constructorimpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalMinimumInteractiveComponentEnforcement$lambda$0() {
        return true;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Boolean> getLocalMinimumInteractiveComponentEnforcement() {
        return LocalMinimumInteractiveComponentEnforcement;
    }

    @NotNull
    public static final Modifier minimumInteractiveComponentSize(@NotNull Modifier modifier) {
        return modifier.then(MinimumInteractiveModifier.INSTANCE);
    }
}
