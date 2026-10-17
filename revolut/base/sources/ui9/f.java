package ui9;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public ai9.h u;
    public wi9.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f280327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f280328x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f280329y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, gim.c cVar) {
        super(cVar);
        this.f280328x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f280327w = obj2;
        this.f280329y |= Integer.MIN_VALUE;
        return this.f280328x.d(null, null, this);
    }
}
