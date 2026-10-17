package iy0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import com.revolut.core.ui_kit.views.video.ZoomableFullScreenVideoView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends yp0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f169579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ZoomableFullScreenVideoView f169580c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ValueAnimator valueAnimator, boolean z, ZoomableFullScreenVideoView zoomableFullScreenVideoView, boolean z3) {
        super(valueAnimator);
        this.f169579b = z;
        this.f169580c = zoomableFullScreenVideoView;
        this.d = z3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        if (this.f169579b) {
            return;
        }
        this.f169580c.setForeground(null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        if (this.d) {
            ZoomableFullScreenVideoView zoomableFullScreenVideoView = this.f169580c;
            zoomableFullScreenVideoView.setForeground(zoomableFullScreenVideoView.f59754j);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        RevolutShimmerDrawable revolutShimmerDrawable = this.f169580c.f59754j;
        if (revolutShimmerDrawable != null) {
            Object animatedValue = animation.getAnimatedValue();
            Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            revolutShimmerDrawable.setAlpha(((Integer) animatedValue).intValue());
        }
    }
}
