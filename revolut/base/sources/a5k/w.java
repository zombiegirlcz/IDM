package a5k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;

/* JADX INFO: loaded from: classes11.dex */
public final class w extends gim.c {
    public BankTransferData u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f1492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f1493x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y f1494y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, gim.c cVar) {
        super(cVar);
        this.f1494y = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f1493x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f1494y.b3(null, null, null, null, this);
    }
}
