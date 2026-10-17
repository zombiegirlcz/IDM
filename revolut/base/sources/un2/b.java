package un2;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public jf0.c u;
    public mn2.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f281340w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f281341x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f281342y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f281341x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f281340w = obj2;
        this.f281342y |= Integer.MIN_VALUE;
        return this.f281341x.e(null, this);
    }
}
