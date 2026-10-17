package y3f;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f310703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f310704x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f310703w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f310704x |= Integer.MIN_VALUE;
        return this.f310703w.c(this);
    }
}
