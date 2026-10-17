package mkf;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends gim.c {
    public c0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f206226w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f206227x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, gim.c cVar) {
        super(cVar);
        this.f206226w = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f206227x |= Integer.MIN_VALUE;
        return this.f206226w.c(null, null, this);
    }
}
