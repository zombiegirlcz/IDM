package zmg;

import elm.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import smd.s;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends nri.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f323512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cng.b f323513c;
    public final s d;

    public e(CoroutineScope coroutineScope, cng.b registeredIdentityInterceptor, s synchronizer) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(registeredIdentityInterceptor, "registeredIdentityInterceptor");
        Intrinsics.checkNotNullParameter(synchronizer, "synchronizer");
        this.f323512b = coroutineScope;
        this.f323513c = registeredIdentityInterceptor;
        this.d = synchronizer;
    }

    @Override // nri.a
    public final void i3() {
        p0 p0Var = p0.f264001a;
        e0.C(this.f323512b, f.f127540b, null, new yzb.c(this, null, 27), 2);
    }
}
