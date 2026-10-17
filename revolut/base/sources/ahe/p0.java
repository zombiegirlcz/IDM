package ahe;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ w0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5023w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(w0 w0Var, gim.c cVar) {
        super(cVar);
        this.v = w0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f5023w |= Integer.MIN_VALUE;
        return w0.a(this.v, this);
    }
}
