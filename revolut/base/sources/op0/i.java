package op0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.Space;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CutoutImageView f227293j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Space f227294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AnimatedNumbersView f227295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f227296n;
    public final TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CircleProgressBar f227297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TagView f227298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LottieAnimationView f227299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CircleBadgeView f227300s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ix0.l0 f227301t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.avatarWidget_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CutoutImageView cutoutImageView = (CutoutImageView) viewFindViewById;
        this.f227293j = cutoutImageView;
        View viewFindViewById2 = itemView.findViewById(R$id.avatarWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.avatarWidget_titleSpace);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f227294l = (Space) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.avatarWidget_animatedNumbersTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        AnimatedNumbersView animatedNumbersView = (AnimatedNumbersView) viewFindViewById4;
        this.f227295m = animatedNumbersView;
        View viewFindViewById5 = itemView.findViewById(R$id.avatarWidget_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f227296n = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.avatarWidget_footer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.o = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.avatarWidget_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        CircleProgressBar circleProgressBar = (CircleProgressBar) viewFindViewById7;
        this.f227297p = circleProgressBar;
        View viewFindViewById8 = itemView.findViewById(R$id.avatarWidget_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f227298q = (TagView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.avatarWidget_lottieBackground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f227299r = (LottieAnimationView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.avatarWidget_imageBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f227300s = (CircleBadgeView) viewFindViewById10;
        animatedNumbersView.setTextAppearance(R$attr.internal_textAppearanceWidgetAmount);
        animatedNumbersView.setAnimateSpin(true);
        animatedNumbersView.setAnimationDuration(900L);
        animatedNumbersView.setAnimationInterpolator(new PathInterpolator(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.1f, 1.0f));
        this.f227301t = new ix0.l0((ViewGroup) itemView, zhm.v.k(cutoutImageView, circleProgressBar));
    }
}
