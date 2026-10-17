package yt0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f316589b;

    public /* synthetic */ q(int i, Function0 function0) {
        this.f316588a = i;
        this.f316589b = function0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f316588a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f316589b.invoke();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f316589b.invoke();
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f316589b.invoke();
                break;
        }
    }
}
