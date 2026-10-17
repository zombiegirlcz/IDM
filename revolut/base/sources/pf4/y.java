package pf4;

/* JADX INFO: loaded from: classes22.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f235467w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f235467w |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b.I2(this.v, this);
    }
}
