package ekf;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ w0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f127135w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, gim.c cVar) {
        super(cVar);
        this.v = w0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f127135w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
