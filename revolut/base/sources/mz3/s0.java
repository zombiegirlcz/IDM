package mz3;

/* JADX INFO: loaded from: classes22.dex */
public final class s0 extends gim.c {
    public int A;
    public it3.d u;
    public grl.r2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wi0.b f210675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f210676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f210677y;
    public final /* synthetic */ t0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, gim.c cVar) {
        super(cVar);
        this.z = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f210677y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.g(null, null, null, null, null, this);
    }
}
