package q97;

/* JADX INFO: loaded from: classes21.dex */
public final class e2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ f2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f243681w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(f2 f2Var, gim.c cVar) {
        super(cVar);
        this.v = f2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f243681w |= Integer.MIN_VALUE;
        return this.v.g(this);
    }
}
