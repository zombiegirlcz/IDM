package fc2;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public int A;
    public g u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f133613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f133614x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f133615y;
    public final /* synthetic */ g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.z = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f133615y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.p(this);
    }
}
