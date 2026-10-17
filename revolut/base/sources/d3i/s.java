package d3i;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends gim.c {
    public c u;
    public a97.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f111195w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a5h.g f111196x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f111197y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a5h.g gVar, gim.c cVar) {
        super(cVar);
        this.f111196x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f111195w = obj2;
        this.f111197y |= Integer.MIN_VALUE;
        return this.f111196x.V(null, null, this);
    }
}
