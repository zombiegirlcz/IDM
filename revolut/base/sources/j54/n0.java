package j54;

/* JADX INFO: loaded from: classes22.dex */
public final class n0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f171532w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(r0 r0Var, gim.c cVar) {
        super(cVar);
        this.v = r0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f171532w |= Integer.MIN_VALUE;
        return this.v.e3(null, false, this);
    }
}
