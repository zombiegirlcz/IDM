package rp0;

import android.transition.Transition;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j0 implements Transition.TransitionListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f256101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f256102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f256103c;

    public j0(int i, m0 overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        this.f256101a = i;
        this.f256102b = overlay;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        if (this.f256103c) {
            return;
        }
        m0 m0Var = this.f256102b;
        int i = this.f256101a;
        if (i == 0) {
            m0Var.b();
        } else if (i == 1) {
            m0Var.a();
        }
        this.f256103c = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (this.f256101a != 1 || this.f256103c) {
            return;
        }
        this.f256102b.a();
        this.f256103c = true;
    }
}
