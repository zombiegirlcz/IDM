package ip0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k50 implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f164961a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animator.AnimatorListener f164962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f164963c;

    public k50(Animator.AnimatorListener animatorListener, View view) {
        this.f164962b = animatorListener;
        this.f164963c = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Animator.AnimatorListener animatorListener = this.f164962b;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        View view = this.f164963c;
        view.setClipBounds(null);
        view.animate().setUpdateListener(null);
        Animator.AnimatorListener animatorListener = this.f164962b;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Animator.AnimatorListener animatorListener = this.f164962b;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Animator.AnimatorListener animatorListener = this.f164962b;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animation);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        View view = this.f164963c;
        int i = -((int) view.getTranslationY());
        int width = view.getWidth();
        int height = view.getHeight() + i;
        Rect rect = this.f164961a;
        rect.set(0, i, width, height);
        view.setClipBounds(rect);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation, boolean z) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Animator.AnimatorListener animatorListener = this.f164962b;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animation, z);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation, boolean z) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Animator.AnimatorListener animatorListener = this.f164962b;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animation, z);
        }
    }
}
