package ae6;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f3479x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3480y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f3479x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f3478w = obj2;
        this.f3480y |= Integer.MIN_VALUE;
        return c.d(this.f3479x, this);
    }
}
