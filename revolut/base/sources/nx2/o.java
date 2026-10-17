package nx2;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_design.impl.card_design.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f220114w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.card_design.impl.card_design.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f220114w |= Integer.MIN_VALUE;
        return com.revolut.feature.card_design.impl.card_design.d.I2(this.v, this);
    }
}
