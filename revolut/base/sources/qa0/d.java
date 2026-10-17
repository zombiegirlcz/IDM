package qa0;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f243923w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f243924x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f243923w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f243924x |= Integer.MIN_VALUE;
        return this.f243923w.c3(null, this);
    }
}
