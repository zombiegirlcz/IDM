package xec;

import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;

/* JADX INFO: loaded from: classes6.dex */
public final class j0 extends gim.c {
    public ShippingContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b f304591w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f304592x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar, gim.c cVar) {
        super(cVar);
        this.f304591w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f304592x |= Integer.MIN_VALUE;
        return com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b.J2(this.f304591w, null, this);
    }
}
