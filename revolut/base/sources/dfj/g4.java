package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class g4 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k4 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f113982w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(k4 k4Var, gim.c cVar) {
        super(cVar);
        this.v = k4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f113982w |= Integer.MIN_VALUE;
        return this.v.j(null, this);
    }
}
