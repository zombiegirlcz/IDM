package t7i;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f268722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f268723x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.f268722w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f268723x |= Integer.MIN_VALUE;
        return this.f268722w.b(0L, null, null, null, this);
    }
}
