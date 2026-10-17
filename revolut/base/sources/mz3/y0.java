package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.failure.flow.FailureRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.failure.flow.FailureRootFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.transparent.TransparentKompotDestinationContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y0 implements sv3.b, oz3.b {
    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Object obj2;
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        it3.d dVar = pluginPayload.f66247a;
        hs3.v vVar = dVar.e;
        if (!(vVar instanceof hs3.a0)) {
            List list = dVar.f;
            obj2 = null;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (next instanceof hs3.a0) {
                        obj2 = next;
                        break;
                    }
                }
                obj2 = (hs3.v) obj2;
            }
        } else {
            if (vVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.FailureMetadata");
            }
            obj2 = (hs3.a0) vVar;
        }
        hs3.a0 a0Var = (hs3.a0) obj2;
        if (a0Var == null) {
            a0Var = new hs3.a0(p.a.p("/credit-application/", pluginPayload.f66247a.f168323a, "/credit-creation/revert"));
        }
        return new FailureRootFlow(new FailureRootFlowContract$InputData(a0Var, io3.h.R(pluginPayload, "")));
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Object obj2;
        Object next;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        it3.d dVar = payload.f66247a;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof hs3.a0)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof hs3.a0) {
                        break;
                    }
                }
                obj2 = (hs3.v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.FailureMetadata");
            }
            obj2 = (hs3.a0) obj3;
        }
        hs3.a0 a0Var = (hs3.a0) obj2;
        if (a0Var == null) {
            a0Var = new hs3.a0(p.a.p("/credit-application/", dVar.f168323a, "/credit-creation/revert"));
        }
        aj4.c.Companion.getClass();
        ufm.b bVarM = efm.d0.m(new ActivityNavigateCommand(aj4.a.f5397b, new TransparentKompotDestinationContract$Configuration(new CreditApplicationKompotFeatureConfig.Failure(a0Var, io3.h.R(payload, ""), null).f98274b), null, null, 0, null, null, null, null, false, 1020));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
