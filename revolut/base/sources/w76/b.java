package w76;

import e0m.d;
import elm.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f295485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ux8.b f295486b;

    public b(CoroutineScope coroutineScope, ux8.b deviceFingerprintInteractorProvider) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(deviceFingerprintInteractorProvider, "deviceFingerprintInteractorProvider");
        this.f295485a = coroutineScope;
        this.f295486b = deviceFingerprintInteractorProvider;
    }

    @Override // e0m.d
    public final void init() {
        p0 p0Var = p0.f264001a;
        e0.C(this.f295485a, f.f127540b, null, new a(this, null, 0), 2);
    }
}
