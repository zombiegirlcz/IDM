package j90;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import sim.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d, LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Lifecycle f172271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f172272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f172273c;

    public abstract View a(Object obj2);

    public abstract Lifecycle b(Object obj2);

    @Override // sim.d
    public final Object getValue(Object obj2, KProperty property) {
        Lifecycle lifecycleB;
        Intrinsics.checkNotNullParameter(property, "property");
        if (!this.f172272b && (lifecycleB = b(obj2)) != null && lifecycleB.getState() != Lifecycle.State.DESTROYED) {
            this.f172273c = a(obj2);
            this.f172271a = lifecycleB;
            this.f172272b = true;
            lifecycleB.addObserver(this);
        }
        View viewA = this.f172273c;
        if (viewA == null) {
            viewA = a(obj2);
        }
        if (viewA != null) {
            return viewA;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            Lifecycle lifecycle = this.f172271a;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
            this.f172273c = null;
            this.f172271a = null;
            this.f172272b = false;
        }
    }
}
