package k3c;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.c {
    public p u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f180669w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f180670x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, gim.c cVar) {
        super(cVar);
        this.f180669w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f180670x |= Integer.MIN_VALUE;
        return this.f180669w.c(this);
    }
}
