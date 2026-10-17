package c9;

import android.animation.ValueAnimator;
import com.facebook.shimmer.ShimmerDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ShimmerDrawable f22264a;

    public h(ShimmerDrawable shimmerDrawable) {
        this.f22264a = shimmerDrawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f22264a.invalidateSelf();
    }
}
