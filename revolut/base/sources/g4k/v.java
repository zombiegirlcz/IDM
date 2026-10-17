package g4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends gim.c {
    public f5j.a u;
    public BankTransferData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f140587w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a0 f140588x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f140589y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.f140588x = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f140587w = obj2;
        this.f140589y |= Integer.MIN_VALUE;
        return this.f140588x.b3(null, null, this);
    }
}
