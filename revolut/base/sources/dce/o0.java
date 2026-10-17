package dce;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 extends gim.c {
    public qua.p u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c f112880w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f112881x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f112880w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f112881x |= Integer.MIN_VALUE;
        return com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c.J2(this.f112880w, null, this);
    }
}
