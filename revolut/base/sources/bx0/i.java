package bx0;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends d {
    public final ShimmerFrameLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Sequence f19420j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.shimmerStoriesPage_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.i = (ShimmerFrameLayout) viewFindViewById;
        this.f19420j = nkm.t.d();
    }

    public final ShimmerFrameLayout H() {
        return this.i;
    }
}
