package h54;

/* JADX INFO: loaded from: classes22.dex */
public final class g0 extends gim.c {
    public com.revolut.feature.credit.application.plugins.impl.ui.application.d u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f149465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.d f149466x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f149467y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar, gim.c cVar) {
        super(cVar);
        this.f149466x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f149465w = obj2;
        this.f149467y |= Integer.MIN_VALUE;
        return this.f149466x.h3(this);
    }
}
