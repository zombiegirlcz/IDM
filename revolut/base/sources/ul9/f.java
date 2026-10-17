package ul9;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f280915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f280916x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f280915w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f280916x |= Integer.MIN_VALUE;
        return g.b(this.f280915w, null, this);
    }
}
