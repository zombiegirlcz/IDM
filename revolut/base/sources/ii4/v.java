package ii4;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends gim.c {
    public g0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f161561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f161562x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, gim.c cVar) {
        super(cVar);
        this.f161561w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f161562x |= Integer.MIN_VALUE;
        return z.a(this.f161561w, null, this);
    }
}
