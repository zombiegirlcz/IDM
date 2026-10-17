package qam;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends gim.c {
    public b u;
    public vam.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f244053w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f244054x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f244055y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f244054x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f244053w = obj2;
        this.f244055y |= Integer.MIN_VALUE;
        return b.d(this.f244054x, null, this);
    }
}
