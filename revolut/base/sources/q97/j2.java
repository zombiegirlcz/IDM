package q97;

/* JADX INFO: loaded from: classes21.dex */
public final class j2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f243716w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(k2 k2Var, gim.c cVar) {
        super(cVar);
        this.v = k2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f243716w |= Integer.MIN_VALUE;
        return this.v.g(this);
    }
}
