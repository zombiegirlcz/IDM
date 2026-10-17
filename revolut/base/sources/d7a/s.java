package d7a;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.paynow.impl.screens.qr.a f111913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f111914x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.paynow.impl.screens.qr.a aVar, gim.c cVar) {
        super(cVar);
        this.f111913w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f111914x |= Integer.MIN_VALUE;
        return com.revolut.feature.paynow.impl.screens.qr.a.J2(this.f111913w, null, this);
    }
}
