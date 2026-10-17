package nfj;

/* JADX INFO: loaded from: classes11.dex */
public final class o2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f215010w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(s2 s2Var, gim.c cVar) {
        super(cVar);
        this.v = s2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f215010w |= Integer.MIN_VALUE;
        return this.v.k(null, null, this);
    }
}
