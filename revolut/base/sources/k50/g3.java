package k50;

/* JADX INFO: loaded from: classes19.dex */
public final class g3 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ j4 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f181077w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(j4 j4Var, gim.c cVar) {
        super(cVar);
        this.v = j4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f181077w |= Integer.MIN_VALUE;
        return j4.M2(this.v, this);
    }
}
