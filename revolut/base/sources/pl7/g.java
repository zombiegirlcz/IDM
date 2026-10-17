package pl7;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f237283w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f237284x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f237283w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f237284x |= Integer.MIN_VALUE;
        return this.f237283w.e(null, this);
    }
}
