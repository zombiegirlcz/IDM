package yy9;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f317889w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, gim.c cVar) {
        super(cVar);
        this.v = h0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f317889w |= Integer.MIN_VALUE;
        return this.v.b(this);
    }
}
