package i23;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.c {
    public n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f157820w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f157821x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, gim.c cVar) {
        super(cVar);
        this.f157820w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f157821x |= Integer.MIN_VALUE;
        return this.f157820w.b3(null, null, this);
    }
}
