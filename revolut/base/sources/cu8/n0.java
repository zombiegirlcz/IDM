package cu8;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f108860w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(r0 r0Var, gim.c cVar) {
        super(cVar);
        this.v = r0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f108860w |= Integer.MIN_VALUE;
        return this.v.e(this);
    }
}
