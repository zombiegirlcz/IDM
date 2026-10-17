package s29;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f259276w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f259277x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f259276w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f259277x |= Integer.MIN_VALUE;
        return this.f259276w.e(null, this);
    }
}
