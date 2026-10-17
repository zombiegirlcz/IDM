package gsh;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public csh.h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f146477w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f146478x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n nVar, gim.c cVar) {
        super(cVar);
        this.f146477w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f146478x |= Integer.MIN_VALUE;
        return this.f146477w.f(this);
    }
}
