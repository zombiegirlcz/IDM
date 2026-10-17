package h3a;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public g5a.n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f149044w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f149045x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, gim.c cVar) {
        super(cVar);
        this.f149044w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f149045x |= Integer.MIN_VALUE;
        return this.f149044w.a(null, this);
    }
}
