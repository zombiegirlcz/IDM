package hje;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f152735w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f152736x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f152735w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f152736x |= Integer.MIN_VALUE;
        return this.f152735w.e(null, this);
    }
}
