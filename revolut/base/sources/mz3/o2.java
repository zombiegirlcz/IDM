package mz3;

/* JADX INFO: loaded from: classes22.dex */
public final class o2 extends gim.c {
    public ys3.a u;
    public it3.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f210644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q2 f210645x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f210646y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(q2 q2Var, gim.c cVar) {
        super(cVar);
        this.f210645x = q2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f210644w = obj2;
        this.f210646y |= Integer.MIN_VALUE;
        return this.f210645x.g(null, null, this);
    }
}
