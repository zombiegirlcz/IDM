package y20;

/* JADX INFO: loaded from: classes19.dex */
public final class e0 extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tb4.t f310488w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f310489x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(tb4.t tVar, gim.c cVar) {
        super(cVar);
        this.f310488w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f310489x |= Integer.MIN_VALUE;
        return this.f310488w.c(null, false, this);
    }
}
