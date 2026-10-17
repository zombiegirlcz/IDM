package gi2;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public com.revolut.feature.apm.wero.impl.ui.pay.b u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f144070w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.wero.impl.ui.pay.b f144071x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f144072y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.apm.wero.impl.ui.pay.b bVar, gim.c cVar) {
        super(cVar);
        this.f144071x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f144070w = obj2;
        this.f144072y |= Integer.MIN_VALUE;
        return this.f144071x.N2(null, this);
    }
}
