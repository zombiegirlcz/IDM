package wq0;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.CaptionsView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nu0.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements n {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptionsView f299372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f299373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f299374c;
    public ViewPropertyAnimator d;

    public d(CaptionsView captionsView, boolean z, b animationSpeed) {
        Intrinsics.checkNotNullParameter(captionsView, "captionsView");
        Intrinsics.checkNotNullParameter(animationSpeed, "animationSpeed");
        this.f299372a = captionsView;
        this.f299373b = z;
        this.f299374c = animationSpeed;
    }

    @Override // nu0.d
    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.d = null;
        CaptionsView captionsView = this.f299372a;
        captionsView.setVisibility(0);
        captionsView.setAlpha(1.0f);
        if (this.f299373b) {
            captionsView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // nu0.d
    public final void b(Function0 startAction, Function0 endAction, boolean z) {
        Intrinsics.checkNotNullParameter(startAction, "startAction");
        Intrinsics.checkNotNullParameter(endAction, "endAction");
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        CaptionsView captionsView = this.f299372a;
        Context context = captionsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fK = kli.a.k(context, 8.0f);
        int i = z ? -1 : 1;
        boolean z3 = this.f299373b;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (z3) {
            captionsView.setTranslationY(z ? fK : 0.0f);
        }
        captionsView.setAlpha(z ? 0.0f : 1.0f);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = captionsView.animate();
        if (z) {
            f = 1.0f;
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(f);
        if (z3) {
            viewPropertyAnimatorAlpha = viewPropertyAnimatorAlpha.translationYBy(fK * i);
        }
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = viewPropertyAnimatorAlpha.setDuration(this.f299374c.getMillis()).setInterpolator(new LinearInterpolator()).withStartAction(new a(z, this, startAction)).withEndAction(new a(this, z, endAction));
        Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorWithEndAction, "withEndAction(...)");
        viewPropertyAnimatorWithEndAction.start();
        this.d = viewPropertyAnimatorWithEndAction;
    }

    @Override // nu0.d
    public final boolean c() {
        return this.d != null;
    }
}
