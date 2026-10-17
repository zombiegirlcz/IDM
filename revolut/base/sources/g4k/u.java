package g4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends gim.c {
    public final /* synthetic */ a0 A;
    public int B;
    public f5j.a u;
    public BankTransferData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BankTransferData f140584w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f140585x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f140586y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.A = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.Z2(null, null, false, this);
    }
}
