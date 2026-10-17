package d4f;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f111296w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, gim.c cVar) {
        super(cVar);
        this.v = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f111296w |= Integer.MIN_VALUE;
        return this.v.g(this);
    }
}
