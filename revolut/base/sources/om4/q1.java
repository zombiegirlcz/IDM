package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class q1 extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f226667w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f226668x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r1 f226669y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, gim.c cVar) {
        super(cVar);
        this.f226669y = r1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226668x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f226669y.s(null, null, 0, null, null, this);
    }
}
