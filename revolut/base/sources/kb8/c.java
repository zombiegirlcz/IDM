package kb8;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f182531w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f182532x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f182533y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f182532x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f182531w = obj2;
        this.f182533y |= Integer.MIN_VALUE;
        return this.f182532x.a(null, this);
    }
}
