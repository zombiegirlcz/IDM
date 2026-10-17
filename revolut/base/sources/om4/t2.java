package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class t2 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x2 f226700w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226701x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(x2 x2Var, gim.c cVar) {
        super(cVar);
        this.f226700w = x2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f226701x |= Integer.MIN_VALUE;
        return this.f226700w.L(null, this);
    }
}
