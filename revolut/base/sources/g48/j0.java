package g48;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f140381w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(r0 r0Var, gim.c cVar) {
        super(cVar);
        this.v = r0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f140381w |= Integer.MIN_VALUE;
        return this.v.o(this);
    }
}
