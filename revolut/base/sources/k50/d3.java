package k50;

/* JADX INFO: loaded from: classes19.dex */
public final class d3 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ j4 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f181052w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(j4 j4Var, gim.c cVar) {
        super(cVar);
        this.v = j4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f181052w |= Integer.MIN_VALUE;
        return this.v.h3(this);
    }
}
