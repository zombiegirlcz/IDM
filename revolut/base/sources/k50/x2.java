package k50;

/* JADX INFO: loaded from: classes19.dex */
public final class x2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ j4 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f181283w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(j4 j4Var, gim.c cVar) {
        super(cVar);
        this.v = j4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f181283w |= Integer.MIN_VALUE;
        return this.v.Z2(null, null, this);
    }
}
