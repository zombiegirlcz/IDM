package h54;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends gim.c {
    public it3.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.d f149490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f149491x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar, gim.c cVar) {
        super(cVar);
        this.f149490w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f149491x |= Integer.MIN_VALUE;
        return this.f149490w.Q2(null, this);
    }
}
