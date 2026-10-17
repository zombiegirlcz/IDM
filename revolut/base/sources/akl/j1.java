package akl;

/* JADX INFO: loaded from: classes12.dex */
public final class j1 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n1 f6040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6041x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(n1 n1Var, gim.c cVar) {
        super(cVar);
        this.f6040w = n1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f6041x |= Integer.MIN_VALUE;
        return this.f6040w.e(null, this);
    }
}
