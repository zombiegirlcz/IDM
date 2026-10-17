package ip0;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class km0 extends koi.b {
    public final TrendView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LottieAnimationView f165041g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.trendView_trendView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TrendView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.trendView_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165041g = (LottieAnimationView) viewFindViewById2;
    }
}
