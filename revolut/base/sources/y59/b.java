package y59;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public ApmPaymentAuthorisationPendingAction u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f311007w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f311008x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f311007w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f311008x |= Integer.MIN_VALUE;
        return this.f311007w.g(null, this);
    }
}
