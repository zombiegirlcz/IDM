package sh2;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.c {
    public sak.c u;
    public ApmPaymentAuthorisationSummary v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PaymentMethodDetails.Wero f263405w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f263406x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f263407y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, gim.c cVar) {
        super(cVar);
        this.f263407y = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f263406x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f263407y.H(null, this);
    }
}
