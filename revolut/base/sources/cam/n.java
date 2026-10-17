package cam;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22686w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, gim.c cVar) {
        super(cVar);
        this.v = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f22686w |= Integer.MIN_VALUE;
        return this.v.N(null, null, null, null, false, this);
    }
}
