package n30;

/* JADX INFO: loaded from: classes19.dex */
public final class k0 extends gim.c {
    public int A;
    public int B;
    public int C;
    public long D;
    public /* synthetic */ Object E;
    public final /* synthetic */ p0 F;
    public int G;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f211640w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f211641x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f211642y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p0 p0Var, gim.c cVar) {
        super(cVar);
        this.F = p0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.E = obj2;
        this.G |= Integer.MIN_VALUE;
        Object objD = this.F.d(this, null, false);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : new yhm.m(objD);
    }
}
