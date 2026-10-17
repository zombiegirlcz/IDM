package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.CreditPlanSelectionFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.CreditPlanSelectionFlowContract$InputData;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b3 implements sv3.b, oz3.b {
    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Object obj2;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        it3.d dVar = pluginPayload.f66247a;
        hs3.v vVar = dVar.e;
        if (!(vVar instanceof hs3.n0)) {
            List list = dVar.f;
            obj2 = null;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (next instanceof hs3.n0) {
                        obj2 = next;
                        break;
                    }
                }
                obj2 = (hs3.v) obj2;
            }
        } else {
            if (vVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.PlanSelectionMetadata");
            }
            obj2 = (hs3.n0) vVar;
        }
        hs3.n0 n0Var = (hs3.n0) obj2;
        if (n0Var == null || (str = n0Var.f154917a) == null) {
            str = "";
        }
        if (n0Var == null || (str2 = n0Var.f154918b) == null) {
            str2 = "";
        }
        return new CreditPlanSelectionFlow(new CreditPlanSelectionFlowContract$InputData(str, str2, io3.h.R(pluginPayload, "")));
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Object obj2;
        Object next;
        Object obj3;
        Object next2;
        String str;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        it3.d dVar = payload.f66247a;
        Object obj4 = dVar.e;
        if (!(obj4 instanceof hs3.n0)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof hs3.n0) {
                        break;
                    }
                }
                obj2 = (hs3.v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.PlanSelectionMetadata");
            }
            obj2 = (hs3.n0) obj4;
        }
        if (obj2 == null) {
            throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.n0.class)));
        }
        String str2 = ((hs3.n0) obj2).f154917a;
        Object obj5 = dVar.e;
        if (!(obj5 instanceof hs3.n0)) {
            List list2 = dVar.f;
            if (list2 != null) {
                Iterator it9 = list2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it9.next();
                    if (next2 instanceof hs3.n0) {
                        break;
                    }
                }
                obj3 = (hs3.v) next2;
            } else {
                obj3 = null;
            }
        } else {
            if (obj5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.PlanSelectionMetadata");
            }
            obj3 = (hs3.n0) obj5;
        }
        hs3.n0 n0Var = (hs3.n0) obj3;
        if (n0Var == null || (str = n0Var.f154918b) == null) {
            str = "";
        }
        ufm.b bVarM = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.PlanSelection(str2, str, io3.h.R(payload, ""), null)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
