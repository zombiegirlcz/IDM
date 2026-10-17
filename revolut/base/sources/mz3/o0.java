package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.DocumentsRemediationFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.DocumentsRemediationFlowContract$InputData;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o0 extends oz3.a {
    @Override // oz3.a
    public final efm.d0 d(ks3.c cVar, PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        rs3.a state = (rs3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        int i = n0.f210639a[state.ordinal()];
        Object obj2 = null;
        if (i == 1) {
            ufm.b bVarM = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.DocumentsRemediation(io3.h.R(payload, ""), (hs3.x) null, 6)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        it3.d dVar = payload.f66247a;
        hs3.v vVar = dVar.e;
        if (!(vVar instanceof hs3.x)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (next instanceof hs3.x) {
                        obj2 = next;
                        break;
                    }
                }
                obj2 = (hs3.v) obj2;
            }
        } else {
            if (vVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.DocumentsRemediationMetadata");
            }
            obj2 = (hs3.x) vVar;
        }
        if (obj2 == null) {
            throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.x.class)));
        }
        ufm.b bVarM2 = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.DocumentsRemediation(io3.h.R(payload, ""), (hs3.x) obj2, 4)));
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }

    @Override // oz3.a
    public final PluginFlowControllerV2 f(ks3.c cVar, PluginPayload pluginPayload) {
        rs3.a state = (rs3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$ConfigurationR = io3.h.R(pluginPayload, "");
        int i = n0.f210639a[state.ordinal()];
        hs3.x xVar = null;
        Object obj2 = null;
        hs3.v vVar = null;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            it3.d dVar = pluginPayload.f66247a;
            hs3.v vVar2 = dVar.e;
            if (!(vVar2 instanceof hs3.x)) {
                List list = dVar.f;
                if (list != null) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        Object next = it8.next();
                        if (next instanceof hs3.x) {
                            obj2 = next;
                            break;
                        }
                    }
                    vVar = (hs3.v) obj2;
                }
            } else {
                if (vVar2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.DocumentsRemediationMetadata");
                }
                vVar = (hs3.x) vVar2;
            }
            if (vVar == null) {
                throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.x.class)));
            }
            xVar = (hs3.x) vVar;
        }
        return new DocumentsRemediationFlow(new DocumentsRemediationFlowContract$InputData(creditApplicationPluginFlowContract$ConfigurationR, xVar));
    }
}
