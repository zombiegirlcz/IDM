package bql;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.sso.impl.ui.signin_sessions_flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17850w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.sso.impl.ui.signin_sessions_flow.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f17850w |= Integer.MIN_VALUE;
        return com.revolut.sso.impl.ui.signin_sessions_flow.a.I2(this.v, null, this);
    }
}
