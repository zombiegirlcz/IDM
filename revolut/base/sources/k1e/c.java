package k1e;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.stock_lending.impl.ui.screens.transaction.StockLendingTransactionDetailsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) obj2;
        e eVar = (e) this.receiver;
        KProperty[] kPropertyArr = StockLendingTransactionDetailsScreen.c0;
        g gVar = (g) eVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51822a, "ID_LEARN_MORE")) {
            gVar.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("topic.stock-lending", 2))));
        }
        return Unit.f186387a;
    }
}
