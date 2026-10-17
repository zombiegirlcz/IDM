package c84;

import com.revolut.feature.credit.api.navigation.CreditApplicationDashboardFeatureConfig;
import com.revolut.feature.credit.application.close.ui.screen.CreditApplicationCloseScreen;
import com.revolut.feature.credit.application.close.ui.screen.CreditApplicationCloseScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.models.CreditOnboardingClosePayload;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import ft3.g1;
import grl.r2;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PluginFlowContract$Input f22086l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rz3.c f22087m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xa4.a f22088n;
    public final xq3.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mri.w f22089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ii4.o f22090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aq3.a f22091r;

    public i(PluginFlowContract$Input inputData, rz3.c creditApplicationRouter, xa4.a creditApplicationErrorHandlerExtension, xq3.j creditApplicationLifecycleInteractor, mri.w revolutJobInteractor, ii4.o spinnerInteractor, aq3.a creditApplicationChecklistAvailabilityProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditApplicationRouter, "creditApplicationRouter");
        Intrinsics.checkNotNullParameter(creditApplicationErrorHandlerExtension, "creditApplicationErrorHandlerExtension");
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleInteractor, "creditApplicationLifecycleInteractor");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(spinnerInteractor, "spinnerInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationChecklistAvailabilityProvider, "creditApplicationChecklistAvailabilityProvider");
        this.f22086l = inputData;
        this.f22087m = creditApplicationRouter;
        this.f22088n = creditApplicationErrorHandlerExtension;
        this.o = creditApplicationLifecycleInteractor;
        this.f22089p = revolutJobInteractor;
        this.f22090q = spinnerInteractor;
        this.f22091r = creditApplicationChecklistAvailabilityProvider;
    }

    @Override // c84.g
    public final boolean Z2(boolean z, String str, Function1 function1) {
        Function1 iVar;
        PluginFlowContract$Input pluginFlowContract$Input = this.f22086l;
        if (((wr3.b) this.f22091r).a(pluginFlowContract$Input.R2()) || pluginFlowContract$Input.getD().f66897l) {
            b3();
            return true;
        }
        if (!pluginFlowContract$Input.getD().i) {
            return false;
        }
        try {
            CreditOnboardingClosePayload payload = new CreditOnboardingClosePayload(pluginFlowContract$Input.getD(), 2);
            Intrinsics.checkNotNullParameter(payload, "payload");
            CreditApplicationCloseScreen creditApplicationCloseScreen = new CreditApplicationCloseScreen(new CreditApplicationCloseScreenContract$InputData(payload, z, str));
            if (function1 == null) {
                iVar = new bwc.i(1, this, i.class, "defaultCloseResultHandler", "defaultCloseResultHandler(Lcom/revolut/feature/credit/application/close/ui/screen/CreditApplicationCloseScreenContract$OutputData;)V", 0, 7);
            } else {
                iVar = function1;
            }
            yji.n.O2(this, creditApplicationCloseScreen, iVar, 1);
            return true;
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, "Cancellation can't be started for applicationId=" + pluginFlowContract$Input.getD().f66892b + ", pluginName=" + pluginFlowContract$Input.getD().f66894g + ", entryPointType=" + pluginFlowContract$Input.getD().f66893c, e, h0Var);
            return false;
        }
    }

    @Override // c84.g
    public final void b3() {
        PluginFlowContract$Input pluginFlowContract$Input = this.f22086l;
        mri.w.r0(this.f22089p, pluginFlowContract$Input.k8());
        if (!((wr3.b) this.f22091r).a(pluginFlowContract$Input.R2()) && !pluginFlowContract$Input.getD().f66897l) {
            A2(new BridgeDestination(new FinishCommand(null, null, null, 7)));
        } else {
            if (zhm.v.k(r2.CREDIT_APPLICATION_DASHBOARD, r2.CREDIT_APPLICATION_CHECKLIST).contains(pluginFlowContract$Input.P9())) {
                A2(new BridgeDestination(new FinishCommand(null, null, null, 7)));
                return;
            }
            String strK8 = pluginFlowContract$Input.k8();
            CreditApplicationPluginFlowContract$Configuration d = pluginFlowContract$Input.getD();
            A2(new BridgeDestination(new FeatureCommand(new CreditApplicationDashboardFeatureConfig(strK8, g1.e(d.d, d.e, d.k)))));
        }
    }

    @Override // c84.g
    public final Object c3(it3.d dVar, gim.c cVar) {
        if (dVar != null) {
            return dVar;
        }
        return this.o.f(this.f22086l.k8(), cVar);
    }

    @Override // c84.g
    public final boolean d3(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return this.f22088n.Z2(throwable, new bwc.i(1, this, i.class, "exitWithRedirect", "exitWithRedirect(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016a  */
    @Override // c84.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(it3.d r11, com.revolut.retail.core.navigation.NaviCommand r12, boolean r13, boolean r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c84.i.e3(it3.d, com.revolut.retail.core.navigation.NaviCommand, boolean, boolean, gim.c):java.lang.Object");
    }
}
