package u8c;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public xi0.b u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f278159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f278160x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f278161y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f278160x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f278159w = obj2;
        this.f278161y |= Integer.MIN_VALUE;
        return e.f3(this.f278160x, null, null, null, this);
    }
}
