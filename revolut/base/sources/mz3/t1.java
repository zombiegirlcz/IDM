package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.ManualUnderwritingScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingSummary;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class t1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f210682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CreditApplicationStatusNavigationConfig f210683c;
    public final /* synthetic */ ManualUnderwritingScreenConfig d;
    public final /* synthetic */ PluginPayload e;

    public /* synthetic */ t1(y1 y1Var, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, ManualUnderwritingScreenConfig manualUnderwritingScreenConfig, PluginPayload pluginPayload, int i) {
        this.f210681a = i;
        this.f210682b = y1Var;
        this.f210683c = creditApplicationStatusNavigationConfig;
        this.d = manualUnderwritingScreenConfig;
        this.e = pluginPayload;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ManualUnderwritingSummary summary = (ManualUnderwritingSummary) obj2;
        switch (this.f210681a) {
            case 0:
                Intrinsics.checkNotNullParameter(summary, "summary");
                boolean zIsEmpty = summary.f66481b.isEmpty();
                ManualUnderwritingScreenConfig manualUnderwritingScreenConfig = this.d;
                PluginPayload pluginPayload = this.e;
                if (zIsEmpty) {
                    return this.f210682b.i(this.f210683c, manualUnderwritingScreenConfig, pluginPayload);
                }
                ufm.b bVarM = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.ManualUnderwriting(summary, io3.h.R(pluginPayload, ""), manualUnderwritingScreenConfig, null)));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            default:
                Intrinsics.checkNotNullParameter(summary, "summary");
                boolean zIsEmpty2 = summary.f66481b.isEmpty();
                ManualUnderwritingScreenConfig manualUnderwritingScreenConfig2 = this.d;
                PluginPayload pluginPayload2 = this.e;
                if (zIsEmpty2) {
                    return this.f210682b.i(this.f210683c, manualUnderwritingScreenConfig2, pluginPayload2);
                }
                ufm.b bVarM2 = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.ManualUnderwritingPopup(summary, io3.h.R(pluginPayload2, ""), manualUnderwritingScreenConfig2, null)));
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                return bVarM2;
        }
    }
}
