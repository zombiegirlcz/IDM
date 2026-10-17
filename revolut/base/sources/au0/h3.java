package au0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class h3 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f9223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9224c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h3(k3 k3Var, ValueAnimator valueAnimator, float f) {
        this.f9222a = 0;
        this.f9224c = k3Var;
        this.d = valueAnimator;
        this.f9223b = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        int i = this.f9222a;
        Object obj2 = this.d;
        float f = this.f9223b;
        Object obj3 = this.f9224c;
        switch (i) {
            case 0:
                k3 k3Var = (k3) obj3;
                Intrinsics.checkNotNullParameter(animation, "animation");
                ViewGroup.LayoutParams layoutParams = k3Var.M().getLayoutParams();
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.width = ((Integer) animatedValue).intValue();
                k3Var.M().requestLayout();
                if (animation.getCurrentPlayTime() > ((ValueAnimator) obj2).getDuration() / ((long) 4)) {
                    float animatedFraction = animation.getAnimatedFraction() * f;
                    k3Var.P().setAlpha(animatedFraction);
                    k3Var.O().setAlpha(animatedFraction);
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "it");
                ((kotlin.jvm.internal.m0) obj3).f186427a = (1 - animation.getAnimatedFraction()) * f;
                ((View) obj2).invalidateOutline();
                break;
            default:
                View view = (View) obj2;
                vp0.h hVar = wp0.h.f299001a;
                Intrinsics.checkNotNullParameter(animation, "it");
                Object obj4 = ((Ref$ObjectRef) obj3).f186409a;
                if (obj4 != null) {
                    Object animatedValue2 = animation.getAnimatedValue();
                    Intrinsics.i(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                    ((iv0.s) obj4).f168696a = ((Float) animatedValue2).floatValue() * f;
                    view.invalidateOutline();
                }
                break;
        }
    }

    public /* synthetic */ h3(Serializable serializable, float f, View view, int i) {
        this.f9222a = i;
        this.f9224c = serializable;
        this.f9223b = f;
        this.d = view;
    }
}
