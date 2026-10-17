package q97;

/* JADX INFO: loaded from: classes21.dex */
public final class l2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ m2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f243731w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, gim.c cVar) {
        super(cVar);
        this.v = m2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f243731w |= Integer.MIN_VALUE;
        return this.v.g(this);
    }
}
