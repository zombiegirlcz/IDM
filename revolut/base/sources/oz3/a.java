package oz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import efm.d0;
import grl.r2;
import it3.d;
import j54.m0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ks3.c;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a implements sv3.b, b {
    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        c cVar = pluginPayload.f66247a.d;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return f(cVar, pluginPayload);
        }
        throw new IllegalStateException("Credit status is not supported " + pluginPayload.f66247a.d);
    }

    @Override // oz3.b
    public final Object b(d dVar, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, r2 r2Var, wi0.b bVar, String str, Continuation continuation) {
        c cVar = dVar.d;
        c cVar2 = cVar != null ? cVar : null;
        if (cVar2 != null) {
            return e(cVar2, dVar, creditApplicationStatusNavigationConfig, r2Var, bVar, str, (m0) continuation);
        }
        throw new IllegalStateException("Credit status is not supported " + cVar);
    }

    @Override // sv3.b
    public final d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        d dVar = payload.f66247a;
        c cVar = dVar.d;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar != null) {
            return d(cVar, payload, navigationConfig);
        }
        String str = dVar.f168323a;
        ks3.b bVar = dVar.f168325c;
        c cVar2 = dVar.d;
        throw new IllegalStateException("Credit status is not supported applicationId=" + str + ", pluginName=" + bVar + ", pluginStateType=" + (cVar2 != null ? cVar2.getClass().getSimpleName() : null));
    }

    public abstract d0 d(c cVar, PluginPayload pluginPayload, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig);

    public Object e(c cVar, d dVar, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, r2 r2Var, wi0.b bVar, String str, m0 m0Var) {
        PluginPayload.INSTANCE.getClass();
        return PluginPayload.Companion.a(dVar, r2Var, bVar, str, null);
    }

    public abstract PluginFlowControllerV2 f(c cVar, PluginPayload pluginPayload);
}
