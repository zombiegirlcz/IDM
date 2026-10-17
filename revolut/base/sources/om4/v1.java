package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class v1 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x1 f226721w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226722x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(x1 x1Var, gim.c cVar) {
        super(cVar);
        this.f226721w = x1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f226722x |= Integer.MIN_VALUE;
        return this.f226721w.c(null, this);
    }
}
