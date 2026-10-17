package yik;

import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import ggk.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f314338a;

    public d(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f314338a = featureToggleInteractor;
    }

    public final g0 a(xfa.b source) {
        Intrinsics.checkNotNullParameter(source, "source");
        switch (c.f314337a[source.ordinal()]) {
            case 1:
            case 2:
                return g0.ONBOARDING_CARDS_UPGRADE;
            case 3:
                return g0.ONBOARDING;
            case 4:
                return g0.ONBOARDING;
            case 5:
                return g0.CREDIT_CARD_OFFER_BENEFITS;
            case 6:
                return g0.CREDIT_CARD;
            case 7:
                return g0.ONBOARDING_CREDIT;
            case 8:
            case 9:
            case 10:
            case 11:
                return g0.AIRPORT_LOUNGES;
            case 12:
            case 13:
            case 14:
                return g0.AIRPORT_LOUNGES;
            case 15:
            case 16:
            case 17:
            case 18:
                return g0.ATM;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                return g0.FX;
            case 29:
            case 30:
            case 31:
                return g0.SAVINGS;
            case 32:
            case 33:
            case 34:
                return g0.CARDS;
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                return g0.INSURANCE;
            case 40:
                return g0.CONCIERGE_ALBERTINE;
            case 41:
            case 42:
            case 43:
            case 44:
                return g0.COMMODITIES;
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return g0.CRYPTO;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                return g0.REV_POINTS;
            case 56:
            case 57:
            case 58:
                return g0.REVOLUT_PRO;
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                return g0.STOCKS;
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return g0.GLOBAL_MONEY_TRANSFERS;
            case 69:
            case 70:
                return g0.YOUTH;
            case 71:
                return g0.FREE_ESIM_DATA_PLAN;
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
                return g0.DEFAULT;
            case 103:
                return g0.PRIVATE_BANKING;
            case 104:
            case 105:
                boolean zC = ((jte.d) this.f314338a).c(PricingPlansUiApi$Toggles.FamilyPlansRedesignBillingCycleExtras.f102630c);
                if (zC) {
                    return g0.ONBOARDING_FAMILY;
                }
                if (zC) {
                    throw new NoWhenBranchMatchedException();
                }
                return g0.SWITCH_TO_FAMILY;
            case 106:
                return g0.EASY_DOWNGRADE;
            case 107:
                return g0.SALARY_HUB;
            case LDSFile.EF_DG12_TAG /* 108 */:
                return g0.DEFAULT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
