package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ToleranceLevelCompactView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y2 extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LottieAnimationView f167237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f167238h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f167239j;
    public final ToleranceLevelCompactView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.banner_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.banner_lottieAnimation);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167237g = (LottieAnimationView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.banner_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f167238h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.banner_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.banner_closeIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f167239j = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.banner_toleranceLevelView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (ToleranceLevelCompactView) viewFindViewById6;
    }
}
