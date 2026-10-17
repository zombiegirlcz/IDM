package n03;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f210862w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f210862w |= Integer.MIN_VALUE;
        return this.v.L2(null, null, this);
    }
}
