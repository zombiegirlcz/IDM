package wtc;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f299884w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f299885x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, gim.c cVar) {
        super(cVar);
        this.f299884w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f299885x |= Integer.MIN_VALUE;
        return this.f299884w.b(this, null, false);
    }
}
