package jy0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ix0.i1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f179268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f179269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ValueAnimator valueAnimator, m mVar, boolean z) {
        super(valueAnimator);
        this.f179268b = mVar;
        this.f179269c = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f179268b.o = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.f179269c) {
            float fB = i1.b(0.3f, BitmapDescriptorFactory.HUE_RED, animation.getAnimatedFraction());
            this.f179268b.d.k = io0.a.d(fB, -1);
        }
    }
}
