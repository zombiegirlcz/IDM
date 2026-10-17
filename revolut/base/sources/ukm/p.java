package ukm;

/* JADX INFO: loaded from: classes14.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f280818w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, gim.c cVar) {
        super(cVar);
        this.v = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f280818w |= Integer.MIN_VALUE;
        Object objK = this.v.K(null, 0, 0L, this);
        return objK == fim.a.COROUTINE_SUSPENDED ? objK : new z(objK);
    }
}
