package pkf;

/* JADX INFO: loaded from: classes8.dex */
public final class u0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ w0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f237133w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, gim.c cVar) {
        super(cVar);
        this.v = w0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f237133w |= Integer.MIN_VALUE;
        return this.v.c(null, null, this);
    }
}
