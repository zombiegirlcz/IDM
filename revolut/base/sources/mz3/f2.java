package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.MortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.MortgageSignatureFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.MortgageSignatureFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.MortgageSignatureSignedFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.MortgageSignatureSignedFlowContract$InputData;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f2 extends oz3.a {
    @Override // oz3.a
    public final efm.d0 d(ks3.c cVar, PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        xs3.a state = (xs3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        ufm.c cVar2 = new ufm.c(new m1i.t(payload, state, 5), 2);
        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
        return cVar2;
    }

    @Override // oz3.a
    public final Object e(ks3.c cVar, it3.d dVar, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, grl.r2 r2Var, wi0.b bVar, String str, j54.m0 m0Var) {
        int i = e2.f210595a[((xs3.a) cVar).ordinal()];
        hs3.v vVar = null;
        MortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing mortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing = null;
        Object obj2 = null;
        if (i == 1) {
            hs3.v vVar2 = dVar.e;
            if (!(vVar2 instanceof hs3.i0)) {
                List list = dVar.f;
                if (list != null) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        Object next = it8.next();
                        if (next instanceof hs3.i0) {
                            obj2 = next;
                            break;
                        }
                    }
                    vVar = (hs3.v) obj2;
                }
            } else {
                if (vVar2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.MortgageSignatureMetadata");
                }
                vVar = (hs3.i0) vVar2;
            }
            if (vVar == null) {
                throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.i0.class)));
            }
            mortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing = new MortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing(((hs3.i0) vVar).f154897a);
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        PluginPayload.INSTANCE.getClass();
        return PluginPayload.Companion.a(dVar, r2Var, bVar, str, mortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing);
    }

    @Override // oz3.a
    public final PluginFlowControllerV2 f(ks3.c cVar, PluginPayload pluginPayload) {
        xs3.a state = (xs3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        int i = e2.f210595a[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new MortgageSignatureSignedFlow(new MortgageSignatureSignedFlowContract$InputData(io3.h.R(pluginPayload, "")));
            }
            throw new NoWhenBranchMatchedException();
        }
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (pluginLaunchInstructions instanceof MortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing) {
            return new MortgageSignatureFlow(new MortgageSignatureFlowContract$InputData(((MortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing) pluginLaunchInstructions).f66927a, io3.h.R(pluginPayload, "")));
        }
        throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", kotlin.jvm.internal.o0.f186429a.b(MortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing.class)));
    }
}
