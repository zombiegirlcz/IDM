package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class e1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ i1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184654w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(i1 i1Var, gim.c cVar) {
        super(cVar);
        this.v = i1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184654w |= Integer.MIN_VALUE;
        return this.v.c(null, null, this);
    }
}
