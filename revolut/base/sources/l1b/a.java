package l1b;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends gim.c {
    public jf0.c u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f191508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f191509x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f191510y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f191509x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f191508w = obj2;
        this.f191510y |= Integer.MIN_VALUE;
        return c.b(this.f191509x, null, this);
    }
}
