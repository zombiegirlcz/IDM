package tv8;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.kyc.impl.flow.kyc_consolidated.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f274738w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.kyc.impl.flow.kyc_consolidated.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f274738w |= Integer.MIN_VALUE;
        return com.revolut.feature.kyc.impl.flow.kyc_consolidated.c.K2(this.v, null, this);
    }
}
