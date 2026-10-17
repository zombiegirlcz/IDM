package hje;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f152740w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f152741x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f152740w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f152741x |= Integer.MIN_VALUE;
        return this.f152740w.e(null, this);
    }
}
