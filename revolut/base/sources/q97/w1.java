package q97;

/* JADX INFO: loaded from: classes21.dex */
public final class w1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f243814w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(n nVar, gim.c cVar) {
        super(cVar);
        this.v = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f243814w |= Integer.MIN_VALUE;
        return this.v.g(this);
    }
}
