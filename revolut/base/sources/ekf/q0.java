package ekf;

import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 extends gim.c {
    public a3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r0 f127115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127116x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, gim.c cVar) {
        super(cVar);
        this.f127115w = r0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f127116x |= Integer.MIN_VALUE;
        return this.f127115w.Z2(null, this);
    }
}
