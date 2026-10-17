package ix0;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements View.OnAttachStateChangeListener, LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f169234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d2 f169235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f169236c;
    public boolean d;
    public Lifecycle e;

    public f2(View view, d2 callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f169234a = view;
        this.f169235b = callback;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        View view = this.f169234a;
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = e2.f169228a[event.ordinal()];
        d2 d2Var = this.f169235b;
        if (i == 1) {
            if (this.f169236c) {
                return;
            }
            this.f169236c = true;
            d2Var.D(true);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            d2Var.C();
        } else if (this.f169236c) {
            this.f169236c = false;
            d2Var.D(false);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Lifecycle lifecycleA = te0.w.A(this.f169234a);
        this.e = lifecycleA;
        if (lifecycleA != null) {
            lifecycleA.addObserver(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (this.f169236c) {
            this.f169236c = false;
            this.f169235b.D(false);
        }
        Lifecycle lifecycle = this.e;
        if (lifecycle != null) {
            lifecycle.removeObserver(this);
        }
        this.e = null;
    }
}
