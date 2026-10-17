package n5k;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f212644w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, gim.c cVar) {
        super(cVar);
        this.v = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f212644w |= Integer.MIN_VALUE;
        return this.v.j3(this);
    }
}
