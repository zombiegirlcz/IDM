package kp0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f188018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f188019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f188020c;

    public i0(j0 j0Var, long j2, Function0 function0) {
        this.f188018a = j0Var;
        this.f188019b = j2;
        this.f188020c = function0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        j0 j0Var = this.f188018a;
        j0Var.f188024a.removeAnimatorListener(this);
        j0Var.d = null;
        if (this.f188019b == j0Var.f) {
            this.f188020c.invoke();
        }
    }
}
