package h6i;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 extends gim.c {
    public f0 u;
    public p6i.l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f149673w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i0 f149674x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f149675y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, gim.c cVar) {
        super(cVar);
        this.f149674x = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f149673w = obj2;
        this.f149675y |= Integer.MIN_VALUE;
        return this.f149674x.c(null, this);
    }
}
