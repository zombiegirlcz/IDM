package n30;

/* JADX INFO: loaded from: classes19.dex */
public final class n0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ p0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f211650w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, gim.c cVar) {
        super(cVar);
        this.v = p0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f211650w |= Integer.MIN_VALUE;
        Object objA = p0.a(this.v, this);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
    }
}
