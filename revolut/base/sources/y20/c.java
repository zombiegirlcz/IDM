package y20;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends gim.c {
    public int A;
    public p u;
    public r10.q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u10.q f310471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f310472x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f310473y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.z = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f310473y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(null, null, this);
    }
}
