package ce4;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23385w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f23385w |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d.P2(this.v, this);
    }
}
