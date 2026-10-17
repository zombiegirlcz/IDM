package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class g1 extends gim.c {
    public String u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f226582w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f226583x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r1 f226584y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(r1 r1Var, gim.c cVar) {
        super(cVar);
        this.f226584y = r1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226583x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f226584y.f(null, null, 0, null, this);
    }
}
