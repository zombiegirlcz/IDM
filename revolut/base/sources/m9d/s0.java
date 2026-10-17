package m9d;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ g1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f203739w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(g1 g1Var, gim.c cVar) {
        super(cVar);
        this.v = g1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f203739w |= Integer.MIN_VALUE;
        return this.v.B2(this);
    }
}
