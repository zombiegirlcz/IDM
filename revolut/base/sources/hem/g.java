package hem;

/* JADX INFO: loaded from: classes23.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ g1m.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f151733w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g1m.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f151733w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
