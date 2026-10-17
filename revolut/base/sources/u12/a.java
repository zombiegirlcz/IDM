package u12;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.h;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.n0;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$Details$ByMoneyRequest;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import h12.d;
import h12.e;
import h12.f;
import h12.g;
import h12.i;
import h12.j;
import h12.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import tof.a3;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements h12.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kz9.a f276330a;

    public a(kz9.a chatNavigationProvider) {
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        this.f276330a = chatNavigationProvider;
    }

    public static g d(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1710640736) {
            if (str.equals("ApmAreaContactsMapper_newContact")) {
                return h12.b.f148445a;
            }
            return null;
        }
        if (iHashCode == 256028036) {
            if (str.equals("ApmAreaContactsMapper_widget")) {
                return e.f148448a;
            }
            return null;
        }
        if (iHashCode == 1439280523 && str.equals("ApmAreaTransactionsMapper_header")) {
            return f.f148449a;
        }
        return null;
    }

    public final BridgeDestination a(Object obj2) {
        if (obj2 instanceof ApmContact) {
            return u0.c(((uz9.a) this.f276330a).a(new ChatTransferRecipient.ApmTransferRecipient((ApmContact) obj2), null));
        }
        if (obj2 instanceof a3) {
            return u0.c(new TransactionsFeatureConfig.Details(q.P((a3) obj2), null, null, null, 126));
        }
        if (obj2 instanceof MoneyRequest) {
            return u0.c(new MoneyRequestFeatureConfig$Details$ByMoneyRequest((MoneyRequest) obj2, null));
        }
        return null;
    }

    public final k b(t clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        if (!Intrinsics.f(clickData.f54722b.f51590a, "ID_PERMISSIONS")) {
            return null;
        }
        ActionWidgetDelegate.a aVar = clickData.f54721a;
        if ((aVar instanceof ActionWidgetDelegate.a.c) || (aVar instanceof ActionWidgetDelegate.a.d)) {
            return i.f148450a;
        }
        if (aVar instanceof ActionWidgetDelegate.a.C0395a) {
            return j.f148451a;
        }
        if ((aVar instanceof h) || (aVar instanceof ActionWidgetDelegate.a.b)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final g c(BaseDraggableWidgetDelegate.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            com.revolut.core.ui_kit.delegates.widgets.i iVar = (com.revolut.core.ui_kit.delegates.widgets.i) event;
            BaseDraggableWidgetDelegate.Model model = iVar.f55375c;
            if ((model instanceof HorizontalScrollerWidgetDelegate.Model) || (model instanceof RowsWidgetDelegate.Model)) {
                return d(iVar.f55374b);
            }
            return null;
        }
        if (event instanceof n0) {
            ReferralContactDelegate.Model model2 = ((n0) event).f55437c;
            BridgeDestination bridgeDestinationA = a(model2.f53167l);
            return bridgeDestinationA != null ? new d(bridgeDestinationA) : d(model2.f53161a);
        }
        if (event instanceof i3) {
            RowDelegate.Model model3 = ((i3) event).f55382c;
            BridgeDestination bridgeDestinationA2 = a(model3.u);
            return bridgeDestinationA2 != null ? new d(bridgeDestinationA2) : new h12.c(model3.u);
        }
        if (event instanceof g3) {
            return d(((g3) event).f55359b);
        }
        return null;
    }
}
