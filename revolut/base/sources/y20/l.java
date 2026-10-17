package y20;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends gim.c {
    public v20.s0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v60.g f310520w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f310521x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v60.g gVar, gim.c cVar) {
        super(cVar);
        this.f310520w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f310521x |= Integer.MIN_VALUE;
        return v60.g.a(this.f310520w, null, this);
    }
}
