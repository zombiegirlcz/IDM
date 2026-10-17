package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class s1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ x1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f226689w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(x1 x1Var, gim.c cVar) {
        super(cVar);
        this.v = x1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f226689w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
