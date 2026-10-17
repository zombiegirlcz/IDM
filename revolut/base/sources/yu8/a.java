package yu8;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f316912w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f316913x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, gim.c cVar) {
        super(cVar);
        this.f316912w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f316913x |= Integer.MIN_VALUE;
        return this.f316912w.b(null, this);
    }
}
