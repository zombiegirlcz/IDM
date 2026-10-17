package d7a;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.paynow.impl.screens.qr.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f111915w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.paynow.impl.screens.qr.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f111915w |= Integer.MIN_VALUE;
        return this.v.L2(null, this);
    }
}
