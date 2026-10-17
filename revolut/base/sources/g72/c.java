package g72;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public int A;
    public g u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f141073w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f141074x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f141075y;
    public final /* synthetic */ g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.z = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f141075y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.j(this);
    }
}
