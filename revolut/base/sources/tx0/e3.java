package tx0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.animation.AnimationUtils;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e3 extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatTextView f275113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f275114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f275115c;
    public int d;
    public final int e;
    public final /* synthetic */ NavBarWithContainerHeaderView f;

    public e3(NavBarWithContainerHeaderView navBarWithContainerHeaderView, AppCompatTextView view, int i, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f = navBarWithContainerHeaderView;
        this.f275113a = view;
        this.f275114b = i;
        this.f275115c = z;
        this.e = i == 0 ? navBarWithContainerHeaderView.f59374a0 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r18) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tx0.e3.a(boolean):void");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f275113a.setVisibility(this.f275114b);
        NavBarWithContainerHeaderView navBarWithContainerHeaderView = this.f;
        navBarWithContainerHeaderView.setMessageAnimRunning(false);
        navBarWithContainerHeaderView.f59384k0 = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.f275114b == 0) {
            this.f275113a.setVisibility(0);
        }
        this.d = this.f.W;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f.setMessageCurrentInset$ui_kit_components_release(AnimationUtils.lerp(this.d, this.e, animator.getAnimatedFraction()));
    }
}
