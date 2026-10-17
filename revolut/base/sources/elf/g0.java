package elf;

import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 extends gim.c {
    public a3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f127328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127329x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, gim.c cVar) {
        super(cVar);
        this.f127328w = h0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f127329x |= Integer.MIN_VALUE;
        return this.f127328w.b3(this);
    }
}
