package d1l;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f110665w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f110666x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f110665w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f110666x |= Integer.MIN_VALUE;
        return this.f110665w.a(null, this);
    }
}
