package q23;

import com.revolut.feature.address.models.Address;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.c {
    public Address u;
    public wi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f241506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b f241507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f241508y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar, gim.c cVar) {
        super(cVar);
        this.f241507x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f241506w = obj2;
        this.f241508y |= Integer.MIN_VALUE;
        return com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b.J2(this.f241507x, null, this);
    }
}
