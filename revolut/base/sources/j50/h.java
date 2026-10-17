package j50;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends gim.c {
    public g u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f171432w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f171433x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.f171432w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f171433x |= Integer.MIN_VALUE;
        return this.f171432w.b(null, this);
    }
}
