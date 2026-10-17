package km2;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f185687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f185688x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, gim.c cVar) {
        super(cVar);
        this.f185687w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f185688x |= Integer.MIN_VALUE;
        return this.f185687w.a(null, this);
    }
}
