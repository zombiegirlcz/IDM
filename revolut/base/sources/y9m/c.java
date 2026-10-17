package y9m;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f311871w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f311872x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f311871w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f311872x |= Integer.MIN_VALUE;
        return this.f311871w.a(null, this);
    }
}
