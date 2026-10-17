package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class i1 extends gim.c {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226599w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r1 f226600x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226601y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(r1 r1Var, gim.c cVar) {
        super(cVar);
        this.f226600x = r1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226599w = obj2;
        this.f226601y |= Integer.MIN_VALUE;
        return this.f226600x.g(null, 0, null, this);
    }
}
