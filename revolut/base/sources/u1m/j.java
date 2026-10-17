package u1m;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.c {
    public o u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u f276476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f276477x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f276478y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, gim.c cVar) {
        super(cVar);
        this.f276478y = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f276477x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f276478y.g(null, null, this);
    }
}
