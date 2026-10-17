package op0;

import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n4 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ShimmerFrameLayout f227361j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f227362l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.tileLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227361j = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.tileLoading_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.tileLoading_shimmeringTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f227362l = viewFindViewById3;
    }
}
