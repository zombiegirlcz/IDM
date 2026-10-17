package lmg;

import fmg.u;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.c {
    public u u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k7i.i f197062w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f197063x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k7i.i iVar, gim.c cVar) {
        super(cVar);
        this.f197062w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f197063x |= Integer.MIN_VALUE;
        return this.f197062w.o(null, this);
    }
}
