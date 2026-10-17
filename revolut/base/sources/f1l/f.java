package f1l;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f131301w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f131302x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f131303y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f131302x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f131301w = obj2;
        this.f131303y |= Integer.MIN_VALUE;
        return this.f131302x.d(null, null, this);
    }
}
