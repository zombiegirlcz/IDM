package vgf;

import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public a3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f289073w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f289074x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f289073w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f289074x |= Integer.MIN_VALUE;
        return this.f289073w.a(null, this);
    }
}
