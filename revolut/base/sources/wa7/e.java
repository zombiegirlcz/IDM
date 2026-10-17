package wa7;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f295832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f295833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f295834y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, gim.c cVar) {
        super(cVar);
        this.f295833x = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f295832w = obj2;
        this.f295834y |= Integer.MIN_VALUE;
        return this.f295833x.f(null, null, this);
    }
}
