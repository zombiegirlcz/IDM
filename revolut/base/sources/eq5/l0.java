package eq5;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends gim.c {
    public nqi.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x0 f128286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f128287x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(x0 x0Var, gim.c cVar) {
        super(cVar);
        this.f128286w = x0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f128287x |= Integer.MIN_VALUE;
        return this.f128286w.b(null, null, null, null, this);
    }
}
