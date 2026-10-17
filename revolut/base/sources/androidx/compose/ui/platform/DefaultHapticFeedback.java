package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/DefaultHapticFeedback;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "performHapticFeedback", "", "hapticFeedbackType", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "performHapticFeedback-CdsT49E", "(I)V", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultHapticFeedback implements HapticFeedback {

    @NotNull
    private final View view;

    public DefaultHapticFeedback(@NotNull View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    /* JADX INFO: renamed from: performHapticFeedback-CdsT49E */
    public void mo2292performHapticFeedbackCdsT49E(int hapticFeedbackType) {
        HapticFeedbackType.Companion companion = HapticFeedbackType.INSTANCE;
        ViewCompat.performHapticFeedback(this.view, HapticFeedbackType.m2294equalsimpl0(hapticFeedbackType, companion.m2295getConfirm5zf0vsI()) ? 16 : HapticFeedbackType.m2294equalsimpl0(hapticFeedbackType, companion.m2296getContextClick5zf0vsI()) ? 6 : HapticFeedbackType.m2294equalsimpl0(hapticFeedbackType, companion.m2297getGestureEnd5zf0vsI()) ? 13 : HapticFeedbackType.m2294equalsimpl0(hapticFeedbackType, companion.m2298getGestureThresholdActivate5zf0vsI()) ? 23 : HapticFeedbackType.m2294equalsimpl0(hapticFeedbackType, companion.m2299getKeyboardTap5zf0vsI()) ? 3 : HapticFeedbackType.m2294equalsimpl0(hapticFeedbackType, companion.m2300getLongPress5zf0vsI()) ? 0 : HapticFeedbackType.m2294equalsimpl0(hapticFeedbackType, companion.m2301getReject5zf0vsI()) ? 17 : HapticFeedbackType.m2294equalsimpl0(hapticFeedbackType, companion.m2302getSegmentFrequentTick5zf0vsI()) ? 27 : HapticFeedbackType.m2294equalsimpl0(hapticFeedbackType, companion.m2303getSegmentTick5zf0vsI()) ? 26 : HapticFeedbackType.m2294equalsimpl0(hapticFeedbackType, companion.m2304getTextHandleMove5zf0vsI()) ? 9 : HapticFeedbackType.m2294equalsimpl0(hapticFeedbackType, companion.m2305getToggleOff5zf0vsI()) ? 22 : HapticFeedbackType.m2294equalsimpl0(hapticFeedbackType, companion.m2306getToggleOn5zf0vsI()) ? 21 : HapticFeedbackType.m2294equalsimpl0(hapticFeedbackType, companion.m2307getVirtualKey5zf0vsI()) ? 1 : -1);
    }
}
