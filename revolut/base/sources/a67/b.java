package a67;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f1549w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f1550x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1551y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f1550x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f1549w = obj2;
        this.f1551y |= Integer.MIN_VALUE;
        return this.f1550x.i(null, null, null, this);
    }
}
