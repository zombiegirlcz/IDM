package i2j;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public j1j.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fn2.c f157992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f157993x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fn2.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f157992w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f157993x |= Integer.MIN_VALUE;
        return this.f157992w.p(null, null, this);
    }
}
