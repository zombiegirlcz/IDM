package jlf;

import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.c {
    public a3 u;
    public r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f175752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f175753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f175754y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, gim.c cVar) {
        super(cVar);
        this.f175753x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f175752w = obj2;
        this.f175754y |= Integer.MIN_VALUE;
        return this.f175753x.c(null, null, this);
    }
}
