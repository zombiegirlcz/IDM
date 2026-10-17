package c55;

import com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentAccountDetails;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public q35.e0 u;
    public LoanRepaymentAccountDetails v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f21436w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f21437x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f21438y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f21438y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f21437x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f21438y.c(null, this);
    }
}
