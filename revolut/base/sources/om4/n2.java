package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class n2 extends gim.c {
    public String u;
    public od0.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226647w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x2 f226648x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226649y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(x2 x2Var, gim.c cVar) {
        super(cVar);
        this.f226648x = x2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226647w = obj2;
        this.f226649y |= Integer.MIN_VALUE;
        return this.f226648x.x(null, this);
    }
}
