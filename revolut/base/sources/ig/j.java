package ig;

/* JADX INFO: loaded from: classes.dex */
public final class j extends gim.c {
    public k u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f161055w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f161056x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f161055w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f161056x |= Integer.MIN_VALUE;
        return this.f161055w.b(this);
    }
}
