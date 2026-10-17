package akf;

/* JADX INFO: loaded from: classes8.dex */
public final class d1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ f1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5826w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, gim.c cVar) {
        super(cVar);
        this.v = f1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f5826w |= Integer.MIN_VALUE;
        return this.v.c(null, null, this);
    }
}
