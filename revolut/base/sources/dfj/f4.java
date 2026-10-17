package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class f4 extends gim.c {
    public chj.k0 u;
    public dej.a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f113967w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k4 f113968x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f113969y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(k4 k4Var, gim.c cVar) {
        super(cVar);
        this.f113968x = k4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f113967w = obj2;
        this.f113969y |= Integer.MIN_VALUE;
        return this.f113968x.i(null, null, null, null, null, null, null, null, null, null, this);
    }
}
