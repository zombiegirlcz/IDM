package lp6;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f198945w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, gim.c cVar) {
        super(cVar);
        this.v = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f198945w |= Integer.MIN_VALUE;
        return this.v.f(null, 0, null, null, this);
    }
}
