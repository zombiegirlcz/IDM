package xlb;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f306999w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f306999w |= Integer.MIN_VALUE;
        return this.v.N2(false, this);
    }
}
