package oul;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class v implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.target_price.b f229924b;

    public /* synthetic */ v(com.revolut.trading.orders.ui.invest.placement.target_price.b bVar, int i) {
        this.f229923a = i;
        this.f229924b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f229923a) {
            case 0:
                com.revolut.trading.orders.ui.invest.placement.target_price.b bVar = this.f229924b;
                bVar.n2(new a0(bVar, null, 3), new whi.b(6));
                return Unit.f186387a;
            case 1:
                com.revolut.trading.orders.ui.invest.placement.target_price.b bVar2 = this.f229924b;
                bVar2.n2(new a0(bVar2, null, 0), new whi.b(6));
                return Unit.f186387a;
            case 2:
                com.revolut.trading.orders.ui.invest.placement.target_price.b bVar3 = this.f229924b;
                return rd0.e.b(((ael.k) bVar3.f107007q).f(bVar3.o.f106996a));
            default:
                com.revolut.trading.orders.ui.invest.placement.target_price.b bVar4 = this.f229924b;
                return ((ael.k) bVar4.f107007q).o(bVar4.o.f106996a, w4l.h.f294642c);
        }
    }
}
