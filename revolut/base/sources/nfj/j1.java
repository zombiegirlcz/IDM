package nfj;

/* JADX INFO: loaded from: classes11.dex */
public final class j1 extends gim.c {
    public String u;
    public m1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f214969w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m1 f214970x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f214971y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(m1 m1Var, gim.c cVar) {
        super(cVar);
        this.f214970x = m1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f214969w = obj2;
        this.f214971y |= Integer.MIN_VALUE;
        return this.f214970x.c(null, this);
    }
}
