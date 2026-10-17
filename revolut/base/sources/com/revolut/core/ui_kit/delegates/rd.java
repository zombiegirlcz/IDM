package com.revolut.core.ui_kit.delegates;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.internal.views.CircleProgressBarWithText;
import com.revolut.core.ui_kit.internal.views.FcaDisclaimerView;
import com.revolut.core.ui_kit.internal.views.OnMeasureCallbackConstraintLayout;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit.views.InnerScrollView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.u60;
import ip0.v60;
import ip0.w10;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class rd extends koi.b implements ms0.i2 {
    public final InnerScrollView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ActionFooterView f54663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BasicNavBar f54664h;
    public final UIKitConstraintLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final UiKitMediaView f54665j;
    public final AvatarView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CircleProgressBarWithText f54666l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UiKitMediaView f54667m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f54668n;
    public final TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f54669p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FcaDisclaimerView f54670q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f54671r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f54672s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Guideline f54673t;
    public final Guideline u;
    public PromptMarketingContentDelegate.Model.AnimationType v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AnimatorSet f54674w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.marketingPrompt_scrollView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        InnerScrollView scrollView = (InnerScrollView) viewFindViewById;
        this.f = scrollView;
        ActionFooterView actionFooterView = (ActionFooterView) itemView.findViewById(R$id.marketingPrompt_actionFooter);
        this.f54663g = actionFooterView;
        View viewFindViewById2 = itemView.findViewById(R$id.marketingPrompt_navBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        BasicNavBar basicNavBar = (BasicNavBar) viewFindViewById2;
        this.f54664h = basicNavBar;
        View viewFindViewById3 = scrollView.findViewById(R$id.marketingPrompt_scrollContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        UIKitConstraintLayout uIKitConstraintLayout = (UIKitConstraintLayout) viewFindViewById3;
        this.i = uIKitConstraintLayout;
        View viewFindViewById4 = uIKitConstraintLayout.findViewById(R$id.marketingPrompt_mediaView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f54665j = (UiKitMediaView) viewFindViewById4;
        View viewFindViewById5 = uIKitConstraintLayout.findViewById(R$id.marketingPrompt_avatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.k = (AvatarView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.marketingPrompt_progressBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f54666l = (CircleProgressBarWithText) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.marketingPrompt_fullscreenBackgroundMediaView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        UiKitMediaView uiKitMediaView = (UiKitMediaView) viewFindViewById7;
        this.f54667m = uiKitMediaView;
        View viewFindViewById8 = uIKitConstraintLayout.findViewById(R$id.marketingPrompt_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById8;
        this.f54668n = textView;
        View viewFindViewById9 = uIKitConstraintLayout.findViewById(R$id.marketingPrompt_avatarHeading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.o = (TextView) viewFindViewById9;
        View viewFindViewById10 = uIKitConstraintLayout.findViewById(R$id.marketingPrompt_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById10;
        this.f54669p = textView2;
        View viewFindViewById11 = itemView.findViewById(R$id.marketingPrompt_disclaimer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f54670q = (FcaDisclaimerView) viewFindViewById11;
        View viewFindViewById12 = uIKitConstraintLayout.findViewById(R$id.marketingPrompt_link);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f54671r = (TextView) viewFindViewById12;
        View viewFindViewById13 = uIKitConstraintLayout.findViewById(R$id.marketingPrompt_topGuideline);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f54673t = (Guideline) viewFindViewById13;
        View viewFindViewById14 = uIKitConstraintLayout.findViewById(R$id.marketingPrompt_bottomGuideline);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.u = (Guideline) viewFindViewById14;
        scrollView.setClipToPadding(false);
        textView2.setMovementMethod(ix0.c0.f169220a);
        textView2.setClickable(false);
        uIKitConstraintLayout.setReadableAreaGuidelinesEnabled(true);
        ny0.i.e(uiKitMediaView);
        jb3.l.e(textView, R$attr.internal_textAppearanceMarketingDisplay2_noXmlUsage);
        ViewGroup.LayoutParams layoutParams = basicNavBar.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        ViewCompat.setOnApplyWindowInsetsListener(itemView, new com.google.android.material.sidesheet.c(this, marginLayoutParams != null ? marginLayoutParams.topMargin : 0, 2));
        ViewUtils.requestApplyInsetsWhenAttached(itemView);
        OnMeasureCallbackConstraintLayout onMeasureCallbackConstraintLayout = itemView instanceof OnMeasureCallbackConstraintLayout ? (OnMeasureCallbackConstraintLayout) itemView : null;
        if (onMeasureCallbackConstraintLayout != null) {
            onMeasureCallbackConstraintLayout.setOnMeasureCallback(this);
        }
        ox0.j jVar = new ox0.j();
        Intrinsics.checkNotNullExpressionValue(actionFooterView, "actionFooterView");
        Intrinsics.checkNotNullParameter(actionFooterView, "actionFooterView");
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        ox0.n nVar = jVar.f230482a;
        View view = nVar != null ? nVar.f230490b : null;
        Object parent = view != null ? view.getParent() : null;
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(jVar);
        }
        es0.k kVar = jVar.f230483b;
        if (view != null) {
            view.removeOnAttachStateChangeListener(kVar);
        }
        ox0.n nVar2 = jVar.f230482a;
        if (nVar2 != null) {
            nVar2.a();
        }
        jVar.f230482a = null;
        ox0.n nVar3 = new ox0.n(actionFooterView, scrollView);
        nVar3.c(true);
        nVar3.d(actionFooterView);
        if (scrollView.isAttachedToWindow()) {
            Object parent2 = scrollView.getParent();
            View view3 = parent2 instanceof View ? (View) parent2 : null;
            if (view3 != null) {
                view3.addOnLayoutChangeListener(jVar);
            }
        }
        scrollView.addOnAttachStateChangeListener(kVar);
        jVar.f230482a = nVar3;
        c8g.a.a(itemView, ny0.a.f220589a, new w10(this, 6));
    }

    public final void F(PromptMarketingContentDelegate.Model.AnimationType animation, boolean z) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        boolean z3 = animation instanceof PromptMarketingContentDelegate.Model.AnimationType.SlideInAndFadeIn;
        final int i = 1;
        final int i2 = 0;
        final int i3 = 2;
        TextView textView = this.f54669p;
        TextView textView2 = this.f54668n;
        ActionFooterView actionFooterView = this.f54663g;
        if (z3) {
            PromptMarketingContentDelegate.Model.AnimationType.SlideInAndFadeIn slideInAndFadeIn = (PromptMarketingContentDelegate.Model.AnimationType.SlideInAndFadeIn) animation;
            float f = slideInAndFadeIn.f53098c;
            actionFooterView.setTranslationY(f);
            textView2.setTranslationY(f);
            textView.setTranslationY(f);
            textView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            textView2.setAlpha(BitmapDescriptorFactory.HUE_RED);
            actionFooterView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat.setInterpolator(jq0.r.f177392a);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ip0.t60

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.core.ui_kit.delegates.rd f166471b;

                {
                    this.f166471b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            float fFloatValue = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            com.revolut.core.ui_kit.delegates.rd rdVar = this.f166471b;
                            rdVar.f54668n.setTranslationY(fFloatValue);
                            rdVar.f54669p.setTranslationY(fFloatValue);
                            rdVar.f54663g.setTranslationY(fFloatValue);
                            break;
                        case 1:
                            float fFloatValue2 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            com.revolut.core.ui_kit.delegates.rd rdVar2 = this.f166471b;
                            rdVar2.f54669p.setAlpha(fFloatValue2);
                            rdVar2.f54668n.setAlpha(fFloatValue2);
                            rdVar2.f54663g.setAlpha(fFloatValue2);
                            break;
                        case 2:
                            float fFloatValue3 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            com.revolut.core.ui_kit.delegates.rd rdVar3 = this.f166471b;
                            rdVar3.f54668n.setTranslationY(fFloatValue3);
                            rdVar3.f54669p.setTranslationY(fFloatValue3);
                            rdVar3.f54663g.setTranslationY(fFloatValue3);
                            break;
                        case 3:
                            float fFloatValue4 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            com.revolut.core.ui_kit.delegates.rd rdVar4 = this.f166471b;
                            rdVar4.f54669p.setAlpha(fFloatValue4);
                            rdVar4.f54668n.setAlpha(fFloatValue4);
                            rdVar4.f54663g.setAlpha(fFloatValue4);
                            break;
                        default:
                            this.f166471b.f54665j.setTranslationY(((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ip0.t60

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.core.ui_kit.delegates.rd f166471b;

                {
                    this.f166471b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i) {
                        case 0:
                            float fFloatValue = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            com.revolut.core.ui_kit.delegates.rd rdVar = this.f166471b;
                            rdVar.f54668n.setTranslationY(fFloatValue);
                            rdVar.f54669p.setTranslationY(fFloatValue);
                            rdVar.f54663g.setTranslationY(fFloatValue);
                            break;
                        case 1:
                            float fFloatValue2 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            com.revolut.core.ui_kit.delegates.rd rdVar2 = this.f166471b;
                            rdVar2.f54669p.setAlpha(fFloatValue2);
                            rdVar2.f54668n.setAlpha(fFloatValue2);
                            rdVar2.f54663g.setAlpha(fFloatValue2);
                            break;
                        case 2:
                            float fFloatValue3 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            com.revolut.core.ui_kit.delegates.rd rdVar3 = this.f166471b;
                            rdVar3.f54668n.setTranslationY(fFloatValue3);
                            rdVar3.f54669p.setTranslationY(fFloatValue3);
                            rdVar3.f54663g.setTranslationY(fFloatValue3);
                            break;
                        case 3:
                            float fFloatValue4 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            com.revolut.core.ui_kit.delegates.rd rdVar4 = this.f166471b;
                            rdVar4.f54669p.setAlpha(fFloatValue4);
                            rdVar4.f54668n.setAlpha(fFloatValue4);
                            rdVar4.f54663g.setAlpha(fFloatValue4);
                            break;
                        default:
                            this.f166471b.f54665j.setTranslationY(((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                            break;
                    }
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(slideInAndFadeIn.f53096a);
            animatorSet.setDuration(slideInAndFadeIn.f53097b);
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            this.f54674w = animatorSet;
            animatorSet.addListener(new v60(this, 0));
            animatorSet.start();
            return;
        }
        if (!Intrinsics.f(animation, PromptMarketingContentDelegate.Model.AnimationType.SlideInWithReveal.f53099a)) {
            throw new NoWhenBranchMatchedException();
        }
        UiKitMediaView uiKitMediaView = this.f54665j;
        if (!z && uiKitMediaView.getMeasuredHeight() <= 0) {
            this.v = animation;
            return;
        }
        float measuredHeight = this.itemView.getMeasuredHeight();
        actionFooterView.setTranslationY(measuredHeight);
        textView2.setTranslationY(measuredHeight);
        textView.setTranslationY(measuredHeight);
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        Intrinsics.i(uiKitMediaView.getLayoutParams(), "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        Intrinsics.i(this.f54673t.getLayoutParams(), "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        uiKitMediaView.setTranslationY(((itemView.getMeasuredHeight() - uiKitMediaView.getMeasuredHeight()) / 2) - (((ConstraintLayout.LayoutParams) r10).guideBegin + ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) r8)).topMargin));
        textView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        textView2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        actionFooterView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(measuredHeight, BitmapDescriptorFactory.HUE_RED);
        Interpolator interpolator = jq0.r.f177392a;
        valueAnimatorOfFloat3.setInterpolator(interpolator);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ip0.t60

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.core.ui_kit.delegates.rd f166471b;

            {
                this.f166471b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        float fFloatValue = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        com.revolut.core.ui_kit.delegates.rd rdVar = this.f166471b;
                        rdVar.f54668n.setTranslationY(fFloatValue);
                        rdVar.f54669p.setTranslationY(fFloatValue);
                        rdVar.f54663g.setTranslationY(fFloatValue);
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        com.revolut.core.ui_kit.delegates.rd rdVar2 = this.f166471b;
                        rdVar2.f54669p.setAlpha(fFloatValue2);
                        rdVar2.f54668n.setAlpha(fFloatValue2);
                        rdVar2.f54663g.setAlpha(fFloatValue2);
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        com.revolut.core.ui_kit.delegates.rd rdVar3 = this.f166471b;
                        rdVar3.f54668n.setTranslationY(fFloatValue3);
                        rdVar3.f54669p.setTranslationY(fFloatValue3);
                        rdVar3.f54663g.setTranslationY(fFloatValue3);
                        break;
                    case 3:
                        float fFloatValue4 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        com.revolut.core.ui_kit.delegates.rd rdVar4 = this.f166471b;
                        rdVar4.f54669p.setAlpha(fFloatValue4);
                        rdVar4.f54668n.setAlpha(fFloatValue4);
                        rdVar4.f54663g.setAlpha(fFloatValue4);
                        break;
                    default:
                        this.f166471b.f54665j.setTranslationY(((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        final int i5 = 3;
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ip0.t60

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.core.ui_kit.delegates.rd f166471b;

            {
                this.f166471b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i5) {
                    case 0:
                        float fFloatValue = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        com.revolut.core.ui_kit.delegates.rd rdVar = this.f166471b;
                        rdVar.f54668n.setTranslationY(fFloatValue);
                        rdVar.f54669p.setTranslationY(fFloatValue);
                        rdVar.f54663g.setTranslationY(fFloatValue);
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        com.revolut.core.ui_kit.delegates.rd rdVar2 = this.f166471b;
                        rdVar2.f54669p.setAlpha(fFloatValue2);
                        rdVar2.f54668n.setAlpha(fFloatValue2);
                        rdVar2.f54663g.setAlpha(fFloatValue2);
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        com.revolut.core.ui_kit.delegates.rd rdVar3 = this.f166471b;
                        rdVar3.f54668n.setTranslationY(fFloatValue3);
                        rdVar3.f54669p.setTranslationY(fFloatValue3);
                        rdVar3.f54663g.setTranslationY(fFloatValue3);
                        break;
                    case 3:
                        float fFloatValue4 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        com.revolut.core.ui_kit.delegates.rd rdVar4 = this.f166471b;
                        rdVar4.f54669p.setAlpha(fFloatValue4);
                        rdVar4.f54668n.setAlpha(fFloatValue4);
                        rdVar4.f54663g.setAlpha(fFloatValue4);
                        break;
                    default:
                        this.f166471b.f54665j.setTranslationY(((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(uiKitMediaView.getTranslationY(), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat5.setInterpolator(interpolator);
        final int i6 = 4;
        valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ip0.t60

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.core.ui_kit.delegates.rd f166471b;

            {
                this.f166471b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        float fFloatValue = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        com.revolut.core.ui_kit.delegates.rd rdVar = this.f166471b;
                        rdVar.f54668n.setTranslationY(fFloatValue);
                        rdVar.f54669p.setTranslationY(fFloatValue);
                        rdVar.f54663g.setTranslationY(fFloatValue);
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        com.revolut.core.ui_kit.delegates.rd rdVar2 = this.f166471b;
                        rdVar2.f54669p.setAlpha(fFloatValue2);
                        rdVar2.f54668n.setAlpha(fFloatValue2);
                        rdVar2.f54663g.setAlpha(fFloatValue2);
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        com.revolut.core.ui_kit.delegates.rd rdVar3 = this.f166471b;
                        rdVar3.f54668n.setTranslationY(fFloatValue3);
                        rdVar3.f54669p.setTranslationY(fFloatValue3);
                        rdVar3.f54663g.setTranslationY(fFloatValue3);
                        break;
                    case 3:
                        float fFloatValue4 = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        com.revolut.core.ui_kit.delegates.rd rdVar4 = this.f166471b;
                        rdVar4.f54669p.setAlpha(fFloatValue4);
                        rdVar4.f54668n.setAlpha(fFloatValue4);
                        rdVar4.f54663g.setAlpha(fFloatValue4);
                        break;
                    default:
                        this.f166471b.f54665j.setTranslationY(((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                        break;
                }
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setStartDelay(2300L);
        animatorSet2.setDuration(1000L);
        animatorSet2.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4, valueAnimatorOfFloat5);
        this.f54674w = animatorSet2;
        animatorSet2.addListener(new v60(this, 1));
        animatorSet2.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H() {
        /*
            r7 = this;
            koi.j r0 = r7.e
            boolean r1 = r0 instanceof com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model
            r2 = 0
            if (r1 == 0) goto La
            com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            r1 = 1
            if (r0 != 0) goto Lf
            return r1
        Lf:
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r3 = r0.f53085g
            com.revolut.core.ui_kit.views.navbar.BasicNavBar r4 = r7.f54664h
            r5 = 0
            if (r3 == 0) goto L2d
            int r3 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r6 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L25
            r2 = r4
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
        L25:
            if (r2 == 0) goto L2a
            int r2 = r2.topMargin
            goto L2b
        L2a:
            r2 = r5
        L2b:
            int r3 = r3 + r2
            goto L50
        L2d:
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            boolean r4 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L38
            r2 = r3
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
        L38:
            if (r2 == 0) goto L3d
            int r2 = r2.topMargin
            goto L3e
        L3d:
            r2 = r5
        L3e:
            android.view.View r3 = r7.itemView
            android.content.Context r3 = r3.getContext()
            java.lang.String r4 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r4 = 1103101952(0x41c00000, float:24.0)
            int r3 = kli.a.k(r3, r4)
            goto L2b
        L50:
            com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate$Model$Content r0 = r0.d
            boolean r2 = r0 instanceof com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model.Content.AvatarContent
            if (r2 == 0) goto L57
            goto L83
        L57:
            boolean r2 = r0 instanceof com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model.Content.MediaContent
            if (r2 == 0) goto L5c
            goto L83
        L5c:
            boolean r2 = r0 instanceof com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model.Content.ProgressContent
            if (r2 == 0) goto L61
            goto L83
        L61:
            boolean r2 = r0 instanceof com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model.Content.BackgroundMediaContent
            if (r2 == 0) goto L67
        L65:
            r3 = r5
            goto L83
        L67:
            boolean r2 = r0 instanceof com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent
            if (r2 == 0) goto Lb2
            com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate$Model$Content$FullScreenMediaContent r0 = (com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent) r0
            com.revolut.core.ui_kit.delegates.jd r0 = r0.f53110c
            int[] r2 = com.revolut.core.ui_kit.delegates.qd.f54633b
            int r0 = r0.ordinal()
            r0 = r2[r0]
            if (r0 == r1) goto L65
            r2 = 2
            if (r0 != r2) goto L7d
            goto L83
        L7d:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L83:
            com.revolut.core.ui_kit.views.buttons.ActionFooterView r0 = r7.f54663g
            int r0 = r0.getMeasuredHeight()
            androidx.constraintlayout.widget.Guideline r2 = r7.f54673t
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            java.lang.String r6 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            kotlin.jvm.internal.Intrinsics.i(r4, r6)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r4
            int r4 = r4.guideBegin
            if (r4 == r3) goto L9e
            r2.setGuidelineBegin(r3)
            r5 = r1
        L9e:
            androidx.constraintlayout.widget.Guideline r2 = r7.u
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            kotlin.jvm.internal.Intrinsics.i(r3, r6)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r3
            int r3 = r3.guideEnd
            if (r3 == r0) goto Lb1
            r2.setGuidelineEnd(r0)
            return r1
        Lb1:
            return r5
        Lb2:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.rd.H():boolean");
    }

    public final void I() {
        this.f54663g.setGradientTint(this.f.getMeasuredHeight() < this.i.getMeasuredHeight() ? this.f54672s : 0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void J(PromptMarketingContentDelegate.Model model) {
        u60 config;
        int iA;
        float f;
        PromptMarketingContentDelegate.Model.Content content = model.d;
        boolean z = content instanceof PromptMarketingContentDelegate.Model.Content.AvatarContent;
        CircleProgressBarWithText circleProgressBarWithText = this.f54666l;
        TextView textView = this.o;
        Guideline guideline = this.f54673t;
        UiKitMediaView uiKitMediaView = this.f54665j;
        if (z) {
            int dimensionPixelSize = uiKitMediaView.getResources().getDimensionPixelSize(R$dimen.internal_prompt_image_size);
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            config = new u60(kli.a.k(context, 16.0f) + dimensionPixelSize, 2, BitmapDescriptorFactory.HUE_RED, guideline.getId(), false, false, 0, -2, -2, 0, BitmapDescriptorFactory.HUE_RED, false, this.k, true, Integer.valueOf(textView.getId()));
        } else if (content instanceof PromptMarketingContentDelegate.Model.Content.MediaContent) {
            config = new u60(com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 16.0f), 0, 0.5f, uiKitMediaView.getId(), true, false, com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 16.0f), uiKitMediaView.getResources().getDimensionPixelSize(R$dimen.internal_prompt_image_size), uiKitMediaView.getResources().getDimensionPixelSize(R$dimen.internal_prompt_image_size), 0, 1.0f, false, this.f54665j);
        } else if (content instanceof PromptMarketingContentDelegate.Model.Content.BackgroundMediaContent) {
            config = new u60(0, 0, 0.5f, uiKitMediaView.getId(), true, false, 0, 0, 0, com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 440.0f), 0.45f, false, this.f54665j);
        } else if (content instanceof PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent) {
            jd jdVar = ((PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent) content).f53110c;
            int[] iArr = qd.f54633b;
            int i = iArr[jdVar.ordinal()];
            if (i == 1) {
                iA = 0;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iA = com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 16.0f);
            }
            int i2 = iArr[((PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent) model.d).f53110c.ordinal()];
            if (i2 == 1) {
                f = 1.0f;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 0.5f;
            }
            config = new u60(iA, 2, f, guideline.getId(), false, false, 0, 0, 0, 0, BitmapDescriptorFactory.HUE_RED, true, this.f54665j);
        } else {
            if (!(content instanceof PromptMarketingContentDelegate.Model.Content.ProgressContent)) {
                throw new NoWhenBranchMatchedException();
            }
            config = new u60(com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 16.0f), 0, 0.5f, circleProgressBarWithText.getId(), false, true, com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 16.0f), 0, uiKitMediaView.getResources().getDimensionPixelSize(R$dimen.internal_prompt_image_size), 0, 1.0f, false, this.f54666l);
        }
        Intrinsics.checkNotNullParameter(config, "config");
        circleProgressBarWithText.setVisibility(config.f ? 0 : 8);
        uiKitMediaView.setVisibility(config.e ? 0 : 8);
        this.f54667m.setVisibility(config.f166607l ? 0 : 8);
        boolean z3 = config.f166609n;
        int i3 = z3 ? 0 : 8;
        AvatarView avatarView = this.k;
        avatarView.setVisibility(i3);
        textView.setVisibility(z3 ? 0 : 8);
        View view = config.f166608m;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = config.i;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = config.f166605h;
        layoutParams2.matchConstraintMaxHeight = config.f166606j;
        layoutParams2.matchConstraintPercentHeight = config.k;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = config.f166604g;
        view.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = avatarView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        Integer num = config.o;
        int iIntValue = num != null ? num.intValue() : -1;
        if (layoutParams4.bottomToTop != iIntValue) {
            layoutParams4.bottomToTop = iIntValue;
        }
        avatarView.setLayoutParams(layoutParams4);
        TextView textView2 = this.f54668n;
        ViewGroup.LayoutParams layoutParams5 = textView2.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        layoutParams6.topToBottom = config.d;
        layoutParams6.verticalBias = config.f166603c;
        layoutParams6.verticalChainStyle = config.f166602b;
        ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = config.f166601a;
        textView2.setLayoutParams(layoutParams6);
        H();
    }

    @Override // ms0.i2
    public final boolean b(OnMeasureCallbackConstraintLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        I();
        boolean zH = H();
        PromptMarketingContentDelegate.Model.AnimationType animationType = this.v;
        if (animationType != null) {
            this.v = null;
            AnimatorSet animatorSet = this.f54674w;
            if (animatorSet != null) {
                animatorSet.end();
            }
            this.f54674w = null;
            F(animationType, true);
        }
        return zH;
    }
}
