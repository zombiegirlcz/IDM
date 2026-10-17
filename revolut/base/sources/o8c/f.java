package o8c;

import com.revolut.feature.revolutpay.api.shared.domain.models.PaymentInitiationParams;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.c {
    public int A;
    public PaymentInitiationParams u;
    public j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f223002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f223003x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f223004y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, gim.c cVar) {
        super(cVar);
        this.z = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f223004y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.e3(null, this);
    }
}
