package q97;

/* JADX INFO: loaded from: classes21.dex */
public final class r1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f243777w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(s1 s1Var, gim.c cVar) {
        super(cVar);
        this.v = s1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f243777w |= Integer.MIN_VALUE;
        return this.v.g(this);
    }
}
