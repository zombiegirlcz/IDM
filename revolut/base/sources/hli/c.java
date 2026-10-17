package hli;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements a, LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f153463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f153464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f153465c;
    public final Lifecycle d;
    public b e;

    public c(Context context, f onBlock, f onUnblock, Lifecycle controllerLifecycle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onBlock, "onBlock");
        Intrinsics.checkNotNullParameter(onUnblock, "onUnblock");
        Intrinsics.checkNotNullParameter(controllerLifecycle, "controllerLifecycle");
        this.f153463a = context;
        this.f153464b = onBlock;
        this.f153465c = onUnblock;
        this.d = controllerLifecycle;
    }

    public final void a() {
        Lifecycle lifecycle = this.d;
        if (lifecycle.getState() != Lifecycle.State.RESUMED) {
            return;
        }
        lifecycle.addObserver(this);
        AppCompatActivity appCompatActivityD = v04.b.d(this.f153463a);
        if (this.e == null && appCompatActivityD != null) {
            b bVar = new b(true);
            this.e = bVar;
            appCompatActivityD.getOnBackPressedDispatcher().addCallback(bVar);
        }
        this.f153464b.invoke(this);
    }

    public final void b() {
        this.d.removeObserver(this);
        b bVar = this.e;
        if (bVar != null) {
            bVar.remove();
        }
        this.e = null;
        this.f153465c.invoke(this);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.d.getState() != Lifecycle.State.RESUMED) {
            b();
        }
    }
}
