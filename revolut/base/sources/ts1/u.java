package ts1;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.bizum.impl.ui.settings.BizumSettingsScreen;
import com.revolut.feature.apm.core.ui.api.navigation.list.ApmTransactionAreaListInputData;
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
import vkm.z1;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class u extends jki.g implements d {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ss1.b f273934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pak.h f273935q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qr0.i f273936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h12.a f273937s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final pn3.a f273938t;
    public final vz1.j u;
    public final e12.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final lx1.d f273939w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ry9.d f273940x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z1 f273941y;
    public final b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ss1.b areaProvider, pak.h newContactNavigationProvider, qr0.i recipientListNavigationProvider, h12.a apmAreaHandler, pn3.a contactsPermissionsController, vz1.j apmPreferencesRepository, e12.f apmTransactionAreaListExtension, lx1.d apmContactsInteractor, ry9.d sendFromClipboardExtension, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(areaProvider, "areaProvider");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(recipientListNavigationProvider, "recipientListNavigationProvider");
        Intrinsics.checkNotNullParameter(apmAreaHandler, "apmAreaHandler");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(apmPreferencesRepository, "apmPreferencesRepository");
        Intrinsics.checkNotNullParameter(apmTransactionAreaListExtension, "apmTransactionAreaListExtension");
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(sendFromClipboardExtension, "sendFromClipboardExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f273934p = areaProvider;
        this.f273935q = newContactNavigationProvider;
        this.f273936r = recipientListNavigationProvider;
        this.f273937s = apmAreaHandler;
        this.f273938t = contactsPermissionsController;
        this.u = apmPreferencesRepository;
        this.v = apmTransactionAreaListExtension;
        this.f273939w = apmContactsInteractor;
        this.f273940x = sendFromClipboardExtension;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f273941y = z1VarB;
        this.z = new b(new Data(null, null, true, 3, null), false);
    }

    public static void y2(Object obj2) {
        IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj2, "BizumArea: handling not supported: "));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    public final void A2(Object obj2) {
        if (obj2 instanceof a) {
            z2((a) obj2);
            Unit unit = Unit.f186387a;
        } else {
            if (obj2 instanceof ty9.a) {
                this.f273940x.Z2();
                Unit unit2 = Unit.f186387a;
                return;
            }
            BridgeDestination bridgeDestinationA = ((u12.a) this.f273937s).a(obj2);
            if (bridgeDestinationA == null || C1(bridgeDestinationA) == null) {
                y2(obj2);
                Unit unit3 = Unit.f186387a;
            }
        }
    }

    public final void B2(h12.g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof h12.d) {
            C1(((h12.d) event).f148447a);
            return;
        }
        if (event instanceof h12.c) {
            A2(((h12.c) event).f148446a);
            return;
        }
        if (event instanceof h12.b) {
            z2(a.AddContact);
        } else if (event instanceof h12.e) {
            C1(new TransferDestination.PaymentsSearch(WhoToTransferFilter.ApmBizum.f79986a, 29));
        } else {
            if (!(event instanceof h12.f)) {
                throw new NoWhenBranchMatchedException();
            }
            C1(new com.revolut.kompot.common.b(e1(new e12.e(new ApmTransactionAreaListInputData(0), this.v)), (ModalDestination.Style) null, 6));
        }
    }

    @Override // yji.l
    public final void I1() {
        l2(new s(this, null, 1), new yi5.b(26));
        yji.l.a1(this, rd0.e.b(te0.w.l(((pn3.b) this.f273938t).b(), this.u.a(n02.b.BIZUM))), null, null, new t(this, null, 0), 3);
        yji.l.a1(this, vkm.q.Q(this.f273941y, new tik.b((Continuation) null, this, 4)), null, null, new t(this, null, 1), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        ((pn3.b) this.f273938t).e();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.z;
    }

    public final void z2(a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = r.f273931a[action.ordinal()];
        qr0.i iVar = this.f273936r;
        if (i == 1) {
            C1(new com.revolut.kompot.common.b(e1(iVar.e(hrf.f.OUTGOING)), (ModalDestination.Style) null, 6));
            return;
        }
        if (i == 2) {
            C1(new com.revolut.kompot.common.b(e1(iVar.e(hrf.f.INCOMING)), (ModalDestination.Style) null, 6));
            return;
        }
        if (i == 3) {
            C1(new com.revolut.kompot.common.b(e1(this.f273935q.d(hrf.f.OUTGOING, null)), (ModalDestination.Style) null, 6));
        } else if (i == 4) {
            C1(new com.revolut.kompot.common.d(new BizumSettingsScreen(), 6));
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            C1(new SharedHelpDestination((SharedHelpDestination.InputData) null, 3));
        }
    }
}
