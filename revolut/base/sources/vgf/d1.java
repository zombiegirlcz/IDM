package vgf;

import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class d1 extends gim.c {
    public a3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f289083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f289084x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, gim.c cVar) {
        super(cVar);
        this.f289083w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f289084x |= Integer.MIN_VALUE;
        return this.f289083w.c(null, this);
    }
}
