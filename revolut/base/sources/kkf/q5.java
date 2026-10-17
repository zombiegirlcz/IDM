package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class q5 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ t5 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184909w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(t5 t5Var, gim.c cVar) {
        super(cVar);
        this.v = t5Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184909w |= Integer.MIN_VALUE;
        return this.v.c(null, null, this);
    }
}
