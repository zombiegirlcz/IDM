package s56;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f260005w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f260006x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(i0 i0Var, gim.c cVar) {
        super(cVar);
        this.f260005w = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f260006x |= Integer.MIN_VALUE;
        return this.f260005w.c(null, null, this);
    }
}
