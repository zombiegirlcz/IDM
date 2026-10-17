package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class b3 extends gim.c {
    public String u;
    public xp3.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226530w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c3 f226531x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226532y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(c3 c3Var, gim.c cVar) {
        super(cVar);
        this.f226531x = c3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226530w = obj2;
        this.f226532y |= Integer.MIN_VALUE;
        return this.f226531x.b(null, null, this);
    }
}
