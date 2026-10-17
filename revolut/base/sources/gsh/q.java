package gsh;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.c {
    public final /* synthetic */ a0 A;
    public int B;
    public dsh.i u;
    public a0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f146508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public hlm.c f146509x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f146510y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.A = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, null, this);
    }
}
