package mz3;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.CongratulationsScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class i implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PluginPayload f210608b;

    public /* synthetic */ i(PluginPayload pluginPayload, int i) {
        this.f210607a = i;
        this.f210608b = pluginPayload;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj2;
        Object next;
        Object obj3;
        Object next2;
        switch (this.f210607a) {
            case 0:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.Calculator(io3.h.R(this.f210608b, ""), null));
            case 1:
                PluginPayload pluginPayload = this.f210608b;
                it3.d dVar = pluginPayload.f66247a;
                Object obj4 = dVar.e;
                if (!(obj4 instanceof hs3.t)) {
                    List list = dVar.f;
                    if (list != null) {
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (next instanceof hs3.t) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        obj2 = (hs3.v) next;
                    } else {
                        obj2 = null;
                    }
                } else {
                    if (obj4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.CongratulationsMetadata");
                    }
                    obj2 = (hs3.t) obj4;
                }
                if (obj2 == null) {
                    throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.t.class)));
                }
                CongratulationsScreenConfig.INSTANCE.getClass();
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.Congratulations(io3.h.R(pluginPayload, ""), CongratulationsScreenConfig.Companion.a((hs3.t) obj2), null));
            case 2:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.ConveyancingAppointmentScheduling(io3.h.R(this.f210608b, ""), null));
            case 3:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.Addon(io3.h.R(this.f210608b, ""), null));
            case 4:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.Address(io3.h.R(this.f210608b, ""), null));
            case 5:
                String str = this.f210608b.f66247a.f168330m;
                if (str != null) {
                    return str;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 6:
                PluginPayload pluginPayload2 = this.f210608b;
                it3.d dVar2 = pluginPayload2.f66247a;
                Object obj5 = dVar2.e;
                if (!(obj5 instanceof hs3.w)) {
                    List list2 = dVar2.f;
                    if (list2 != null) {
                        Iterator it9 = list2.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next2 = it9.next();
                                if (next2 instanceof hs3.w) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        obj3 = (hs3.v) next2;
                    } else {
                        obj3 = null;
                    }
                } else {
                    if (obj5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.CreditCardOfferMetadata");
                    }
                    obj3 = (hs3.w) obj5;
                }
                if (obj3 != null) {
                    return new FeatureCommand(new CreditApplicationKompotFeatureConfig.CreditCardOffer(new CreditApplicationKompotFeatureConfig.CreditCardOffer.CreditOfferConfig.RegularOffer(f0.h(((hs3.w) obj3).f154958b)), io3.h.R(pluginPayload2, ""), null));
                }
                throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.w.class)));
            case 7:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.CreditInsuranceOffer(io3.h.R(this.f210608b, ""), null));
            case 8:
                it3.d dVar3 = this.f210608b.f66247a;
                boolean z = dVar3.f168334r == it3.k.CC_CLI_USER_INITIATED;
                String str2 = dVar3.f168330m;
                if (str2 != null) {
                    return new Pair(str2, Boolean.valueOf(z));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 9:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.DocumentsUpload(io3.h.R(this.f210608b, ""), null));
            case 10:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.DownPaymentSource(io3.h.R(this.f210608b, ""), null));
            case 11:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.EmailVerification(io3.h.R(this.f210608b, ""), null));
            case 12:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.FamilyCreditCardSettings(io3.h.R(this.f210608b, ""), null));
            case 13:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.FinancialEvidence(io3.h.R(this.f210608b, ""), null));
            case 14:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.FinancialSituationConfirmation(io3.h.R(this.f210608b, ""), null));
            case 15:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.HomeInsurance(io3.h.R(this.f210608b, ""), null));
            case 16:
                String str3 = this.f210608b.f66247a.f168330m;
                if (str3 != null) {
                    return str3;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 17:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.MortgageRefinancingDetailsV2(io3.h.R(this.f210608b, ""), null));
            case 18:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.MortgageValuation(io3.h.R(this.f210608b, ""), null));
            case 19:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.OutstandingDebtsV3(io3.h.R(this.f210608b, "")));
            case 20:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.OverdraftOffer(io3.h.R(this.f210608b, ""), null));
            case 21:
                String str4 = this.f210608b.f66247a.f168330m;
                if (str4 != null) {
                    return str4;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 22:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.Payment(io3.h.R(this.f210608b, ""), null));
            case 23:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.PhotosUpload(io3.h.R(this.f210608b, ""), null));
            case 24:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.SolicitorSelection(io3.h.R(this.f210608b, ""), null));
            default:
                return new FeatureCommand(new CreditApplicationKompotFeatureConfig.UserSelection(io3.h.R(this.f210608b, ""), null));
        }
    }

    public /* synthetic */ i(PluginPayload pluginPayload, f0 f0Var) {
        this.f210607a = 6;
        this.f210608b = pluginPayload;
    }
}
