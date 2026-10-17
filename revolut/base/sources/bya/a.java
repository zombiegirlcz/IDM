package bya;

import aii.e;
import aii.g;
import aii.u;
import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$FaqReferralsFlowMigrationV4;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ReferralsSearchQuickAction;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ReferralsShareInviteForceCompletion;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ShowInviteDetailsConfetti;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ShowInviteListPaginated;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ShowReferralsBusinessButton;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ShowReferralsLearnMoreHelp;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$UseUpsellColorUpdate;
import com.revolut.feature.referrals.shared.ui.api.navigation.InvitesDetailsDestination$ByInviteeDetails;
import com.revolut.feature.referrals.shared.ui.api.navigation.InvitesDetailsDestination$ByInviteeId;
import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeControllerContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.DetailsScope;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InviteDetailsCampaignType;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.ReferralsTroubleshooterTopLevelScreenContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsScreenContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.ReferralsFlow;
import com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.ReferralsFlowContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.ReferralsFlowContract$Step;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.c;
import pwa.n;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof aya.a)) {
            return null;
        }
        aya.a aVar = (aya.a) descriptor;
        return aVar.a(new ReferralsFlow(new ReferralsFlowContract$InputData(new ReferralsFlowContract$Step.InviteCampaignHome(new InviteCampaignHomeControllerContract$InputData(null, aVar.f11111a, false, false)))));
    }

    @Override // nte.a
    public final List e() {
        return v.k(SharedReferralsUiApi$Toggles$FaqReferralsFlowMigrationV4.f81817c, SharedReferralsUiApi$Toggles$UseUpsellColorUpdate.f81824c, SharedReferralsUiApi$Toggles$ShowInviteListPaginated.f81821c, SharedReferralsUiApi$Toggles$ShowReferralsLearnMoreHelp.f81823c, SharedReferralsUiApi$Toggles$ShowReferralsBusinessButton.f81822c, SharedReferralsUiApi$Toggles$ReferralsSearchQuickAction.f81818c, SharedReferralsUiApi$Toggles$ShowInviteDetailsConfetti.f81820c, SharedReferralsUiApi$Toggles$ReferralsShareInviteForceCompletion.f81819c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ReferralsBizFeatureConfig.InviteCampaignHomeNavigationDestination) {
            ReferralsBizFeatureConfig.InviteCampaignHomeNavigationDestination inviteCampaignHomeNavigationDestination = (ReferralsBizFeatureConfig.InviteCampaignHomeNavigationDestination) destination;
            boolean z = inviteCampaignHomeNavigationDestination.f81835a;
            boolean z3 = inviteCampaignHomeNavigationDestination.f81836b;
            return new ReferralsFlow(new ReferralsFlowContract$InputData(new ReferralsFlowContract$Step.InviteCampaignHome(new InviteCampaignHomeControllerContract$InputData(inviteCampaignHomeNavigationDestination.f81837c, inviteCampaignHomeNavigationDestination.d, z, z3))));
        }
        if (destination instanceof ReferralsBizFeatureConfig.ReferralsTroubleshooterNavigationDestination) {
            return new ReferralsFlow(new ReferralsFlowContract$InputData(new ReferralsFlowContract$Step.ReferralsTroubleshooter(new ReferralsTroubleshooterTopLevelScreenContract$InputData(n.STANDARD, false, false, 13))));
        }
        if (destination instanceof ReferralsBizFeatureConfig.AllReferralsTroubleshooterNavigationDestination) {
            return new ReferralsFlow(new ReferralsFlowContract$InputData(new ReferralsFlowContract$Step.AllReferralsTroubleshooter(new AllReferralsScreenContract$InputData(n.STANDARD, true, true))));
        }
        boolean z4 = destination instanceof InvitesDetailsDestination$ByInviteeId;
        InviteDetailsCampaignType.General general = InviteDetailsCampaignType.General.f81866a;
        if (z4) {
            InvitesDetailsDestination$ByInviteeId invitesDetailsDestination$ByInviteeId = (InvitesDetailsDestination$ByInviteeId) destination;
            return new ReferralsFlow(new ReferralsFlowContract$InputData(new ReferralsFlowContract$Step.InviteDetails(new InvitesDetailsContract$InputData.ByInviteId(invitesDetailsDestination$ByInviteeId.f81827a, invitesDetailsDestination$ByInviteeId.f81829c, general, invitesDetailsDestination$ByInviteeId.f81828b, 4))));
        }
        if (destination instanceof InvitesDetailsDestination$ByInviteeDetails) {
            InvitesDetailsDestination$ByInviteeDetails invitesDetailsDestination$ByInviteeDetails = (InvitesDetailsDestination$ByInviteeDetails) destination;
            return new ReferralsFlow(new ReferralsFlowContract$InputData(new ReferralsFlowContract$Step.InviteDetails(new InvitesDetailsContract$InputData.ByInviteeDetails(invitesDetailsDestination$ByInviteeDetails.f81825a, DetailsScope.HelpCenter.f81865a, general, invitesDetailsDestination$ByInviteeDetails.f81826b))));
        }
        if (destination instanceof ReferralsBizFeatureConfig.C2BReferralsNavigationDestination) {
            return new ReferralsFlow(new ReferralsFlowContract$InputData(ReferralsFlowContract$Step.C2BReferrals.f81933a));
        }
        if (!(destination instanceof ReferralsBizFeatureConfig.SalaryReferralIneligibleDestination)) {
            return null;
        }
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.referrals_personalized_tracking_salary_not_eligible_title, null, null, 14), new TextLocalisedClause(R$string.referrals_personalized_tracking_salary_not_eligible_subtitle, null, null, 14), new c(new GlyphImage(R$drawable.uikit_icn_24_cross, null, null, 6)), null, false, 24);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.referrals_personalized_tracking_salary_not_eligible_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
        k9 k9Var = k9.Salary;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }
}
