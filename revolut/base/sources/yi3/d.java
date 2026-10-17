package yi3;

import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import androidx.core.graphics.drawable.DrawableKt;
import aw0.n6;
import bjl.d0;
import bjl.n0;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth.BiometricVerificationMyNumberDateOfBirthEditScreenContract$ModalStep;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.k3;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.network.models.topup.McyAllowedTravelCountries;
import com.revolut.feature.card.view_pin.ui.screen.old_or_new_pin_dialog.OldOrNewPinDialogContract$InputData;
import com.revolut.feature.card.view_pin.ui.screen.old_or_new_pin_dialog.OldOrNewPinDialogScreen;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$ModalStep;
import com.revolut.feature.chooser.external_map.screen.BottomChooserExternalMapAppScreenContract$ModalStep;
import com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_price.CryptoPriceChartChatWidgetParcel$Retry;
import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoSortingPickerInputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.CryptoSortingPickerScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.CryptoDiscoverAllContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.details.InvoiceTemplateDetailsScreenContract$ModalStep;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.details.AdditionalDriverDetailsScreen;
import com.revolut.feature.junior_graduation.impl.R$string;
import com.revolut.feature.junior_payment_links.api.navigation.JuniorPaymentLinksConsentInput;
import com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.JuniorCardProfileFlowContract$Input;
import com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.JuniorCardProfileFlowContract$Step;
import com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.JuniorCardProfileScreen;
import com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.JuniorCardProfileScreenContract;
import com.revolut.feature.junior_payment_links.impl.ui.screen.consent.JuniorPaymentLinksConsentScreen;
import com.revolut.feature.junior_payment_links.impl.ui.screen.custom_amount.JuniorPaymentLinkCustomAmountScreen;
import com.revolut.feature.junior_payment_links.impl.ui.screen.custom_amount.JuniorPaymentLinkCustomAmountScreenContract$Input;
import com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreen;
import com.revolut.feature.shared.invoices.api.ui.contract.InvoiceLanguageSelectorContract$InputData;
import com.revolut.feature.shared.invoices.api.ui.contract.InvoiceTemplatePreviewContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetContract$InputData$Mode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.AddNewOptionsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_other_asset.AddOtherAssetController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details.CustomAssetDetailsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details_v2.CustomAssetDetailsV2Controller;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_historical_values.CustomAssetHistoricalValuesController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$Step;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.SmartEstimationBottomSheetController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.a;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.type_selector_sheet.TotalWealthTypeSelectorContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.type_selector_sheet.TotalWealthTypeSelectorController;
import com.revolut.feature.tax_residency.impl.v2.ui.tin_input.TinInputScreen;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreenContract$ModalStep;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.flight_date_picker_screen.AsftFlightDatePickerScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.flight_date_picker_screen.AsftFlightDatePickerScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.number_of_travelers_picker.AsftNumberOfTravelersPickerScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.number_of_travelers_picker.AsftNumberOfTravelersPickerScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.time_slot_picker.AsftTimeSlotPickerScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.time_slot_picker.AsftTimeSlotPickerScreenContract$InputData;
import com.revolut.retail.feature.api.userauth.models.SignInOrigin;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.ChallengeDetailsScreenContract$ModalStep;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.RetailRevolutSsoFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreenContract$ModalStep;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.AddKeyStatsItemFlow;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.EditKeyStatsScreenContract$ModalStep;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$AccessRecovery;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$CombinedAuthentication;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$SignIn;
import com.revolut.sso.api.login.RevolutSsoApi$SignUpInputData;
import com.revolut.sso.api.models.CombinedAuthenticationScreenCustomization;
import com.revolut.sso.api.models.RevolutAccountSession;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlow;
import com.revolut.sso.impl.ui.signup.SignUpFlow;
import eii.l;
import gkl.m;
import grl.k9;
import ip0.zj;
import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import ms0.h4;
import mx0.ba;
import mx0.o9;
import nd.n;
import pcd.s;
import pfm.t;
import prd.b;
import sgm.e3;
import srd.e;
import urd.e;
import vkm.j2;
import vkm.v1;
import xil.j;
import xil.k;
import xwd.o;
import yed.g0;
import yma.r;
import yr5.f;
import yr5.q;
import yrb.g;
import ys.x;
import yt0.h;
import yuc.p;
import yui.a0;
import ywj.i;
import zh9.u0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.y0;
import zp0.u;
import zp0.y;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f314230b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f314229a = i;
        this.f314230b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        RevolutSsoApi$InputData$CombinedAuthentication.b bVar;
        String str;
        o9 o9Var;
        RevolutSsoApi$InputData$SignIn input;
        AuthenticationFlowContract$InputData.SignIn.Origin subAccount;
        AuthenticationFlowContract$InputData.SignIn.Origin origin;
        final com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar = (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c) this.f314230b;
        nkl.b bVar2 = cVar.f101711q;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        RetailRevolutSsoFlowContract$Step step = (RetailRevolutSsoFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        final int i = 0;
        if (step instanceof RetailRevolutSsoFlowContract$Step.ForgotPasscode) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            AuthenticationFlow authenticationFlowA = djl.a.a(bVar2, new RevolutSsoApi$InputData$AccessRecovery(RevolutSsoApi$InputData$AccessRecovery.Origin.ForgotPasscode.f105845a), new i(i, cVar, ref$ObjectRef));
            Function1 block = new Function1() { // from class: ywj.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            bjl.q result = (bjl.q) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar2 = cVar;
                            cVar2.l2(new y65.l(cVar2, ref$ObjectRef, result, null, 16), new yi5.b(26));
                            break;
                        case 1:
                            d0 result2 = (d0) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar3 = cVar;
                            cVar3.l2(new y65.l(cVar3, ref$ObjectRef, result2, null, 17), new yi5.b(26));
                            break;
                        default:
                            n0 result3 = (n0) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (result3 instanceof n0) {
                                com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar4 = cVar;
                                cVar4.l2(new y65.l(cVar4, result3, ref$ObjectRef, null, 18), new yi5.b(26));
                            } else {
                                gom.e.f145194a.e(a0.d.l(result3.getClass(), "Expected SignUpOutputData Authenticated but got "), new Object[0]);
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            authenticationFlowA.H = block;
            return authenticationFlowA;
        }
        m mVar = null;
        Object obj4 = null;
        if (step instanceof RetailRevolutSsoFlowContract$Step.SignIn) {
            final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            UserAuthFeatureConfig.SignInParams signInParams = ((RetailRevolutSsoFlowContract$Step.SignIn) step).f101703a;
            SignInOrigin signInOrigin = signInParams.f99353b;
            RevolutAccountSession revolutAccountSession = signInParams.f99352a;
            if (Intrinsics.f(signInOrigin, SignInOrigin.Default.f99273a)) {
                input = new RevolutSsoApi$InputData$SignIn(revolutAccountSession, new RevolutSsoApi$InputData$SignIn.Origin.Default(false));
            } else if (signInOrigin instanceof SignInOrigin.DuplicateAccount) {
                SignInOrigin.DuplicateAccount duplicateAccount = (SignInOrigin.DuplicateAccount) signInOrigin;
                input = new RevolutSsoApi$InputData$SignIn(revolutAccountSession, new RevolutSsoApi$InputData$SignIn.Origin.DuplicateAccount(duplicateAccount.f99274a, duplicateAccount.f99275b, null, false));
            } else {
                if (!(signInOrigin instanceof SignInOrigin.LostAccess)) {
                    throw new NoWhenBranchMatchedException();
                }
                input = new RevolutSsoApi$InputData$SignIn(revolutAccountSession, ((SignInOrigin.LostAccess) signInOrigin).f99276a, RevolutSsoApi$InputData$SignIn.Origin.LostAccess.f105865a);
            }
            UICustomization uiCustomization = signInParams.f99354c;
            i codeChallengeGenerator = new i(1, cVar, ref$ObjectRef2);
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
            Intrinsics.checkNotNullParameter(codeChallengeGenerator, "codeChallengeGenerator");
            bVar2.f216818a.c(new j(0));
            Intrinsics.checkNotNullParameter(input, "<this>");
            RevolutSsoApi$InputData$SignIn.Origin origin2 = input.f105860c;
            if (origin2 instanceof RevolutSsoApi$InputData$SignIn.Origin.Default) {
                origin = new AuthenticationFlowContract$InputData.SignIn.Origin.Default(((RevolutSsoApi$InputData$SignIn.Origin.Default) origin2).f105861a, 2);
            } else {
                if (origin2 instanceof RevolutSsoApi$InputData$SignIn.Origin.DuplicateAccount) {
                    RevolutSsoApi$InputData$SignIn.Origin.DuplicateAccount duplicateAccount2 = (RevolutSsoApi$InputData$SignIn.Origin.DuplicateAccount) origin2;
                    String value = duplicateAccount2.f105862a;
                    Intrinsics.checkNotNullParameter(value, "value");
                    String value2 = duplicateAccount2.f105863b;
                    if (value2 != null) {
                        Intrinsics.checkNotNullParameter(m.Companion, "<this>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        for (Object obj5 : m.a()) {
                            if (Intrinsics.f(((m) obj5).b(), value2)) {
                                if (i != 0) {
                                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                                }
                                obj4 = obj5;
                                i = 1;
                            }
                        }
                        if (i == 0) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        mVar = (m) obj4;
                    }
                    subAccount = new AuthenticationFlowContract$InputData.SignIn.Origin.DuplicateAccount(value, mVar, duplicateAccount2.f105864c, duplicateAccount2.d);
                } else if (origin2 instanceof RevolutSsoApi$InputData$SignIn.Origin.LostAccess) {
                    origin = AuthenticationFlowContract$InputData.SignIn.Origin.LostAccess.f106240a;
                } else {
                    if (!(origin2 instanceof RevolutSsoApi$InputData$SignIn.Origin.SubAccount)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    RevolutSsoApi$InputData$SignIn.Origin.SubAccount subAccount2 = (RevolutSsoApi$InputData$SignIn.Origin.SubAccount) origin2;
                    subAccount = new AuthenticationFlowContract$InputData.SignIn.Origin.SubAccount(subAccount2.f105866a, subAccount2.f105867b);
                }
                origin = subAccount;
            }
            AuthenticationFlow authenticationFlow = new AuthenticationFlow(new AuthenticationFlowContract$InputData.SignIn(input.f105858a, input.f105859b, origin), codeChallengeGenerator, uiCustomization);
            final int i2 = 1;
            Function1 block2 = new Function1() { // from class: ywj.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj42) {
                    switch (i2) {
                        case 0:
                            bjl.q result = (bjl.q) obj42;
                            Intrinsics.checkNotNullParameter(result, "result");
                            com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar2 = cVar;
                            cVar2.l2(new y65.l(cVar2, ref$ObjectRef2, result, null, 16), new yi5.b(26));
                            break;
                        case 1:
                            d0 result2 = (d0) obj42;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar3 = cVar;
                            cVar3.l2(new y65.l(cVar3, ref$ObjectRef2, result2, null, 17), new yi5.b(26));
                            break;
                        default:
                            n0 result3 = (n0) obj42;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (result3 instanceof n0) {
                                com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar4 = cVar;
                                cVar4.l2(new y65.l(cVar4, result3, ref$ObjectRef2, null, 18), new yi5.b(26));
                            } else {
                                gom.e.f145194a.e(a0.d.l(result3.getClass(), "Expected SignUpOutputData Authenticated but got "), new Object[0]);
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            authenticationFlow.H = block2;
            return authenticationFlow;
        }
        if (step instanceof RetailRevolutSsoFlowContract$Step.SignUp) {
            final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
            final int i3 = 2;
            RevolutSsoApi$SignUpInputData input2 = new RevolutSsoApi$SignUpInputData(((RetailRevolutSsoFlowContract$Step.SignUp) step).f101704a, 2);
            i codeChallengeGenerator2 = new i(i3, cVar, ref$ObjectRef3);
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(input2, "input");
            Intrinsics.checkNotNullParameter(codeChallengeGenerator2, "codeChallengeGenerator");
            bVar2.f216818a.c(new k(0));
            SignUpFlow signUpFlow = new SignUpFlow(input2, codeChallengeGenerator2);
            Function1 block3 = new Function1() { // from class: ywj.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj42) {
                    switch (i3) {
                        case 0:
                            bjl.q result = (bjl.q) obj42;
                            Intrinsics.checkNotNullParameter(result, "result");
                            com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar2 = cVar;
                            cVar2.l2(new y65.l(cVar2, ref$ObjectRef3, result, null, 16), new yi5.b(26));
                            break;
                        case 1:
                            d0 result2 = (d0) obj42;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar3 = cVar;
                            cVar3.l2(new y65.l(cVar3, ref$ObjectRef3, result2, null, 17), new yi5.b(26));
                            break;
                        default:
                            n0 result3 = (n0) obj42;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (result3 instanceof n0) {
                                com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar4 = cVar;
                                cVar4.l2(new y65.l(cVar4, result3, ref$ObjectRef3, null, 18), new yi5.b(26));
                            } else {
                                gom.e.f145194a.e(a0.d.l(result3.getClass(), "Expected SignUpOutputData Authenticated but got "), new Object[0]);
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            signUpFlow.H = block3;
            return signUpFlow;
        }
        if (!(step instanceof RetailRevolutSsoFlowContract$Step.CombinedAuthentication)) {
            if (step instanceof RetailRevolutSsoFlowContract$Step.PersonalisedSignUp) {
                ViewController viewControllerE1 = cVar.e1(new lg8.e(new lg8.a(((RetailRevolutSsoFlowContract$Step.PersonalisedSignUp) step).f101701a)));
                yrk.e block4 = new yrk.e(cVar, 8, LazyFlowCoordinator, step);
                Intrinsics.checkNotNullParameter(block4, "block");
                viewControllerE1.H = block4;
                return viewControllerE1;
            }
            if (!(step instanceof RetailRevolutSsoFlowContract$Step.GraduationNotAvailableYet)) {
                throw new NoWhenBranchMatchedException();
            }
            fh8.a aVar = cVar.A;
            int i5 = ((RetailRevolutSsoFlowContract$Step.GraduationNotAvailableYet) step).f101700a;
            aVar.getClass();
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_graduation_junior_user_identification_too_early_screen_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.junior_graduation_junior_user_identification_too_early_screen_description_generic, u.c(String.valueOf(i5)), null, 12);
            CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D122", null, null, null, 30);
            PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.junior_graduation_junior_user_identification_too_early_screen_go_to_junior_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
            k9 k9Var = k9.Junior;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause, textLocalisedClause2, cdnImageC, null, null, null, null, button, null, null, null, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 61272));
            p block5 = new p(cVar, 12);
            Intrinsics.checkNotNullParameter(block5, "block");
            promptMarketingScreen.H = block5;
            return promptMarketingScreen;
        }
        Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
        i codeChallengeGenerator3 = new i(3, cVar, ref$ObjectRef4);
        RetailRevolutSsoFlowContract$Step.CombinedAuthentication combinedAuthentication = (RetailRevolutSsoFlowContract$Step.CombinedAuthentication) step;
        String str2 = combinedAuthentication.f101696a;
        String str3 = combinedAuthentication.f101697b;
        int i6 = ywj.k.f317483a[combinedAuthentication.f101698c.ordinal()];
        if (i6 == 1) {
            bVar = RevolutSsoApi$InputData$CombinedAuthentication.b.UNIFIED_UI;
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = RevolutSsoApi$InputData$CombinedAuthentication.b.TWO_BUTTONS_UI;
        }
        RevolutSsoApi$InputData$CombinedAuthentication.b bVar3 = bVar;
        RevolutSsoApi$InputData$CombinedAuthentication input3 = new RevolutSsoApi$InputData$CombinedAuthentication(str2, str3, bVar3, false, combinedAuthentication.d, combinedAuthentication.e);
        cVar.f101717y.getClass();
        Object obj6 = s0j.a.f258961a;
        if (obj6.equals(obj6)) {
            o9Var = o9.REVOLUT;
            str = "block";
        } else {
            str = "block";
            if (!obj6.equals(s0j.b.f258962a)) {
                throw new NoWhenBranchMatchedException();
            }
            o9Var = o9.REVOLUT_X;
        }
        UICustomization uiCustomization2 = new UICustomization(null, new CombinedAuthenticationScreenCustomization(o9Var, 1), 15);
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(input3, "input");
        Intrinsics.checkNotNullParameter(uiCustomization2, "uiCustomization");
        Intrinsics.checkNotNullParameter(codeChallengeGenerator3, "codeChallengeGenerator");
        bVar2.f216818a.c(new xil.i(str2, str3, bVar3));
        CombinedAuthenticationFlow combinedAuthenticationFlow = new CombinedAuthenticationFlow(input3, codeChallengeGenerator3, uiCustomization2);
        yrk.e eVar = new yrk.e(cVar, 7, ref$ObjectRef4, step);
        Intrinsics.checkNotNullParameter(eVar, str);
        combinedAuthenticationFlow.H = eVar;
        return combinedAuthenticationFlow;
    }

    /* JADX WARN: Type inference failed for: r1v127, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws PackageManager.NameNotFoundException {
        Object obj4;
        TimeZone timeZone;
        TimeZone timeZone2;
        int i = this.f314229a;
        int i2 = 20;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        final int i3 = 1;
        Object obj5 = this.f314230b;
        switch (i) {
            case 0:
                com.revolut.feature.chooser.external_map.screen.b bVar = (com.revolut.feature.chooser.external_map.screen.b) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                BottomChooserExternalMapAppScreenContract$ModalStep step = (BottomChooserExternalMapAppScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof BottomChooserExternalMapAppScreenContract$ModalStep.MapAppChooser)) {
                    throw new NoWhenBranchMatchedException();
                }
                e eVar = bVar.f65922q;
                List mapApps = ((BottomChooserExternalMapAppScreenContract$ModalStep.MapAppChooser) step).f65920a;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(mapApps, "mapApps");
                List<q70.e> list = mapApps;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (q70.e eVar2 : list) {
                    TextClause textClause = new TextClause(eVar2.f242734a, (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126);
                    zi3.a aVar = eVar.f314231a;
                    String packageName = eVar2.f242735b;
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(packageName, "packageName");
                    Drawable applicationIcon = aVar.f322497a.getPackageManager().getApplicationIcon(packageName);
                    Intrinsics.checkNotNullExpressionValue(applicationIcon, "getApplicationIcon(...)");
                    arrayList.add(new l((Clause) textClause, (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(new BitmapImage(DrawableKt.toBitmap$default(applicationIcon, 0, 0, null, 7, null), false, (ImageTransformations) null, 14), null, null, false, null, false, 62), true, false, (RowDelegate.Model.c) null, (Object) eVar2, 232));
                }
                RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(null, null, arrayList, AnalyticsProduct.Shared.RevolutUIKit.f, null));
                g0 block = new g0(bVar, 13);
                Intrinsics.checkNotNullParameter(block, "block");
                rowActionsBottomSheetController.H = block;
                rowActionsBottomSheetController.k2(new y99.c(bVar, 11));
                return rowActionsBottomSheetController;
            case 1:
                com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a aVar2 = (com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a) obj5;
                JuniorCardProfileFlowContract$Input juniorCardProfileFlowContract$Input = aVar2.o;
                JuniorCardProfileFlowContract$Step step2 = (JuniorCardProfileFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof JuniorCardProfileFlowContract$Step.PaymentLinksConsent) {
                    JuniorCardProfileFlowContract$Step.PaymentLinksConsent paymentLinksConsent = (JuniorCardProfileFlowContract$Step.PaymentLinksConsent) step2;
                    JuniorPaymentLinksConsentScreen juniorPaymentLinksConsentScreen = new JuniorPaymentLinksConsentScreen(new JuniorPaymentLinksConsentInput(juniorCardProfileFlowContract$Input.f77079a, paymentLinksConsent.f77083b, paymentLinksConsent.f77084c, paymentLinksConsent.f77082a));
                    yi8.e block2 = new yi8.e(aVar2, 2);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    juniorPaymentLinksConsentScreen.H = block2;
                    juniorPaymentLinksConsentScreen.l2(new y99.c(aVar2, 12));
                    return juniorPaymentLinksConsentScreen;
                }
                if (Intrinsics.f(step2, JuniorCardProfileFlowContract$Step.CardProfile.f77080a)) {
                    JuniorCardProfileScreen juniorCardProfileScreen = new JuniorCardProfileScreen(new JuniorCardProfileScreenContract.Input(juniorCardProfileFlowContract$Input.f77079a));
                    yi8.e block3 = new yi8.e(aVar2, i3);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    juniorCardProfileScreen.H = block3;
                    return juniorCardProfileScreen;
                }
                if (!(step2 instanceof JuniorCardProfileFlowContract$Step.CustomAmountSetup)) {
                    throw new NoWhenBranchMatchedException();
                }
                JuniorCardProfileFlowContract$Step.CustomAmountSetup customAmountSetup = (JuniorCardProfileFlowContract$Step.CustomAmountSetup) step2;
                JuniorPaymentLinkCustomAmountScreen juniorPaymentLinkCustomAmountScreen = new JuniorPaymentLinkCustomAmountScreen(new JuniorPaymentLinkCustomAmountScreenContract$Input(customAmountSetup.f77081a));
                y7k.g0 block4 = new y7k.g0(aVar2, customAmountSetup, 29);
                Intrinsics.checkNotNullParameter(block4, "block");
                juniorPaymentLinkCustomAmountScreen.H = block4;
                return juniorPaymentLinkCustomAmountScreen;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((ykh.a) obj5).a(h0.f322473a);
            case 3:
                yki.a aVar3 = (yki.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                FlowStep step3 = (FlowStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                return (com.revolut.kompot.navigable.a) aVar3.d.invoke(aVar3, step3);
            case 4:
                yki.i iVar = (yki.i) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                FlowStep step4 = (FlowStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                return (com.revolut.kompot.navigable.a) iVar.f314632b.invoke(iVar, step4);
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                ((ylh.u) obj5).getClass();
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_ITEM_ID", new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.common_state_error_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.common_state_error_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1984);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return u.c(model);
            case 6:
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a aVar4 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PlanPageScreenContract$ModalStep step5 = (PlanPageScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof PlanPageScreenContract$ModalStep.PlanPagerBottomSheet) {
                    return new PlanPageBottomSheetScreen(new PlanPageBottomSheetContract$InputData(((PlanPageScreenContract$ModalStep.PlanPagerBottomSheet) step5).f103607a, aVar4.o.e, null));
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                List counterparties = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(counterparties, "counterparties");
                ((yn9.c) obj5).f315273c.f("KEY_COUNTERPARTY", counterparties);
                return Unit.f186387a;
            case 8:
                AdditionalDriverDetailsScreen additionalDriverDetailsScreen = (AdditionalDriverDetailsScreen) obj5;
                InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                InputText field = (InputText) obj3;
                KProperty[] kPropertyArr = AdditionalDriverDetailsScreen.f75571d0;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                if (Intrinsics.f(model2.f52580a, "INPUT_BIRTH_DATE")) {
                    return new zp0.w(null, field.getInnerEditText(), u.a.f324146a, new g0(additionalDriverDetailsScreen, 26), 488);
                }
                return null;
            case 9:
                TinInputScreen tinInputScreen = (TinInputScreen) obj5;
                InputTextDelegate.Model model3 = (InputTextDelegate.Model) obj2;
                InputText field2 = (InputText) obj3;
                KProperty[] kPropertyArr2 = TinInputScreen.S;
                Intrinsics.checkNotNullParameter(model3, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                String str = model3.f52580a;
                if (Intrinsics.f(str, "tin_input_field")) {
                    return new y(field2.getInnerEditText(), zhm.u.c(zp0.m.a()), tinInputScreen.K.f.f90183b, new r(tinInputScreen, 25), str, null, false, 96);
                }
                return null;
            case 10:
                s sVar = (s) obj5;
                ((Boolean) obj2).booleanValue();
                return sVar;
            case 11:
                yr3.a key = (yr3.a) obj2;
                List data = (List) obj3;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(data, "data");
                ((yr3.b) obj5).f316116b.f(key.f316114c, data);
                return Unit.f186387a;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new ChatItemsDelegate.Model(new k3(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), (ComplexImage.Regular) null, CryptoPriceChartChatWidgetParcel$Retry.f71358a, 12), ((f) obj5).f316132a, q.f316149b, null, null, false ? 1 : 0, null, 131064);
            case 13:
                CenteredAmountDelegate.Model data2 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field3 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr3 = PushToCardTransferAmountScreen.p0;
                Intrinsics.checkNotNullParameter(data2, "data");
                Intrinsics.checkNotNullParameter(field3, "field");
                MaskedTextInputEditText editText = field3.getEditText();
                Object obj6 = data2.f51981p;
                Intrinsics.i(obj6, "null cannot be cast to non-null type com.revolut.feature.transfer.core.api.mapper.TransferAmountInputPayload");
                return new zp0.d(editText, ((yof.b) obj6).f315672a, (u80.d) ((PushToCardTransferAmountScreen) obj5).f81588a0.getValue(), null, null, false, false, 0, false, null, 1944);
            case 14:
                g gVar = (g) obj5;
                CenteredAmountDelegate.Model model4 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field4 = (CenteredAmountView) obj3;
                Intrinsics.checkNotNullParameter(model4, "model");
                Intrinsics.checkNotNullParameter(field4, "field");
                Object obj7 = model4.f51981p;
                yrb.u uVar = obj7 instanceof yrb.u ? (yrb.u) obj7 : null;
                if (uVar != null) {
                    return new zp0.d(field4.getEditText(), new xi0.b(4, uVar.f316246a.f104720b, Integer.valueOf(uVar.f316247b)), new u80.d(((s80.b) gVar.f316213c).b()), null, new e3(gVar, uVar, 19), false, false, 0, false, null, 1928);
                }
                return null;
            case 15:
                final com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f) obj5;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                TotalWealthFlowContract$Step step6 = (TotalWealthFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof TotalWealthFlowContract$Step.TotalWealth) {
                    TotalWealthFlowContract$Step.TotalWealth totalWealth = (TotalWealthFlowContract$Step.TotalWealth) step6;
                    return new TotalWealthController(new TotalWealthContract$InputData(totalWealth.f87985a, totalWealth.f87986b, totalWealth.f87987c, totalWealth.d));
                }
                if (step6 instanceof TotalWealthFlowContract$Step.AddOtherAsset) {
                    xi0.b bVar2 = ((TotalWealthFlowContract$Step.AddOtherAsset) step6).f87965a;
                    AddOtherAssetController addOtherAssetController = new AddOtherAssetController();
                    yrb.i block5 = new yrb.i(fVar, bVar2, 7);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    addOtherAssetController.H = block5;
                    obj4 = addOtherAssetController;
                } else if (step6 instanceof TotalWealthFlowContract$Step.AddEditAsset) {
                    AddEditAssetContract$InputData$Mode addEditAssetContract$InputData$Mode = ((TotalWealthFlowContract$Step.AddEditAsset) step6).f87963a;
                    AddEditAssetController addEditAssetController = new AddEditAssetController(new grd.b(addEditAssetContract$InputData$Mode));
                    yrb.i block6 = new yrb.i(fVar, addEditAssetContract$InputData$Mode, 3);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    addEditAssetController.H = block6;
                    obj4 = addEditAssetController;
                } else if (step6 instanceof TotalWealthFlowContract$Step.SelectType) {
                    TotalWealthFlowContract$Step.SelectType selectType = (TotalWealthFlowContract$Step.SelectType) step6;
                    TotalWealthTypeSelectorController totalWealthTypeSelectorController = new TotalWealthTypeSelectorController(new TotalWealthTypeSelectorContract$InputData(selectType.f87978b, selectType.d, selectType.f87977a, selectType.f87979c));
                    yrb.i block7 = new yrb.i(fVar, LazyFlowCoordinator, 5);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    totalWealthTypeSelectorController.H = block7;
                    totalWealthTypeSelectorController.k2(new yff.b(LazyFlowCoordinator, fVar, i2));
                    obj4 = totalWealthTypeSelectorController;
                } else {
                    if (step6 instanceof TotalWealthFlowContract$Step.CustomAssetDetails) {
                        TotalWealthFlowContract$Step.CustomAssetDetails customAssetDetails = (TotalWealthFlowContract$Step.CustomAssetDetails) step6;
                        CustomAssetDetailsController customAssetDetailsController = new CustomAssetDetailsController(new srd.c(customAssetDetails.f87967a, customAssetDetails.f87968b, customAssetDetails.f87969c));
                        final int i5 = z ? 1 : 0;
                        Function1 block8 = new Function1() { // from class: yrd.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                switch (i5) {
                                    case 0:
                                        srd.e outputData = (srd.e) obj8;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        if (!Intrinsics.f(outputData, e.a.f265169a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar2 = fVar;
                                        fVar2.f88003t.c(true);
                                        fVar2.u.e(true);
                                        fVar2.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_asset_removed);
                                        return Unit.f186387a;
                                    case 1:
                                        prd.b outputData2 = (prd.b) obj8;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar3 = fVar;
                                        fVar3.f88003t.c(true);
                                        if (Intrinsics.f(outputData2, b.a.f238978a)) {
                                            fVar3.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_current_value_updated);
                                        } else {
                                            if (!Intrinsics.f(outputData2, b.C1322b.f238979a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            if (fVar3.f88000q.e()) {
                                                fVar3.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_smart_estimation_history_value_updated);
                                            } else {
                                                fVar3.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_historical_value_updated);
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.a outputData3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.a) obj8;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        if (!Intrinsics.f(outputData3, a.C0551a.f88039a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        hha.u.Companion.getClass();
                                        fVar.C1(u0.b(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByFeature(hha.u.F, xfa.b.CUSTOM_ASSETS_SMART_ESTIMATION, null, false, 988))));
                                        return Unit.f186387a;
                                    default:
                                        urd.e outputData4 = (urd.e) obj8;
                                        Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                        if (!Intrinsics.f(outputData4, e.a.f282278a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar4 = fVar;
                                        fVar4.u.e(true);
                                        fVar4.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_asset_removed);
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block8, "block");
                        customAssetDetailsController.H = block8;
                        return customAssetDetailsController;
                    }
                    if (step6 instanceof TotalWealthFlowContract$Step.CustomAssetDetailsV2) {
                        TotalWealthFlowContract$Step.CustomAssetDetailsV2 customAssetDetailsV2 = (TotalWealthFlowContract$Step.CustomAssetDetailsV2) step6;
                        CustomAssetDetailsV2Controller customAssetDetailsV2Controller = new CustomAssetDetailsV2Controller(new urd.c(customAssetDetailsV2.f87970a, customAssetDetailsV2.f87971b, customAssetDetailsV2.f87972c));
                        final int i6 = 3;
                        Function1 block9 = new Function1() { // from class: yrd.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                switch (i6) {
                                    case 0:
                                        srd.e outputData = (srd.e) obj8;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        if (!Intrinsics.f(outputData, e.a.f265169a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar2 = fVar;
                                        fVar2.f88003t.c(true);
                                        fVar2.u.e(true);
                                        fVar2.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_asset_removed);
                                        return Unit.f186387a;
                                    case 1:
                                        prd.b outputData2 = (prd.b) obj8;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar3 = fVar;
                                        fVar3.f88003t.c(true);
                                        if (Intrinsics.f(outputData2, b.a.f238978a)) {
                                            fVar3.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_current_value_updated);
                                        } else {
                                            if (!Intrinsics.f(outputData2, b.C1322b.f238979a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            if (fVar3.f88000q.e()) {
                                                fVar3.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_smart_estimation_history_value_updated);
                                            } else {
                                                fVar3.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_historical_value_updated);
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.a outputData3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.a) obj8;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        if (!Intrinsics.f(outputData3, a.C0551a.f88039a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        hha.u.Companion.getClass();
                                        fVar.C1(u0.b(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByFeature(hha.u.F, xfa.b.CUSTOM_ASSETS_SMART_ESTIMATION, null, false, 988))));
                                        return Unit.f186387a;
                                    default:
                                        urd.e outputData4 = (urd.e) obj8;
                                        Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                        if (!Intrinsics.f(outputData4, e.a.f282278a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar4 = fVar;
                                        fVar4.u.e(true);
                                        fVar4.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_asset_removed);
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block9, "block");
                        customAssetDetailsV2Controller.H = block9;
                        return customAssetDetailsV2Controller;
                    }
                    if (step6 instanceof TotalWealthFlowContract$Step.CustomAssetHistoricalValues) {
                        TotalWealthFlowContract$Step.CustomAssetHistoricalValues customAssetHistoricalValues = (TotalWealthFlowContract$Step.CustomAssetHistoricalValues) step6;
                        return new CustomAssetHistoricalValuesController(new wrd.c(customAssetHistoricalValues.f87973a, customAssetHistoricalValues.f87974b));
                    }
                    if (!(step6 instanceof TotalWealthFlowContract$Step.AddNewOptions)) {
                        if (step6 instanceof TotalWealthFlowContract$Step.AdjustAssetValue) {
                            AdjustAssetValueController adjustAssetValueController = new AdjustAssetValueController(((TotalWealthFlowContract$Step.AdjustAssetValue) step6).f87966a);
                            Function1 block10 = new Function1() { // from class: yrd.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj8) {
                                    switch (i3) {
                                        case 0:
                                            srd.e outputData = (srd.e) obj8;
                                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                                            if (!Intrinsics.f(outputData, e.a.f265169a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar2 = fVar;
                                            fVar2.f88003t.c(true);
                                            fVar2.u.e(true);
                                            fVar2.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_asset_removed);
                                            return Unit.f186387a;
                                        case 1:
                                            prd.b outputData2 = (prd.b) obj8;
                                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar3 = fVar;
                                            fVar3.f88003t.c(true);
                                            if (Intrinsics.f(outputData2, b.a.f238978a)) {
                                                fVar3.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_current_value_updated);
                                            } else {
                                                if (!Intrinsics.f(outputData2, b.C1322b.f238979a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                if (fVar3.f88000q.e()) {
                                                    fVar3.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_smart_estimation_history_value_updated);
                                                } else {
                                                    fVar3.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_historical_value_updated);
                                                }
                                            }
                                            return Unit.f186387a;
                                        case 2:
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.a outputData3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.a) obj8;
                                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                            if (!Intrinsics.f(outputData3, a.C0551a.f88039a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            hha.u.Companion.getClass();
                                            fVar.C1(u0.b(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByFeature(hha.u.F, xfa.b.CUSTOM_ASSETS_SMART_ESTIMATION, null, false, 988))));
                                            return Unit.f186387a;
                                        default:
                                            urd.e outputData4 = (urd.e) obj8;
                                            Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                            if (!Intrinsics.f(outputData4, e.a.f282278a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar4 = fVar;
                                            fVar4.u.e(true);
                                            fVar4.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_asset_removed);
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block10, "block");
                            adjustAssetValueController.H = block10;
                            return adjustAssetValueController;
                        }
                        if (step6 instanceof TotalWealthFlowContract$Step.RemoveAssetConfirmationBottomSheet) {
                            TotalWealthFlowContract$Step.RemoveAssetConfirmationBottomSheet removeAssetConfirmationBottomSheet = (TotalWealthFlowContract$Step.RemoveAssetConfirmationBottomSheet) step6;
                            lw0.a aVar5 = new lw0.a(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_smart_estimation_remove_sheet_title, zhm.u.c(new TextClause(removeAssetConfirmationBottomSheet.f87976b, (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_smart_estimation_remove_sheet_subtitle, null, null, 14), null, null, false, 28);
                            aw0.g gVar2 = new aw0.g(new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_label_remove, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                            k9 k9Var = k9.Analytics;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar5, gVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                            yrb.i block11 = new yrb.i(fVar, removeAssetConfirmationBottomSheet, 4);
                            Intrinsics.checkNotNullParameter(block11, "block");
                            actionsBottomSheetController.H = block11;
                            return actionsBottomSheetController;
                        }
                        if (step6 instanceof TotalWealthFlowContract$Step.SmartEstimationBottomSheet) {
                            TotalWealthFlowContract$Step.SmartEstimationBottomSheet smartEstimationBottomSheet = (TotalWealthFlowContract$Step.SmartEstimationBottomSheet) step6;
                            SmartEstimationBottomSheetController smartEstimationBottomSheetController = new SmartEstimationBottomSheetController(new btd.a(smartEstimationBottomSheet.f87980a, smartEstimationBottomSheet.f87981b));
                            final int i21 = 2;
                            Function1 block12 = new Function1() { // from class: yrd.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj8) {
                                    switch (i21) {
                                        case 0:
                                            srd.e outputData = (srd.e) obj8;
                                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                                            if (!Intrinsics.f(outputData, e.a.f265169a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar2 = fVar;
                                            fVar2.f88003t.c(true);
                                            fVar2.u.e(true);
                                            fVar2.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_asset_removed);
                                            return Unit.f186387a;
                                        case 1:
                                            prd.b outputData2 = (prd.b) obj8;
                                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar3 = fVar;
                                            fVar3.f88003t.c(true);
                                            if (Intrinsics.f(outputData2, b.a.f238978a)) {
                                                fVar3.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_current_value_updated);
                                            } else {
                                                if (!Intrinsics.f(outputData2, b.C1322b.f238979a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                if (fVar3.f88000q.e()) {
                                                    fVar3.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_smart_estimation_history_value_updated);
                                                } else {
                                                    fVar3.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_historical_value_updated);
                                                }
                                            }
                                            return Unit.f186387a;
                                        case 2:
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.a outputData3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.a) obj8;
                                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                            if (!Intrinsics.f(outputData3, a.C0551a.f88039a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            hha.u.Companion.getClass();
                                            fVar.C1(u0.b(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByFeature(hha.u.F, xfa.b.CUSTOM_ASSETS_SMART_ESTIMATION, null, false, 988))));
                                            return Unit.f186387a;
                                        default:
                                            urd.e outputData4 = (urd.e) obj8;
                                            Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                            if (!Intrinsics.f(outputData4, e.a.f282278a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar4 = fVar;
                                            fVar4.u.e(true);
                                            fVar4.J2(com.revolut.feature.spending_analytics.api.R$string.analytics_total_wealth_custom_assets_tooltip_asset_removed);
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block12, "block");
                            smartEstimationBottomSheetController.H = block12;
                            return smartEstimationBottomSheetController;
                        }
                        if (!(step6 instanceof TotalWealthFlowContract$Step.SmartEstimationProductArticle)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ViewController viewControllerE1 = fVar.e1(dtd.e.a(((TotalWealthFlowContract$Step.SmartEstimationProductArticle) step6).f87982a));
                        yrb.i block13 = new yrb.i(fVar, step6, 6);
                        Intrinsics.checkNotNullParameter(block13, "block");
                        viewControllerE1.H = block13;
                        return viewControllerE1;
                    }
                    AddNewOptionsController addNewOptionsController = new AddNewOptionsController();
                    o block14 = new o(fVar, 29, LazyFlowCoordinator, step6);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    addNewOptionsController.H = block14;
                    obj4 = addNewOptionsController;
                }
                return obj4;
            case 16:
                com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth.a aVar6 = (com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                BiometricVerificationMyNumberDateOfBirthEditScreenContract$ModalStep step7 = (BiometricVerificationMyNumberDateOfBirthEditScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!Intrinsics.f(step7, BiometricVerificationMyNumberDateOfBirthEditScreenContract$ModalStep.CalendarPicker.f50531a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ys.y yVar = aVar6.f50533q;
                x selectedCalendar = ((ys.j) ((j2) aVar6.f50534r.f22677a).getValue()).f316351a;
                w0 w0Var = aVar6.o.f50530b;
                yVar.getClass();
                Intrinsics.checkNotNullParameter(selectedCalendar, "selectedCalendar");
                lw0.a aVar7 = new lw0.a(new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_nfc_my_number_dob_calendar, null, null, 14), null, null, null, false, 30);
                EnumEntries<x> enumEntriesA = x.a();
                ArrayList arrayList2 = new ArrayList(w.t(enumEntriesA, 10));
                for (x xVar : enumEntriesA) {
                    arrayList2.add(new l((Clause) new TextLocalisedClause(ksj.b.k(xVar), null, null, 14), (Clause) null, (RowDelegate.Model.MainImage) null, true, xVar == selectedCalendar, (RowDelegate.Model.c) null, (Object) xVar, 200));
                }
                RowActionsBottomSheetController rowActionsBottomSheetController2 = new RowActionsBottomSheetController(new eii.c(aVar7, null, arrayList2, AnalyticsProduct.Shared.Vision.f, new AnalyticsContext(w0Var)));
                yo7.p block15 = new yo7.p(aVar6, 16);
                Intrinsics.checkNotNullParameter(block15, "block");
                rowActionsBottomSheetController2.H = block15;
                return rowActionsBottomSheetController2;
            case 17:
                String facilityId = (String) obj2;
                xr7.f state = (xr7.f) obj3;
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(state, "state");
                ((ys7.d) obj5).f316420b.f("credit-insurance-state-" + facilityId, state);
                return Unit.f186387a;
            case 18:
                h hVar = (h) obj5;
                Boolean popupStyleActivated = (Boolean) obj2;
                Boolean embeddedContentActivated = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(popupStyleActivated, "popupStyleActivated");
                Intrinsics.checkNotNullParameter(embeddedContentActivated, "embeddedContentActivated");
                if (popupStyleActivated.booleanValue() && !embeddedContentActivated.booleanValue() && ((Boolean) jo0.g.k.getValue()).booleanValue() && (hVar.f316543l instanceof ba)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                yta.b bVar3 = (yta.b) obj5;
                Integer currentCounter = (Integer) obj2;
                Long storedNextActionDate = (Long) obj3;
                Intrinsics.checkNotNullParameter(currentCounter, "currentCounter");
                Intrinsics.checkNotNullParameter(storedNextActionDate, "storedNextActionDate");
                int iIntValue = currentCounter.intValue() + 1;
                Clock clock = bVar3.f316688b;
                aua.f fVar2 = bVar3.f316687a;
                long epochMilli = iIntValue <= 1 ? LocalDate.now(clock).plusWeeks(1L).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli() : LocalDate.now(clock).plusMonths(3L).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                if (storedNextActionDate.longValue() >= epochMilli) {
                    return pfm.m.f235744a;
                }
                t tVarD = fVar2.d(0);
                pfm.h hVar2 = new pfm.h(new aua.c(fVar2, iIntValue, i3), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                t tVarM = te0.w.g0(hVar2).m(new aua.a(new ak7.g(a0.d.n("Failed to set POSTPONE_RATE_COUNTER=", iIntValue), 17), z ? 1 : 0));
                Intrinsics.checkNotNullExpressionValue(tVarM, "doOnError(...)");
                return efm.b.i(v.k(tVarD, tVarM, fVar2.c(epochMilli)));
            case 20:
                com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a aVar8 = (com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ChallengeDetailsScreenContract$ModalStep modalStep = (ChallengeDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(modalStep, "modalStep");
                if (!(modalStep instanceof ChallengeDetailsScreenContract$ModalStep.StartChallengeBottomSheet)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar9 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.api.rewards_hub.R$string.rewards_hub_challenge_details_start_challenge_status_sheet_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.api.rewards_hub.R$string.rewards_hub_challenge_details_start_challenge_status_sheet_subtitle, null, null, 14), null, null, false, 28);
                aw0.e eVar3 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.feature.api.rewards_hub.R$string.rewards_hub_challenge_details_start_challenge_status_sheet_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var2 = k9.Rewards;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar9, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                yrb.i block16 = new yrb.i(aVar8, modalStep, 11);
                Intrinsics.checkNotNullParameter(block16, "block");
                actionsBottomSheetController2.H = block16;
                return actionsBottomSheetController2;
            case 21:
                McyAllowedTravelCountries data3 = (McyAllowedTravelCountries) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(data3, "data");
                ((yue.b) obj5).f317017b.f("ALLOWED_COUNTRIES", data3);
                return Unit.f186387a;
            case 22:
                final com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar10 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a) obj5;
                AsftTimeSlotBookingScreenContract$InputData asftTimeSlotBookingScreenContract$InputData = aVar10.o;
                cli.y yVar2 = aVar10.f98893x;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AsftTimeSlotBookingScreenContract$ModalStep step8 = (AsftTimeSlotBookingScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (Intrinsics.f(step8, AsftTimeSlotBookingScreenContract$ModalStep.FlightDatePicker.f98884a)) {
                    j2 j2Var = (j2) yVar2.f22677a;
                    j2 j2Var2 = (j2) yVar2.f22677a;
                    LocalDate localDateI2 = aVar10.I2((bti.a) ((yui.l) j2Var.getValue()).f317029b.getContent(), (AsftTerminal) ((yui.l) j2Var2.getValue()).f317030c.getContent());
                    if (localDateI2 == null) {
                        yui.a aVar11 = aVar10.f98891t;
                        bti.a aVar12 = (bti.a) ((yui.l) j2Var2.getValue()).f317029b.getContent();
                        if (aVar12 == null || (timeZone2 = aVar12.f) == null) {
                            timeZone2 = TimeZone.getDefault();
                        }
                        Intrinsics.h(timeZone2);
                        aVar11.getClass();
                        localDateI2 = yui.a.a(timeZone2);
                    }
                    LocalDate localDate = ((yui.l) j2Var2.getValue()).f;
                    n nVar = aVar10.u;
                    AsftTerminal asftTerminal = (AsftTerminal) ((yui.l) j2Var2.getValue()).f317030c.getContent();
                    List list2 = asftTerminal != null ? asftTerminal.f98743l : null;
                    nVar.getClass();
                    AsftFlightDatePickerScreen asftFlightDatePickerScreen = new AsftFlightDatePickerScreen(new AsftFlightDatePickerScreenContract$InputData(localDateI2, localDate, n.i(list2)));
                    Function1 block17 = new Function1() { // from class: yui.w
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i3) {
                                case 0:
                                    cvi.g result = (cvi.g) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar13 = aVar10;
                                    aVar13.H2(aVar13.f98893x, new yuc.p(result, aVar13, 3));
                                    break;
                                case 1:
                                    avi.d result2 = (avi.d) obj8;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar14 = aVar10;
                                    aVar14.H2(aVar14.f98893x, new yuc.p(result2, aVar14, 5));
                                    break;
                                default:
                                    evi.e it8 = (evi.e) obj8;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar15 = aVar10;
                                    cli.y yVar3 = aVar15.f98893x;
                                    aVar15.H2(yVar3, new yuc.p(it8, 4));
                                    AsftTimeSlot asftTimeSlot = ((l) ((j2) yVar3.f22677a).getValue()).f317031g;
                                    j2 j2Var3 = (j2) yVar3.f22677a;
                                    LocalDate localDate2 = ((l) j2Var3.getValue()).f;
                                    if (asftTimeSlot != null && localDate2 != null) {
                                        zsi.h hVar3 = aVar15.f98889r;
                                        String str2 = aVar15.o.f98883b;
                                        String string = localDate2.toString();
                                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                        bti.o request = new bti.o(str2, string, asftTimeSlot.f98749a, ((l) j2Var3.getValue()).e);
                                        mti.l lVar = (mti.l) hVar3;
                                        lVar.getClass();
                                        Intrinsics.checkNotNullParameter(request, "request");
                                        yji.l.b1(aVar15, rd0.e.d(t1.E(new v1(new mti.k(lVar, request, null))), y0.b(new Pair("AsftTimeSlotBookingScreenModel", "prebookSlotAndObserveStatus"))), null, new y(aVar15, null, 2), 3);
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    asftFlightDatePickerScreen.H = block17;
                    return asftFlightDatePickerScreen;
                }
                if (Intrinsics.f(step8, AsftTimeSlotBookingScreenContract$ModalStep.TravelersNumberPicker.f98886a)) {
                    AsftNumberOfTravelersPickerScreen asftNumberOfTravelersPickerScreen = new AsftNumberOfTravelersPickerScreen(new AsftNumberOfTravelersPickerScreenContract$InputData(asftTimeSlotBookingScreenContract$InputData.f98882a, asftTimeSlotBookingScreenContract$InputData.f98883b, ((yui.l) ((j2) yVar2.f22677a).getValue()).e));
                    final int i22 = z ? 1 : 0;
                    Function1 block18 = new Function1() { // from class: yui.w
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i22) {
                                case 0:
                                    cvi.g result = (cvi.g) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar13 = aVar10;
                                    aVar13.H2(aVar13.f98893x, new yuc.p(result, aVar13, 3));
                                    break;
                                case 1:
                                    avi.d result2 = (avi.d) obj8;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar14 = aVar10;
                                    aVar14.H2(aVar14.f98893x, new yuc.p(result2, aVar14, 5));
                                    break;
                                default:
                                    evi.e it8 = (evi.e) obj8;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar15 = aVar10;
                                    cli.y yVar3 = aVar15.f98893x;
                                    aVar15.H2(yVar3, new yuc.p(it8, 4));
                                    AsftTimeSlot asftTimeSlot = ((l) ((j2) yVar3.f22677a).getValue()).f317031g;
                                    j2 j2Var3 = (j2) yVar3.f22677a;
                                    LocalDate localDate2 = ((l) j2Var3.getValue()).f;
                                    if (asftTimeSlot != null && localDate2 != null) {
                                        zsi.h hVar3 = aVar15.f98889r;
                                        String str2 = aVar15.o.f98883b;
                                        String string = localDate2.toString();
                                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                        bti.o request = new bti.o(str2, string, asftTimeSlot.f98749a, ((l) j2Var3.getValue()).e);
                                        mti.l lVar = (mti.l) hVar3;
                                        lVar.getClass();
                                        Intrinsics.checkNotNullParameter(request, "request");
                                        yji.l.b1(aVar15, rd0.e.d(t1.E(new v1(new mti.k(lVar, request, null))), y0.b(new Pair("AsftTimeSlotBookingScreenModel", "prebookSlotAndObserveStatus"))), null, new y(aVar15, null, 2), 3);
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    asftNumberOfTravelersPickerScreen.H = block18;
                    return asftNumberOfTravelersPickerScreen;
                }
                if (!Intrinsics.f(step8, AsftTimeSlotBookingScreenContract$ModalStep.TimeSlotPicker.f98885a)) {
                    throw new NoWhenBranchMatchedException();
                }
                j2 j2Var3 = (j2) yVar2.f22677a;
                j2 j2Var4 = (j2) yVar2.f22677a;
                bti.a aVar13 = (bti.a) ((yui.l) j2Var3.getValue()).f317029b.getContent();
                if (aVar13 == null || (timeZone = aVar13.f) == null) {
                    timeZone = TimeZone.getDefault();
                }
                Intrinsics.h(timeZone);
                AsftTimeSlotPickerScreen asftTimeSlotPickerScreen = new AsftTimeSlotPickerScreen(new AsftTimeSlotPickerScreenContract$InputData(timeZone, asftTimeSlotBookingScreenContract$InputData.f98882a, asftTimeSlotBookingScreenContract$InputData.f98883b, ((yui.l) j2Var4.getValue()).f, ((yui.l) j2Var4.getValue()).f317031g));
                final int i32 = 2;
                Function1 block19 = new Function1() { // from class: yui.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        switch (i32) {
                            case 0:
                                cvi.g result = (cvi.g) obj8;
                                Intrinsics.checkNotNullParameter(result, "result");
                                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar132 = aVar10;
                                aVar132.H2(aVar132.f98893x, new yuc.p(result, aVar132, 3));
                                break;
                            case 1:
                                avi.d result2 = (avi.d) obj8;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar14 = aVar10;
                                aVar14.H2(aVar14.f98893x, new yuc.p(result2, aVar14, 5));
                                break;
                            default:
                                evi.e it8 = (evi.e) obj8;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar15 = aVar10;
                                cli.y yVar3 = aVar15.f98893x;
                                aVar15.H2(yVar3, new yuc.p(it8, 4));
                                AsftTimeSlot asftTimeSlot = ((l) ((j2) yVar3.f22677a).getValue()).f317031g;
                                j2 j2Var32 = (j2) yVar3.f22677a;
                                LocalDate localDate2 = ((l) j2Var32.getValue()).f;
                                if (asftTimeSlot != null && localDate2 != null) {
                                    zsi.h hVar3 = aVar15.f98889r;
                                    String str2 = aVar15.o.f98883b;
                                    String string = localDate2.toString();
                                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                    bti.o request = new bti.o(str2, string, asftTimeSlot.f98749a, ((l) j2Var32.getValue()).e);
                                    mti.l lVar = (mti.l) hVar3;
                                    lVar.getClass();
                                    Intrinsics.checkNotNullParameter(request, "request");
                                    yji.l.b1(aVar15, rd0.e.d(t1.E(new v1(new mti.k(lVar, request, null))), y0.b(new Pair("AsftTimeSlotBookingScreenModel", "prebookSlotAndObserveStatus"))), null, new y(aVar15, null, 2), 3);
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block19, "block");
                asftTimeSlotPickerScreen.H = block19;
                return asftTimeSlotPickerScreen;
            case 23:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new yui.u((List) getDefaultErrorItems.invoke(((a0) obj5).f317021c), yui.q.f317045a);
            case 24:
                com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.e eVar4 = (com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.e) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator8 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ShowCardPinWithCtaScreenContract$ModalStep step9 = (ShowCardPinWithCtaScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator8, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!Intrinsics.f(step9, ShowCardPinWithCtaScreenContract$ModalStep.ShowOldOrNewPinDialog.f64423a)) {
                    throw new NoWhenBranchMatchedException();
                }
                OldOrNewPinDialogScreen oldOrNewPinDialogScreen = new OldOrNewPinDialogScreen(new OldOrNewPinDialogContract$InputData(eVar4.o.getF64420a()));
                yv2.n block20 = new yv2.n(eVar4, z ? 1 : 0);
                Intrinsics.checkNotNullParameter(block20, "block");
                oldOrNewPinDialogScreen.H = block20;
                return oldOrNewPinDialogScreen;
            case 25:
                com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a aVar14 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator9 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EditKeyStatsScreenContract$ModalStep step10 = (EditKeyStatsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator9, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof EditKeyStatsScreenContract$ModalStep.AddStatsItem)) {
                    throw new NoWhenBranchMatchedException();
                }
                trk.a aVar15 = aVar14.o.f104027a;
                Set set = ((EditKeyStatsScreenContract$ModalStep.AddStatsItem) step10).f104028a;
                TradingLegalEntityInformation tradingLegalEntityInformation = ((yvk.f) ((j2) aVar14.f104032s.f22677a).getValue()).f317218b;
                AddKeyStatsItemFlow addKeyStatsItemFlow = new AddKeyStatsItemFlow(new mtk.b(aVar15, set, tradingLegalEntityInformation != null ? tradingLegalEntityInformation.f105106a : null));
                p block21 = new p(aVar14, 9);
                Intrinsics.checkNotNullParameter(block21, "block");
                addKeyStatsItemFlow.H = block21;
                return addKeyStatsItemFlow;
            case 26:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new yw6.f((List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null)), ax6.a.a(((yw6.i) obj5).f317344b.f73805a));
            case 27:
                return a(obj2, obj3);
            case 28:
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b bVar4 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator10 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CryptoDiscoverAllContract$ModalStep step11 = (CryptoDiscoverAllContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator10, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof CryptoDiscoverAllContract$ModalStep.SelectSorting)) {
                    throw new NoWhenBranchMatchedException();
                }
                CryptoSortingPickerScreen cryptoSortingPickerScreen = new CryptoSortingPickerScreen(new CryptoSortingPickerInputData(((CryptoDiscoverAllContract$ModalStep.SelectSorting) step11).f71588a));
                yx5.i block22 = new yx5.i(bVar4, i3);
                Intrinsics.checkNotNullParameter(block22, "block");
                cryptoSortingPickerScreen.H = block22;
                return cryptoSortingPickerScreen;
            default:
                com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c cVar = (com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator11 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InvoiceTemplateDetailsScreenContract$ModalStep step12 = (InvoiceTemplateDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator11, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof InvoiceTemplateDetailsScreenContract$ModalStep.LanguageSelector)) {
                    if (step12 instanceof InvoiceTemplateDetailsScreenContract$ModalStep.Preview) {
                        return cVar.e1(new t9d.c(new InvoiceTemplatePreviewContract$InputData(((InvoiceTemplateDetailsScreenContract$ModalStep.Preview) step12).f73947a)));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE12 = cVar.e1(new t9d.a(new InvoiceLanguageSelectorContract$InputData(((InvoiceTemplateDetailsScreenContract$ModalStep.LanguageSelector) step12).f73946a)));
                p block23 = new p(cVar, i2);
                Intrinsics.checkNotNullParameter(block23, "block");
                viewControllerE12.H = block23;
                return viewControllerE12;
        }
    }

    public /* synthetic */ d(q qVar, f fVar) {
        this.f314229a = 12;
        this.f314230b = fVar;
    }
}
