package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2Flow;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Config;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends oz3.a {
    public static CreditApplicationKompotFeatureConfig.AddressV2.Config g(ls3.a aVar, hs3.u uVar) {
        dx4.z2 z2Var = uVar.d;
        String str = uVar.f154951c;
        String str2 = uVar.f154950b;
        String str3 = uVar.f154949a;
        int i = a.f210575a[aVar.ordinal()];
        if (i == 1) {
            return new CreditApplicationKompotFeatureConfig.AddressV2.Config.AddressInput(str3, str2, str, z2Var);
        }
        if (i == 2) {
            return new CreditApplicationKompotFeatureConfig.AddressV2.Config.AddressSelection(str3, str2, str, z2Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // oz3.a
    public final efm.d0 d(ks3.c cVar, PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Object obj2;
        Object next;
        ls3.a state = (ls3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        it3.d dVar = payload.f66247a;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof hs3.u)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof hs3.u) {
                        break;
                    }
                }
                obj2 = (hs3.v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.CreditAddressMetadata");
            }
            obj2 = (hs3.u) obj3;
        }
        if (obj2 == null) {
            throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.u.class)));
        }
        ufm.b bVarM = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.AddressV2(g(state, (hs3.u) obj2), io3.h.R(payload, ""), null)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // oz3.a
    public final PluginFlowControllerV2 f(ks3.c cVar, PluginPayload pluginPayload) {
        Object obj2;
        Object next;
        CreditAddressV2FlowContract$Config addressSelection;
        ls3.a state = (ls3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        it3.d dVar = pluginPayload.f66247a;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof hs3.u)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof hs3.u) {
                        break;
                    }
                }
                obj2 = (hs3.v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.CreditAddressMetadata");
            }
            obj2 = (hs3.u) obj3;
        }
        if (obj2 == null) {
            throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.u.class)));
        }
        CreditApplicationKompotFeatureConfig.AddressV2.Config configG = g(state, (hs3.u) obj2);
        if (configG instanceof CreditApplicationKompotFeatureConfig.AddressV2.Config.AddressInput) {
            CreditApplicationKompotFeatureConfig.AddressV2.Config.AddressInput addressInput = (CreditApplicationKompotFeatureConfig.AddressV2.Config.AddressInput) configG;
            addressSelection = new CreditAddressV2FlowContract$Config.AddressInput(addressInput.f66509a, addressInput.f66510b, addressInput.f66511c, addressInput.d);
        } else {
            if (!(configG instanceof CreditApplicationKompotFeatureConfig.AddressV2.Config.AddressSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            CreditApplicationKompotFeatureConfig.AddressV2.Config.AddressSelection addressSelection2 = (CreditApplicationKompotFeatureConfig.AddressV2.Config.AddressSelection) configG;
            addressSelection = new CreditAddressV2FlowContract$Config.AddressSelection(addressSelection2.f66512a, addressSelection2.f66513b, addressSelection2.f66514c, null);
        }
        return new CreditAddressV2Flow(new CreditAddressV2FlowContract$InputData(addressSelection, io3.h.R(pluginPayload, "")));
    }
}
