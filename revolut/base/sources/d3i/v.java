package d3i;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends gim.c {
    public xi0.b u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f111202w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f111203x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a5h.g f111204y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a5h.g gVar, gim.c cVar) {
        super(cVar);
        this.f111204y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f111203x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f111204y.r0(null, null, null, this);
    }
}
