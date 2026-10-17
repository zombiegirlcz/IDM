package ate;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f9032w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9033x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f9032w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f9033x |= Integer.MIN_VALUE;
        return this.f9032w.b(null, this);
    }
}
