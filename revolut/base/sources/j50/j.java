package j50;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends gim.c {
    public g u;
    public c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f f171437w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f171438x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f171439y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f171439y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f171438x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f171439y.d(null, null, this);
    }
}
