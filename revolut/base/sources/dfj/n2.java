package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class n2 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v2 f114050w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114051x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(v2 v2Var, gim.c cVar) {
        super(cVar);
        this.f114050w = v2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114051x |= Integer.MIN_VALUE;
        return this.f114050w.c(null, this);
    }
}
