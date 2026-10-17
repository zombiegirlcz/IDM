package ui9;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.c {
    public wi9.g u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f280330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f280331x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f280332y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, gim.c cVar) {
        super(cVar);
        this.f280331x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f280330w = obj2;
        this.f280332y |= Integer.MIN_VALUE;
        return this.f280331x.e(null, this);
    }
}
