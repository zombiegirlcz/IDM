package et0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.hd;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f129011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f129012c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ValueAnimator valueAnimator, Object obj2, Object obj3, int i) {
        super(valueAnimator);
        this.f129011b = i;
        this.f129012c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f129011b) {
        }
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f129011b) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((View) this.f129012c).setVisibility(8);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((Function1) this.f129012c).invoke(animator);
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((jy0.m) this.f129012c).e();
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f129011b) {
        }
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f129011b) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((jy0.m) this.f129012c).k();
                break;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        switch (this.f129011b) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                View view = (View) this.d;
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                view.setTranslationY(((Float) animatedValue).floatValue());
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((Function1) this.d).invoke(animation);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                hd.a aVar = hd.Companion;
                jy0.m mVar = (jy0.m) this.f129012c;
                HomeOverlayConfig homeOverlayConfig = mVar.f179273g;
                aVar.getClass();
                if (!hd.a.a(homeOverlayConfig)) {
                    AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = (AccelerateDecelerateInterpolator) this.d;
                    Object animatedValue2 = animation.getAnimatedValue();
                    Intrinsics.i(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                    float interpolation = accelerateDecelerateInterpolator.getInterpolation(((Float) animatedValue2).floatValue());
                    Interpolator easing = hd.i;
                    Intrinsics.checkNotNullParameter(easing, "easing");
                    mVar.c(interpolation, easing, (jy0.f) mVar.B.getValue());
                } else {
                    Object animatedValue3 = animation.getAnimatedValue();
                    Intrinsics.i(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                    float fFloatValue = ((Float) animatedValue3).floatValue();
                    Interpolator easing2 = jq0.r.f177395g;
                    Intrinsics.checkNotNullParameter(easing2, "easing");
                    mVar.c(fFloatValue, easing2, (jy0.d) mVar.D.getValue());
                }
                break;
        }
    }
}
