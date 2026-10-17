package vqg;

import yhm.m;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f291396w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.v = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f291396w |= Integer.MIN_VALUE;
        Object objZ2 = this.v.Z2(null, this);
        return objZ2 == fim.a.COROUTINE_SUSPENDED ? objZ2 : new m(objZ2);
    }
}
