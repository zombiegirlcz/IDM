package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$RolleeV4;
import com.revolut.feature.credit.application.plugins.api.models.rollee.RolleeSession;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeRootFlow;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j3 implements sv3.b, oz3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f210620a;

    public j3(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f210620a = featureToggleInteractor;
    }

    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Object obj2;
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        it3.d dVar = pluginPayload.f66247a;
        hs3.v vVar = dVar.e;
        if (!(vVar instanceof hs3.n1)) {
            List list = dVar.f;
            obj2 = null;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (next instanceof hs3.n1) {
                        obj2 = next;
                        break;
                    }
                }
                obj2 = (hs3.v) obj2;
            }
        } else {
            if (vVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.RolleeMetadata");
            }
            obj2 = (hs3.n1) vVar;
        }
        if (obj2 == null) {
            throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.n1.class)));
        }
        hs3.n1 n1Var = (hs3.n1) obj2;
        boolean zC = ((jte.d) this.f210620a).c(CreditApplicationPluginsApi$Toggles$RolleeV4.f66283c);
        String str = n1Var.f154919a;
        String str2 = n1Var.f154920b;
        String strConcat = n1Var.f154921c;
        if (strConcat == null) {
            strConcat = "https://assets.revolut.com/mobile/credit/application/".concat(zC ? "rollee_script_v4.html" : "rollee_script_v2.html");
        }
        return new RolleeRootFlow(new RolleeFlowContract$InputData(new RolleeSession(str, str2, strConcat), io3.h.R(pluginPayload, ""), n1Var.d));
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Object obj2;
        Object next;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        it3.d dVar = payload.f66247a;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof hs3.n1)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof hs3.n1) {
                        break;
                    }
                }
                obj2 = (hs3.v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.RolleeMetadata");
            }
            obj2 = (hs3.n1) obj3;
        }
        if (obj2 == null) {
            throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.n1.class)));
        }
        hs3.n1 n1Var = (hs3.n1) obj2;
        boolean zC = ((jte.d) this.f210620a).c(CreditApplicationPluginsApi$Toggles$RolleeV4.f66283c);
        String str = n1Var.f154919a;
        String str2 = n1Var.f154920b;
        String strConcat = n1Var.f154921c;
        if (strConcat == null) {
            strConcat = "https://assets.revolut.com/mobile/credit/application/".concat(zC ? "rollee_script_v4.html" : "rollee_script_v2.html");
        }
        ufm.b bVarM = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.Rollee(new RolleeSession(str, str2, strConcat), n1Var.d, io3.h.R(payload, ""), null)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
