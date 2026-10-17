package o3k;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public xi0.b u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f221839w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f221840x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f221841y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f221840x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f221839w = obj2;
        this.f221841y |= Integer.MIN_VALUE;
        return this.f221840x.e(null, null, 0L, null, null, null, null, this);
    }
}
