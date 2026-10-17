package fkf;

import r10.q;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public f u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f135811w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f135812x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f135813y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q qVar, gim.c cVar) {
        super(cVar);
        this.f135812x = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f135811w = obj2;
        this.f135813y |= Integer.MIN_VALUE;
        return this.f135812x.M(null, this);
    }
}
