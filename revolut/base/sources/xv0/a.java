package xv0;

import android.view.animation.Animation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f309143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f309144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xub.e f309145c;

    public a() {
        this(null, null, 7);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f309144b.invoke(animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f309145c.invoke(animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f309143a.invoke(animation);
    }

    public a(dyl.i iVar, Function1 onAnimationEndAction, int i) {
        Function1 onAnimationStartAction = iVar;
        onAnimationStartAction = (i & 1) != 0 ? new xub.e(2) : onAnimationStartAction;
        onAnimationEndAction = (i & 2) != 0 ? new xub.e(3) : onAnimationEndAction;
        xub.e onAnimationRepeatAction = new xub.e(4);
        Intrinsics.checkNotNullParameter(onAnimationStartAction, "onAnimationStartAction");
        Intrinsics.checkNotNullParameter(onAnimationEndAction, "onAnimationEndAction");
        Intrinsics.checkNotNullParameter(onAnimationRepeatAction, "onAnimationRepeatAction");
        this.f309143a = onAnimationStartAction;
        this.f309144b = onAnimationEndAction;
        this.f309145c = onAnimationRepeatAction;
    }
}
