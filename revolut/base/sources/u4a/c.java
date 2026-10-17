package u4a;

import com.revolut.feature.freelancer.common.models.ProPaymentLinkEligibility;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public ProPaymentLinkEligibility u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f277282w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f277283x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f277282w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f277283x |= Integer.MIN_VALUE;
        return this.f277282w.a(this);
    }
}
