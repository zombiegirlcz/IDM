package q7c;

import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends gim.c {
    public ShippingContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f242833w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f242834x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, gim.c cVar) {
        super(cVar);
        this.f242833w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f242834x |= Integer.MIN_VALUE;
        return this.f242833w.b(null, this);
    }
}
