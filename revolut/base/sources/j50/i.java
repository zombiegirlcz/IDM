package j50;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends gim.c {
    public g u;
    public b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f171434w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f171435x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f171436y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f171435x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f171434w = obj2;
        this.f171436y |= Integer.MIN_VALUE;
        return this.f171435x.c(null, null, this);
    }
}
