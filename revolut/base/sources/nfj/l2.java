package nfj;

/* JADX INFO: loaded from: classes11.dex */
public final class l2 extends gim.c {
    public String u;
    public dej.x1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f214982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s2 f214983x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f214984y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(s2 s2Var, gim.c cVar) {
        super(cVar);
        this.f214983x = s2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f214982w = obj2;
        this.f214984y |= Integer.MIN_VALUE;
        return s2.b(this.f214983x, null, null, this);
    }
}
