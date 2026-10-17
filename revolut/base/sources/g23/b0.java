package g23;

/* JADX INFO: loaded from: classes21.dex */
public final class b0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g0 f139773w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f139774x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g0 g0Var, gim.c cVar) {
        super(cVar);
        this.f139773w = g0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f139774x |= Integer.MIN_VALUE;
        return this.f139773w.c(null, null, this);
    }
}
