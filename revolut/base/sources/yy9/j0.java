package yy9;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k0 f317901w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f317902x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, gim.c cVar) {
        super(cVar);
        this.f317901w = k0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f317902x |= Integer.MIN_VALUE;
        return this.f317901w.a(null, this);
    }
}
