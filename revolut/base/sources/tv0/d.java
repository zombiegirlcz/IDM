package tv0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.WindowInsetsAnimation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f274661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WindowInsetsAnimation f274662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f274663c;
    public final /* synthetic */ int d;
    public final /* synthetic */ e e;

    public d(WindowInsetsAnimation windowInsetsAnimation, Function1 function1, int i, e eVar) {
        this.f274662b = windowInsetsAnimation;
        this.f274663c = function1;
        this.d = i;
        this.e = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f274661a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        if (!this.f274661a) {
            this.f274662b.setFraction(1.0f);
            this.f274663c.invoke(Integer.valueOf(this.d));
        }
        this.e.c(this.f274662b);
    }
}
