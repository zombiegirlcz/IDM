package ji5;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f174360w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.v = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f174360w |= Integer.MIN_VALUE;
        Object objC = this.v.c(null, this);
        return objC == fim.a.COROUTINE_SUSPENDED ? objC : new yhm.m(objC);
    }
}
