package qc2;

import c12.p0;
import cli.y;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraft;
import com.revolut.feature.apm.core.ui.api.navigation.list.ApmTransactionAreaListInputData;
import com.revolut.feature.apm.qvik.api.navigation.QvikNavigation$StartType;
import com.revolut.feature.apm.qvik.impl.ui.pay.QvikPayFlow;
import com.revolut.feature.apm.qvik.impl.ui.pay.QvikPayFlowContract$InputData;
import com.revolut.feature.apm.qvik.impl.ui.settings.QvikSettingsScreen;
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
import te0.w;
import vkm.q;
import vkm.z1;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends oki.h implements e {
    public final pc2.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mc2.g f244527p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mc2.n f244528q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mc2.c f244529r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mc2.b f244530s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h12.a f244531t;
    public final vz1.j u;
    public final e12.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final pn3.a f244532w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f244533x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z1 f244534y;

    public n(pc2.e areaProvider, mc2.g newContactNavigationProvider, mc2.n recipientListNavigationProvider, mc2.c draftNavigationProvider, mc2.b draftListExtension, h12.a apmAreaHandler, vz1.j apmPreferencesRepository, e12.f apmTransactionAreaListExtension, pn3.a contactsPermissionsController, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(areaProvider, "areaProvider");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(recipientListNavigationProvider, "recipientListNavigationProvider");
        Intrinsics.checkNotNullParameter(draftNavigationProvider, "draftNavigationProvider");
        Intrinsics.checkNotNullParameter(draftListExtension, "draftListExtension");
        Intrinsics.checkNotNullParameter(apmAreaHandler, "apmAreaHandler");
        Intrinsics.checkNotNullParameter(apmPreferencesRepository, "apmPreferencesRepository");
        Intrinsics.checkNotNullParameter(apmTransactionAreaListExtension, "apmTransactionAreaListExtension");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = areaProvider;
        this.f244527p = newContactNavigationProvider;
        this.f244528q = recipientListNavigationProvider;
        this.f244529r = draftNavigationProvider;
        this.f244530s = draftListExtension;
        this.f244531t = apmAreaHandler;
        this.u = apmPreferencesRepository;
        this.v = apmTransactionAreaListExtension;
        this.f244532w = contactsPermissionsController;
        this.f244533x = mra.d.b(this, new b(new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f244534y = z1VarB;
    }

    public static void I2(Object obj2) {
        IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj2, "QvikArea: handling not supported: "));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(w.l(((pn3.b) this.f244532w).b(), this.u.a(n02.b.QVIK))), null, null, new m(this, null, 0), 3);
        yji.l.a1(this, q.Q(this.f244534y, new q7b.j((Continuation) null, this, 10)), null, null, new m(this, null, 1), 3);
    }

    public final void J2(a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = l.f244525a[action.ordinal()];
        mc2.n nVar = this.f244528q;
        if (i == 1) {
            C1(new com.revolut.kompot.common.b(e1(nVar.a(hrf.f.OUTGOING, false)), (ModalDestination.Style) null, 6));
            return;
        }
        if (i == 2) {
            C1(new com.revolut.kompot.common.b(e1(nVar.a(hrf.f.INCOMING, false)), (ModalDestination.Style) null, 6));
            return;
        }
        if (i == 3) {
            C1(new com.revolut.kompot.common.b(new QvikPayFlow(new QvikPayFlowContract$InputData(QvikNavigation$StartType.Pay.Scanner.f62779a)), (ModalDestination.Style) null, 6));
        } else if (i == 4) {
            C1(new com.revolut.kompot.common.b(new QvikSettingsScreen(), (ModalDestination.Style) null, 6));
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            C1(new SharedHelpDestination((SharedHelpDestination.InputData) null, 3));
        }
    }

    public final void K2(Object obj2) {
        BridgeDestination bridgeDestinationA = ((u12.a) this.f244531t).a(obj2);
        if (bridgeDestinationA != null) {
            C1(bridgeDestinationA);
            return;
        }
        if (obj2 instanceof a) {
            J2((a) obj2);
            return;
        }
        if (!(obj2 instanceof ApmPaymentDraft)) {
            I2(obj2);
            return;
        }
        this.f244529r.getClass();
        p0 p0VarA = mc2.c.a((ApmPaymentDraft) obj2);
        if (p0VarA != null) {
            C1(new com.revolut.kompot.common.b(e1(p0VarA), (ModalDestination.Style) null, 6));
        }
    }

    public final void L2() {
        C1(new com.revolut.kompot.common.b(e1(new e12.e(new ApmTransactionAreaListInputData(0), this.v)), (ModalDestination.Style) null, 6));
    }

    public final void M2(BaseDraggableWidgetDelegate.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        h12.g gVarC = ((u12.a) this.f244531t).c(event);
        if (gVarC instanceof h12.d) {
            C1(((h12.d) gVarC).f148447a);
            return;
        }
        if (gVarC instanceof h12.c) {
            K2(((h12.c) gVarC).f148446a);
            return;
        }
        if (gVarC instanceof h12.b) {
            C1(new com.revolut.kompot.common.b(e1(this.f244527p.a(hrf.f.OUTGOING, false, null)), (ModalDestination.Style) null, 6));
            return;
        }
        boolean z = gVarC instanceof h12.e;
        WhoToTransferFilter.ApmQvik apmQvik = WhoToTransferFilter.ApmQvik.f79993a;
        if (z) {
            C1(new TransferDestination.PaymentsSearch(apmQvik, 29));
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
        int iHashCode = id10.hashCode();
        if (iHashCode != -1341304868) {
            if (iHashCode != -1254901926) {
                if (iHashCode == -1120858491 && id10.equals("ApmAreaDraftsMapper_widget")) {
                    C1(new com.revolut.kompot.common.b(e1(new e12.a(new e12.c(new TextLocalisedClause(R$string.apm_area_draft_payments_list_title, null, null, 14)), this.f244530s)), (ModalDestination.Style) null, 6));
                    return;
                }
            } else if (id10.equals("ApmAreaContactsMapper_event")) {
                C1(new TransferDestination.PaymentsSearch(apmQvik, 29));
                return;
            }
        } else if (id10.equals("ApmAreaTransactionsMapper_event")) {
            L2();
            return;
        }
        I2(id10);
    }

    @Override // yji.l
    public final void T1(long j2) {
        ((pn3.b) this.f244532w).e();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f244533x;
    }
}
