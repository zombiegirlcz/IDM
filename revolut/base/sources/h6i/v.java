package h6i;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ e0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f149728w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(e0 e0Var, gim.c cVar) {
        super(cVar);
        this.v = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f149728w |= Integer.MIN_VALUE;
        return this.v.b(null, 0L, false, false, null, null, this);
    }
}
