package b67;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f12537w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f12538x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12539y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f12538x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f12537w = obj2;
        this.f12539y |= Integer.MIN_VALUE;
        return this.f12538x.i(null, null, null, this);
    }
}
