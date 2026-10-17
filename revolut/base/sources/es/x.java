package es;

/* JADX INFO: loaded from: classes17.dex */
public final class x extends gim.c {
    public long u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f128776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f128777x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.f128776w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f128777x |= Integer.MIN_VALUE;
        return a0.a(this.f128776w, 0L, this);
    }
}
