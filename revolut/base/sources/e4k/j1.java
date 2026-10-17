package e4k;

/* JADX INFO: loaded from: classes11.dex */
public final class j1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f122613w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f122613w |= Integer.MIN_VALUE;
        return this.v.I2(this);
    }
}
