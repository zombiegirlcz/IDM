package aem;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes23.dex */
public final class g0 implements fem.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kem.y f3722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kem.q0 f3723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oem.e f3724c;
    public final kem.t d;

    public g0(fem.d dVar) {
        this.f3722a = dVar.f134658b;
        this.f3723b = dVar.f134657a.b();
        this.f3724c = dVar.f;
        this.d = dVar.f134659c.j();
    }

    @Override // fem.b
    public final oem.e getAttributes() {
        return this.f3724c;
    }

    @Override // fem.b, kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        throw new IllegalStateException("Call is not initialized");
    }

    @Override // kem.v
    public final kem.r getHeaders() {
        return this.d;
    }

    @Override // fem.b
    public final kem.y getMethod() {
        return this.f3722a;
    }

    @Override // fem.b
    public final kem.q0 getUrl() {
        return this.f3723b;
    }
}
