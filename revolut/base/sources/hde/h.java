package hde;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f151418w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f151419x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f151418w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f151419x |= Integer.MIN_VALUE;
        return this.f151418w.e(null, this);
    }
}
