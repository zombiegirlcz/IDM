package wdb;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f296513w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f296514x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, gim.c cVar) {
        super(cVar);
        this.f296513w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f296514x |= Integer.MIN_VALUE;
        return this.f296513w.c(null, this);
    }
}
