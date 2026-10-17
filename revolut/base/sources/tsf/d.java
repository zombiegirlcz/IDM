package tsf;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f274124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f274125x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f274124w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f274125x |= Integer.MIN_VALUE;
        return this.f274124w.c(null, null, null, this);
    }
}
