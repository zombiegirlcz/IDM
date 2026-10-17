package olb;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f226364w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f226364w |= Integer.MIN_VALUE;
        return this.v.l(null, this);
    }
}
