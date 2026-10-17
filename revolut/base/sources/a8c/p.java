package a8c;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.c {
    public com.revolut.feature.revolutpay.impl.external.ui.flow.root.a u;
    public m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f2174w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.impl.external.ui.flow.root.a f2175x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2176y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.revolutpay.impl.external.ui.flow.root.a aVar, gim.c cVar) {
        super(cVar);
        this.f2175x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f2174w = obj2;
        this.f2176y |= Integer.MIN_VALUE;
        return this.f2175x.T2(this);
    }
}
