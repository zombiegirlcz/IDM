package q4k;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f242174w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f242175x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f242174w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f242175x |= Integer.MIN_VALUE;
        return this.f242174w.a(null, this);
    }
}
