package ks9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.c {
    public PaymentGroup u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f189352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f189353x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, gim.c cVar) {
        super(cVar);
        this.f189352w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f189353x |= Integer.MIN_VALUE;
        return s.Z2(this.f189352w, null, this);
    }
}
