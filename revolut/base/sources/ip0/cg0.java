package ip0;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import com.revolut.core.ui_kit.views.AvatarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class cg0 extends koi.b {
    public final AppCompatTextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AvatarView f163732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f163733h;
    public final AppCompatTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Guideline f163734j;
    public final LineChartView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LottieAnimationView f163735l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.assetSmartTile_caption);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.assetSmartTile_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        AvatarView avatarView = (AvatarView) viewFindViewById2;
        this.f163732g = avatarView;
        View viewFindViewById3 = itemView.findViewById(R$id.assetSmartTile_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163733h = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.assetSmartTile_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (AppCompatTextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.vertical_center_guideline);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f163734j = (Guideline) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.assetSmartTile_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (LineChartView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.assetSmartTile_chartLoadingView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f163735l = (LottieAnimationView) viewFindViewById7;
        avatarView.setDefaultAvatarStyle$ui_kit_components_release(mx0.i1.SIZE_32_32);
    }
}
