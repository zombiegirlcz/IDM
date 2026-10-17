package k6i;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jpc.e f181720w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f181721x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(jpc.e eVar, gim.c cVar) {
        super(cVar);
        this.f181720w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f181721x |= Integer.MIN_VALUE;
        return this.f181720w.d(null, this);
    }
}
