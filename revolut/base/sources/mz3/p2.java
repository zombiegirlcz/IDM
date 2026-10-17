package mz3;

/* JADX INFO: loaded from: classes22.dex */
public final class p2 extends gim.c {
    public int A;
    public it3.d u;
    public grl.r2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wi0.b f210653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f210654x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f210655y;
    public final /* synthetic */ q2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(q2 q2Var, gim.c cVar) {
        super(cVar);
        this.z = q2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f210655y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.h(null, null, null, null, null, this);
    }
}
