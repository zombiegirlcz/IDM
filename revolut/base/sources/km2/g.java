package km2;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f185689w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f185690x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.f185689w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f185690x |= Integer.MIN_VALUE;
        return this.f185689w.c(null, null, this);
    }
}
