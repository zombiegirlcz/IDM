package g64;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f140847w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f140847w |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a.Q2(this.v, null, null, this);
    }
}
