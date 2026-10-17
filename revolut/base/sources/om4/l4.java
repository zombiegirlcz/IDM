package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class l4 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ m4 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f226635w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(m4 m4Var, gim.c cVar) {
        super(cVar);
        this.v = m4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f226635w |= Integer.MIN_VALUE;
        return this.v.b(this);
    }
}
