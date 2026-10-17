package u1m;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.c {
    public o u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f276479w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f276480x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f276481y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, gim.c cVar) {
        super(cVar);
        this.f276481y = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f276480x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f276481y.h(null, null, this);
    }
}
