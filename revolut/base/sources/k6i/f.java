package k6i;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public String u;
    public fo3.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public io3.d f181730w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f181731x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f181732y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, gim.c cVar) {
        super(cVar);
        this.f181732y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f181731x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f181732y.b(null, this);
    }
}
