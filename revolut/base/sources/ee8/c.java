package ee8;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public String u;
    public zm3.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f125142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f125143x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f125144y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f125143x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f125142w = obj2;
        this.f125144y |= Integer.MIN_VALUE;
        return this.f125143x.c(null, null, this);
    }
}
