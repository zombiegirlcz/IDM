package k7c;

import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;

/* JADX INFO: loaded from: classes6.dex */
public final class w0 extends gim.c {
    public ShippingContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y0 f182014w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f182015x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(y0 y0Var, gim.c cVar) {
        super(cVar);
        this.f182014w = y0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f182015x |= Integer.MIN_VALUE;
        return y0.a(this.f182014w, null, this);
    }
}
