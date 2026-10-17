package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$StartCreditApplicationKompotNavigation;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.RejectedPluginFactory$RejectedPluginLaunchInstructions;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedLazyFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedLazyFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedRootFlowContract$InputData;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i3 implements sv3.b, oz3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f210611a;

    public i3(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f210611a = featureToggleInteractor;
    }

    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Object obj2;
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        it3.d dVar = pluginPayload.f66247a;
        hs3.v vVar = dVar.e;
        if (!(vVar instanceof hs3.l1)) {
            List list = dVar.f;
            obj2 = null;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (next instanceof hs3.l1) {
                        obj2 = next;
                        break;
                    }
                }
                obj2 = (hs3.v) obj2;
            }
        } else {
            if (vVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.RejectionMetadata");
            }
            obj2 = (hs3.l1) vVar;
        }
        if (obj2 == null) {
            throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.l1.class)));
        }
        hs3.l1 l1Var = (hs3.l1) obj2;
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (!(pluginLaunchInstructions instanceof RejectedPluginFactory$RejectedPluginLaunchInstructions)) {
            throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", kotlin.jvm.internal.o0.f186429a.b(RejectedPluginFactory$RejectedPluginLaunchInstructions.class)));
        }
        ju3.g gVar = ((RejectedPluginFactory$RejectedPluginLaunchInstructions) pluginLaunchInstructions).f66931a;
        return ((jte.d) this.f210611a).c(CreditApplicationPluginsApi$Toggles$StartCreditApplicationKompotNavigation.f66284c) ? new RejectedLazyFlow(new RejectedLazyFlowContract$InputData(l1Var, gVar, io3.h.R(pluginPayload, ""))) : new RejectedRootFlow(new RejectedRootFlowContract$InputData(l1Var, gVar, io3.h.R(pluginPayload, "")));
    }

    @Override // oz3.b
    public final Object b(it3.d dVar, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, grl.r2 r2Var, wi0.b bVar, String str, Continuation continuation) {
        PluginPayload.Companion companion = PluginPayload.INSTANCE;
        RejectedPluginFactory$RejectedPluginLaunchInstructions rejectedPluginFactory$RejectedPluginLaunchInstructions = new RejectedPluginFactory$RejectedPluginLaunchInstructions(!creditApplicationStatusNavigationConfig.f66191a ? ju3.g.BOTTOM_SHEET : ju3.g.STATUS_DIALOG);
        companion.getClass();
        return PluginPayload.Companion.a(dVar, r2Var, bVar, str, rejectedPluginFactory$RejectedPluginLaunchInstructions);
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Object obj2;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        it3.d dVar = payload.f66247a;
        hs3.v vVar = dVar.e;
        if (!(vVar instanceof hs3.l1)) {
            List list = dVar.f;
            obj2 = null;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (next instanceof hs3.l1) {
                        obj2 = next;
                        break;
                    }
                }
                obj2 = (hs3.v) obj2;
            }
        } else {
            if (vVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.RejectionMetadata");
            }
            obj2 = (hs3.l1) vVar;
        }
        if (obj2 == null) {
            throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.l1.class)));
        }
        ufm.b bVarM = efm.d0.m(obj2);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        ufm.i iVar = new ufm.i(bVarM, new s(new h3(this, navigationConfig, payload, 0), 19), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
