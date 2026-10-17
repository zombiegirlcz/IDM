package ehk;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public long u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f126215w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f126216x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f126215w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f126216x |= Integer.MIN_VALUE;
        return this.f126215w.a(this);
    }
}
