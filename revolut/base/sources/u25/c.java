package u25;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f276549w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f276550x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, gim.c cVar) {
        super(cVar);
        this.f276549w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f276550x |= Integer.MIN_VALUE;
        return this.f276549w.f(null, this);
    }
}
