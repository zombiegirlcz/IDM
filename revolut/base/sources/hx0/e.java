package hx0;

import android.app.ActivityOptions;
import android.content.Intent;
import android.transition.Transition;
import android.util.Pair;
import android.view.Window;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.view.ComponentActivity;
import com.revolut.core.ui_kit.transition.TransitionFixActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d, DefaultLifecycleObserver, Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentActivity f156304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f156305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f156306c;
    public boolean d;
    public WeakReference e;
    public Transition f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Transition f156307g;

    public e(ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f156304a = activity;
    }

    public final void a(Transition transition) {
        Transition transition2 = this.f;
        if (transition2 != null) {
            transition2.removeListener(this);
        }
        if (transition != null) {
            transition.removeListener(this);
        }
        if (transition != null) {
            transition.addListener(this);
        }
        this.f = transition;
        d.Companion.getClass();
        Window window = this.f156304a.getWindow();
        if (window != null) {
            window.setEnterTransition(transition);
        }
    }

    public final void b(Transition transition) {
        Transition transition2 = this.f156307g;
        if (transition2 != null) {
            transition2.removeListener(this);
        }
        if (transition != null) {
            transition.removeListener(this);
        }
        if (transition != null) {
            transition.addListener(this);
        }
        this.f156307g = transition;
        d.Companion.getClass();
        Window window = this.f156304a.getWindow();
        if (window != null) {
            window.setReenterTransition(transition);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        d.Companion.getClass();
        ComponentActivity activity = this.f156304a;
        if (activity.isFinishing()) {
            return;
        }
        boolean z = false;
        if (this.d) {
            this.f156306c = false;
            this.d = false;
            Intent intent = new Intent(activity, (Class<?>) TransitionFixActivity.class);
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(activity, new Pair[0]).toBundle());
            return;
        }
        if ((this.f != null || this.f156307g != null) && activity.isActivityTransitionRunning()) {
            z = true;
        }
        this.f156306c = z;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        d.Companion.getClass();
        if (this.f156304a.isFinishing()) {
            return;
        }
        if (this.f156306c && !this.f156305b) {
            this.d = true;
        }
        this.f156305b = true;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        this.f156306c = false;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f156306c = false;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
