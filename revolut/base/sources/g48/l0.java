package g48;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends gim.c {
    public n38.e0 u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n38.u f140385w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f140386x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r0 f140387y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(r0 r0Var, gim.c cVar) {
        super(cVar);
        this.f140387y = r0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f140386x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f140387y.q(null, null, this);
    }
}
