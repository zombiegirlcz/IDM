package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes13.dex */
public final class a2 extends wkm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f289993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public skm.l f289994b;

    @Override // wkm.c
    public final boolean a(wkm.a aVar) {
        z1 z1Var = (z1) aVar;
        if (this.f289993a >= 0) {
            return false;
        }
        long j2 = z1Var.i;
        if (j2 < z1Var.f290162j) {
            z1Var.f290162j = j2;
        }
        this.f289993a = j2;
        return true;
    }

    @Override // wkm.c
    public final Continuation[] b(wkm.a aVar) {
        long j2 = this.f289993a;
        this.f289993a = -1L;
        this.f289994b = null;
        return ((z1) aVar).w(j2);
    }
}
