package pgk;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f235992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f235993x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f235992w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f235993x |= Integer.MIN_VALUE;
        return this.f235992w.m(null, this);
    }
}
