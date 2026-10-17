package a8c;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.c {
    public m u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.impl.external.ui.flow.root.a f2172w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2173x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.revolutpay.impl.external.ui.flow.root.a aVar, gim.c cVar) {
        super(cVar);
        this.f2172w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f2173x |= Integer.MIN_VALUE;
        return this.f2172w.S2(this);
    }
}
