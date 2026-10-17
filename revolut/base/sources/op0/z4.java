package op0;

import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z4 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ShimmerConstraintLayout f227514j;
    public final TextView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.trackingProgressLoadingWidget_shimmeringLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227514j = (ShimmerConstraintLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.trackingProgressLoadingWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (TextView) viewFindViewById2;
    }
}
