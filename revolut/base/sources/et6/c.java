package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public mr6.i u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f129201w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129202x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.f129201w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129202x |= Integer.MIN_VALUE;
        return this.f129201w.a(this);
    }
}
