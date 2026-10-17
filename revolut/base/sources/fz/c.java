package fz;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements LifecycleOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleRegistry f139067a = new LifecycleRegistry(this);

    public final void a(Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f139067a.handleLifecycleEvent(event);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f139067a;
    }
}
