package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.transparent.TransparentKompotDestinationContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class h3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreditApplicationStatusNavigationConfig f210605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginPayload f210606c;

    public /* synthetic */ h3(Object obj2, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, PluginPayload pluginPayload, int i) {
        this.f210604a = i;
        this.f210605b = creditApplicationStatusNavigationConfig;
        this.f210606c = pluginPayload;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f210604a) {
            case 0:
                hs3.l1 rejectionMetadata = (hs3.l1) obj2;
                Intrinsics.checkNotNullParameter(rejectionMetadata, "rejectionMetadata");
                aj4.c.Companion.getClass();
                return new ActivityNavigateCommand(aj4.a.f5397b, new TransparentKompotDestinationContract$Configuration(new CreditApplicationKompotFeatureConfig.Rejected(rejectionMetadata, !this.f210605b.f66191a ? ju3.g.BOTTOM_SHEET : ju3.g.STATUS_DIALOG, io3.h.R(this.f210606c, ""), null).f98274b), null, null, 0, null, null, null, null, false, 1020);
            default:
                SpousalConsentInitiatorPopupScreenConfig configuration = (SpousalConsentInitiatorPopupScreenConfig) obj2;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                aj4.c.Companion.getClass();
                return new ActivityNavigateCommand(aj4.a.f5397b, new TransparentKompotDestinationContract$Configuration(new CreditApplicationKompotFeatureConfig.SpousalConsentInitiatorPopup(configuration, this.f210605b.f66191a ? ju3.g.STATUS_DIALOG : ju3.g.BOTTOM_SHEET, io3.h.R(this.f210606c, ""), null).f98274b), null, null, 0, null, null, null, null, false, 1020);
        }
    }
}
