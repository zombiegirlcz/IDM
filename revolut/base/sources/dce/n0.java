package dce;

/* JADX INFO: loaded from: classes8.dex */
public final class n0 extends gim.c {
    public qua.p u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c f112878w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f112879x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f112878w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f112879x |= Integer.MIN_VALUE;
        return com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c.I2(this.f112878w, null, this);
    }
}
