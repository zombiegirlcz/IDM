package nqj;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public boolean u;
    public hlm.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f218474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f218475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f218476y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f218475x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f218474w = obj2;
        this.f218476y |= Integer.MIN_VALUE;
        return c.a(this.f218475x, false, this);
    }
}
