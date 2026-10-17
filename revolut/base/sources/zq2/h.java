package zq2;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ uc.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f324352w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(uc.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f324352w |= Integer.MIN_VALUE;
        return uc.d.g(this.v, null, this);
    }
}
