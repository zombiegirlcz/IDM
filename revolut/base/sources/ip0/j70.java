package ip0;

import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j70 extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164801h;
    public final View i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j70(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.qrCodeLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.qrCodeLoading_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164800g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.qrCodeLoading_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164801h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.qrCodeLoading_qrCodeView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = viewFindViewById4;
    }
}
