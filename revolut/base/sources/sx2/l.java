package sx2;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.c {
    public h93.l0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_design.impl.card_design.carousel.e f266302w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f266303x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.card_design.impl.card_design.carousel.e eVar, gim.c cVar) {
        super(cVar);
        this.f266302w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f266303x |= Integer.MIN_VALUE;
        return this.f266302w.K2(null, this);
    }
}
