package wtc;

/* JADX INFO: loaded from: classes7.dex */
public final class v0 extends gim.c {
    public a1 u;
    public cuc.u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f299912w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f299913x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f299914y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(a1 a1Var, gim.c cVar) {
        super(cVar);
        this.f299913x = a1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f299912w = obj2;
        this.f299914y |= Integer.MIN_VALUE;
        return this.f299913x.a(this);
    }
}
