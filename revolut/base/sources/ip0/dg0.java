package ip0;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class dg0 extends koi.b {
    public final ShimmerConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f163895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f163896h;
    public final LottieAnimationView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.smartTileAssetLoading_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerConstraintLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.assetSmartTileLoading_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163895g = (AppCompatImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.assetSmartTileLoading_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163896h = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.assetSmartTileLoading_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (LottieAnimationView) viewFindViewById4;
    }
}
