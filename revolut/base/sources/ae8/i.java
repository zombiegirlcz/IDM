package ae8;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ o7.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3512w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o7.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f3512w |= Integer.MIN_VALUE;
        return this.v.f(null, this);
    }
}
