package t80;

/* JADX INFO: loaded from: classes19.dex */
public final class u extends gim.c {
    public p u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f268779w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f268780x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, gim.c cVar) {
        super(cVar);
        this.f268779w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f268780x |= Integer.MIN_VALUE;
        return this.f268779w.c(null, null, null, this);
    }
}
