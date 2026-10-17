package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class t1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ u1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184948w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(u1 u1Var, gim.c cVar) {
        super(cVar);
        this.v = u1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184948w |= Integer.MIN_VALUE;
        return this.v.b3(this);
    }
}
