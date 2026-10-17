package uz;

import android.animation.ValueAnimator;
import com.revolut.camerakit.ui.views.view.TrackingFaceMaskView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class j0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackingFaceMaskView f284529b;

    public /* synthetic */ j0(TrackingFaceMaskView trackingFaceMaskView, int i) {
        this.f284528a = i;
        this.f284529b = trackingFaceMaskView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animator) {
        int i = this.f284528a;
        TrackingFaceMaskView trackingFaceMaskView = this.f284529b;
        switch (i) {
            case 0:
                TrackingFaceMaskView.a aVar = TrackingFaceMaskView.Companion;
                x9m.b bVar = (x9m.b) z9h.n.g(animator, "animator", "null cannot be cast to non-null type dev.romainguy.kotlin.math.Float2");
                k0 k0Var = trackingFaceMaskView.k;
                k0Var.f284532a = bVar.f303748a;
                k0Var.f284533b = bVar.f303749b;
                trackingFaceMaskView.invalidate();
                break;
            case 1:
                TrackingFaceMaskView.a aVar2 = TrackingFaceMaskView.Companion;
                Intrinsics.checkNotNullParameter(animator, "animator");
                k0 k0Var2 = trackingFaceMaskView.k;
                Object animatedValue = animator.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                k0Var2.d = ((Float) animatedValue).floatValue();
                trackingFaceMaskView.invalidate();
                break;
            case 2:
                TrackingFaceMaskView.a aVar3 = TrackingFaceMaskView.Companion;
                Intrinsics.checkNotNullParameter(animator, "animator");
                k0 k0Var3 = trackingFaceMaskView.k;
                Object animatedValue2 = animator.getAnimatedValue();
                Intrinsics.i(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                k0Var3.f284534c = ((Float) animatedValue2).floatValue();
                trackingFaceMaskView.invalidate();
                break;
            default:
                TrackingFaceMaskView.a aVar4 = TrackingFaceMaskView.Companion;
                Intrinsics.checkNotNullParameter(animator, "animation");
                Object animatedValue3 = animator.getAnimatedValue();
                Integer num = animatedValue3 instanceof Integer ? (Integer) animatedValue3 : null;
                if (num != null) {
                    trackingFaceMaskView.f50885q = num.intValue();
                    trackingFaceMaskView.invalidate();
                }
                break;
        }
    }
}
