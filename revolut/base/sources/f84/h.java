package f84;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.c {
    public k u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f132730w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f132731x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.f132730w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f132731x |= Integer.MIN_VALUE;
        return this.f132730w.b(null, this);
    }
}
