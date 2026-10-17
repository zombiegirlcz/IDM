package nfj;

/* JADX INFO: loaded from: classes11.dex */
public final class k1 extends gim.c {
    public String u;
    public m1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f214972w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m1 f214973x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f214974y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(m1 m1Var, gim.c cVar) {
        super(cVar);
        this.f214973x = m1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f214972w = obj2;
        this.f214974y |= Integer.MIN_VALUE;
        return this.f214973x.e(null, this);
    }
}
