package u8e;

import yhm.m;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f278189w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, gim.c cVar) {
        super(cVar);
        this.v = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f278189w |= Integer.MIN_VALUE;
        Object objZ2 = this.v.Z2(null, this);
        return objZ2 == fim.a.COROUTINE_SUSPENDED ? objZ2 : new m(objZ2);
    }
}
