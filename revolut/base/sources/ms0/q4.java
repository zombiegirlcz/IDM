package ms0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.revolut.core.ui_kit.internal.views.SmallActionButtonWithPager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q4 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SmallActionButtonWithPager f208384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f208385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f208386c;
    public final /* synthetic */ int d;

    public q4(SmallActionButtonWithPager smallActionButtonWithPager, int i, int i2, int i3) {
        this.f208384a = smallActionButtonWithPager;
        this.f208385b = i;
        this.f208386c = i2;
        this.d = i3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        SmallActionButtonWithPager smallActionButtonWithPager = this.f208384a;
        smallActionButtonWithPager.f.setVisibility(this.f208385b);
        smallActionButtonWithPager.f56401g.setVisibility(this.f208386c);
        smallActionButtonWithPager.getPagerIndicatorView().setVisibility(this.d);
        smallActionButtonWithPager.k = null;
    }
}
