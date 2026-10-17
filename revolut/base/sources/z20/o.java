package z20;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends gim.c {
    public d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f318925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f318926x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, gim.c cVar) {
        super(cVar);
        this.f318925w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f318926x |= Integer.MIN_VALUE;
        return this.f318925w.e(null, this);
    }
}
