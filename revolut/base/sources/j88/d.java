package j88;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f172157w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.v = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f172157w |= Integer.MIN_VALUE;
        return this.v.c(this);
    }
}
