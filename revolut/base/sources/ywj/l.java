package ywj;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.c {
    public cdd.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c f317484w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f317485x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f317484w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f317485x |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c.I2(this.f317484w, null, this);
    }
}
