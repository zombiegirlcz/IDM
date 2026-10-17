package k50;

/* JADX INFO: loaded from: classes19.dex */
public final class z extends gim.c {
    public y20.p u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f181301w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f181302x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.f181301w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f181302x |= Integer.MIN_VALUE;
        return this.f181301w.Z2(null, this);
    }
}
