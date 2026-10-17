package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zq.a f129367w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129368x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(zq.a aVar, gim.c cVar) {
        super(cVar);
        this.f129367w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129368x |= Integer.MIN_VALUE;
        return this.f129367w.n(null, this);
    }
}
