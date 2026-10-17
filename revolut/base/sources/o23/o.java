package o23;

import com.revolut.feature.address.models.Address;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends gim.c {
    public Address u;
    public gk3.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f221452w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b f221453x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f221454y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar, gim.c cVar) {
        super(cVar);
        this.f221453x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f221452w = obj2;
        this.f221454y |= Integer.MIN_VALUE;
        return com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.I2(this.f221453x, null, this);
    }
}
