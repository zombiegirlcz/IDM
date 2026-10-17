package e4k;

/* JADX INFO: loaded from: classes11.dex */
public final class t0 extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a f122638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f122639x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar, gim.c cVar) {
        super(cVar);
        this.f122638w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f122639x |= Integer.MIN_VALUE;
        return this.f122638w.B2(false, this);
    }
}
