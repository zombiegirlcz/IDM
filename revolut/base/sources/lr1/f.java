package lr1;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.apm.bills.postal_check.impl.ui.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f199372w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f199372w |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.bills.postal_check.impl.ui.b.I2(this.v, null, this);
    }
}
