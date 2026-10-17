package up4;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.c {
    public com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f281845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c f281846x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f281847y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f281846x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f281845w = obj2;
        this.f281847y |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c.I2(this.f281846x, null, this);
    }
}
