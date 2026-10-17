package cul;

/* JADX INFO: loaded from: classes12.dex */
public final class o2 extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e B;
    public int C;
    public k4l.r0 u;
    public gim.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public bfl.g f109146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public bfl.g f109147x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public k4l.r0 f109148y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, gim.c cVar) {
        super(cVar);
        this.B = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return com.revolut.trading.orders.ui.invest.placement.screens.edit.e.N2(this.B, null, null, this);
    }
}
