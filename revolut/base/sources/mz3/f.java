package mz3;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.ConfirmationPromptScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.esign.ESignTask;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PluginPayload f210597b;

    public /* synthetic */ f(PluginPayload pluginPayload, int i) {
        this.f210596a = i;
        this.f210597b = pluginPayload;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        Object next;
        switch (this.f210596a) {
            case 0:
                hs3.m bannerMetadata = (hs3.m) obj2;
                Intrinsics.checkNotNullParameter(bannerMetadata, "bannerMetadata");
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.Banner(bannerMetadata, io3.h.R(this.f210597b, ""), null));
            case 1:
                ConfirmationPromptScreenConfig screenConfig = (ConfirmationPromptScreenConfig) obj2;
                Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.Confirmation(io3.h.R(this.f210597b, ""), screenConfig, null));
            case 2:
                nu3.i it8 = (nu3.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.CreditCardOffer(new CreditApplicationKompotFeatureConfig.CreditCardOffer.CreditOfferConfig.PromoOffer(it8), io3.h.R(this.f210597b, ""), null));
            case 3:
                bk4.e autoPayInfo = (bk4.e) obj2;
                Intrinsics.checkNotNullParameter(autoPayInfo, "autoPayInfo");
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.DirectDebitAccountConfirmation(autoPayInfo, io3.h.R(this.f210597b, ""), null));
            case 4:
                do3.n it9 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.ESignature(io3.h.R(this.f210597b, ""), new CreditApplicationKompotFeatureConfig.ESignature.Config.Otp(ESignTask.INSTANCE, it9.i, true), null));
            case 5:
                PluginPayload it10 = (PluginPayload) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                it3.d dVar = it10.f66247a;
                Object obj4 = dVar.e;
                if (!(obj4 instanceof hs3.x0)) {
                    List list = dVar.f;
                    if (list != null) {
                        Iterator it11 = list.iterator();
                        while (true) {
                            if (it11.hasNext()) {
                                next = it11.next();
                                if (next instanceof hs3.x0) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        obj3 = (hs3.v) next;
                    } else {
                        obj3 = null;
                    }
                } else {
                    if (obj4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.PromptMetadata");
                    }
                    obj3 = (hs3.x0) obj4;
                }
                if (obj3 == null) {
                    throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.x0.class)));
                }
                hs3.x0 x0Var = (hs3.x0) obj3;
                PluginPayload pluginPayload = this.f210597b;
                CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$ConfigurationR = io3.h.R(pluginPayload, "");
                String str = pluginPayload.f66247a.f168330m;
                if (str != null) {
                    return new FeatureCommand(new CreditApplicationKompotFeatureConfig.EmergencyPayment(x0Var, creditApplicationPluginFlowContract$ConfigurationR, str, null));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 6:
                SpousalConsentInitiatorIntroScreenConfig introConfig = (SpousalConsentInitiatorIntroScreenConfig) obj2;
                Intrinsics.checkNotNullParameter(introConfig, "introConfig");
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.SpousalConsentInitiator(io3.h.R(this.f210597b, ""), introConfig, null));
            case 7:
                SpousalConsentPartnerPopupScreenConfig configuration = (SpousalConsentPartnerPopupScreenConfig) obj2;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return u3.i(configuration, this.f210597b);
            default:
                SpousalConsentPartnerPopupScreenConfig configuration2 = (SpousalConsentPartnerPopupScreenConfig) obj2;
                Intrinsics.checkNotNullParameter(configuration2, "configuration");
                return u3.i(configuration2, this.f210597b);
        }
    }

    public /* synthetic */ f(u3 u3Var, PluginPayload pluginPayload, int i) {
        this.f210596a = i;
        this.f210597b = pluginPayload;
    }
}
