package cul;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class j0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109121b;

    public /* synthetic */ j0(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, int i) {
        this.f109120a = i;
        this.f109121b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f109120a) {
            case 0:
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = this.f109121b;
                eVar.n2(new j1(eVar, null, 1), new whi.b(6));
                return Unit.f186387a;
            case 1:
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar2 = this.f109121b;
                eVar2.n2(new j1(eVar2, null, 2), new whi.b(6));
                return Unit.f186387a;
            case 2:
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar3 = this.f109121b;
                eVar3.n2(new j1(eVar3, null, 3), new whi.b(6));
                return Unit.f186387a;
            case 3:
                this.f109121b.B2();
                return Unit.f186387a;
            default:
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar4 = this.f109121b;
                return vkm.q.q(xam.a.h(new y0(eVar4, (Continuation) null, 20), vkm.q.q(zh9.u0.m(nim.a.v(com.revolut.trading.orders.ui.invest.placement.screens.edit.e.Z2(eVar4), new l0(22)), eVar4.T2()))));
        }
    }
}
