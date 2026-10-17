package t45;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f267897w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267898x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, gim.c cVar) {
        super(cVar);
        this.f267897w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f267898x |= Integer.MIN_VALUE;
        return this.f267897w.e(null, this);
    }
}
