package mm6;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b f207163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f207164x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.f207163w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f207164x |= Integer.MIN_VALUE;
        return this.f207163w.J2(null, null, this);
    }
}
