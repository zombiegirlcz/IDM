package oz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import grl.r2;
import it3.d;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public interface b {
    PluginFlowControllerV2 a(PluginPayload pluginPayload);

    default Object b(d dVar, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, r2 r2Var, wi0.b bVar, String str, Continuation continuation) {
        PluginPayload.INSTANCE.getClass();
        return PluginPayload.Companion.a(dVar, r2Var, bVar, str, null);
    }
}
