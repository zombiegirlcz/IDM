package yy9;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.c {
    public int A;
    public String u;
    public Object[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object[] f317916w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f317917x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f317918y;
    public final /* synthetic */ r z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, gim.c cVar) {
        super(cVar);
        this.z = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f317918y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, this);
    }
}
