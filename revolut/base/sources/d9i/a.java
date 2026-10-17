package d9i;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public f9i.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f112389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f112390x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f112389w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f112390x |= Integer.MIN_VALUE;
        return this.f112389w.d(null, this);
    }
}
