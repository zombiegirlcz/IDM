package wo5;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f298885w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f298886x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.f298885w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f298886x |= Integer.MIN_VALUE;
        return this.f298885w.e(null, this);
    }
}
