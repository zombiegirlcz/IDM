package h3a;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.c {
    public PaymentGroup u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f149053w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f149054x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, gim.c cVar) {
        super(cVar);
        this.f149053w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f149054x |= Integer.MIN_VALUE;
        return this.f149053w.g(null, this);
    }
}
