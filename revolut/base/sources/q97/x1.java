package q97;

/* JADX INFO: loaded from: classes21.dex */
public final class x1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ y1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f243820w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(y1 y1Var, gim.c cVar) {
        super(cVar);
        this.v = y1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f243820w |= Integer.MIN_VALUE;
        return this.v.g(this);
    }
}
