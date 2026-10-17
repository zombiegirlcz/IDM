package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class j6 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ m6 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184776w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(m6 m6Var, gim.c cVar) {
        super(cVar);
        this.v = m6Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184776w |= Integer.MIN_VALUE;
        return this.v.c(null, null, this);
    }
}
