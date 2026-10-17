package p5a;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public f5j.a u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BankTransferData f233057w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f233058x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f233059y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, gim.c cVar) {
        super(cVar);
        this.f233059y = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f233058x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f233059y.a(null, null, this);
    }
}
