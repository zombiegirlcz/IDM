package n5k;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f212645w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f212646x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, gim.c cVar) {
        super(cVar);
        this.f212645w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f212646x |= Integer.MIN_VALUE;
        return this.f212645w.k3(null, this);
    }
}
