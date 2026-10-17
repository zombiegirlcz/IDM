package c52;

import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraftRequest;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.c {
    public ApmPaymentDraftRequest u;
    public k71.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f21372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f21373x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21374y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r rVar, gim.c cVar) {
        super(cVar);
        this.f21373x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f21372w = obj2;
        this.f21374y |= Integer.MIN_VALUE;
        return r.b3(this.f21373x, null, null, this);
    }
}
