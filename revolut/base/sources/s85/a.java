package s85;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends gim.c {
    public koi.j u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f260883w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f260884x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f260883w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f260884x |= Integer.MIN_VALUE;
        return this.f260883w.Z2(null, this);
    }
}
