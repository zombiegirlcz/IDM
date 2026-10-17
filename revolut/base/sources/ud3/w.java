package ud3;

/* JADX INFO: loaded from: classes21.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ e0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f279123w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e0 e0Var, gim.c cVar) {
        super(cVar);
        this.v = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f279123w |= Integer.MIN_VALUE;
        return e0.z2(this.v, null, this);
    }
}
