package mz3;

/* JADX INFO: loaded from: classes22.dex */
public final class x1 extends gim.c {
    public int A;
    public it3.d u;
    public grl.r2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wi0.b f210702w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f210703x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f210704y;
    public final /* synthetic */ y1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(y1 y1Var, gim.c cVar) {
        super(cVar);
        this.z = y1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f210704y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.e(null, null, null, null, null, null, this);
    }
}
