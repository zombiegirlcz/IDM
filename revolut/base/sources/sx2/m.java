package sx2;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_design.impl.card_design.carousel.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f266308w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.card_design.impl.card_design.carousel.e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f266308w |= Integer.MIN_VALUE;
        return com.revolut.feature.card_design.impl.card_design.carousel.e.I2(this.v, null, this);
    }
}
