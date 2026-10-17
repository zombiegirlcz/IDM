package i2l;

/* JADX INFO: loaded from: classes12.dex */
public final class l0 extends gim.c {
    public a2l.n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m0 f158023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f158024x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, gim.c cVar) {
        super(cVar);
        this.f158023w = m0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f158024x |= Integer.MIN_VALUE;
        return m0.I2(this.f158023w, null, this);
    }
}
