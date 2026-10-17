package ip0;

import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zg0 extends koi.b {
    public final zq0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f167464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f167465h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.splitColumnCellLoading_titleValueDividerGuideline);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = new zq0.d((Guideline) viewFindViewById);
        View viewFindViewById2 = itemView.findViewById(R$id.splitColumnCellLoading_titleBackgroundContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167464g = viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.splitColumnCellLoading_valueBackgroundContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f167465h = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.splitColumnCellLoading_titleShimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        View viewFindViewById5 = itemView.findViewById(R$id.splitColumnCellLoading_valueShimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        ifk.b.r((ShimmerFrameLayout) viewFindViewById4);
        ifk.b.r((ShimmerFrameLayout) viewFindViewById5);
    }
}
