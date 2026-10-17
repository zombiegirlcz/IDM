package k50;

/* JADX INFO: loaded from: classes19.dex */
public final class u2 extends gim.c {
    public gim.i u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j4 f181256w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f181257x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(j4 j4Var, gim.c cVar) {
        super(cVar);
        this.f181256w = j4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f181257x |= Integer.MIN_VALUE;
        return this.f181256w.W2(null, this);
    }
}
