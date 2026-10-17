package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering.ComboCardOrderingFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering.ComboCardOrderingRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements sv3.b, oz3.b {
    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Object obj2;
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        it3.d dVar = pluginPayload.f66247a;
        hs3.v vVar = dVar.e;
        if (!(vVar instanceof hs3.q)) {
            List list = dVar.f;
            obj2 = null;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (next instanceof hs3.q) {
                        obj2 = next;
                        break;
                    }
                }
                obj2 = (hs3.v) obj2;
            }
        } else {
            if (vVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.CardOrderingMetadata");
            }
            obj2 = (hs3.q) vVar;
        }
        if (obj2 == null) {
            throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.q.class)));
        }
        return new ComboCardOrderingRootFlow(new ComboCardOrderingFlowContract$InputData(pluginPayload, io3.h.R(pluginPayload, ""), ((hs3.q) obj2).f154929a));
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Object obj2;
        Object next;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        it3.d dVar = payload.f66247a;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof hs3.q)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof hs3.q) {
                        break;
                    }
                }
                obj2 = (hs3.v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.CardOrderingMetadata");
            }
            obj2 = (hs3.q) obj3;
        }
        if (obj2 == null) {
            throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.q.class)));
        }
        ufm.b bVarM = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.ComboCardOrdering(payload, ((hs3.q) obj2).f154929a, io3.h.R(payload, ""), null)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
