package mf4;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.c {
    public int A;
    public int u;
    public cv3.d0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public sx3.a f204878w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f204879x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f204880y;
    public final /* synthetic */ a0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.z = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f204880y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.q(0, this);
    }
}
