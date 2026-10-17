package c55;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentAccountDetails;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public LoanDetails u;
    public LoanRepaymentAccountDetails v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f21430w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f21431x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21432y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f21431x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f21430w = obj2;
        this.f21432y |= Integer.MIN_VALUE;
        return this.f21431x.b(null, this);
    }
}
