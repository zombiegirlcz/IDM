package fkf;

import r10.q;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f135810w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q qVar, gim.c cVar) {
        super(cVar);
        this.v = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f135810w |= Integer.MIN_VALUE;
        return this.v.B(null, this);
    }
}
