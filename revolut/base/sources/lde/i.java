package lde;

import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.c {
    public i7 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f194080w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f194081x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f194080w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f194081x |= Integer.MIN_VALUE;
        return this.f194080w.b(this);
    }
}
