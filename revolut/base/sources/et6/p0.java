package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends gim.c {
    public au6.e0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f129295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129296x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, gim.c cVar) {
        super(cVar);
        this.f129295w = q0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129296x |= Integer.MIN_VALUE;
        return this.f129295w.a(null, this);
    }
}
