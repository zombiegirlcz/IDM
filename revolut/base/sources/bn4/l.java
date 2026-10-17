package bn4;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ b0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17080w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b0 b0Var, gim.c cVar) {
        super(cVar);
        this.v = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f17080w |= Integer.MIN_VALUE;
        return this.v.l(this);
    }
}
