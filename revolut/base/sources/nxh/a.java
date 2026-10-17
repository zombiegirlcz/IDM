package nxh;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature_credit_data_monitoring_sdk_proxy.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f220575w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.revolut.feature_credit_data_monitoring_sdk_proxy.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f220575w |= Integer.MIN_VALUE;
        return this.v.d(this);
    }
}
