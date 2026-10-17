package akl;

/* JADX INFO: loaded from: classes12.dex */
public final class t0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f6094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6095x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(e1 e1Var, gim.c cVar) {
        super(cVar);
        this.f6094w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f6095x |= Integer.MIN_VALUE;
        return this.f6094w.d(null, null, null, this);
    }
}
