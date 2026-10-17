package a5k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;

/* JADX INFO: loaded from: classes11.dex */
public final class x extends gim.c {
    public BankTransferData u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f1495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f1496x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1497y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, gim.c cVar) {
        super(cVar);
        this.f1496x = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f1495w = obj2;
        this.f1497y |= Integer.MIN_VALUE;
        return this.f1496x.c3(null, null, null, this);
    }
}
