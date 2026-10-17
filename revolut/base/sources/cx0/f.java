package cx0;

import android.animation.Animator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f109882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f109883c;

    public /* synthetic */ f(Function0 function0, Function0 function02, int i) {
        this.f109881a = i;
        this.f109882b = function0;
        this.f109883c = function02;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f109881a) {
        }
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f109881a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                Function0 function0 = this.f109883c;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f109883c.invoke();
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        switch (this.f109881a) {
        }
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        switch (this.f109881a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                Function0 function0 = this.f109882b;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f109882b.invoke();
                break;
        }
    }
}
