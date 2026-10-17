package edk;

import com.revolut.feature.external_accounts.api.PseFeatureApi$Toggles$PseAuthorisation;
import com.revolut.feature.external_accounts.api.navigation.PseNavigation$Destination$AuthorisationRequest;
import com.revolut.feature.external_accounts.api.navigation.PseNavigation$Destination$VerificationCode;
import com.revolut.feature.payments_migration.api.PaymentsMigrationApi$Toggles$PaymentsMigration;
import com.revolut.feature.payments_migration.api.navigation.PaymentsMigrationDestination;
import com.revolut.feature.pricing_plans.unlock_benefits.api.PricingPlansUnlockBenefitsApi$Toggles$PlanBenefitsUnlock;
import com.revolut.feature.pricing_plans.unlock_benefits.api.navigation.PricingPlansUnlockBenefitsDestination;
import com.revolut.feature.rewards.api.RewardsApi$FeatureToggles$RentAndBills;
import com.revolut.feature.rewards.api.navigation.RentAndBillsDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.plan_rewards.api.PlanRewardsApi$Toggles$MonthlyDraws;
import com.revolut.retail.feature.plan_rewards.api.navigation.PlanRewardsRevealDestination;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lg0.g;
import xck.o;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f125040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f125041c;

    public f(gte.a featureToggleInteractor, int i) {
        this.f125039a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f125040b = featureToggleInteractor;
                this.f125041c = y0.b("benefit-unlock");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f125040b = featureToggleInteractor;
                this.f125041c = y0.b("rent-and-bills");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f125040b = featureToggleInteractor;
                this.f125041c = y0.b("pse/authorisation/{id}?type={type}");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f125040b = featureToggleInteractor;
                this.f125041c = y0.b("payments-migration");
                break;
            default:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f125040b = featureToggleInteractor;
                this.f125041c = y0.b("monthly-draws/reveal");
                break;
        }
    }

    @Override // xii.b
    public final Set a() {
        switch (this.f125039a) {
        }
        return this.f125041c;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Boolean boolE0;
        int i = this.f125039a;
        gte.a aVar = this.f125040b;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        switch (i) {
            case 0:
                if (aVar.a(PlanRewardsApi$Toggles$MonthlyDraws.f102521c)) {
                    return null;
                }
                return new PlanRewardsRevealDestination(o.MONTHLY_DRAW, null);
            case 1:
                if (!((jte.d) aVar).c(PricingPlansUnlockBenefitsApi$Toggles$PlanBenefitsUnlock.f80963c)) {
                    return null;
                }
                String strA = g.a("attestationRequired", deeplink.f195041c);
                return new PricingPlansUnlockBenefitsDestination((strA == null || (boolE0 = d0.E0(strA)) == null) ? false : boolE0.booleanValue());
            case 2:
                if (aVar.a(RewardsApi$FeatureToggles$RentAndBills.f84764c)) {
                    return null;
                }
                return RentAndBillsDestination.f84896a;
            case 3:
                if (aVar.a(PseFeatureApi$Toggles$PseAuthorisation.f72209c)) {
                    return null;
                }
                String str = (String) deeplink.f195040b.get("id");
                if (str == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing id");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    return null;
                }
                String strA2 = g.a("type", deeplink.f195041c);
                if (Intrinsics.f(strA2, "onetime")) {
                    return new PseNavigation$Destination$AuthorisationRequest(str);
                }
                if (Intrinsics.f(strA2, "otp")) {
                    return new PseNavigation$Destination$VerificationCode(str);
                }
                return null;
            default:
                if (aVar.a(PaymentsMigrationApi$Toggles$PaymentsMigration.f80203c)) {
                    return null;
                }
                return PaymentsMigrationDestination.f80204b;
        }
    }
}
