package i2j;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public Integer u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f157986w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f157987x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f157988y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f157987x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f157986w = obj2;
        this.f157988y |= Integer.MIN_VALUE;
        return this.f157987x.a(null, this);
    }
}
