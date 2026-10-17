package tsf;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f274122w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f274123x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f274122w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f274123x |= Integer.MIN_VALUE;
        return this.f274122w.b(null, this);
    }
}
