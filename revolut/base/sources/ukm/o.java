package ukm;

/* JADX INFO: loaded from: classes14.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f280817w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, gim.c cVar) {
        super(cVar);
        this.v = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f280817w |= Integer.MIN_VALUE;
        Object objJ = q.J(this.v, this);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : new z(objJ);
    }
}
