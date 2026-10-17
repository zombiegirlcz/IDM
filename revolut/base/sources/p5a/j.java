package p5a;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f233072w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f233073x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, gim.c cVar) {
        super(cVar);
        this.f233072w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f233073x |= Integer.MIN_VALUE;
        return this.f233072w.e(null, this);
    }
}
