package lde;

import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public i7 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f194078w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f194079x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, gim.c cVar) {
        super(cVar);
        this.f194078w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f194079x |= Integer.MIN_VALUE;
        return this.f194078w.a(this);
    }
}
