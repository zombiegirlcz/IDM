package k4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import do3.n;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.c {
    public int A;
    public BankTransferFlowInputData u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f5j.a f180930w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public wi0.b f180931x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f180932y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.z = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f180932y = obj2;
        this.A |= Integer.MIN_VALUE;
        return e.a(this.z, null, null, this);
    }
}
