package lik;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public int A;
    public hha.d u;
    public xfa.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xfa.a f195549w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ac1.b f195550x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f195551y;
    public final /* synthetic */ g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.z = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f195551y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.Z2(null, null, null, null, this);
    }
}
