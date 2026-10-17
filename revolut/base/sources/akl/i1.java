package akl;

/* JADX INFO: loaded from: classes12.dex */
public final class i1 extends gim.c {
    public boolean u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f6034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n1 f6035x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6036y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(n1 n1Var, gim.c cVar) {
        super(cVar);
        this.f6035x = n1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f6034w = obj2;
        this.f6036y |= Integer.MIN_VALUE;
        return this.f6035x.b(this, null, false);
    }
}
