package d4f;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.c {
    public long u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f111293w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f111294x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f111295y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, gim.c cVar) {
        super(cVar);
        this.f111294x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f111293w = obj2;
        this.f111295y |= Integer.MIN_VALUE;
        return this.f111294x.f(null, null, 0L, 0, this);
    }
}
