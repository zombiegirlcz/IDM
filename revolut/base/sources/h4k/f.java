package h4k;

import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public long A;
    public /* synthetic */ Object B;
    public final /* synthetic */ k C;
    public int D;
    public BankTransferAmountScreenContract$InputData.NewTransfer u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f149380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f149381x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f149382y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, gim.c cVar) {
        super(cVar);
        this.C = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.e(null, null, this);
    }
}
