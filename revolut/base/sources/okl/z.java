package okl;

import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;

/* JADX INFO: loaded from: classes12.dex */
public final class z extends gim.c {
    public AuthenticationFlowContract$State.ExternalClientAuthentication u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226254w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226255x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.sso.impl.ui.auth.n nVar, gim.c cVar) {
        super(cVar);
        this.f226254w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f226255x |= Integer.MIN_VALUE;
        return com.revolut.sso.impl.ui.auth.n.J2(this.f226254w, this);
    }
}
