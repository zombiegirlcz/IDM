package ae8;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a5h.g f3510w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3511x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a5h.g gVar, gim.c cVar) {
        super(cVar);
        this.f3510w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f3511x |= Integer.MIN_VALUE;
        return this.f3510w.B0(null, null, this);
    }
}
