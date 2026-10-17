package a8c;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.revolutpay.impl.external.ui.flow.root.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2177w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.revolutpay.impl.external.ui.flow.root.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f2177w |= Integer.MIN_VALUE;
        return this.v.W2(this);
    }
}
