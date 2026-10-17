package s8h;

/* JADX INFO: loaded from: classes9.dex */
public final class q0 extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r0 f261029w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f261030x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, gim.c cVar) {
        super(cVar);
        this.f261029w = r0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f261030x |= Integer.MIN_VALUE;
        return this.f261029w.e(null, this);
    }
}
