package sa6;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends gim.c {
    public ba6.r u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j0 f261317w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f261318x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, gim.c cVar) {
        super(cVar);
        this.f261317w = j0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f261318x |= Integer.MIN_VALUE;
        return j0.b(this.f261317w, null, null, this);
    }
}
