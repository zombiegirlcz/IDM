package okl;

/* JADX INFO: loaded from: classes12.dex */
public final class e1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f226172w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.revolut.sso.impl.ui.auth.n nVar, gim.c cVar) {
        super(cVar);
        this.v = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f226172w |= Integer.MIN_VALUE;
        return com.revolut.sso.impl.ui.auth.n.M2(this.v, null, this);
    }
}
