package yp0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import ix0.a2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class c implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValueAnimator f315715a;

    public c(ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f315715a = animator;
    }

    @Override // ix0.a2
    public final void cancel() {
        ValueAnimator valueAnimator = this.f315715a;
        valueAnimator.removeUpdateListener(this);
        valueAnimator.removeListener(this);
    }
}
