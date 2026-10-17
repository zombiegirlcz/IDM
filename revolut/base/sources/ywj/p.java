package ywj;

import bjl.n0;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.c {
    public n0 u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public cdd.c f317491w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f317492x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c f317493y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f317493y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f317492x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c.K2(this.f317493y, null, null, this);
    }
}
