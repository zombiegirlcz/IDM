package hrj;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public jf0.c u;
    public n38.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f154825w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f154826x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f154827y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f154826x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f154825w = obj2;
        this.f154827y |= Integer.MIN_VALUE;
        return this.f154826x.b(null, this);
    }
}
