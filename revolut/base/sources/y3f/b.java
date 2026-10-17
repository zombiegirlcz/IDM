package y3f;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public long u;
    public c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f310695w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f310696x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f310697y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f310696x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f310695w = obj2;
        this.f310697y |= Integer.MIN_VALUE;
        return this.f310696x.a(0L, this);
    }
}
