package tjh;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.c {
    public h0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f271757w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f271758x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h0 h0Var, gim.c cVar) {
        super(cVar);
        this.f271757w = h0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f271758x |= Integer.MIN_VALUE;
        return h0.r3(this.f271757w, null, this);
    }
}
