package akl;

/* JADX INFO: loaded from: classes12.dex */
public final class z0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f6124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6125x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(e1 e1Var, gim.c cVar) {
        super(cVar);
        this.f6124w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f6125x |= Integer.MIN_VALUE;
        return this.f6124w.g(null, null, null, this);
    }
}
