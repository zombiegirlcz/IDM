package pgk;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.dashboard.WaitingListV3DashboardScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.bottom_sheet.screen.CFACInsuranceBottomSheetScreen;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.trusted_merchants.impl.ui.merchant_details.TrustedMerchantDetailsActivity;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$RevPointsCardType;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.retail.operation_status.modal_status.SuccessType;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import pk0.a;
import pk0.b;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235982a;

    public /* synthetic */ d(int i) {
        this.f235982a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 7;
        int i2 = 12;
        Integer num = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        switch (this.f235982a) {
            case 0:
                return new FeatureCommand(new KompotOverlayFeatureConfig((ParcelableDestination) new InternalPricingPlanFeatureConfig.RevPointsCardsBottomSheetDestination(PlanRevPointsCardsScreenContract$RevPointsCardType.Credit.f103532a), yhi.b.BOTTOM_DIALOG, (Integer) (objArr == true ? 1 : 0), i2));
            case 1:
                return new FeatureCommand(new KompotOverlayFeatureConfig((ParcelableDestination) new InternalPricingPlanFeatureConfig.RevPointsCardsBottomSheetDestination(PlanRevPointsCardsScreenContract$RevPointsCardType.Debit.f103533a), yhi.b.BOTTOM_DIALOG, (Integer) (objArr2 == true ? 1 : 0), i2));
            case 2:
                return new FeatureCommand(new PricingPlanFeatureConfig.UltraDashboard(objArr3 == true ? 1 : 0));
            case 3:
                return new KompotPricingPlanFeatureConfig.StudentDestination(KompotPricingPlanFeatureConfig.StudentDestination.Mode.Status.f102896a);
            case 4:
                return vhi.c.c(KompotPricingPlanFeatureConfig.PlanSwitchToAnnualEntryDestination.f102886a, yhi.b.SOLID, null, false, 12);
            case 5:
                return new FeatureCommand(new KompotPricingPlanFeatureConfig.PlanSettings(null));
            case 6:
                return com.revolut.retail.operation_status.modal_screen.a.a(h3l.g.Companion, new StatusViewConfiguration.Success("WELCOME_TO_METAL", new TextLocalisedClause(R$string.metal_upgrade_conf_success_title, null, null, 14), new TextLocalisedClause(R$string.metal_upgrade_conf_success_subtitle, null, null, 14), null, new SuccessType.ResultAction(new TextLocalisedClause(R$string.metal_upgrade_conf_success_action_title, null, null, 14), null), 1912), com.revolut.retail.core.navigation.a.c(new FinishCommand(objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, i), new FeatureCommand(new CardDesignFeatureConfig(b93.e.PHYSICAL, null, null, null, null, false, null, false, false, null, xfa.b.METAL_DEEPLINK, null, null, null, null, null, null, null, null, null, null, false, false, null, 536866814))), null, null, null, 508);
            case 7:
                return new KompotPricingPlanFeatureConfig.StudentDestination(KompotPricingPlanFeatureConfig.StudentDestination.Mode.Verification.f102897a);
            case 8:
                com.revolut.feature.blue_prompt.fullscreen.a aVar = ms2.g.Companion;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.premium_partner_promo_link_not_eligible_new_users_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.premium_partner_promo_link_not_eligible_subtitle, null, null, 14);
                BluePromptContent.MediaContent mediaContent = new BluePromptContent.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D051", null, null, null, 30));
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
                FinishCommand finishCommand = new FinishCommand(objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, i);
                k9 k9Var = k9.Premium;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return com.revolut.feature.blue_prompt.fullscreen.a.a(aVar, textLocalisedClause, textLocalisedClause2, mediaContent, null, textLocalisedClause3, null, finishCommand, null, null, null, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 33291953);
            case 9:
                return gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, gc0.c.f(new KompotOverlayFeatureConfig(KompotPricingPlanFeatureConfig.StudentGraduateActionDestination.f102899a, yhi.b.BOTTOM_DIALOG, num, i2)), 2)));
            case 10:
                return vhi.c.c(KompotPricingPlanFeatureConfig.StudentCancelActionDestination.f102893a, yhi.b.BOTTOM_DIALOG, null, false, 12);
            case 11:
                return new KompotPricingPlanFeatureConfig.StudentDestination(KompotPricingPlanFeatureConfig.StudentDestination.Mode.Default.f102895a);
            case 12:
                return vhi.c.c(InternalPricingPlanFeatureConfig.CancelPlanDowngradeDestination.f103317a, yhi.b.BOTTOM_DIALOG, null, false, 12);
            case 13:
                return new FeatureCommand(new KompotPricingPlanFeatureConfig.WhatsNewInPlan(null));
            case 14:
                return new Regex("\\b\\d+\\b");
            case 15:
                return Unit.f186387a;
            case 16:
                return Unit.f186387a;
            case 17:
                KProperty[] kPropertyArr = WaitingListV3DashboardScreen.S;
                return new RowDelegate(null, null, 7);
            case 18:
                KProperty[] kPropertyArr2 = WaitingListV3DashboardScreen.S;
                return new FullScreenStateDelegate();
            case 19:
                int i3 = CFACInsuranceBottomSheetScreen.X;
                return new RowDelegate(null, null, 7);
            case 20:
                int i5 = CFACInsuranceBottomSheetScreen.X;
                return new DatePickerDelegate();
            case 21:
                int i6 = CFACInsuranceBottomSheetScreen.X;
                return new ListSubheaderDelegate();
            case 22:
                return new qlm.e(pj8.d.f236694a);
            case 23:
                return new PromptMarketingContentDelegate();
            case 24:
                return new FullScreenStateDelegate();
            case 25:
                int i21 = TrustedMerchantDetailsActivity.y0;
                return new CellDetailsDelegate();
            case 26:
                int i22 = TrustedMerchantDetailsActivity.y0;
                return new TwinHorizontalButtonDelegate();
            case 27:
                a.Companion bVar = pk0.a.INSTANCE;
                return new qlm.e(b.a.f236909a);
            case 28:
                return new PromptMarketingContentDelegate();
            default:
                return new FullScreenStateDelegate();
        }
    }
}
