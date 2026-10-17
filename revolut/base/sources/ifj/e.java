package ifj;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public znj.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f161028w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f161029x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f161028w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f161029x |= Integer.MIN_VALUE;
        return this.f161028w.g(null, this);
    }
}
