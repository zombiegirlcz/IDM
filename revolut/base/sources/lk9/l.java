package lk9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pay_later.impl.ui.repaymentdetails.PayLaterRepaymentDetailsScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model item = (RowDelegate.Model) obj2;
        o oVar = (o) this.receiver;
        KProperty[] kPropertyArr = PayLaterRepaymentDetailsScreen.f78910k0;
        y yVar = (y) oVar;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        if (!((com.revolut.feature.pay_later.impl.ui.help.a) yVar.v).O1(item)) {
            Object obj4 = item.u;
            if (obj4 instanceof a3) {
                yVar.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((a3) obj4).f272581b), null, null, null, 94))));
            }
        }
        return Unit.f186387a;
    }
}
