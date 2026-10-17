package dce;

/* JADX INFO: loaded from: classes8.dex */
public final class x0 extends gim.c {
    public qua.p u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c f112909w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f112910x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f112909w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f112910x |= Integer.MIN_VALUE;
        return this.f112909w.O2(null, this);
    }
}
