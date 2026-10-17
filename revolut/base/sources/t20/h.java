package t20;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f267393w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, gim.c cVar) {
        super(cVar);
        this.v = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f267393w |= Integer.MIN_VALUE;
        return this.v.d(this);
    }
}
