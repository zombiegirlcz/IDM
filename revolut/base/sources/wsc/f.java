package wsc;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements DefaultLifecycleObserver, e0m.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ru0.d f299703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f299704b;

    public f(ru0.d getScreenshotDetector) {
        Intrinsics.checkNotNullParameter(getScreenshotDetector, "getScreenshotDetector");
        this.f299703a = getScreenshotDetector;
    }

    @Override // e0m.d
    public final void init() {
        ru0.d dVar = this.f299703a;
        ((a) dVar.invoke()).init();
        if (this.f299704b) {
            ((a) dVar.invoke()).b();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ((a) this.f299703a.invoke()).b();
        this.f299704b = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ((a) this.f299703a.invoke()).c();
        this.f299704b = false;
    }
}
