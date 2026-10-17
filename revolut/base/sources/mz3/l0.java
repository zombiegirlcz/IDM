package mz3;

/* JADX INFO: loaded from: classes22.dex */
public final class l0 extends gim.c {
    public int A;
    public it3.d u;
    public grl.r2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wi0.b f210626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f210627x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f210628y;
    public final /* synthetic */ m0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, gim.c cVar) {
        super(cVar);
        this.z = m0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f210628y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.g(null, null, null, null, null, this);
    }
}
