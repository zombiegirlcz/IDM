package sx2;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_design.impl.card_design.carousel.e f266265w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f266266x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.revolut.feature.card_design.impl.card_design.carousel.e eVar, gim.c cVar) {
        super(cVar);
        this.f266265w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f266266x |= Integer.MIN_VALUE;
        return com.revolut.feature.card_design.impl.card_design.carousel.e.J2(this.f266265w, null, null, null, null, this);
    }
}
