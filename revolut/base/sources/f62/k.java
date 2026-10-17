package f62;

import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.c {
    public PaymentMethodDetails.Iris u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f132387w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f132388x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f132387w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f132388x |= Integer.MIN_VALUE;
        return this.f132387w.d0(null, this);
    }
}
