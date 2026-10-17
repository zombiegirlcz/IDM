package t75;

import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public LoanDetails u;
    public LoanRepaymentTerms v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dj0.d f268583w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f268584x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.b f268585y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.b bVar, gim.c cVar) {
        super(cVar);
        this.f268585y = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f268584x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f268585y.Z2(null, null, null, null, null, this);
    }
}
