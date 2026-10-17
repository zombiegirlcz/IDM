package fz;

import android.content.ComponentCallbacks2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f139064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f139065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f139066n;

    public b(c cameraLifecycleOwner, com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(cameraLifecycleOwner, "cameraLifecycleOwner");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f139064l = cameraLifecycleOwner;
        this.f139065m = controller;
        this.f139066n = new a(this);
    }

    @Override // yji.n
    public final void D2() {
        ComponentCallbacks2 componentCallbacks2M2 = this.f139065m.m2();
        Intrinsics.i(componentCallbacks2M2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        ((LifecycleOwner) componentCallbacks2M2).getLifecycle().addObserver(this.f139066n);
        this.f139064l.a(Lifecycle.Event.ON_CREATE);
    }

    @Override // yji.n
    public final void E2() {
        this.f139064l.a(Lifecycle.Event.ON_DESTROY);
        ComponentCallbacks2 componentCallbacks2M2 = this.f139065m.m2();
        Intrinsics.i(componentCallbacks2M2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        ((LifecycleOwner) componentCallbacks2M2).getLifecycle().removeObserver(this.f139066n);
    }

    @Override // yji.n
    public final void F2() {
        this.f139064l.a(Lifecycle.Event.ON_STOP);
    }

    @Override // yji.n
    public final void H2() {
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        c cVar = this.f139064l;
        cVar.a(event);
        cVar.a(Lifecycle.Event.ON_RESUME);
    }
}
