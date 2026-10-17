package es;

/* JADX INFO: loaded from: classes17.dex */
public final class z extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ a0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f128779w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.v = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f128779w |= Integer.MIN_VALUE;
        return a0.c(this.v, null, this);
    }
}
