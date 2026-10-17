package eg0;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f125515w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.v = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f125515w |= Integer.MIN_VALUE;
        return h.b(this.v, null, null, null, this);
    }
}
