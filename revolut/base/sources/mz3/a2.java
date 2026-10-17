package mz3;

/* JADX INFO: loaded from: classes22.dex */
public final class a2 extends gim.c {
    public int A;
    public it3.d u;
    public grl.r2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wi0.b f210580w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f210581x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f210582y;
    public final /* synthetic */ c2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(c2 c2Var, gim.c cVar) {
        super(cVar);
        this.z = c2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f210582y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, null, null, null, null, this);
    }
}
