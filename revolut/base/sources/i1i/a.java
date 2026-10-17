package i1i;

import ae7.i;
import aii.e0;
import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreen;
import com.revolut.feature.onboarding.api.qes_terms.QesTermsFeatureConfig;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$Configuration;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$ProfileConfirmationPayload;
import com.revolut.feature.profile.api.ProfileApi$Toggles$ProfileDetailsConfirmationBEDrivenUserDetails;
import com.revolut.feature.profile.api.navigation.ProfileFeatureConfig;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$PendingCashback;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.feature.subscriptions.api.subscriptionlist.SubscriptionListFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.rewards_hub.navigation.RewardsHubDestination;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import gsh.a0;
import ial.f;
import ice.o;
import jb3.d;
import je5.n;
import jh6.g;
import jma.j;
import kotlin.Unit;
import kotlin.reflect.KProperty;
import lwl.e;
import ly2.l;
import ma1.b0;
import n33.f2;
import nae.q;
import oc3.r;
import rp0.t;
import rp0.y;
import sri.m;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f157639b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f157638a = i;
        this.f157639b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kfm.a
    public final void run() {
        int i = this.f157638a;
        int i2 = 4;
        int i3 = 1;
        co3.a aVar = null;
        Object[] objArr = 0;
        Object obj2 = this.f157639b;
        switch (i) {
            case 0:
                ((rpi.b) ((c) obj2).f157642j).N(false);
                break;
            case 1:
                ((f) obj2).f160061c.h(Unit.f186387a);
                break;
            case 2:
                o oVar = (o) obj2;
                oVar.k.c(new FeatureCommand(new SubscriptionListFeatureConfig(b9e.b.BLOCKED_OR_INACTIVE, oVar.o.d, i2)));
                break;
            case 3:
                ((d) obj2).f172580b.I0("BARCODE_DETAILS_KEY");
                break;
            case 4:
                ((g) obj2).x2(new n(21));
                break;
            case 5:
                m mVar = ((jma.b) obj2).f176493a;
                j7a.g.Companion.getClass();
                mVar.c(new ActivityNavigateCommand(j7a.a.f171876b, new PdfNativeSaveContract$Configuration(PdfNativeSaveContract$ProfileConfirmationPayload.Cards.f80322a, "PROFILE_CONFIRMATION_FLOW"), null, null, 0, null, null, null, null, false, 1020));
                break;
            case 6:
                j jVar = (j) obj2;
                jVar.f176506a.c(((jte.d) jVar.f176507b).c(ProfileApi$Toggles$ProfileDetailsConfirmationBEDrivenUserDetails.f81316c) ? gc0.c.f(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) UserDetailsDestination.f26226a, false, (Integer) null, 0, 61)) : gc0.c.f(ProfileFeatureConfig.DetailsConfirmation.f81346a));
                break;
            case 7:
                ((i) ((ju8.d) obj2).f178641b).c(new zd7.a(false, null, 28));
                break;
            case 8:
                ((npi.c) ((k1i.j) obj2).i).f218223l.a();
                break;
            case 9:
                ((krj.d) obj2).clear();
                break;
            case 10:
                ((kuj.f) obj2).f189840b.a(new e0(RewardsHubDestination.f99255a, com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE), false, 4));
                break;
            case 11:
                e eVar = (e) obj2;
                a0 a0Var = eVar.i.f168252a;
                skm.e0.C(a0Var.f146462b, rd0.e.i(), null, new ge7.f(a0Var, objArr == true ? 1 : 0, 27), 2);
                eVar.f200488h.e();
                break;
            case 12:
                l lVar = (l) obj2;
                opi.d dVar = lVar.f200653s;
                ((ly2.a) lVar.f200651q).getClass();
                t tVar = new t(new TextLocalisedClause(R$string.card_input_nfc_dialog_title, null, null, 14), new TextLocalisedClause(R$string.card_input_nfc_dialog_description, null, null, 14), null, 28);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_input_nfc_dialog_settings, null, null, 14);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                int i5 = R$attr.uikit_dp24;
                int i6 = R$attr.uikit_dp16;
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("NFC_DIALOG_BUTTON_SETTINGS_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i5, R$attr.uikit_dp8, i6, i6, 496);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_input_nfc_dialog_cancel, null, null, 14);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
                int i21 = R$attr.uikit_dp8;
                int i22 = R$attr.uikit_dp16;
                ((opi.b) dVar).Z(new y(v.k(model, new LargeActionButtonDelegate.Model("NFC_DIALOG_BUTTON_CANCEL_LIST_ID", defaultFilledButton2, null, textLocalisedClause2, false, null, null, i21, R$attr.uikit_dp24, i22, i22, 496)), tVar, null, null, null, null, "CARD_INPUT_DELEGATES_KEY", null, null, null, 3836));
                break;
            case 13:
                j60.a.v(((m9h.b) obj2).f203785m, false, null, 3);
                break;
            case 14:
                ifm.c cVar = ((b0) obj2).f203871j;
                if (cVar != null) {
                    cVar.dispose();
                }
                jb3.l.f172594a = false;
                break;
            case 15:
                ((mc7.e) obj2).f204298a.b(new fc7.d(new AnalyticsFeatureConfig.Dashboard.Destination(com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE), 1)));
                break;
            case 16:
                tpi.j jVar2 = ((msb.a) obj2).f208642a;
                if (jVar2 != null) {
                    ((tpi.i) jVar2).Q();
                }
                break;
            case 17:
                opi.d.c(((f2) obj2).f211717t);
                break;
            case 18:
                ((na1.m) obj2).a();
                break;
            case 19:
                ((na1.m) obj2).a();
                break;
            case 20:
                ((k3l.d) ((q) obj2).v).O(new StatusViewConfiguration.Success("MARKED_SUBSCRIPTION_DIALOG_ID", new TextLocalisedClause(R$string.card_marked_as_subscription_toast, null, null, 14), null, null, null, 2044));
                break;
            case 21:
                ((nc0.f) obj2).a();
                break;
            case 22:
                ((nc1.m) obj2).J.d(Boolean.FALSE);
                break;
            case 23:
                o53.b bVar = (o53.b) obj2;
                bVar.f222307a.I0("CARD_PERSONALISATION_KEY");
                bVar.f222307a.I0("CARD_PERSONALISATION_ADDED_KEY");
                break;
            case 24:
                ash.d dVar2 = ((o69.i) obj2).f222538b;
                TransitionAnimation.Companion companion = TransitionAnimation.INSTANCE;
                dVar2.a(new e0(new ShopsFeatureConfig.Map.Destination(aVar, com.revolut.kompot.common.transition.a.b(companion), i3), com.revolut.kompot.common.transition.a.b(companion), false, 4));
                break;
            case 25:
                ((o7c.f) obj2).f222756a.c(new FeatureCommand(new RevolutPayFeatureConfig$PendingCashback(0)));
                break;
            case 26:
                CashTopUpLocationsMapScreen cashTopUpLocationsMapScreen = (CashTopUpLocationsMapScreen) obj2;
                KProperty[] kPropertyArr = CashTopUpLocationsMapScreen.f65677a0;
                cashTopUpLocationsMapScreen.c3().setLocationVisible(true);
                cashTopUpLocationsMapScreen.N = true;
                cashTopUpLocationsMapScreen.c3().h0(new ah0.a(40.6963d, -73.9988d), false);
                r rVar = cashTopUpLocationsMapScreen.M;
                if (rVar != null) {
                    cashTopUpLocationsMapScreen.Z2(rVar, null);
                }
                cashTopUpLocationsMapScreen.M = null;
                break;
            case 27:
                ((oc9.a) obj2).f224131a.c(new FeatureCommand(new QesTermsFeatureConfig(null)));
                break;
            case 28:
                oee.v vVar = (oee.v) obj2;
                opi.d.c(vVar.f224602h);
                ((k3l.d) vVar.f224607p).O(new StatusViewConfiguration.Error("STATUS_VIEW_CANNOT_CANCEL_ID", new TextLocalisedClause(R$string.delivery_details_cancel_mcy_card_order_error_title, null, null, 14), new TextLocalisedClause(R$string.delivery_details_cancel_mcy_card_order_error_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, 8176));
                break;
            default:
                ((k3l.d) ((oma.q) obj2).f226800r).O(new StatusViewConfiguration.Success("DIALOG_ID_CONFIRM", new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_update_details_success, null, null, 14), null, null, null, 2044));
                break;
        }
    }
}
