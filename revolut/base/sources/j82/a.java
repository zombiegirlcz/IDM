package j82;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends gim.c {
    public h02.c u;
    public z92.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f172079w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zq.a f172080x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f172081y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zq.a aVar, gim.c cVar) {
        super(cVar);
        this.f172080x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f172079w = obj2;
        this.f172081y |= Integer.MIN_VALUE;
        return this.f172080x.g(null, this);
    }
}
