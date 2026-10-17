package d3i;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.c {
    public a97.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a5h.g f111190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f111191x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a5h.g gVar, gim.c cVar) {
        super(cVar);
        this.f111190w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f111191x |= Integer.MIN_VALUE;
        return this.f111190w.E(null, this);
    }
}
