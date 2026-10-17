package mm6;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b f207165w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f207166x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.f207165w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f207166x |= Integer.MIN_VALUE;
        return com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b.I2(this.f207165w, null, this);
    }
}
