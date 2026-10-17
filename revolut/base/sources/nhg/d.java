package nhg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f215466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f215467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f215468c;
    public final /* synthetic */ float d;

    public d(boolean z, ViewGroup viewGroup, float f, float f4) {
        this.f215466a = z;
        this.f215467b = viewGroup;
        this.f215468c = f;
        this.d = f4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        float f = this.d;
        ViewGroup viewGroup = this.f215467b;
        viewGroup.setAlpha(f);
        viewGroup.setVisibility(this.f215466a ? 0 : 8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.f215466a) {
            return;
        }
        this.f215467b.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        boolean z = this.f215466a;
        ViewGroup viewGroup = this.f215467b;
        if (z) {
            viewGroup.setVisibility(0);
        }
        viewGroup.setAlpha(this.f215468c);
    }
}
