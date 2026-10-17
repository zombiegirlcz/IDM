package d7a;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.c {
    public i80.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.paynow.impl.screens.qr.a f111907w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f111908x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.paynow.impl.screens.qr.a aVar, gim.c cVar) {
        super(cVar);
        this.f111907w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f111908x |= Integer.MIN_VALUE;
        return com.revolut.feature.paynow.impl.screens.qr.a.I2(this.f111907w, null, this);
    }
}
