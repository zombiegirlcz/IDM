package tsj;

import yhm.m;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f274136w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, gim.c cVar) {
        super(cVar);
        this.v = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f274136w |= Integer.MIN_VALUE;
        Object objB = this.v.b(null, null, this);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : new m(objB);
    }
}
