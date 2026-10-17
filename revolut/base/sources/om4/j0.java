package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class j0 extends gim.c {
    public String u;
    public yw4.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226604w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k0 f226605x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226606y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, gim.c cVar) {
        super(cVar);
        this.f226605x = k0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226604w = obj2;
        this.f226606y |= Integer.MIN_VALUE;
        return this.f226605x.d(null, null, this);
    }
}
