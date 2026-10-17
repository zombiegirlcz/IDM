package r8;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i implements h, LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f252287a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lifecycle f252288b;

    public i(Lifecycle lifecycle) {
        this.f252288b = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // r8.h
    public final void c(j jVar) {
        this.f252287a.remove(jVar);
    }

    @Override // r8.h
    public final void d(j jVar) {
        this.f252287a.add(jVar);
        Lifecycle lifecycle = this.f252288b;
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            jVar.onDestroy();
        } else if (lifecycle.getState().isAtLeast(Lifecycle.State.STARTED)) {
            jVar.onStart();
        } else {
            jVar.onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it8 = y8.l.e(this.f252287a).iterator();
        while (it8.hasNext()) {
            ((j) it8.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it8 = y8.l.e(this.f252287a).iterator();
        while (it8.hasNext()) {
            ((j) it8.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it8 = y8.l.e(this.f252287a).iterator();
        while (it8.hasNext()) {
            ((j) it8.next()).onStop();
        }
    }
}
