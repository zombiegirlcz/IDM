package mle;

import com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreen;
import com.revolut.shared.feature.wealth.models.portfolio.StockBuyBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import rp0.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        p0.a clickData = (p0.a) obj2;
        i iVar = (i) this.receiver;
        KProperty[] kPropertyArr = InvestSettingsScreen.f0;
        z zVar = (z) iVar;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        wlh.k kVar = (wlh.k) zVar.u;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj4 = clickData.f256150a;
        if (obj4 instanceof uih.f) {
            uih.f fVar = (uih.f) obj4;
            ((r60.d) kVar.f298500n).Q();
            if (fVar.f280444b instanceof StockBuyBlock.Active) {
                kVar.T2(new wlh.j(kVar, fVar, null, 0), new yi5.b(27));
            }
        }
        return Unit.f186387a;
    }
}
