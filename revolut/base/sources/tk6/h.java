package tk6;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request.PseAuthorisationRequestPaymentFrom;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.c {
    public int A;
    public ApmPaymentAuthorisationPendingAction u;
    public ApmPaymentAuthorisationSummary v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PaymentMethodDetails.Pse f271896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PseAuthorisationRequestPaymentFrom f271897x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f271898y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.z = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f271898y = obj2;
        this.A |= Integer.MIN_VALUE;
        return k.Z2(this.z, null, this);
    }
}
