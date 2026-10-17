package hs0;

import androidx.transition.Transition;
import com.revolut.core.ui_kit.internal.drawables.RevolutAnimatableDrawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements Transition.TransitionListener {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutAnimatableDrawable f154855a;

    public f(RevolutAnimatableDrawable revolutAnimatableDrawable) {
        this.f154855a = revolutAnimatableDrawable;
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f154855a.c(false);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f154855a.c(false);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
    }
}
