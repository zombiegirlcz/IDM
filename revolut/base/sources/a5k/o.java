package a5k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.c {
    public BankTransferData u;
    public f5j.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f1472x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t f1473y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, gim.c cVar) {
        super(cVar);
        this.f1473y = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f1472x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f1473y.c3(null, null, null, null, false, this);
    }
}
