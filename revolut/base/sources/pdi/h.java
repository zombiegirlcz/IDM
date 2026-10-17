package pdi;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f235250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f235251x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.f235250w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f235251x |= Integer.MIN_VALUE;
        return this.f235250w.a(this);
    }
}
