package cr0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108171a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f108172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f108173c;

    public j(View view, boolean z) {
        this.f108172b = z;
        this.f108173c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f108171a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f108172b = true;
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animator");
                boolean z = this.f108172b;
                View view = this.f108173c;
                if (!z) {
                    view.setVisibility(4);
                } else {
                    view.setAlpha(1.0f);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f108171a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (!this.f108172b) {
                    this.f108173c.setVisibility(4);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animator");
                if (!this.f108172b) {
                    this.f108173c.setVisibility(4);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f108171a) {
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                if (this.f108172b) {
                    this.f108173c.setVisibility(0);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public j(View view) {
        this.f108173c = view;
    }
}
