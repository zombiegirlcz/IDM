package ywj;

import cjl.u;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.c {
    public wi0.b u;
    public u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f317494w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f317495x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c f317496y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f317496y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f317495x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f317496y.N2(null, null, null, false, null, this);
    }
}
