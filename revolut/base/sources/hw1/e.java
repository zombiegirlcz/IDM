package hw1;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.c {
    public m u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f156034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f156035x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f156034w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f156035x |= Integer.MIN_VALUE;
        return this.f156034w.a(null, this);
    }
}
