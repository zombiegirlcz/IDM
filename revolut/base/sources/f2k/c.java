package f2k;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public wi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f131842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f131843x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f131842w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f131843x |= Integer.MIN_VALUE;
        return this.f131842w.a(null, this);
    }
}
