package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.c {
    public l u;
    public hlm.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f129283w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v f129284x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f129285y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v vVar, gim.c cVar) {
        super(cVar);
        this.f129284x = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f129283w = obj2;
        this.f129285y |= Integer.MIN_VALUE;
        return this.f129284x.b(null, this);
    }
}
