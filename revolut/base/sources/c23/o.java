package c23;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20626w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.card_order_new.impl.kompot.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f20626w |= Integer.MIN_VALUE;
        return com.revolut.feature.card_order_new.impl.kompot.c.R2(this.v, this);
    }
}
