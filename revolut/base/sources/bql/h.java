package bql;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.signin_sessions_flow.a f17854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17855x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.sso.impl.ui.signin_sessions_flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f17854w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f17855x |= Integer.MIN_VALUE;
        return com.revolut.sso.impl.ui.signin_sessions_flow.a.J2(this.f17854w, this);
    }
}
