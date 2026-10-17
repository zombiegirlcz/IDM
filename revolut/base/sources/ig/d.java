package ig;

/* JADX INFO: loaded from: classes.dex */
public final class d extends gim.c {
    public Object u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f161044w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f161045x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f161046y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f161045x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f161044w = obj2;
        this.f161046y |= Integer.MIN_VALUE;
        return this.f161045x.b(this);
    }
}
