package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class e2 extends gim.c {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x2 f226562x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226563y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(x2 x2Var, gim.c cVar) {
        super(cVar);
        this.f226562x = x2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226561w = obj2;
        this.f226563y |= Integer.MIN_VALUE;
        return this.f226562x.g(null, 0, this);
    }
}
