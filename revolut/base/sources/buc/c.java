package buc;

import r10.t;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18761w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t tVar, gim.c cVar) {
        super(cVar);
        this.v = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f18761w |= Integer.MIN_VALUE;
        return this.v.g(this);
    }
}
