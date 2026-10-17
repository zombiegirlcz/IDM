package t2m;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import x2m.f;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f267601a;

    public c(f settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f267601a = settings;
    }

    public abstract void a(f fVar);

    public abstract void b();

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        a(this.f267601a);
        b();
    }
}
