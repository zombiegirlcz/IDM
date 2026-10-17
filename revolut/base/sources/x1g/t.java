package x1g;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends gim.c {
    public iyf.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f302438w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f302439x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(c0 c0Var, gim.c cVar) {
        super(cVar);
        this.f302438w = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f302439x |= Integer.MIN_VALUE;
        return c0.I2(this.f302438w, this);
    }
}
