package b6d;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.c {
    public e6d.r u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f12729w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f12730x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12731y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, gim.c cVar) {
        super(cVar);
        this.f12730x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f12729w = obj2;
        this.f12731y |= Integer.MIN_VALUE;
        return this.f12730x.n(null, 0, this);
    }
}
