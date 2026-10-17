package m4k;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public kq2.a u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f202752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f202753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f202754y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f202753x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f202752w = obj2;
        this.f202754y |= Integer.MIN_VALUE;
        return this.f202753x.g(null, null, this);
    }
}
