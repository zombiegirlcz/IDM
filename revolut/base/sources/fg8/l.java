package fg8;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f134943w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f134944x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.f134943w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f134944x |= Integer.MIN_VALUE;
        return this.f134943w.e(null, this);
    }
}
