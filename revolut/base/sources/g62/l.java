package g62;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.api.navigation.list.ApmTransactionAreaListInputData;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$StartType;
import com.revolut.feature.apm.iris.impl.ui.area.IrisAreaScreenContract$InputData;
import com.revolut.feature.apm.iris.impl.ui.pay.IrisPayFlow;
import com.revolut.feature.apm.iris.impl.ui.pay.IrisPayFlowContract$InputData;
import com.revolut.feature.apm.iris.impl.ui.settings.IrisSettingsScreen;
import com.revolut.feature.apm.iris.impl.ui.settings.IrisSettingsScreenContract$InputData;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import f62.o;
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
public final class l extends oki.h implements f {
    public final IrisAreaScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zq.a f140826p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lx1.d f140827q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pn3.a f140828r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vz1.j f140829s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h12.a f140830t;
    public final e12.f u;
    public final f62.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o f140831w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ry9.d f140832x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f140833y;
    public final z1 z;

    public l(IrisAreaScreenContract$InputData inputData, zq.a areaProvider, lx1.d apmContactsInteractor, pn3.a contactsPermissionsController, vz1.j apmPreferencesRepository, h12.a apmAreaHandler, e12.f apmTransactionAreaListExtension, f62.f newContactNavigationProvider, o recipientListNavigationProvider, ry9.d sendFromClipboardExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(areaProvider, "areaProvider");
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(apmPreferencesRepository, "apmPreferencesRepository");
        Intrinsics.checkNotNullParameter(apmAreaHandler, "apmAreaHandler");
        Intrinsics.checkNotNullParameter(apmTransactionAreaListExtension, "apmTransactionAreaListExtension");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(recipientListNavigationProvider, "recipientListNavigationProvider");
        Intrinsics.checkNotNullParameter(sendFromClipboardExtension, "sendFromClipboardExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f140826p = areaProvider;
        this.f140827q = apmContactsInteractor;
        this.f140828r = contactsPermissionsController;
        this.f140829s = apmPreferencesRepository;
        this.f140830t = apmAreaHandler;
        this.u = apmTransactionAreaListExtension;
        this.v = newContactNavigationProvider;
        this.f140831w = recipientListNavigationProvider;
        this.f140832x = sendFromClipboardExtension;
        this.f140833y = mra.d.b(this, new d(new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.z = z1VarB;
    }

    public static void I2(Object obj2) {
        IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj2, "IrisArea: handling not supported: "));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new j(this, continuation, 1), new yi5.b(26));
        yji.l.a1(this, rd0.e.b(w.l(((pn3.b) this.f140828r).b(), this.f140829s.a(n02.b.IRIS))), null, null, new k(this, null, 0), 3);
        yji.l.a1(this, q.Q(this.z, new f5h.b(continuation, this, 28)), null, null, new k(this, null, 1), 3);
    }

    public final void J2(a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = i.f140823a[action.ordinal()];
        if (i == 1) {
            C1(new com.revolut.kompot.common.b(e1(this.f140831w.a()), (ModalDestination.Style) null, 6));
            return;
        }
        IrisAreaScreenContract$InputData irisAreaScreenContract$InputData = this.o;
        if (i == 2) {
            C1(new com.revolut.kompot.common.b(new IrisPayFlow(new IrisPayFlowContract$InputData(IrisNavigation$StartType.Pay.Scanner.f62490a, irisAreaScreenContract$InputData.f62511a)), (ModalDestination.Style) null, 6));
            return;
        }
        if (i == 3) {
            C1(new com.revolut.kompot.common.b(e1(this.v.a(null)), (ModalDestination.Style) null, 6));
            return;
        }
        if (i != 4) {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            C1(new SharedHelpDestination((SharedHelpDestination.InputData) null, 3));
        } else {
            IrisSettingsScreen irisSettingsScreen = new IrisSettingsScreen(new IrisSettingsScreenContract$InputData(irisAreaScreenContract$InputData.f62511a));
            h block = new h(this, 0);
            Intrinsics.checkNotNullParameter(block, "block");
            irisSettingsScreen.H = block;
            C1(new com.revolut.kompot.common.b(irisSettingsScreen, (ModalDestination.Style) null, 6));
        }
    }

    public final void K2(Object obj2) {
        BridgeDestination bridgeDestinationA = ((u12.a) this.f140830t).a(obj2);
        if (bridgeDestinationA != null) {
            C1(bridgeDestinationA);
            return;
        }
        if (obj2 instanceof a) {
            J2((a) obj2);
        } else if (obj2 instanceof ty9.a) {
            this.f140832x.Z2();
        } else {
            I2(obj2);
        }
    }

    public final void L2() {
        C1(new com.revolut.kompot.common.b(e1(new e12.e(new ApmTransactionAreaListInputData(0), this.u)), (ModalDestination.Style) null, 6));
    }

    @Override // yji.l
    public final void T1(long j2) {
        ((pn3.b) this.f140828r).e();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f140833y;
    }
}
