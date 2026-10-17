package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class v3 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k4 f114132w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114133x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(k4 k4Var, gim.c cVar) {
        super(cVar);
        this.f114132w = k4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114133x |= Integer.MIN_VALUE;
        return this.f114132w.c(null, null, this);
    }
}
