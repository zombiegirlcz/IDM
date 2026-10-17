package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.CreditAgreementsV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.CreditAgreementsV2RootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements sv3.b, oz3.b {
    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Object obj2;
        hs3.q1 q1Var;
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$ConfigurationR = io3.h.R(pluginPayload, "");
        it3.d dVar = pluginPayload.f66247a;
        hs3.v vVar = dVar.e;
        if (!(vVar instanceof hs3.a)) {
            List list = dVar.f;
            obj2 = null;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (next instanceof hs3.a) {
                        obj2 = next;
                        break;
                    }
                }
                obj2 = (hs3.v) obj2;
            }
        } else {
            if (vVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.AgreementMetadata");
            }
            obj2 = (hs3.a) vVar;
        }
        hs3.a aVar = (hs3.a) obj2;
        if (aVar == null || (q1Var = aVar.f154861a) == null) {
            q1Var = hs3.q1.UNKNOWN;
        }
        return new CreditAgreementsV2RootFlow(new CreditAgreementsV2FlowContract$InputData(creditApplicationPluginFlowContract$ConfigurationR, q1Var));
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Object obj2;
        Object next;
        hs3.q1 q1Var;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$ConfigurationR = io3.h.R(payload, "");
        it3.d dVar = payload.f66247a;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof hs3.a)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof hs3.a) {
                        break;
                    }
                }
                obj2 = (hs3.v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.AgreementMetadata");
            }
            obj2 = (hs3.a) obj3;
        }
        hs3.a aVar = (hs3.a) obj2;
        if (aVar == null || (q1Var = aVar.f154861a) == null) {
            q1Var = hs3.q1.UNKNOWN;
        }
        ufm.b bVarM = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.AgreementsV2(creditApplicationPluginFlowContract$ConfigurationR, q1Var, null)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
