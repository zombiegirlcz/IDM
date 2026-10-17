package y9m;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f311873w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f311874x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f311875y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f311874x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f311873w = obj2;
        this.f311875y |= Integer.MIN_VALUE;
        return this.f311874x.b(null, null, this);
    }
}
