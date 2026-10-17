package d3i;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.c {
    public a97.d u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f111192w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a5h.g f111193x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f111194y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a5h.g gVar, gim.c cVar) {
        super(cVar);
        this.f111193x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f111192w = obj2;
        this.f111194y |= Integer.MIN_VALUE;
        return this.f111193x.S(null, this);
    }
}
