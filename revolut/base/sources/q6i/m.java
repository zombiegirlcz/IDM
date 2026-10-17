package q6i;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.c {
    public e7l.f u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f242628w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f242629x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, gim.c cVar) {
        super(cVar);
        this.f242628w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f242629x |= Integer.MIN_VALUE;
        return this.f242628w.a(null, null, this);
    }
}
