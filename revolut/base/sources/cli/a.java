package cli;

import android.transition.Transition;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bvb.a f25013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Transition f25015c;
    public Transition d;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) throws IOException {
        this.f25014b = false;
        bvb.a aVar = this.f25013a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) throws IOException {
        this.f25014b = false;
        bvb.a aVar = this.f25013a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.f25014b = true;
    }
}
