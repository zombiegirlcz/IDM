package d3i;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends gim.c {
    public a97.c u;
    public a97.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f111198w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a5h.g f111199x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f111200y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a5h.g gVar, gim.c cVar) {
        super(cVar);
        this.f111199x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f111198w = obj2;
        this.f111200y |= Integer.MIN_VALUE;
        return this.f111199x.W(null, this);
    }
}
