package s38;

import n38.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.c {
    public d0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f259468w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f259469x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, gim.c cVar) {
        super(cVar);
        this.f259468w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f259469x |= Integer.MIN_VALUE;
        return this.f259468w.Z2(null, this);
    }
}
