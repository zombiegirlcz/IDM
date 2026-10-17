package eu1;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.c {
    public c02.j u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i4b.f f129472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129473x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(i4b.f fVar, gim.c cVar) {
        super(cVar);
        this.f129472w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129473x |= Integer.MIN_VALUE;
        return this.f129472w.c(null, null, this);
    }
}
