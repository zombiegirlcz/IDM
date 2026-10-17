package zkf;

import tof.t3;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.c {
    public t3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f322964w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f322965x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, gim.c cVar) {
        super(cVar);
        this.f322964w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f322965x |= Integer.MIN_VALUE;
        return n.Z2(this.f322964w, null, this);
    }
}
