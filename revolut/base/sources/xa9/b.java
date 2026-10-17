package xa9;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public long u;
    public hlm.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f303784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f303785x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f303786y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f303785x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f303784w = obj2;
        this.f303786y |= Integer.MIN_VALUE;
        return d.a(this.f303785x, 0L, this);
    }
}
