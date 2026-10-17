package et6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 extends gim.c {
    public String u;
    public FreelancerInvoiceNumberData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f129286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p1 f129287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f129288y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(p1 p1Var, gim.c cVar) {
        super(cVar);
        this.f129287x = p1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f129286w = obj2;
        this.f129288y |= Integer.MIN_VALUE;
        return this.f129287x.j(null, null, this);
    }
}
