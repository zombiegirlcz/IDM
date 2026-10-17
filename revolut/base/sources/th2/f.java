package th2;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public com.revolut.feature.apm.wero.impl.ui.flow.b u;
    public yki.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f271255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.wero.impl.ui.flow.b f271256x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f271257y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.apm.wero.impl.ui.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.f271256x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f271255w = obj2;
        this.f271257y |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.wero.impl.ui.flow.b.J2(this.f271256x, null, this);
    }
}
