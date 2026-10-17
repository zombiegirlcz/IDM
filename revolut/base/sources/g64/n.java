package g64;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingIntroScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingLoadingScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import h93.l0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f140851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginPayload f140852c;
    public final /* synthetic */ l0 d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ n(s sVar, PluginPayload pluginPayload, l0 l0Var, boolean z, int i) {
        this.f140850a = i;
        this.f140851b = sVar;
        this.f140852c = pluginPayload;
        this.d = l0Var;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f140850a) {
            case 0:
                CardOrderingIntroScreenConfig config = (CardOrderingIntroScreenConfig) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                this.f140851b.getClass();
                PluginPayload pluginPayload = this.f140852c;
                String strD = s.d(pluginPayload);
                if (strD != null) {
                    return new FeatureCommand(new CreditApplicationKompotFeatureConfig.CardOrdering(new CreditApplicationKompotFeatureConfig.CardOrdering.Config.PhysicalAndVirtualCard(strD, config, null, this.d, this.e), io3.h.R(pluginPayload, ""), null));
                }
                throw new IllegalStateException("Facility id can't be null with Card ordering plugin");
            default:
                CardOrderingLoadingScreenConfig config2 = (CardOrderingLoadingScreenConfig) obj2;
                Intrinsics.checkNotNullParameter(config2, "config");
                this.f140851b.getClass();
                PluginPayload pluginPayload2 = this.f140852c;
                String strD2 = s.d(pluginPayload2);
                if (strD2 != null) {
                    return new FeatureCommand(new CreditApplicationKompotFeatureConfig.CardOrdering(new CreditApplicationKompotFeatureConfig.CardOrdering.Config.VirtualCard(strD2, config2, null, this.d, this.e), io3.h.R(pluginPayload2, ""), null));
                }
                throw new IllegalStateException("Facility id can't be null with Card ordering plugin");
        }
    }
}
