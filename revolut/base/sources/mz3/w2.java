package mz3;

/* JADX INFO: loaded from: classes22.dex */
public final class w2 extends gim.c {
    public int A;
    public it3.d u;
    public grl.r2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wi0.b f210698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f210699x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f210700y;
    public final /* synthetic */ x2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var, gim.c cVar) {
        super(cVar);
        this.z = x2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f210700y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, null, null, null, null, this);
    }
}
