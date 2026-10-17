package mx0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class id extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f209762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hd f209763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f209764c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;

    public id(hd hdVar, ValueAnimator valueAnimator, View view, Function0 function0, Function0 function02) {
        this.f209763b = hdVar;
        this.f209764c = valueAnimator;
        this.d = view;
        this.e = function0;
        this.f = function02;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f209762a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f209763b.f209742g = null;
        if (!this.f209762a) {
            this.e.invoke();
            return;
        }
        Function0 function0 = this.f;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        ValueAnimator valueAnimator = this.f209764c;
        hd hdVar = this.f209763b;
        hdVar.f209742g = valueAnimator;
        hdVar.d = this.d;
    }
}
