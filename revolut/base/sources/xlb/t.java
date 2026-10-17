package xlb;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f307003w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f307003w |= Integer.MIN_VALUE;
        return com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e.J2(this.v, this);
    }
}
