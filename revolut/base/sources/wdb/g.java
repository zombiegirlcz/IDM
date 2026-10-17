package wdb;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f296517w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n nVar, gim.c cVar) {
        super(cVar);
        this.v = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f296517w |= Integer.MIN_VALUE;
        Object objA = n.a(this.v, null, null, null, 0, this);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
    }
}
