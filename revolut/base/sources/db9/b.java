package db9;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public wi0.b u;
    public t89.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f112684w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f112685x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f112686y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f112685x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f112684w = obj2;
        this.f112686y |= Integer.MIN_VALUE;
        return this.f112685x.b(null, null, this);
    }
}
