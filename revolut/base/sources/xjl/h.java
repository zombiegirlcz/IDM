package xjl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f306557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f306558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f306559c;

    public h(ne0.j cache, ue0.c storage, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f306557a = cache;
        this.f306558b = storage;
        this.f306559c = coroutineScope;
    }

    public final xil.m a() {
        xil.m mVar = (xil.m) this.f306557a.get("KEY_SSO_FLOW_SCOPE");
        return mVar == null ? (xil.m) j6.a.k(xil.m.class, this.f306558b, "KEY_SSO_FLOW_SCOPE") : mVar;
    }

    public final void b() {
        p0 p0Var = p0.f264001a;
        e0.C(this.f306559c, elm.f.f127540b, null, new x0f.g(this, null, 22), 2);
    }

    public final void c(xil.m scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        p0 p0Var = p0.f264001a;
        e0.C(this.f306559c, elm.f.f127540b, null, new g(this, scope, null, 0), 2);
    }
}
