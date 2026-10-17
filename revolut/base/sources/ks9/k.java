package ks9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.c {
    public PaymentGroup u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f189336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f189337x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f189336w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f189337x |= Integer.MIN_VALUE;
        return l.Z2(this.f189336w, null, this);
    }
}
