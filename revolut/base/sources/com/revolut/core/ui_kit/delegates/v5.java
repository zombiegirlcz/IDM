package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.flexbox.FlexboxLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v5 extends koi.b {
    public final CutoutImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CircleProgressBar f54850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CircleBadgeView f54851h;
    public final AppCompatTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f54852j;
    public final AppCompatTextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SmallActionButton f54853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinearLayout f54854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final FlexboxLayout f54855n;
    public ip0.ad o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ix0.l0 f54856p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.esim_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CutoutImageView cutoutImageView = (CutoutImageView) viewFindViewById;
        this.f = cutoutImageView;
        View viewFindViewById2 = itemView.findViewById(R$id.esim_iconProgress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        CircleProgressBar circleProgressBar = (CircleProgressBar) viewFindViewById2;
        this.f54850g = circleProgressBar;
        View viewFindViewById3 = itemView.findViewById(R$id.esim_circleBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f54851h = (CircleBadgeView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.esim_topLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (AppCompatTextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.esim_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f54852j = (AppCompatTextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.esim_bottomLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (AppCompatTextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.esim_bottomAction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f54853l = (SmallActionButton) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.esim_additionalDescriptionsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f54854m = (LinearLayout) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.esim_tagsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f54855n = (FlexboxLayout) viewFindViewById9;
        this.f54856p = new ix0.l0((ViewGroup) itemView, zhm.v.k(cutoutImageView, circleProgressBar));
    }

    public final jr0.g getGlowHighlightManager() {
        jr0.f fVar = jr0.g.Companion;
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        fVar.getClass();
        return jr0.f.a(itemView);
    }
}
