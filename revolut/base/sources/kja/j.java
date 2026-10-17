package kja;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.product.lifecycle.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184355w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.product.lifecycle.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184355w |= Integer.MIN_VALUE;
        return this.v.K2(null, this);
    }
}
