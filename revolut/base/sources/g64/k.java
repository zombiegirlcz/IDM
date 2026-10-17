package g64;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f140848w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f140848w |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a.R2(this.v, null, this);
    }
}
