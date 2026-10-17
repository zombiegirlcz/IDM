package androidx.compose.ui.viewinterop;

import android.view.WindowInsets;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/layout/LayoutCoordinates;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AndroidViewHolder$layoutNode$1$coreModifier$3 extends u implements Function1<LayoutCoordinates, Unit> {
    final /* synthetic */ LayoutNode $layoutNode;
    final /* synthetic */ AndroidViewHolder $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$3(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        super(1);
        this.$this_run = androidViewHolder;
        this.$layoutNode = layoutNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((LayoutCoordinates) obj2);
        return Unit.f186387a;
    }

    public final void invoke(LayoutCoordinates layoutCoordinates) {
        WindowInsets windowInsets;
        AndroidViewHolder_androidKt.layoutAccordingTo(this.$this_run, this.$layoutNode);
        this.$this_run.owner.onInteropViewLayoutChange(this.$this_run);
        int i = this.$this_run.position[0];
        int i2 = this.$this_run.position[1];
        this.$this_run.getView().getLocationOnScreen(this.$this_run.position);
        long j2 = this.$this_run.size;
        this.$this_run.size = layoutCoordinates.mo2533getSizeYbymL2g();
        WindowInsetsCompat windowInsetsCompat = this.$this_run.insets;
        if (windowInsetsCompat != null) {
            if ((i == this.$this_run.position[0] && i2 == this.$this_run.position[1] && IntSize.m3353equalsimpl0(j2, this.$this_run.size)) || (windowInsets = this.$this_run.insetToLayoutPosition(windowInsetsCompat).toWindowInsets()) == null) {
                return;
            }
            this.$this_run.getView().dispatchApplyWindowInsets(windowInsets);
        }
    }
}
