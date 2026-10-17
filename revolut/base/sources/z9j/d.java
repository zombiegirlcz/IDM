package z9j;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f320505w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f320506x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f320505w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f320506x |= Integer.MIN_VALUE;
        return e.I2(this.f320505w, null, this);
    }
}
