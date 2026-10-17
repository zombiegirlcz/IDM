package a6b;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f1585w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1586x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, gim.c cVar) {
        super(cVar);
        this.f1585w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f1586x |= Integer.MIN_VALUE;
        return this.f1585w.e(null, this);
    }
}
