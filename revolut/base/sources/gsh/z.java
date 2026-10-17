package gsh;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ a0 B;
    public int C;
    public dsh.t u;
    public dsh.t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a0 f146531w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f146532x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public hlm.c f146533y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.B = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.k(null, null, null, this);
    }
}
