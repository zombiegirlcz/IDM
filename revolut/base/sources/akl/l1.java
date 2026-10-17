package akl;

/* JADX INFO: loaded from: classes12.dex */
public final class l1 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n1 f6047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6048x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(n1 n1Var, gim.c cVar) {
        super(cVar);
        this.f6047w = n1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f6048x |= Integer.MIN_VALUE;
        return this.f6047w.f(null, this);
    }
}
