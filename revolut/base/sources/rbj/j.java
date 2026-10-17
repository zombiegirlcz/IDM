package rbj;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f253134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f253135x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, gim.c cVar) {
        super(cVar);
        this.f253134w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f253135x |= Integer.MIN_VALUE;
        return this.f253134w.c(null, false, this);
    }
}
