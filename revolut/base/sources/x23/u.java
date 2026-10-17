package x23;

/* JADX INFO: loaded from: classes21.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f302497w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f302497w |= Integer.MIN_VALUE;
        return com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c.I2(this.v, this);
    }
}
