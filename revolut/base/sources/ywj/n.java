package ywj;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f317487w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f317487w |= Integer.MIN_VALUE;
        return this.v.L2(this);
    }
}
