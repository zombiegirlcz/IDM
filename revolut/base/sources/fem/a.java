package fem;

import kem.q0;
import kem.r;
import kem.t;
import kem.y;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wdm.f f134654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f134655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f134656c;
    public final t d;
    public final oem.e e;

    public a(wdm.f call, e data) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f134654a = call;
        this.f134655b = data.f134661b;
        this.f134656c = data.f134660a;
        this.d = data.f134662c;
        this.e = data.f;
    }

    @Override // fem.b
    public final oem.e getAttributes() {
        return this.e;
    }

    @Override // fem.b, kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f134654a.getCoroutineContext();
    }

    @Override // kem.v
    public final r getHeaders() {
        return this.d;
    }

    @Override // fem.b
    public final y getMethod() {
        return this.f134655b;
    }

    @Override // fem.b
    public final q0 getUrl() {
        return this.f134656c;
    }
}
