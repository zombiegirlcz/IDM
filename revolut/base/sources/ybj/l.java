package ybj;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f312383w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f312383w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b.K2(this.v, null, this);
    }
}
