package ce4;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f23369w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23370x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, gim.c cVar) {
        super(cVar);
        this.f23369w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f23370x |= Integer.MIN_VALUE;
        return this.f23369w.g(null, null, this);
    }
}
