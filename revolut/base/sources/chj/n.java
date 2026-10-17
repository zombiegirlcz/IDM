package chj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.c {
    public int A;
    public PaymentMethod u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f24275w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f24276x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f24277y;
    public final /* synthetic */ q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, gim.c cVar) {
        super(cVar);
        this.z = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f24277y = obj2;
        this.A |= Integer.MIN_VALUE;
        return q.a(this.z, null, null, null, null, null, this);
    }
}
