package ivf;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends gim.c {
    public Throwable u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f168840w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f168841x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, gim.c cVar) {
        super(cVar);
        this.f168840w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f168841x |= Integer.MIN_VALUE;
        return this.f168840w.a(null, null, this);
    }
}
