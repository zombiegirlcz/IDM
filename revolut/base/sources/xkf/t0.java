package xkf;

/* JADX INFO: loaded from: classes8.dex */
public final class t0 extends gim.c {
    public v0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v0 f306771w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f306772x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(v0 v0Var, gim.c cVar) {
        super(cVar);
        this.f306771w = v0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f306772x |= Integer.MIN_VALUE;
        return this.f306771w.c(null, null, this);
    }
}
