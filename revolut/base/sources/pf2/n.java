package pf2;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.n0;
import com.revolut.core.ui_kit.delegates.widgets.p2;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.api.navigation.list.ApmTransactionAreaListInputData;
import com.revolut.feature.apm.upi.api.UpiFeatureConfig;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.payments.profile.api.navigation.PaymentProfileInputData;
import com.revolut.feature.payments.profile.api.navigation.PaymentsProfileDestination;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ox5.r;
import tof.a3;
import vkm.z1;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends oki.h implements d {

    @NotNull
    public static final l Companion = new l();
    public final lal.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f235417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e12.f f235418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kz9.a f235419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f235420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f235421t;

    public n(lal.a upiAreaProvider, c70.a clipboard, e12.f apmTransactionAreaListExtension, kz9.a chatNavigationProvider, p stateMapper) {
        Intrinsics.checkNotNullParameter(upiAreaProvider, "upiAreaProvider");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(apmTransactionAreaListExtension, "apmTransactionAreaListExtension");
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = upiAreaProvider;
        this.f235417p = clipboard;
        this.f235418q = apmTransactionAreaListExtension;
        this.f235419r = chatNavigationProvider;
        this.f235420s = mra.d.b(this, new b(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f235421t = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f235421t, new okf.m(continuation, this, 24)), null, null, new r(this, continuation, 27), 3);
    }

    public final void I2(a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = m.f235416a[action.ordinal()];
        if (i == 1) {
            C1(UpiFeatureConfig.TransferInputIdOrMobile.f62954g.f98274b);
        } else if (i == 2) {
            C1(new PaymentsProfileDestination(new PaymentProfileInputData(ew9.b.QR_SCANNER)));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            C1(new SharedHelpDestination((SharedHelpDestination.InputData) null, 3));
        }
    }

    public final void J2(BaseDraggableWidgetDelegate.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof i3) {
            RowDelegate.Model model = ((i3) event).f55382c;
            if (Intrinsics.f(model.f53228a, "UPI_SUBSCRIPTIONS_ID")) {
                C1(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) null, 3));
                return;
            }
            Object obj2 = model.u;
            a3 a3Var = obj2 instanceof a3 ? (a3) obj2 : null;
            if (a3Var != null) {
                C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P(a3Var), null, null, null, 126))));
                return;
            }
            return;
        }
        if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            BaseDraggableWidgetDelegate.Model model2 = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
            if (model2 instanceof HorizontalScrollerWidgetDelegate.Model) {
                C1(new TransferDestination.PaymentsSearch(WhoToTransferFilter.ApmUpi.f79995a, 29));
                return;
            } else {
                if (model2 instanceof RowsWidgetDelegate.Model) {
                    K2();
                    return;
                }
                return;
            }
        }
        if (event instanceof n0) {
            Object obj3 = ((n0) event).f55437c.f53167l;
            if (obj3 instanceof PaymentCounterpartyInfo) {
                C1(u0.c(((uz9.a) this.f235419r).a(new ChatTransferRecipient.PaymentCounterpartyRecipient((PaymentCounterpartyInfo) obj3), null)));
                return;
            } else {
                C1(UpiFeatureConfig.TransferInputIdOrMobile.f62954g.f98274b);
                return;
            }
        }
        if (!(event instanceof p2)) {
            if (event instanceof g3) {
                K2();
                return;
            }
            return;
        }
        PaymentLinkWidgetDelegate.Model model3 = ((p2) event).f55467c;
        Object obj4 = model3.f55203g;
        String str = obj4 instanceof String ? (String) obj4 : null;
        if (str != null) {
            this.f235417p.c(null, str, false, new os2.a(this, 25));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("UpiArea: handling not supported: ", model3.f55201b));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    public final void K2() {
        C1(new com.revolut.kompot.common.b(e1(new e12.e(new ApmTransactionAreaListInputData(0), this.f235418q)), (ModalDestination.Style) null, 6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f235420s;
    }
}
