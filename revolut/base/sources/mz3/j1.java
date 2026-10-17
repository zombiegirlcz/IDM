package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$StartCreditApplicationKompotNavigation;
import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.InProgressPluginFactory$InProgressLaunchInstructions;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerLazyFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerLazyFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerRootFlow;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j1 implements sv3.b, oz3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hz3.c f210614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f210615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f210616c;

    public j1(hz3.c creditApplicationCommandsFactory, i1 inProgressConfigurationFactory, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationCommandsFactory, "creditApplicationCommandsFactory");
        Intrinsics.checkNotNullParameter(inProgressConfigurationFactory, "inProgressConfigurationFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f210614a = creditApplicationCommandsFactory;
        this.f210615b = inProgressConfigurationFactory;
        this.f210616c = featureToggleInteractor;
    }

    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (!(pluginLaunchInstructions instanceof InProgressPluginFactory$InProgressLaunchInstructions)) {
            throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", kotlin.jvm.internal.o0.f186429a.b(InProgressPluginFactory$InProgressLaunchInstructions.class)));
        }
        SpinnerConfiguration.Popup popup = ((InProgressPluginFactory$InProgressLaunchInstructions) pluginLaunchInstructions).f66921a;
        return ((jte.d) this.f210616c).c(CreditApplicationPluginsApi$Toggles$StartCreditApplicationKompotNavigation.f66284c) ? new SpinnerLazyFlow(new SpinnerLazyFlowContract$InputData(popup, io3.h.R(pluginPayload, ""))) : new SpinnerRootFlow(new SpinnerFlowContract$InputData(popup, io3.h.R(pluginPayload, "")));
    }

    @Override // oz3.b
    public final Object b(it3.d dVar, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, grl.r2 r2Var, wi0.b bVar, String str, Continuation continuation) {
        Object obj2;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof hs3.u1)) {
            List list = dVar.f;
            Object obj4 = null;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (next instanceof hs3.u1) {
                        obj4 = next;
                        break;
                    }
                }
                obj2 = (hs3.v) obj4;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.SpinnerMetadata");
            }
            obj2 = (hs3.u1) obj3;
        }
        if (obj2 == null) {
            throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.u1.class)));
        }
        SpinnerConfiguration.Popup popupA = i1.a(this.f210615b, (hs3.u1) obj2, creditApplicationStatusNavigationConfig.f66191a, dVar.f168325c);
        PluginPayload.Companion companion = PluginPayload.INSTANCE;
        InProgressPluginFactory$InProgressLaunchInstructions inProgressPluginFactory$InProgressLaunchInstructions = new InProgressPluginFactory$InProgressLaunchInstructions(popupA);
        companion.getClass();
        return PluginPayload.Companion.a(dVar, r2Var, bVar, str, inProgressPluginFactory$InProgressLaunchInstructions);
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Object obj2;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        it3.d dVar = payload.f66247a;
        hs3.v vVar = dVar.e;
        if (!(vVar instanceof hs3.u1)) {
            List list = dVar.f;
            obj2 = null;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (next instanceof hs3.u1) {
                        obj2 = next;
                        break;
                    }
                }
                obj2 = (hs3.v) obj2;
            }
        } else {
            if (vVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.SpinnerMetadata");
            }
            obj2 = (hs3.u1) vVar;
        }
        if (obj2 == null) {
            throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.u1.class)));
        }
        ufm.b bVarM = efm.d0.m(obj2);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        ufm.i iVar = new ufm.i(bVarM, new s(new moe.c(this, 11, payload, navigationConfig), 7), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
