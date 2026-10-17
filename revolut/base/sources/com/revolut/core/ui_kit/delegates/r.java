package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.NewBadgeView;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.SimpleLimitProgressBarWithText;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r extends koi.b {
    public final AppCompatTextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SimpleLimitProgressBarWithText f54641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f54642h;
    public final AppCompatTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f54643j;
    public final CutoutImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AppCompatImageView f54644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SmallActionButton f54645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SmallActionButton f54646n;
    public CircleBadgeView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public NewBadgeView f54647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CircleProgressBar f54648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f54649r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ihm.f f54650s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ihm.f f54651t;
    public CircleBadgeModel u;
    public NewBadgeContent v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f54652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ix0.l0 f54653x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.actionWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.actionWidget_simpleLimitWithText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54641g = (SimpleLimitProgressBarWithText) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.actionWidget_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f54642h = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.actionWidget_valuePrimary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (AppCompatTextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.actionWidget_valueSecondary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f54643j = (AppCompatTextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.actionWidget_imageStart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        CutoutImageView cutoutImageView = (CutoutImageView) viewFindViewById6;
        this.k = cutoutImageView;
        View viewFindViewById7 = itemView.findViewById(R$id.actionWidget_imageDismiss);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f54644l = (AppCompatImageView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.actionWidget_buttonStart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f54645m = (SmallActionButton) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.actionWidget_buttonEnd);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f54646n = (SmallActionButton) viewFindViewById9;
        this.f54649r = v0.a.d("create(...)");
        this.f54650s = v0.a.d("create(...)");
        this.f54651t = v0.a.d("create(...)");
        Context context = itemView.getContext();
        this.f54652w = context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        kli.a.l(context, qv0.h.EXTRA_LARGE.a());
        this.f54653x = new ix0.l0((ViewGroup) itemView, zhm.v.k(cutoutImageView, new ix0.k0(new ip0.q(this, r.class, "imageProgressView", "getImageProgressView()Lcom/revolut/core/ui_kit/internal/views/CircleProgressBar;", 0))));
    }

    public static void F(SmallActionButton smallActionButton, Clause clause, Image image, boolean z) {
        smallActionButton.setEnabled(z);
        if (clause == null && image == null) {
            smallActionButton.setVisibility(8);
            return;
        }
        smallActionButton.setVisibility(0);
        smallActionButton.setText(clause);
        smallActionButton.setIcon(image);
    }

    public final jr0.g H() {
        jr0.f fVar = jr0.g.Companion;
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        fVar.getClass();
        return jr0.f.a(itemView);
    }

    public final SmallActionButton I(ActionWidgetDelegate.Model.a style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return ((style instanceof k) && ((k) style).e) ? this.f54646n : this.f54645m;
    }

    public final SmallActionButton J(ActionWidgetDelegate.Model.a style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return ((style instanceof k) && ((k) style).e) ? this.f54645m : this.f54646n;
    }

    public final void K(n nVar) {
        AttributeSet attributeSet = null;
        CutoutImageView cutoutImageView = this.k;
        if (nVar == null) {
            zi0.c.g(cutoutImageView, null);
            NewBadgeView newBadgeView = this.f54647p;
            if (newBadgeView != null) {
                newBadgeView.setVisibility(8);
            }
            CircleBadgeView circleBadgeView = this.o;
            if (circleBadgeView != null) {
                circleBadgeView.setVisibility(8);
                return;
            }
            return;
        }
        if (!(nVar instanceof m)) {
            throw new NoWhenBranchMatchedException();
        }
        ViewGroup.LayoutParams layoutParams = cutoutImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 40.0f);
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = iA;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = iA;
        cutoutImageView.setLayoutParams(layoutParams2);
        m mVar = (m) nVar;
        zi0.c.g(cutoutImageView, mVar.f54449a);
        CircleBadgeModel circleBadgeModel = mVar.f54451c;
        int i = 0;
        if ((circleBadgeModel != null || this.o != null) && !Intrinsics.f(this.u, circleBadgeModel)) {
            CircleBadgeView circleBadgeView2 = this.o;
            if (circleBadgeView2 == null) {
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                CircleBadgeView circleBadgeView3 = new CircleBadgeView(context, null, 0, os0.a.SMALL, 6);
                this.o = circleBadgeView3;
                circleBadgeView3.setId(R$id.actionWidget_bottomEndBadge);
                Context context2 = circleBadgeView3.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int iK = kli.a.k(context2, 20.0f);
                ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(iK, iK);
                int i2 = R$id.actionWidget_imageStart;
                layoutParams3.topToTop = i2;
                layoutParams3.bottomToBottom = i2;
                layoutParams3.rightToRight = i2;
                layoutParams3.leftToLeft = i2;
                circleBadgeView3.setLayoutParams(layoutParams3);
                ifk.b.a(cutoutImageView, circleBadgeView3, false);
                View view = this.itemView;
                Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) view).addView(circleBadgeView3);
                circleBadgeView2 = circleBadgeView3;
            }
            circleBadgeView2.setBadgeAndVisibility(circleBadgeModel, this.f54653x);
            this.u = circleBadgeModel;
        }
        NewBadgeContent newBadgeContent = mVar.f54450b;
        int i3 = 6;
        if ((newBadgeContent != null || this.f54647p != null) && !Intrinsics.f(this.v, newBadgeContent)) {
            NewBadgeView newBadgeView2 = this.f54647p;
            if (newBadgeView2 == null) {
                Context context3 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                newBadgeView2 = new NewBadgeView(context3, attributeSet, i3, i);
                this.f54647p = newBadgeView2;
                newBadgeView2.setId(R$id.actionWidget_topEndBadge);
                Context context4 = newBadgeView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                int iK2 = kli.a.k(context4, 16.0f);
                ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(iK2, iK2);
                int i5 = R$id.actionWidget_imageStart;
                layoutParams4.topToTop = i5;
                layoutParams4.bottomToBottom = i5;
                layoutParams4.rightToRight = i5;
                layoutParams4.leftToLeft = i5;
                newBadgeView2.setLayoutParams(layoutParams4);
                View view2 = this.itemView;
                Intrinsics.i(view2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) view2).addView(newBadgeView2);
                ifk.b.a(cutoutImageView, newBadgeView2, true);
            }
            newBadgeView2.setVisibility(newBadgeContent != null ? 0 : 8);
            if (newBadgeContent != null) {
                newBadgeView2.setContent(newBadgeContent);
            }
            this.v = newBadgeContent;
        }
        ProgressStyle progressStyle = mVar.d;
        if (progressStyle == null && this.f54648q == null) {
            return;
        }
        CircleProgressBar circleProgressBar = this.f54648q;
        if (circleProgressBar == null) {
            Context context5 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            circleProgressBar = new CircleProgressBar(context5, null, 6, 0);
            this.f54648q = circleProgressBar;
            circleProgressBar.setId(R$id.actionWidget_imageProgress);
            ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
            int i6 = R$id.actionWidget_imageStart;
            layoutParams5.bottomToBottom = i6;
            layoutParams5.topToTop = i6;
            layoutParams5.rightToRight = i6;
            layoutParams5.leftToLeft = i6;
            circleProgressBar.setLayoutParams(layoutParams5);
            View view3 = this.itemView;
            Intrinsics.i(view3, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) view3).addView(circleProgressBar);
        }
        if (progressStyle == null) {
            circleProgressBar.setVisibility(8);
            return;
        }
        circleProgressBar.setVisibility(0);
        circleProgressBar.a(progressStyle);
        int iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 10.0f);
        int i21 = cutoutImageView.getLayoutParams().width + iA2;
        ViewGroup.LayoutParams layoutParams6 = circleProgressBar.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams7 = (ConstraintLayout.LayoutParams) layoutParams6;
        ((ViewGroup.MarginLayoutParams) layoutParams7).width = i21;
        ((ViewGroup.MarginLayoutParams) layoutParams7).height = i21;
        layoutParams7.setMarginEnd(iA2 / 10);
        circleProgressBar.setLayoutParams(layoutParams7);
    }

    public final void M(l lVar) {
        SimpleLimitProgressBarWithText simpleLimitProgressBarWithText = this.f54641g;
        if (lVar == null) {
            simpleLimitProgressBarWithText.setVisibility(8);
            return;
        }
        SimpleLimitProgressBarWithText.setTitle$default(simpleLimitProgressBarWithText, lVar.f54405a, false, 2, null);
        simpleLimitProgressBarWithText.setStyle(new ms0.c4(lVar.f54406b, lVar.d, lVar.f54407c, lVar.e, lVar.f));
        simpleLimitProgressBarWithText.setVisibility(0);
    }
}
