package g6i;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f140953w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.v = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f140953w |= Integer.MIN_VALUE;
        return this.v.b3(null, this);
    }
}
