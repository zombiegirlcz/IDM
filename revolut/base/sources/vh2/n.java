package vh2;

import cli.y;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.p2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.ui.api.navigation.list.ApmTransactionAreaListInputData;
import com.revolut.feature.apm.core.ui.api.navigation.list.ApmTransactionOnlyListInputData;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType;
import com.revolut.feature.apm.wero.impl.ui.home.settings.WeroSettingsScreen;
import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlow;
import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$InputData;
import com.revolut.feature.apm.wero.impl.ui.pay.list.WeroRequestLinkListScreen;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vdl.c1;
import vkm.j2;
import vkm.z1;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends oki.h implements g {

    @NotNull
    public static final k Companion = new k();
    public final uh2.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sh2.d f289284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f62.o f289285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h12.a f289286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pn3.a f289287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vz1.j f289288t;
    public final e12.f u;
    public final e12.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c70.a f289289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ry9.d f289290x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f289291y;
    public final z1 z;

    public n(uh2.g areaProvider, sh2.d newContactNavigationProvider, f62.o recipientListNavigationProvider, h12.a apmAreaHandler, pn3.a contactsPermissionsController, vz1.j apmPreferencesRepository, e12.f apmTransactionAreaListExtension, e12.h apmTransactionOnlyListExtension, c70.a clipboard, ry9.d sendFromClipboardExtension, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(areaProvider, "areaProvider");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(recipientListNavigationProvider, "recipientListNavigationProvider");
        Intrinsics.checkNotNullParameter(apmAreaHandler, "apmAreaHandler");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(apmPreferencesRepository, "apmPreferencesRepository");
        Intrinsics.checkNotNullParameter(apmTransactionAreaListExtension, "apmTransactionAreaListExtension");
        Intrinsics.checkNotNullParameter(apmTransactionOnlyListExtension, "apmTransactionOnlyListExtension");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(sendFromClipboardExtension, "sendFromClipboardExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = areaProvider;
        this.f289284p = newContactNavigationProvider;
        this.f289285q = recipientListNavigationProvider;
        this.f289286r = apmAreaHandler;
        this.f289287s = contactsPermissionsController;
        this.f289288t = apmPreferencesRepository;
        this.u = apmTransactionAreaListExtension;
        this.v = apmTransactionOnlyListExtension;
        this.f289289w = clipboard;
        this.f289290x = sendFromClipboardExtension;
        this.f289291y = mra.d.b(this, new c(new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.z = z1VarB;
    }

    public static void I2(Object obj2) {
        IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj2, "WeroArea: handling not supported: "));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(w.l(((pn3.b) this.f289287s).b(), this.f289288t.a(n02.b.WERO))), null, null, new m(this, null, 0), 3);
        yji.l.a1(this, vkm.q.Q(this.z, new c1((Continuation) null, this, 5)), null, null, new m(this, null, 1), 3);
    }

    public final void J2(a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = l.f289282a[action.ordinal()];
        f62.o oVar = this.f289285q;
        switch (i) {
            case 1:
                C1(new com.revolut.kompot.common.b(e1(oVar.b(hrf.f.OUTGOING)), (ModalDestination.Style) null, 6));
                return;
            case 2:
                C1(new com.revolut.kompot.common.b(e1(oVar.b(hrf.f.INCOMING)), (ModalDestination.Style) null, 6));
                return;
            case 3:
                Object content = ((c) ((j2) this.f289291y.f22677a).getValue()).f289270a.getContent();
                if (content == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                C1(new com.revolut.kompot.common.b(e1(this.f289284p.a(((d) content).f289272a, hrf.f.OUTGOING, null)), (ModalDestination.Style) null, 6));
                return;
            case 4:
                C1(new com.revolut.kompot.common.b(new WeroPayFlow(new WeroPayFlowContract$InputData(WeroNavigation$StartType.Pay.Scanner.f63024a)), (ModalDestination.Style) null, 6));
                return;
            case 5:
                C1(new com.revolut.kompot.common.b(new WeroSettingsScreen(), (ModalDestination.Style) null, 6));
                return;
            case 6:
                C1(new SharedHelpDestination((SharedHelpDestination.InputData) null, 3));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void K2(Object obj2) {
        BridgeDestination bridgeDestinationA = ((u12.a) this.f289286r).a(obj2);
        if (bridgeDestinationA != null) {
            C1(bridgeDestinationA);
            return;
        }
        if (obj2 instanceof a) {
            J2((a) obj2);
            return;
        }
        if (obj2 instanceof jh2.n) {
            C1(new com.revolut.kompot.common.b(new WeroPayFlow(new WeroPayFlowContract$InputData(new WeroNavigation$StartType.Pay.RequestLinkDetails(((jh2.n) obj2).f174130a))), (ModalDestination.Style) null, 6));
        } else if (obj2 instanceof ty9.a) {
            this.f289290x.Z2();
        } else {
            I2(obj2);
        }
    }

    public final void L2() {
        C1(new com.revolut.kompot.common.b(e1(new e12.e(new ApmTransactionAreaListInputData(0), this.u)), (ModalDestination.Style) null, 6));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void M2(BaseDraggableWidgetDelegate.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.f(event.a(), "ID_QR_WIDGET")) {
            if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
                C1(new com.revolut.kompot.common.b(new WeroPayFlow(new WeroPayFlowContract$InputData(WeroNavigation$StartType.Pay.ScannerDetails.f63025a)), (ModalDestination.Style) null, 6));
                return;
            }
            if (!(event instanceof p2)) {
                I2(event.a());
                return;
            }
            PaymentLinkWidgetDelegate.Model model = ((p2) event).f55467c;
            Object obj2 = model.f55203g;
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null) {
                I2(model.f55201b);
                return;
            } else {
                this.f289289w.c(null, str, false, new vch.a(this, 9));
                return;
            }
        }
        h12.g gVarC = ((u12.a) this.f289286r).c(event);
        if (gVarC instanceof h12.d) {
            C1(((h12.d) gVarC).f148447a);
            return;
        }
        if (gVarC instanceof h12.c) {
            K2(((h12.c) gVarC).f148446a);
            return;
        }
        if (gVarC instanceof h12.b) {
            J2(a.AddContact);
            return;
        }
        boolean z = gVarC instanceof h12.e;
        WhoToTransferFilter.ApmWero apmWero = WhoToTransferFilter.ApmWero.f79996a;
        if (z) {
            C1(new TransferDestination.PaymentsSearch(apmWero, 29));
            return;
        }
        if (gVarC instanceof h12.f) {
            L2();
            return;
        }
        if (gVarC != null) {
            throw new NoWhenBranchMatchedException();
        }
        String id10 = event.a();
        Intrinsics.checkNotNullParameter(id10, "id");
        switch (id10.hashCode()) {
            case -2093222463:
                if (id10.equals("WeroAreaLinksMapper_widget")) {
                    C1(new com.revolut.kompot.common.b(new WeroRequestLinkListScreen(), (ModalDestination.Style) null, 6));
                    return;
                }
                break;
            case -1341304868:
                if (id10.equals("ApmAreaTransactionsMapper_event")) {
                    L2();
                    return;
                }
                break;
            case -1254901926:
                if (id10.equals("ApmAreaContactsMapper_event")) {
                    C1(new TransferDestination.PaymentsSearch(apmWero, 29));
                    return;
                }
                break;
            case 35082267:
                if (id10.equals("WeroAreaDisputesMapper_widget")) {
                    C1(new com.revolut.kompot.common.b(e1(new e12.g(new ApmTransactionOnlyListInputData(new TextLocalisedClause(R$string.apm_transaction_chargeback_title, null, null, 14)), this.v)), (ModalDestination.Style) null, 6));
                    return;
                }
                break;
        }
        I2(id10);
    }

    @Override // yji.l
    public final void T1(long j2) {
        ((pn3.b) this.f289287s).e();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f289291y;
    }
}
