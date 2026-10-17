package ble;

/* JADX INFO: loaded from: classes8.dex */
public final class x0 extends gim.c {
    public com.revolut.feature.tab.invest.impl.ui.home.f u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.invest.impl.ui.home.f f16612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16613x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.revolut.feature.tab.invest.impl.ui.home.f fVar, gim.c cVar) {
        super(cVar);
        this.f16612w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f16613x |= Integer.MIN_VALUE;
        return this.f16612w.N2(null, null, this);
    }
}
