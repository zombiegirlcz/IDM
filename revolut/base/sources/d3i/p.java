package d3i;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.c {
    public final /* synthetic */ a5h.g A;
    public int B;
    public xi0.b u;
    public a97.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a97.c f111187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a97.c f111188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a97.c f111189y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a5h.g gVar, gim.c cVar) {
        super(cVar);
        this.A = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.B(null, null, this);
    }
}
