package mi1;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f205592w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f205592w |= Integer.MIN_VALUE;
        return this.v.b3(this);
    }
}
