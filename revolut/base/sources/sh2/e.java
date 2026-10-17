package sh2;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.transfer.core.models.FundingSource;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public FundingSource u;
    public ApmPaymentAuthorisationPendingAction v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f263395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f263396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f263397y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f263396x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f263395w = obj2;
        this.f263397y |= Integer.MIN_VALUE;
        return this.f263396x.Z2(null, null, this);
    }
}
