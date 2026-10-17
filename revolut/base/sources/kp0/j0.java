package kp0;

import android.view.animation.AccelerateInterpolator;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieAnimationView f188024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k0.b f188025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k0.b f188026c;
    public i0 d;
    public g0 e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Image f188027g;

    public j0(LottieAnimationView lottieView) {
        Intrinsics.checkNotNullParameter(lottieView, "lottieView");
        this.f188024a = lottieView;
    }

    public final void a() {
        this.f++;
        LottieAnimationView lottieAnimationView = this.f188024a;
        lottieAnimationView.setScaleX(1.0f);
        lottieAnimationView.setScaleY(1.0f);
        lottieAnimationView.setAlpha(1.0f);
        this.f188026c = null;
        lottieAnimationView.animate().cancel();
        k0.b bVar = this.f188025b;
        if (bVar != null) {
            lottieAnimationView.removeCallbacks(bVar);
        }
        this.f188025b = null;
        i0 i0Var = this.d;
        if (i0Var != null) {
            lottieAnimationView.removeAnimatorListener(i0Var);
        }
        this.d = null;
        g0 g0Var = this.e;
        if (g0Var != null) {
            lottieAnimationView.removeCallbacks(g0Var);
        }
        this.e = null;
    }

    public final void b(Image image) {
        this.f188026c = new k0.b(this, image, 5);
        this.f188024a.animate().scaleX(BitmapDescriptorFactory.HUE_RED).scaleY(BitmapDescriptorFactory.HUE_RED).alpha(BitmapDescriptorFactory.HUE_RED).setDuration(200L).setInterpolator(new AccelerateInterpolator()).withEndAction(new fp0.l(this, 29)).start();
    }

    public final void c(Image image) {
        yy0.f.e(or0.u.k(this.f188024a).Q(), image, this.f188024a, null, null, 12);
    }
}
