package ip0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CutoutLottieAnimationView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zy extends koi.b {
    public final CutoutLottieAnimationView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CircleBadgeView f167546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f167547h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f167548j;
    public final View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f167549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SmallActionButton f167550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SmallActionButton f167551n;
    public final TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f167552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ix0.l0 f167553q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.notificationCentreItem_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CutoutLottieAnimationView cutoutLottieAnimationView = (CutoutLottieAnimationView) viewFindViewById;
        this.f = cutoutLottieAnimationView;
        View viewFindViewById2 = itemView.findViewById(R$id.notificationCentreItem_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167546g = (CircleBadgeView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.notificationCentreItem_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f167547h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.notificationCentreItem_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.notificationCentreItem_time);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f167548j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.notificationCentreItem_selectedView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.notificationCentreItem_notificationDot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f167549l = viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.notificationCentreItem_primaryButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f167550m = (SmallActionButton) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.notificationCentreItem_secondaryButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f167551n = (SmallActionButton) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.notificationCentreItem_valuePrimary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.o = (TextView) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.notificationCentreItem_valueSecondary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f167552p = (TextView) viewFindViewById11;
        this.f167553q = new ix0.l0((ViewGroup) itemView, zhm.u.c(cutoutLottieAnimationView));
    }
}
