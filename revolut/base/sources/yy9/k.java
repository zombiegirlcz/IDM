package yy9;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f317903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f317904x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f317903w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f317904x |= Integer.MIN_VALUE;
        return this.f317903w.a(null, this);
    }
}
