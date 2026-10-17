package a32;

/* JADX INFO: loaded from: classes20.dex */
public final class y extends gim.c {
    public a0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f1042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1043x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.f1042w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f1043x |= Integer.MIN_VALUE;
        return a0.I2(this.f1042w, null, this);
    }
}
