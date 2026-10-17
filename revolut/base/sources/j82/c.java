package j82;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public h02.c u;
    public z92.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f172084w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zq.a f172085x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f172086y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zq.a aVar, gim.c cVar) {
        super(cVar);
        this.f172085x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f172084w = obj2;
        this.f172086y |= Integer.MIN_VALUE;
        return this.f172085x.A(null, this);
    }
}
