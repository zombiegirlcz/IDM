package iz1;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public dx1.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f169827w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f169828x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.f169827w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f169828x |= Integer.MIN_VALUE;
        return h.b(this.f169827w, null, null, this);
    }
}
