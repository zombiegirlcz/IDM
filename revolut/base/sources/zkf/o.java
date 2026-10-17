package zkf;

import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.c {
    public a3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uvl.c f322972w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f322973x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(uvl.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f322972w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f322973x |= Integer.MIN_VALUE;
        return uvl.c.a(this.f322972w, null, null, this);
    }
}
