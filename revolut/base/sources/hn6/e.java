package hn6;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.link.penny_topup.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f154072w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.external_accounts.impl.ui.link.penny_topup.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f154072w |= Integer.MIN_VALUE;
        return com.revolut.feature.external_accounts.impl.ui.link.penny_topup.d.I2(this.v, null, this);
    }
}
