package nz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.AutoPayPromptScreenConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nvg.b0;
import nyb.h0;
import ufm.i;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b extends oz3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw3.e f220948a;

    public b(hw3.e creditApplicationConfigInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        this.f220948a = creditApplicationConfigInteractor;
    }

    @Override // oz3.a
    public final d0 d(ks3.c cVar, PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        ms3.a state = (ms3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        if (a.f220947a[state.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        return new i(this.f220948a.b(ju3.a.AUTO_PAY, payload.f66247a.f168328j), new h0(4, new b0(this, payload, 11)), 1);
    }

    public abstract FeatureCommand g(AutoPayPromptScreenConfig autoPayPromptScreenConfig, PluginPayload pluginPayload);
}
