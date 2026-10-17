package g1i;

import com.revolut.feature.revolut_x_balances.api.fiat.navigation.RevXOrdersBreakdownControllerDestination;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.order_settings.OrderSettingsContract$Configuration;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f139617b;

    public /* synthetic */ e0(l0 l0Var, int i) {
        this.f139616a = i;
        this.f139617b = l0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f139616a) {
            case 0:
                ExchangeOrderDraft it8 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f139617b.d.a(vhi.c.c(new RevXOrdersBreakdownControllerDestination(it8.f96879a.f96897a, t4c.a.BRIEF), yhi.b.BOTTOM_DIALOG, null, false, 12));
            case 1:
                FeatureCommand command = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return this.f139617b.d.a(command);
            case 2:
                NaviCommand naviCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
                return this.f139617b.g(naviCommand);
            case 3:
                FeatureCommand it9 = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return this.f139617b.d.a(it9);
            case 4:
                FeatureCommand command2 = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(command2, "command");
                return this.f139617b.d.a(command2);
            case 5:
                NaviCommand command3 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command3, "command");
                return this.f139617b.d.a(command3);
            case 6:
                FeatureCommand command4 = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(command4, "command");
                return this.f139617b.d.a(command4);
            default:
                ExchangeOrderDraft draft = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                w1i.g.Companion.getClass();
                return this.f139617b.d.a(new ActivityNavigateCommand(w1i.c.f293855b, new OrderSettingsContract$Configuration(draft.f96885l, R$string.common_action_done), null, null, 0, null, null, null, null, false, 1020));
        }
    }
}
