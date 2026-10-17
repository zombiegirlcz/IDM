package tf1;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.c {
    public hlm.a u;
    public o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f270173w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f270174x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f270175y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, gim.c cVar) {
        super(cVar);
        this.f270175y = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f270174x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f270175y.b(this);
    }
}
