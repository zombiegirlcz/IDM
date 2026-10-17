package bn2;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17010w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, gim.c cVar) {
        super(cVar);
        this.v = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f17010w |= Integer.MIN_VALUE;
        return this.v.a(null, null, this);
    }
}
