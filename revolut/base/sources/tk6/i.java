package tk6;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.c {
    public ApmPaymentAuthorisationPendingAction u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f271899w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f271900x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f271899w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f271900x |= Integer.MIN_VALUE;
        return this.f271899w.H(null, this);
    }
}
