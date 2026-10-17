package db;

/* JADX INFO: loaded from: classes16.dex */
public final class a0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ i0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f112599w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(i0 i0Var, gim.c cVar) {
        super(cVar);
        this.v = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f112599w |= Integer.MIN_VALUE;
        return this.v.J2(this);
    }
}
