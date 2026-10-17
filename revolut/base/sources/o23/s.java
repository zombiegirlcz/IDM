package o23;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends gim.c {
    public wi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b f221458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f221459x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar, gim.c cVar) {
        super(cVar);
        this.f221458w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f221459x |= Integer.MIN_VALUE;
        return com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.J2(this.f221458w, null, this);
    }
}
