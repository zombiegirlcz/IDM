package dk9;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f115487w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f115488x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.f115487w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f115488x |= Integer.MIN_VALUE;
        return a0.y2(this.f115487w, null, this);
    }
}
