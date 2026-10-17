package ce4;

/* JADX INFO: loaded from: classes22.dex */
public final class w extends gim.c {
    public cv3.s u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d f23391w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23392x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar, gim.c cVar) {
        super(cVar);
        this.f23391w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f23392x |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d.Q2(this.f23391w, this);
    }
}
