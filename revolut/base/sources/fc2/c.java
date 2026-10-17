package fc2;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public int A;
    public g u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f133610w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f133611x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f133612y;
    public final /* synthetic */ g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.z = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f133612y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.o(this);
    }
}
