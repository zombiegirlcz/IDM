package s8h;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f261042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f261043x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, gim.c cVar) {
        super(cVar);
        this.f261042w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f261043x |= Integer.MIN_VALUE;
        return this.f261042w.e(null, this);
    }
}
