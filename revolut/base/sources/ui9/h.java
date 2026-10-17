package ui9;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.c {
    public wi9.g u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f280333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f280334x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, gim.c cVar) {
        super(cVar);
        this.f280333w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f280334x |= Integer.MIN_VALUE;
        return this.f280333w.f(null, this);
    }
}
