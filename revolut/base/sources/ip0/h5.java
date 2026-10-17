package ip0;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.candlesticks.CandleSticksView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h5 extends koi.b {
    public final CandleSticksView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LottieAnimationView f164507g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.graph);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (CandleSticksView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164507g = (LottieAnimationView) viewFindViewById2;
    }
}
