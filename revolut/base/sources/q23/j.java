package q23;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public gk3.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b f241504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f241505x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar, gim.c cVar) {
        super(cVar);
        this.f241504w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f241505x |= Integer.MIN_VALUE;
        return com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b.I2(this.f241504w, null, this);
    }
}
