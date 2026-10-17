package rnd;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ v0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f255610w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(v0 v0Var, gim.c cVar) {
        super(cVar);
        this.v = v0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f255610w |= Integer.MIN_VALUE;
        return this.v.b(null, this);
    }
}
