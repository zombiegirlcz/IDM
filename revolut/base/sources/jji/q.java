package jji;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.transition.revolut.RevGhostViewFacade;
import com.revolut.core.ui_kit.views.ProfileCardView;
import ix0.b2;
import ix0.i1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f174974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f174975c;
    public final /* synthetic */ ProfileCardView d;
    public final /* synthetic */ ViewGroup e;
    public final /* synthetic */ ViewGroup f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f174976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ProfileCardView f174977h;
    public final /* synthetic */ View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f174978j;
    public final /* synthetic */ ViewGroup k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Drawable f174979l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ValueAnimator valueAnimator, r rVar, boolean z, ProfileCardView profileCardView, ViewGroup viewGroup, ViewGroup viewGroup2, boolean z3, ProfileCardView profileCardView2, View view, ViewGroup viewGroup3, ViewGroup viewGroup4, Drawable drawable) {
        super(valueAnimator);
        this.f174974b = rVar;
        this.f174975c = z;
        this.d = profileCardView;
        this.e = viewGroup;
        this.f = viewGroup2;
        this.f174976g = z3;
        this.f174977h = profileCardView2;
        this.i = view;
        this.f174978j = viewGroup3;
        this.k = viewGroup4;
        this.f174979l = drawable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f174974b.d();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        r rVar = this.f174974b;
        b2 b2Var = rVar.f174980g;
        Intrinsics.checkNotNullParameter(animator, "animator");
        ViewGroup viewGroup = this.e;
        ProfileCardView profileCardView = this.d;
        boolean z = this.f174975c;
        if (!z) {
            profileCardView.setImageEntryPointSize(b2Var, viewGroup);
            int width = this.f.getWidth();
            int width2 = profileCardView.getWidth();
            float f = (width2 == 0 || width == 0) ? 1.0f : ((width - width2) / (width2 * 2.0f)) + 1.0f;
            rVar.f174981h = f;
            profileCardView.setScaleX(f);
            profileCardView.setScaleY(rVar.f174981h);
        } else if (viewGroup != null) {
            viewGroup.setScaleX(1.0f);
            viewGroup.setScaleY(1.0f);
        }
        View rootView = profileCardView.getRootView();
        ViewGroup viewGroup2 = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup2 != null && viewGroup != null) {
            RevGhostViewFacade revGhostViewFacadeCreate = RevGhostViewFacade.INSTANCE.create(b2Var, viewGroup);
            revGhostViewFacadeCreate.attach(viewGroup2);
            rVar.f174982j = revGhostViewFacadeCreate;
            RevGhostViewFacade revGhostViewFacadeD = profileCardView.d();
            revGhostViewFacadeD.attach(viewGroup2);
            rVar.i = revGhostViewFacadeD;
        }
        if (!z) {
            profileCardView.setScaleX(1.0f);
            profileCardView.setScaleY(1.0f);
        } else if (viewGroup != null) {
            viewGroup.setScaleX(0.9f);
            viewGroup.setScaleY(0.9f);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        r rVar = this.f174974b;
        RectF rectF = rVar.k;
        Intrinsics.checkNotNullParameter(animation, "animation");
        ProfileCardView.INSTANCE.getClass();
        Interpolator interpolator = jq0.r.f177392a;
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float interpolation = interpolator.getInterpolation(((Float) animatedValue).floatValue());
        boolean z = this.f174976g;
        ProfileCardView profileCardView = this.f174977h;
        if (!z) {
            float fB = i1.b(1.0f, rVar.f174981h, interpolation);
            profileCardView.setScaleX(fB);
            profileCardView.setScaleY(fB);
        }
        float fB2 = i1.b(1.0f, 0.9f, interpolation);
        RevGhostViewFacade revGhostViewFacade = rVar.i;
        RevGhostViewFacade revGhostViewFacade2 = rVar.f174982j;
        View view = this.i;
        if (revGhostViewFacade != null && revGhostViewFacade2 != null) {
            RevGhostViewFacade.INSTANCE.lerpBounds(revGhostViewFacade2, revGhostViewFacade, rectF, interpolation);
            revGhostViewFacade2.setCurrentBounds(rectF);
            revGhostViewFacade2.view.setAlpha(1.0f - interpolation);
            revGhostViewFacade.setCurrentBounds(rectF);
            revGhostViewFacade.view.setAlpha(interpolation);
            if (view != null) {
                view.setTranslationX(revGhostViewFacade.centerXDiff(rectF));
                view.setTranslationY(revGhostViewFacade.centerYDiff(rectF));
            }
        }
        ViewGroup viewGroup = this.f174978j;
        if (viewGroup != null) {
            viewGroup.setScaleX(fB2);
        }
        if (viewGroup != null) {
            viewGroup.setScaleY(fB2);
        }
        profileCardView.c(interpolation);
        ViewGroup viewGroup2 = this.k;
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup2.getChildAt(i);
            if (childAt != view) {
                childAt.setAlpha(interpolation);
            }
        }
        Drawable drawable = this.f174979l;
        if (drawable != null) {
            drawable.setAlpha((int) (interpolation * 255));
        }
    }
}
