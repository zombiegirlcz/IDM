package w4k;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public boolean u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f294615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f294616x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f294617y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f294616x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f294615w = obj2;
        this.f294617y |= Integer.MIN_VALUE;
        return this.f294616x.a(false, null, null, null, null, false, this);
    }
}
