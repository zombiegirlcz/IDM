package w20;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends gim.c {
    public u10.e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f293907w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f293908x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f293907w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f293908x |= Integer.MIN_VALUE;
        return e.a(this.f293907w, null, this);
    }
}
