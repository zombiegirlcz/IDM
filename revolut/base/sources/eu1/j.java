package eu1;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ i4b.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129474w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i4b.f fVar, gim.c cVar) {
        super(cVar);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f129474w |= Integer.MIN_VALUE;
        return this.v.d(null, null, this);
    }
}
