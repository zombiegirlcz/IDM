package ekf;

/* JADX INFO: loaded from: classes8.dex */
public final class b1 extends gim.c {
    public final /* synthetic */ c1 A;
    public int B;
    public Object[] u;
    public f01.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object[] f127049w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127050x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f127051y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var, gim.c cVar) {
        super(cVar);
        this.A = c1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.Z2(this);
    }
}
