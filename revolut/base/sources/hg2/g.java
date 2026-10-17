package hg2;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public String u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f152072w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f152073x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f152074y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f152073x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f152072w = obj2;
        this.f152074y |= Integer.MIN_VALUE;
        return this.f152073x.b(this, null, false);
    }
}
