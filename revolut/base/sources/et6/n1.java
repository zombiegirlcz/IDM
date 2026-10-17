package et6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends gim.c {
    public FreelancerInvoiceNumberData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p1 f129278w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129279x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p1 p1Var, gim.c cVar) {
        super(cVar);
        this.f129278w = p1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129279x |= Integer.MIN_VALUE;
        return this.f129278w.h(null, this);
    }
}
