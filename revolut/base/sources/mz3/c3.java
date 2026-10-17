package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.plan_subscribe.PlanSubscribeFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.plan_subscribe.PlanSubscribeFlowContract$InputData;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c3 implements sv3.b, oz3.b {
    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Object obj2;
        Object next;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        it3.d dVar = pluginPayload.f66247a;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof hs3.o0)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof hs3.o0) {
                        break;
                    }
                }
                obj2 = (hs3.v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.PlanSubscribeMetadata");
            }
            obj2 = (hs3.o0) obj3;
        }
        hs3.o0 o0Var = (hs3.o0) obj2;
        if (o0Var == null || (str = o0Var.f154924a) == null) {
            str = "";
        }
        return new PlanSubscribeFlow(new PlanSubscribeFlowContract$InputData(new IntendedPricingPlan((o0Var == null || (str2 = o0Var.f154925b) == null) ? null : hha.i.valueOf(str2), str, o0Var != null ? o0Var.f154926c : null), io3.h.R(pluginPayload, "")));
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Object obj2;
        Object next;
        String str;
        Object obj3;
        Object next2;
        Object obj4;
        Object next3;
        String str2;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        it3.d dVar = payload.f66247a;
        Object obj5 = dVar.e;
        if (!(obj5 instanceof hs3.o0)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof hs3.o0) {
                        break;
                    }
                }
                obj2 = (hs3.v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.PlanSubscribeMetadata");
            }
            obj2 = (hs3.o0) obj5;
        }
        hs3.o0 o0Var = (hs3.o0) obj2;
        if (o0Var == null || (str = o0Var.f154924a) == null) {
            str = "";
        }
        Object obj6 = dVar.e;
        if (!(obj6 instanceof hs3.o0)) {
            List list2 = dVar.f;
            if (list2 != null) {
                Iterator it9 = list2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it9.next();
                    if (next2 instanceof hs3.o0) {
                        break;
                    }
                }
                obj3 = (hs3.v) next2;
            } else {
                obj3 = null;
            }
        } else {
            if (obj6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.PlanSubscribeMetadata");
            }
            obj3 = (hs3.o0) obj6;
        }
        hs3.o0 o0Var2 = (hs3.o0) obj3;
        hha.i iVarValueOf = (o0Var2 == null || (str2 = o0Var2.f154925b) == null) ? null : hha.i.valueOf(str2);
        Object obj7 = dVar.e;
        if (!(obj7 instanceof hs3.o0)) {
            List list3 = dVar.f;
            if (list3 != null) {
                Iterator it10 = list3.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it10.next();
                    if (next3 instanceof hs3.o0) {
                        break;
                    }
                }
                obj4 = (hs3.v) next3;
            } else {
                obj4 = null;
            }
        } else {
            if (obj7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.PlanSubscribeMetadata");
            }
            obj4 = (hs3.o0) obj7;
        }
        hs3.o0 o0Var3 = (hs3.o0) obj4;
        ufm.b bVarM = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.PlanSubscribe(new IntendedPricingPlan(iVarValueOf, str, o0Var3 != null ? o0Var3.f154926c : null), io3.h.R(payload, ""), null)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
