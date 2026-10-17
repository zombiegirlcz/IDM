package rp0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q1 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f256156b;

    public /* synthetic */ q1(s1 s1Var, int i) {
        this.f256155a = i;
        this.f256156b = s1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f256155a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                s1 s1Var = this.f256156b;
                s1Var.c();
                s1Var.k(o1.HIDDEN);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f256156b.k(o1.SHOWN);
                break;
        }
    }
}
