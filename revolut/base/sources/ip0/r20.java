package ip0;

import android.view.View;
import com.facebook.shimmer.ShimmerLinearLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r20 extends koi.b {
    public final ShimmerLinearLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f166085g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r20(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (ShimmerLinearLayout) itemView;
        View viewFindViewById = itemView.findViewById(R$id.widgetLoading_action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f166085g = viewFindViewById;
    }
}
