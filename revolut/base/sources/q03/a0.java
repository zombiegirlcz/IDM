package q03;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.settings.b f241059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f241060x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar, gim.c cVar) {
        super(cVar);
        this.f241059w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f241060x |= Integer.MIN_VALUE;
        return this.f241059w.K2(null, null, this);
    }
}
