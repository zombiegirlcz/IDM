package tv8;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public wi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.kyc.impl.flow.kyc_consolidated.c f274735w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f274736x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.kyc.impl.flow.kyc_consolidated.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f274735w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f274736x |= Integer.MIN_VALUE;
        return com.revolut.feature.kyc.impl.flow.kyc_consolidated.c.I2(this.f274735w, null, this);
    }
}
