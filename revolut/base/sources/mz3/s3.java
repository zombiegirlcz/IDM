package mz3;

/* JADX INFO: loaded from: classes22.dex */
public final class s3 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ u3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f210678w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(u3 u3Var, gim.c cVar) {
        super(cVar);
        this.v = u3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f210678w |= Integer.MIN_VALUE;
        return this.v.g(null, null, this);
    }
}
