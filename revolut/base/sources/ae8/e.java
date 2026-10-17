package ae8;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ a5h.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3507w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a5h.g gVar, gim.c cVar) {
        super(cVar);
        this.v = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f3507w |= Integer.MIN_VALUE;
        return this.v.a0(null, this);
    }
}
