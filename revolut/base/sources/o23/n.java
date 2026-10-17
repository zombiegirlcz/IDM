package o23;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f221451w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f221451w |= Integer.MIN_VALUE;
        return this.v.L2(this);
    }
}
