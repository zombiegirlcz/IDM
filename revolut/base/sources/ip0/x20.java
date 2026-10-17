package ip0;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x20 extends koi.b {
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f167088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ShimmerFrameLayout f167089h;
    public final ShimmerFrameLayout i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x20(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.productSelectionLoading_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.productSelectionLoading_picture);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167088g = viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.productSelectionLoading_shimmeringImages);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f167089h = (ShimmerFrameLayout) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.productSelectionLoading_shimmeringTexts);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ShimmerFrameLayout) viewFindViewById4;
    }
}
