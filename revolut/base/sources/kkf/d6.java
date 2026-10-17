package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class d6 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h6 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184644w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(h6 h6Var, gim.c cVar) {
        super(cVar);
        this.v = h6Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184644w |= Integer.MIN_VALUE;
        return this.v.Z2(null, this);
    }
}
