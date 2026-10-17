package op0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i3 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ShimmerConstraintLayout f227306j;
    public final TextView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ShimmerConstraintLayout shimmerConstraintLayout = (ShimmerConstraintLayout) itemView.findViewById(R$id.paymentLinkWidgetLoading_container);
        this.f227306j = shimmerConstraintLayout;
        this.k = (TextView) itemView.findViewById(R$id.paymentLinkWidgetLoading_title);
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        shimmerConstraintLayout.h0(yp0.a0.a(context));
        shimmerConstraintLayout.setShimmerMode(c9.f.SHIMMERING_CHILDREN_ONLY);
    }
}
