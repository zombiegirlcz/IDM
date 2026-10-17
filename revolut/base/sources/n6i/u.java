package n6i;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f212820w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, gim.c cVar) {
        super(cVar);
        this.v = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f212820w |= Integer.MIN_VALUE;
        return this.v.b(null, this);
    }
}
