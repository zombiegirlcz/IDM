package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class a1 extends gim.c {
    public int A;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ql4.v f226513w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226514x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f226515y;
    public final /* synthetic */ r1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(r1 r1Var, gim.c cVar) {
        super(cVar);
        this.z = r1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226515y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, null, 0, null, null, this);
    }
}
