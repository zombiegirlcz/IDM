package y0i;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public q06.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f310215w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f310216x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f310215w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f310216x |= Integer.MIN_VALUE;
        return this.f310215w.e(null, this);
    }
}
