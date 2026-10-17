package ap0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import et0.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f8051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(ValueAnimator valueAnimator, View view, int i) {
        super(valueAnimator);
        this.f8050b = i;
        this.f8051c = view;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f8050b) {
        }
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8050b) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                z zVar = (z) this.f8051c;
                zVar.f129161r = false;
                zVar.g();
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f8050b) {
        }
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f8050b) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((z) this.f8051c).f(300L, false);
                break;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        switch (this.f8050b) {
            case 0:
                float fFloatValue = ((Float) z9h.n.g(animation, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                View view = this.f8051c;
                view.setScaleX(fFloatValue);
                view.setScaleY(fFloatValue);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }
}
