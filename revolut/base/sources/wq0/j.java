package wq0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements nu0.d {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f299383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPropertyAnimator f299384b;

    public j(ImageView wrappedView) {
        Intrinsics.checkNotNullParameter(wrappedView, "wrappedView");
        this.f299383a = wrappedView;
    }

    @Override // nu0.d
    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.f299384b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f299384b = null;
        View view = this.f299383a;
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    @Override // nu0.d
    public final void b(Function0 startAction, Function0 endAction, boolean z) {
        Intrinsics.checkNotNullParameter(startAction, "startAction");
        Intrinsics.checkNotNullParameter(endAction, "endAction");
        ViewPropertyAnimator viewPropertyAnimator = this.f299384b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        float f = z ? 0.0f : 1.0f;
        View view = this.f299383a;
        view.setAlpha(f);
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = view.animate().alpha(z ? 1.0f : 0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).withStartAction(new h(z, this, startAction)).withEndAction(new h(this, z, endAction));
        Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorWithEndAction, "withEndAction(...)");
        viewPropertyAnimatorWithEndAction.start();
        this.f299384b = viewPropertyAnimatorWithEndAction;
    }

    @Override // nu0.d
    public final boolean c() {
        return this.f299384b != null;
    }
}
