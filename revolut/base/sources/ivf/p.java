package ivf;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f168854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f168855x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, gim.c cVar) {
        super(cVar);
        this.f168854w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f168855x |= Integer.MIN_VALUE;
        return this.f168854w.d(false, this);
    }
}
