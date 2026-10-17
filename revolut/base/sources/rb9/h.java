package rb9;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.c {
    public long u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f253001w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f253002x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f253001w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f253002x |= Integer.MIN_VALUE;
        return this.f253001w.J2(0L, this);
    }
}
