package ds4;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.hub.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f117221w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.credit.card.impl.ui.instalment.hub.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f117221w |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.card.impl.ui.instalment.hub.a.I2(this.v, null, this);
    }
}
