package ble;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.invest.impl.ui.home.f f16611b;

    public /* synthetic */ x(com.revolut.feature.tab.invest.impl.ui.home.f fVar, int i) {
        this.f16610a = i;
        this.f16611b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16610a) {
            case 0:
                ((gld.f0) this.f16611b.Q).c3(new mkd.a(new SlotContext(akd.s.INVEST_HOME)));
                return Unit.f186387a;
            case 1:
                z1 z1Var = this.f16611b.T.f16557c;
                Unit unit = Unit.f186387a;
                z1Var.k(unit);
                return unit;
            default:
                z1 z1Var2 = this.f16611b.T.f16557c;
                Unit unit2 = Unit.f186387a;
                z1Var2.k(unit2);
                return unit2;
        }
    }
}
