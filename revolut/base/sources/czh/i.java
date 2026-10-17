package czh;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public xi0.b u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f110248w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f110249x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f110250y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f110249x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f110248w = obj2;
        this.f110250y |= Integer.MIN_VALUE;
        return this.f110249x.d(null, null, null, null, false, this);
    }
}
