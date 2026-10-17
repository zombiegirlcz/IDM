package com.revolut.feature.credit.application.plugins.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import bk4.e;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.CreditOfferParcel;
import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.AutoPayPromptScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingIntroScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingLoadingScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.ConfirmationPromptScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.CongratulationsScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.ManualUnderwritingScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.esign.ESignTask;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingSummary;
import com.revolut.feature.credit.application.plugins.api.models.rollee.RolleeSession;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import ds3.c;
import dx4.z2;
import ft3.a1;
import ft3.d1;
import ft3.j1;
import gt3.f;
import h30.l;
import h93.j0;
import hs3.a0;
import hs3.k0;
import hs3.l1;
import hs3.m;
import hs3.m0;
import hs3.q1;
import hs3.r1;
import hs3.w0;
import hs3.x;
import hs3.x0;
import hs3.y1;
import hs3.z1;
import ht3.l0;
import io3.h;
import java.io.Serializable;
import ju3.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu3.i;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jetbrains.annotations.NotNull;
import yp3.b;
import yp3.d;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bU\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:U\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUV\u0082\u0001\u0081\u0001WXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¨\u0006¬\u0001"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "StartApplication", "CancelApplication", "Confirmation", "Workflow", "Form", "Address", "KontomatikIncomeCheck", "Congratulations", "HowItWorks", "Offer", "Rollee", "Akahu", "OfferV2", "CreditCardOffer", "MortgageOffer", "RefinancingOffer", "RefinancingAccountDetails", "Consents", "ESignature", "MortgageSignature", "MortgageSignatureSigned", "CardOrdering", "ComboCardOrdering", "Agreements", "AgreementsV2", "ManualUnderwriting", "ManualUnderwritingTicketor", "ManualUnderwritingPopup", "Calculator", "LinkedAccountsV2", "LinkedAccountsV3", "ConsentsV1", "Banner", "ExpiredPopup", "DeclineInvitationPopup", "OutstandingDebts", "OutstandingDebtsV2", "OutstandingDebtsV3", "EmergencyPayment", "SpousalConsentInitiator", "Spinner", "DirectDebitAccountSelection", "DirectDebitAccountConfirmation", "DirectDebitFailed", "Rejected", "Failure", "AutoPay", "CreditCardAutoPay", "WaitingPopup", "SpousalConsentInitiatorPopup", "SpousalConsentPartnerPopup", "EmailVerification", "EmailVerificationContinue", "BirthPlace", "StatusDialog", "DocumentsRemediation", "CoBorrowerConsentInitiator", "CoBorrowerConsentPartner", "SepaDirectDebit", "PersonalDetails", "FinancialEvidence", "IllionBankStatement", "DocumentsUpload", "MortgageRefinancingDetailsV2", "HomeInsurance", "ConveyancingAppointmentScheduling", "FinancialSituationConfirmation", "PhotosUpload", "OverdraftOffer", "Addon", "SecurityDeposit", "ProductArticles", "FamilyCreditCardSettings", "UserSelection", "SolicitorSelection", "PlanSelection", "PlanSubscribe", "VisiblePrequalification", "MortgageValuation", "Payment", "DownPaymentSource", "CreditInsuranceOffer", "AddressV2", "LoanSelection", "DropOutForm", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Addon;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Address;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AddressV2;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Agreements;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AgreementsV2;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Akahu;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AutoPay;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Banner;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$BirthPlace;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Calculator;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CancelApplication;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CoBorrowerConsentInitiator;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CoBorrowerConsentPartner;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ComboCardOrdering;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Confirmation;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Congratulations;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Consents;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ConsentsV1;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ConveyancingAppointmentScheduling;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditCardAutoPay;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditCardOffer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditInsuranceOffer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DeclineInvitationPopup;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DirectDebitAccountConfirmation;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DirectDebitAccountSelection;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DirectDebitFailed;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DocumentsRemediation;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DocumentsUpload;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DownPaymentSource;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DropOutForm;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ESignature;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$EmailVerification;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$EmailVerificationContinue;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$EmergencyPayment;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ExpiredPopup;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Failure;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$FamilyCreditCardSettings;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$FinancialEvidence;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$FinancialSituationConfirmation;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Form;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$HomeInsurance;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$HowItWorks;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$IllionBankStatement;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$KontomatikIncomeCheck;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$LinkedAccountsV2;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$LinkedAccountsV3;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$LoanSelection;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ManualUnderwriting;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ManualUnderwritingPopup;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ManualUnderwritingTicketor;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$MortgageOffer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$MortgageRefinancingDetailsV2;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$MortgageSignature;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$MortgageSignatureSigned;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$MortgageValuation;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Offer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OfferV2;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebts;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebtsV2;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebtsV3;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OverdraftOffer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Payment;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$PersonalDetails;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$PhotosUpload;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$PlanSelection;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$PlanSubscribe;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ProductArticles;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$RefinancingAccountDetails;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$RefinancingOffer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Rejected;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Rollee;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SecurityDeposit;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SepaDirectDebit;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SolicitorSelection;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Spinner;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SpousalConsentInitiator;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SpousalConsentInitiatorPopup;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SpousalConsentPartnerPopup;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$StartApplication;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$StatusDialog;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$UserSelection;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$VisiblePrequalification;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$WaitingPopup;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Workflow;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditApplicationKompotFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Addon;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Addon extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Addon> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66501g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66502h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Addon$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66503a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66503a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66503a, ((NavigationDestination) obj2).f66503a);
            }

            public final int hashCode() {
                return this.f66503a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66503a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Addon(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Addon.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Addon[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Addon(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66501g = pluginConfiguration;
            this.f66502h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66502h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Addon)) {
                return false;
            }
            Addon addon = (Addon) obj2;
            return Intrinsics.f(this.f66501g, addon.f66501g) && Intrinsics.f(this.f66502h, addon.f66502h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66501g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66502h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66501g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66502h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Address;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "AddressNavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Address extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Address> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66504g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66505h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Address$AddressNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AddressNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<AddressNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66506a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AddressNavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AddressNavigationDestination[i];
                }
            }

            public AddressNavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66506a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof AddressNavigationDestination) && Intrinsics.f(this.f66506a, ((AddressNavigationDestination) obj2).f66506a);
            }

            public final int hashCode() {
                return this.f66506a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66506a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Address(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Address.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Address[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Address(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new AddressNavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66504g = pluginConfiguration;
            this.f66505h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66505h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Address)) {
                return false;
            }
            Address address = (Address) obj2;
            return Intrinsics.f(this.f66504g, address.f66504g) && Intrinsics.f(this.f66505h, address.f66505h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66504g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66505h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66504g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66505h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AddressV2;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Config", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressV2 extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<AddressV2> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Config f66507g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66508h;
        public final ActivityAnimation i;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AddressV2$Config;", "Landroid/os/Parcelable;", "AddressInput", "AddressSelection", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AddressV2$Config$AddressInput;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AddressV2$Config$AddressSelection;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Config extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AddressV2$Config$AddressInput;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AddressV2$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class AddressInput implements Config {

                @NotNull
                public static final Parcelable.Creator<AddressInput> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f66509a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f66510b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f66511c;
                public final z2 d;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new AddressInput(parcel.readString(), parcel.readString(), parcel.readString(), (z2) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new AddressInput[i];
                    }
                }

                public AddressInput(String title, String str, String buttonTitle, z2 z2Var) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
                    this.f66509a = title;
                    this.f66510b = str;
                    this.f66511c = buttonTitle;
                    this.d = z2Var;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof AddressInput)) {
                        return false;
                    }
                    AddressInput addressInput = (AddressInput) obj2;
                    return Intrinsics.f(this.f66509a, addressInput.f66509a) && Intrinsics.f(this.f66510b, addressInput.f66510b) && Intrinsics.f(this.f66511c, addressInput.f66511c) && Intrinsics.f(this.d, addressInput.d);
                }

                public final int hashCode() {
                    int iHashCode = this.f66509a.hashCode() * 31;
                    String str = this.f66510b;
                    int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f66511c);
                    z2 z2Var = this.d;
                    return iC + (z2Var != null ? z2Var.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f66509a);
                    dest.writeString(this.f66510b);
                    dest.writeString(this.f66511c);
                    dest.writeSerializable(this.d);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AddressV2$Config$AddressSelection;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AddressV2$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class AddressSelection implements Config {

                @NotNull
                public static final Parcelable.Creator<AddressSelection> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f66512a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f66513b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f66514c;
                public final z2 d;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new AddressSelection(parcel.readString(), parcel.readString(), parcel.readString(), (z2) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new AddressSelection[i];
                    }
                }

                public AddressSelection(String title, String str, String buttonTitle, z2 z2Var) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
                    this.f66512a = title;
                    this.f66513b = str;
                    this.f66514c = buttonTitle;
                    this.d = z2Var;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof AddressSelection)) {
                        return false;
                    }
                    AddressSelection addressSelection = (AddressSelection) obj2;
                    return Intrinsics.f(this.f66512a, addressSelection.f66512a) && Intrinsics.f(this.f66513b, addressSelection.f66513b) && Intrinsics.f(this.f66514c, addressSelection.f66514c) && Intrinsics.f(this.d, addressSelection.d);
                }

                public final int hashCode() {
                    int iHashCode = this.f66512a.hashCode() * 31;
                    String str = this.f66513b;
                    int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f66514c);
                    z2 z2Var = this.d;
                    return iC + (z2Var != null ? z2Var.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f66512a);
                    dest.writeString(this.f66513b);
                    dest.writeString(this.f66514c);
                    dest.writeSerializable(this.d);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AddressV2$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Config f66515a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66516b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination((Config) parcel.readParcelable(NavigationDestination.class.getClassLoader()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(Config config, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66515a = config;
                this.f66516b = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66515a, navigationDestination.f66515a) && Intrinsics.f(this.f66516b, navigationDestination.f66516b);
            }

            public final int hashCode() {
                return this.f66516b.hashCode() + (this.f66515a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f66515a, i);
                this.f66516b.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddressV2((Config) parcel.readParcelable(AddressV2.class.getClassLoader()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(AddressV2.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressV2[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddressV2(Config config, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(config, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66507g = config;
            this.f66508h = pluginConfiguration;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddressV2)) {
                return false;
            }
            AddressV2 addressV2 = (AddressV2) obj2;
            return Intrinsics.f(this.f66507g, addressV2.f66507g) && Intrinsics.f(this.f66508h, addressV2.f66508h) && Intrinsics.f(this.i, addressV2.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f66508h, this.f66507g.hashCode() * 31, 31);
            ActivityAnimation activityAnimation = this.i;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66507g, i);
            this.f66508h.writeToParcel(dest, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Agreements;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "AgreementsNavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Agreements extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Agreements> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66517g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final q1 f66518h;
        public final ActivityAnimation i;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Agreements$AgreementsNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AgreementsNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<AgreementsNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66519a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final q1 f66520b;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AgreementsNavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), q1.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AgreementsNavigationDestination[i];
                }
            }

            public AgreementsNavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, q1 scrollDownBehaviour) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(scrollDownBehaviour, "scrollDownBehaviour");
                this.f66519a = pluginConfiguration;
                this.f66520b = scrollDownBehaviour;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AgreementsNavigationDestination)) {
                    return false;
                }
                AgreementsNavigationDestination agreementsNavigationDestination = (AgreementsNavigationDestination) obj2;
                return Intrinsics.f(this.f66519a, agreementsNavigationDestination.f66519a) && this.f66520b == agreementsNavigationDestination.f66520b;
            }

            public final int hashCode() {
                return this.f66520b.hashCode() + (this.f66519a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66519a.writeToParcel(dest, i);
                dest.writeString(this.f66520b.name());
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Agreements(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), q1.valueOf(parcel.readString()), (ActivityAnimation) parcel.readParcelable(Agreements.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Agreements[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Agreements(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, q1 scrollDownBehaviour, ActivityAnimation activityAnimation) {
            super(activityAnimation, new AgreementsNavigationDestination(pluginConfiguration, scrollDownBehaviour), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            Intrinsics.checkNotNullParameter(scrollDownBehaviour, "scrollDownBehaviour");
            this.f66517g = pluginConfiguration;
            this.f66518h = scrollDownBehaviour;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Agreements)) {
                return false;
            }
            Agreements agreements = (Agreements) obj2;
            return Intrinsics.f(this.f66517g, agreements.f66517g) && this.f66518h == agreements.f66518h && Intrinsics.f(this.i, agreements.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.f66518h.hashCode() + (this.f66517g.hashCode() * 31)) * 31;
            ActivityAnimation activityAnimation = this.i;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66517g.writeToParcel(dest, i);
            dest.writeString(this.f66518h.name());
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AgreementsV2;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "AgreementsV2NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AgreementsV2 extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<AgreementsV2> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66521g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final q1 f66522h;
        public final ActivityAnimation i;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AgreementsV2$AgreementsV2NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AgreementsV2NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<AgreementsV2NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66523a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final q1 f66524b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AgreementsV2NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), q1.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AgreementsV2NavigationDestination[i];
                }
            }

            public AgreementsV2NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, q1 scrollDownBehaviour) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(scrollDownBehaviour, "scrollDownBehaviour");
                this.f66523a = pluginConfiguration;
                this.f66524b = scrollDownBehaviour;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AgreementsV2NavigationDestination)) {
                    return false;
                }
                AgreementsV2NavigationDestination agreementsV2NavigationDestination = (AgreementsV2NavigationDestination) obj2;
                return Intrinsics.f(this.f66523a, agreementsV2NavigationDestination.f66523a) && this.f66524b == agreementsV2NavigationDestination.f66524b;
            }

            public final int hashCode() {
                return this.f66524b.hashCode() + (this.f66523a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66523a.writeToParcel(dest, i);
                dest.writeString(this.f66524b.name());
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AgreementsV2(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), q1.valueOf(parcel.readString()), (ActivityAnimation) parcel.readParcelable(AgreementsV2.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AgreementsV2[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AgreementsV2(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, q1 scrollDownBehaviour, ActivityAnimation activityAnimation) {
            super(activityAnimation, new AgreementsV2NavigationDestination(pluginConfiguration, scrollDownBehaviour), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            Intrinsics.checkNotNullParameter(scrollDownBehaviour, "scrollDownBehaviour");
            this.f66521g = pluginConfiguration;
            this.f66522h = scrollDownBehaviour;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AgreementsV2)) {
                return false;
            }
            AgreementsV2 agreementsV2 = (AgreementsV2) obj2;
            return Intrinsics.f(this.f66521g, agreementsV2.f66521g) && this.f66522h == agreementsV2.f66522h && Intrinsics.f(this.i, agreementsV2.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.f66522h.hashCode() + (this.f66521g.hashCode() * 31)) * 31;
            ActivityAnimation activityAnimation = this.i;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66521g.writeToParcel(dest, i);
            dest.writeString(this.f66522h.name());
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Akahu;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Companion", "NavigationDestination", "a", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Akahu extends CreditApplicationKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f66525g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final l0 f66526h;
        public final z2 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66527j;
        public final ActivityAnimation k;

        @NotNull
        public static final Parcelable.Creator<Akahu> CREATOR = new b();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Akahu$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66528a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final l0 f66529b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final z2 f66530c;
            public final CreditApplicationPluginFlowContract$Configuration d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(parcel.readString(), (l0) parcel.readSerializable(), (z2) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(String akahuLink, l0 introPrompt, z2 z2Var, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(akahuLink, "akahuLink");
                Intrinsics.checkNotNullParameter(introPrompt, "introPrompt");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66528a = akahuLink;
                this.f66529b = introPrompt;
                this.f66530c = z2Var;
                this.d = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66528a, navigationDestination.f66528a) && Intrinsics.f(this.f66529b, navigationDestination.f66529b) && Intrinsics.f(this.f66530c, navigationDestination.f66530c) && Intrinsics.f(this.d, navigationDestination.d);
            }

            public final int hashCode() {
                int iHashCode = (this.f66529b.hashCode() + (this.f66528a.hashCode() * 31)) * 31;
                z2 z2Var = this.f66530c;
                return this.d.hashCode() + ((iHashCode + (z2Var == null ? 0 : z2Var.hashCode())) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f66528a);
                dest.writeSerializable(this.f66529b);
                dest.writeSerializable(this.f66530c);
                this.d.writeToParcel(dest, i);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Akahu(parcel.readString(), (l0) parcel.readSerializable(), (z2) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Akahu.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Akahu[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Akahu(String akahuLink, l0 introPrompt, z2 z2Var, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(akahuLink, introPrompt, z2Var, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(akahuLink, "akahuLink");
            Intrinsics.checkNotNullParameter(introPrompt, "introPrompt");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66525g = akahuLink;
            this.f66526h = introPrompt;
            this.i = z2Var;
            this.f66527j = pluginConfiguration;
            this.k = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.k;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Akahu)) {
                return false;
            }
            Akahu akahu = (Akahu) obj2;
            return Intrinsics.f(this.f66525g, akahu.f66525g) && Intrinsics.f(this.f66526h, akahu.f66526h) && Intrinsics.f(this.i, akahu.i) && Intrinsics.f(this.f66527j, akahu.f66527j) && Intrinsics.f(this.k, akahu.k);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.f66526h.hashCode() + (this.f66525g.hashCode() * 31)) * 31;
            z2 z2Var = this.i;
            int iC = a.c(this.f66527j, (iHashCode + (z2Var == null ? 0 : z2Var.hashCode())) * 31, 31);
            ActivityAnimation activityAnimation = this.k;
            return iC + (activityAnimation != null ? activityAnimation.hashCode() : 0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66525g);
            dest.writeSerializable(this.f66526h);
            dest.writeSerializable(this.i);
            this.f66527j.writeToParcel(dest, i);
            dest.writeParcelable(this.k, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AutoPay;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "AutoPayDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoPay extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<AutoPay> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AutoPayPromptScreenConfig f66531g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66532h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$AutoPay$AutoPayDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AutoPayDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<AutoPayDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AutoPayPromptScreenConfig f66533a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66534b;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AutoPayDestination(AutoPayPromptScreenConfig.CREATOR.createFromParcel(parcel), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AutoPayDestination[i];
                }
            }

            public AutoPayDestination(AutoPayPromptScreenConfig promptConfig, CreditApplicationPluginFlowContract$Configuration pluginConfig) {
                Intrinsics.checkNotNullParameter(promptConfig, "promptConfig");
                Intrinsics.checkNotNullParameter(pluginConfig, "pluginConfig");
                this.f66533a = promptConfig;
                this.f66534b = pluginConfig;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AutoPayDestination)) {
                    return false;
                }
                AutoPayDestination autoPayDestination = (AutoPayDestination) obj2;
                return Intrinsics.f(this.f66533a, autoPayDestination.f66533a) && Intrinsics.f(this.f66534b, autoPayDestination.f66534b);
            }

            public final int hashCode() {
                return this.f66534b.hashCode() + (this.f66533a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66533a.writeToParcel(dest, i);
                this.f66534b.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoPay(AutoPayPromptScreenConfig.CREATOR.createFromParcel(parcel), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoPay[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoPay(AutoPayPromptScreenConfig promptConfig, CreditApplicationPluginFlowContract$Configuration pluginConfig) {
            super(null, new AutoPayDestination(promptConfig, pluginConfig), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(promptConfig, "promptConfig");
            Intrinsics.checkNotNullParameter(pluginConfig, "pluginConfig");
            this.f66531g = promptConfig;
            this.f66532h = pluginConfig;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutoPay)) {
                return false;
            }
            AutoPay autoPay = (AutoPay) obj2;
            return Intrinsics.f(this.f66531g, autoPay.f66531g) && Intrinsics.f(this.f66532h, autoPay.f66532h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f66532h.hashCode() + (this.f66531g.hashCode() * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66531g.writeToParcel(dest, i);
            this.f66532h.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Banner;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "BannerNavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Banner extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Banner> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final m f66535g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66536h;
        public final ActivityAnimation i;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Banner$BannerNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BannerNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<BannerNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final m f66537a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66538b;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new BannerNavigationDestination((m) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BannerNavigationDestination[i];
                }
            }

            public BannerNavigationDestination(m bannerMetadata, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(bannerMetadata, "bannerMetadata");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66537a = bannerMetadata;
                this.f66538b = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof BannerNavigationDestination)) {
                    return false;
                }
                BannerNavigationDestination bannerNavigationDestination = (BannerNavigationDestination) obj2;
                return Intrinsics.f(this.f66537a, bannerNavigationDestination.f66537a) && Intrinsics.f(this.f66538b, bannerNavigationDestination.f66538b);
            }

            public final int hashCode() {
                return this.f66538b.hashCode() + (this.f66537a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f66537a);
                this.f66538b.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Banner((m) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Banner.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Banner[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Banner(m bannerMetadata, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new BannerNavigationDestination(bannerMetadata, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(bannerMetadata, "bannerMetadata");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66535g = bannerMetadata;
            this.f66536h = pluginConfiguration;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj2;
            return Intrinsics.f(this.f66535g, banner.f66535g) && Intrinsics.f(this.f66536h, banner.f66536h) && Intrinsics.f(this.i, banner.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f66536h, this.f66535g.hashCode() * 31, 31);
            ActivityAnimation activityAnimation = this.i;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66535g);
            this.f66536h.writeToParcel(dest, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$BirthPlace;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BirthPlace extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<BirthPlace> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66539g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66540h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$BirthPlace$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66541a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66541a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66541a, ((NavigationDestination) obj2).f66541a);
            }

            public final int hashCode() {
                return this.f66541a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66541a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BirthPlace(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(BirthPlace.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BirthPlace[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BirthPlace(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66539g = pluginConfiguration;
            this.f66540h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66540h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BirthPlace)) {
                return false;
            }
            BirthPlace birthPlace = (BirthPlace) obj2;
            return Intrinsics.f(this.f66539g, birthPlace.f66539g) && Intrinsics.f(this.f66540h, birthPlace.f66540h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66539g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66540h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66539g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66540h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Calculator;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "CalculatorNavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Calculator extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Calculator> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66542g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66543h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Calculator$CalculatorNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CalculatorNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<CalculatorNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66544a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CalculatorNavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CalculatorNavigationDestination[i];
                }
            }

            public CalculatorNavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66544a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CalculatorNavigationDestination) && Intrinsics.f(this.f66544a, ((CalculatorNavigationDestination) obj2).f66544a);
            }

            public final int hashCode() {
                return this.f66544a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66544a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Calculator(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Calculator.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Calculator[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Calculator(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new CalculatorNavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66542g = pluginConfiguration;
            this.f66543h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66543h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Calculator)) {
                return false;
            }
            Calculator calculator = (Calculator) obj2;
            return Intrinsics.f(this.f66542g, calculator.f66542g) && Intrinsics.f(this.f66543h, calculator.f66543h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66542g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66543h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66542g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66543h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CancelApplication;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelApplication extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CancelApplication> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f66545g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final d1 f66546h;
        public final a1 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f66547j;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CancelApplication$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66548a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d1 f66549b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final a1 f66550c;
            public final boolean d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(parcel.readString(), (d1) parcel.readSerializable(), (a1) parcel.readSerializable(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(String applicationId, d1 productClassification, a1 entryPointPayload, boolean z) {
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                Intrinsics.checkNotNullParameter(productClassification, "productClassification");
                Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
                this.f66548a = applicationId;
                this.f66549b = productClassification;
                this.f66550c = entryPointPayload;
                this.d = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66548a, navigationDestination.f66548a) && Intrinsics.f(this.f66549b, navigationDestination.f66549b) && Intrinsics.f(this.f66550c, navigationDestination.f66550c) && this.d == navigationDestination.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + ((this.f66550c.hashCode() + ((this.f66549b.hashCode() + (this.f66548a.hashCode() * 31)) * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f66548a);
                dest.writeSerializable(this.f66549b);
                dest.writeSerializable(this.f66550c);
                dest.writeInt(this.d ? 1 : 0);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelApplication(parcel.readString(), (d1) parcel.readSerializable(), (a1) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelApplication[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelApplication(String applicationId, d1 productClassification, a1 entryPointPayload, boolean z) {
            super(new NavigationDestination(applicationId, productClassification, entryPointPayload, z));
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(productClassification, "productClassification");
            Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
            this.f66545g = applicationId;
            this.f66546h = productClassification;
            this.i = entryPointPayload;
            this.f66547j = z;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CancelApplication)) {
                return false;
            }
            CancelApplication cancelApplication = (CancelApplication) obj2;
            return Intrinsics.f(this.f66545g, cancelApplication.f66545g) && Intrinsics.f(this.f66546h, cancelApplication.f66546h) && Intrinsics.f(this.i, cancelApplication.i) && this.f66547j == cancelApplication.f66547j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return Boolean.hashCode(this.f66547j) + ((this.i.hashCode() + ((this.f66546h.hashCode() + (this.f66545g.hashCode() * 31)) * 31)) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66545g);
            dest.writeSerializable(this.f66546h);
            dest.writeSerializable(this.i);
            dest.writeInt(this.f66547j ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Config", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardOrdering extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CardOrdering> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Config f66551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66552h;
        public final ActivityAnimation i;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering$Config;", "Landroid/os/Parcelable;", "PhysicalAndVirtualCard", "VirtualCard", "CardOrdered", "FromPayload", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering$Config$CardOrdered;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering$Config$FromPayload;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering$Config$PhysicalAndVirtualCard;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering$Config$VirtualCard;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Config extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering$Config$CardOrdered;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class CardOrdered implements Config {

                @NotNull
                public static final Parcelable.Creator<CardOrdered> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f66553a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CardOrderingLoadingScreenConfig f66554b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f66555c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new CardOrdered(parcel.readString(), CardOrderingLoadingScreenConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new CardOrdered[i];
                    }
                }

                public CardOrdered(String facilityId, CardOrderingLoadingScreenConfig screenConfig, boolean z) {
                    Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                    Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                    this.f66553a = facilityId;
                    this.f66554b = screenConfig;
                    this.f66555c = z;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof CardOrdered)) {
                        return false;
                    }
                    CardOrdered cardOrdered = (CardOrdered) obj2;
                    return Intrinsics.f(this.f66553a, cardOrdered.f66553a) && Intrinsics.f(this.f66554b, cardOrdered.f66554b) && this.f66555c == cardOrdered.f66555c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f66555c) + ((this.f66554b.hashCode() + (this.f66553a.hashCode() * 31)) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f66553a);
                    this.f66554b.writeToParcel(dest, i);
                    dest.writeInt(this.f66555c ? 1 : 0);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering$Config$FromPayload;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class FromPayload implements Config {

                @NotNull
                public static final Parcelable.Creator<FromPayload> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PluginPayload f66556a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new FromPayload((PluginPayload) parcel.readParcelable(FromPayload.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new FromPayload[i];
                    }
                }

                public FromPayload(PluginPayload payload) {
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    this.f66556a = payload;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof FromPayload) && Intrinsics.f(this.f66556a, ((FromPayload) obj2).f66556a);
                }

                public final int hashCode() {
                    return this.f66556a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f66556a, i);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering$Config$PhysicalAndVirtualCard;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class PhysicalAndVirtualCard implements Config {

                @NotNull
                public static final Parcelable.Creator<PhysicalAndVirtualCard> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f66557a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CardOrderingIntroScreenConfig f66558b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final j0 f66559c;
                public final h93.l0 d;
                public final boolean e;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new PhysicalAndVirtualCard(parcel.readString(), CardOrderingIntroScreenConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString()), parcel.readInt() != 0 ? h93.l0.valueOf(parcel.readString()) : null, parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new PhysicalAndVirtualCard[i];
                    }
                }

                public PhysicalAndVirtualCard(String facilityId, CardOrderingIntroScreenConfig screenConfig, j0 j0Var, h93.l0 l0Var, boolean z) {
                    Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                    Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                    this.f66557a = facilityId;
                    this.f66558b = screenConfig;
                    this.f66559c = j0Var;
                    this.d = l0Var;
                    this.e = z;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof PhysicalAndVirtualCard)) {
                        return false;
                    }
                    PhysicalAndVirtualCard physicalAndVirtualCard = (PhysicalAndVirtualCard) obj2;
                    return Intrinsics.f(this.f66557a, physicalAndVirtualCard.f66557a) && Intrinsics.f(this.f66558b, physicalAndVirtualCard.f66558b) && this.f66559c == physicalAndVirtualCard.f66559c && this.d == physicalAndVirtualCard.d && this.e == physicalAndVirtualCard.e;
                }

                public final int hashCode() {
                    int iHashCode = (this.f66558b.hashCode() + (this.f66557a.hashCode() * 31)) * 31;
                    j0 j0Var = this.f66559c;
                    int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
                    h93.l0 l0Var = this.d;
                    return Boolean.hashCode(this.e) + ((iHashCode2 + (l0Var != null ? l0Var.hashCode() : 0)) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f66557a);
                    this.f66558b.writeToParcel(dest, i);
                    j0 j0Var = this.f66559c;
                    if (j0Var == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        dest.writeString(j0Var.name());
                    }
                    h93.l0 l0Var = this.d;
                    if (l0Var == null) {
                        dest.writeInt(0);
                    } else {
                        l.B(dest, 1, l0Var);
                    }
                    dest.writeInt(this.e ? 1 : 0);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering$Config$VirtualCard;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class VirtualCard implements Config {

                @NotNull
                public static final Parcelable.Creator<VirtualCard> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f66560a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CardOrderingLoadingScreenConfig f66561b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final j0 f66562c;
                public final h93.l0 d;
                public final boolean e;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new VirtualCard(parcel.readString(), CardOrderingLoadingScreenConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString()), parcel.readInt() != 0 ? h93.l0.valueOf(parcel.readString()) : null, parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new VirtualCard[i];
                    }
                }

                public VirtualCard(String facilityId, CardOrderingLoadingScreenConfig screenConfig, j0 j0Var, h93.l0 l0Var, boolean z) {
                    Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                    Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                    this.f66560a = facilityId;
                    this.f66561b = screenConfig;
                    this.f66562c = j0Var;
                    this.d = l0Var;
                    this.e = z;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof VirtualCard)) {
                        return false;
                    }
                    VirtualCard virtualCard = (VirtualCard) obj2;
                    return Intrinsics.f(this.f66560a, virtualCard.f66560a) && Intrinsics.f(this.f66561b, virtualCard.f66561b) && this.f66562c == virtualCard.f66562c && this.d == virtualCard.d && this.e == virtualCard.e;
                }

                public final int hashCode() {
                    int iHashCode = (this.f66561b.hashCode() + (this.f66560a.hashCode() * 31)) * 31;
                    j0 j0Var = this.f66562c;
                    int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
                    h93.l0 l0Var = this.d;
                    return Boolean.hashCode(this.e) + ((iHashCode2 + (l0Var != null ? l0Var.hashCode() : 0)) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f66560a);
                    this.f66561b.writeToParcel(dest, i);
                    j0 j0Var = this.f66562c;
                    if (j0Var == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        dest.writeString(j0Var.name());
                    }
                    h93.l0 l0Var = this.d;
                    if (l0Var == null) {
                        dest.writeInt(0);
                    } else {
                        l.B(dest, 1, l0Var);
                    }
                    dest.writeInt(this.e ? 1 : 0);
                }
            }
        }

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CardOrdering$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66563a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Config f66564b;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (Config) parcel.readParcelable(NavigationDestination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, Config config) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(config, "config");
                this.f66563a = pluginConfiguration;
                this.f66564b = config;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66563a, navigationDestination.f66563a) && Intrinsics.f(this.f66564b, navigationDestination.f66564b);
            }

            public final int hashCode() {
                return this.f66564b.hashCode() + (this.f66563a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66563a.writeToParcel(dest, i);
                dest.writeParcelable(this.f66564b, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardOrdering((Config) parcel.readParcelable(CardOrdering.class.getClassLoader()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(CardOrdering.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardOrdering[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardOrdering(Config config, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration, config), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66551g = config;
            this.f66552h = pluginConfiguration;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardOrdering)) {
                return false;
            }
            CardOrdering cardOrdering = (CardOrdering) obj2;
            return Intrinsics.f(this.f66551g, cardOrdering.f66551g) && Intrinsics.f(this.f66552h, cardOrdering.f66552h) && Intrinsics.f(this.i, cardOrdering.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f66552h, this.f66551g.hashCode() * 31, 31);
            ActivityAnimation activityAnimation = this.i;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66551g, i);
            this.f66552h.writeToParcel(dest, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CoBorrowerConsentInitiator;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CoBorrowerConsentInitiator extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CoBorrowerConsentInitiator> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66565g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66566h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CoBorrowerConsentInitiator$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66567a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66567a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66567a, ((NavigationDestination) obj2).f66567a);
            }

            public final int hashCode() {
                return this.f66567a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66567a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CoBorrowerConsentInitiator(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(CoBorrowerConsentInitiator.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoBorrowerConsentInitiator[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CoBorrowerConsentInitiator(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66565g = pluginConfiguration;
            this.f66566h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66566h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CoBorrowerConsentInitiator)) {
                return false;
            }
            CoBorrowerConsentInitiator coBorrowerConsentInitiator = (CoBorrowerConsentInitiator) obj2;
            return Intrinsics.f(this.f66565g, coBorrowerConsentInitiator.f66565g) && Intrinsics.f(this.f66566h, coBorrowerConsentInitiator.f66566h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66565g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66566h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66565g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66566h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CoBorrowerConsentPartner;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CoBorrowerConsentPartner extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CoBorrowerConsentPartner> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66568g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66569h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CoBorrowerConsentPartner$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66570a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66570a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66570a, ((NavigationDestination) obj2).f66570a);
            }

            public final int hashCode() {
                return this.f66570a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66570a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CoBorrowerConsentPartner(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(CoBorrowerConsentPartner.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoBorrowerConsentPartner[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CoBorrowerConsentPartner(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66568g = pluginConfiguration;
            this.f66569h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66569h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CoBorrowerConsentPartner)) {
                return false;
            }
            CoBorrowerConsentPartner coBorrowerConsentPartner = (CoBorrowerConsentPartner) obj2;
            return Intrinsics.f(this.f66568g, coBorrowerConsentPartner.f66568g) && Intrinsics.f(this.f66569h, coBorrowerConsentPartner.f66569h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66568g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66569h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66568g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66569h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ComboCardOrdering;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ComboCardOrdering extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ComboCardOrdering> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PluginPayload f66571g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f66572h;
        public final CreditApplicationPluginFlowContract$Configuration i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f66573j;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ComboCardOrdering$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PluginPayload f66574a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f66575b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66576c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination((PluginPayload) parcel.readParcelable(NavigationDestination.class.getClassLoader()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(PluginPayload pluginPayload, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, boolean z) {
                Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66574a = pluginPayload;
                this.f66575b = z;
                this.f66576c = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66574a, navigationDestination.f66574a) && this.f66575b == navigationDestination.f66575b && Intrinsics.f(this.f66576c, navigationDestination.f66576c);
            }

            public final int hashCode() {
                return this.f66576c.hashCode() + j6.a.c(this.f66574a.hashCode() * 31, 31, this.f66575b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f66574a, i);
                dest.writeInt(this.f66575b ? 1 : 0);
                this.f66576c.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComboCardOrdering((PluginPayload) parcel.readParcelable(ComboCardOrdering.class.getClassLoader()), parcel.readInt() != 0, CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(ComboCardOrdering.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ComboCardOrdering[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComboCardOrdering(PluginPayload pluginPayload, boolean z, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginPayload, pluginConfiguration, z), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66571g = pluginPayload;
            this.f66572h = z;
            this.i = pluginConfiguration;
            this.f66573j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66573j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ComboCardOrdering)) {
                return false;
            }
            ComboCardOrdering comboCardOrdering = (ComboCardOrdering) obj2;
            return Intrinsics.f(this.f66571g, comboCardOrdering.f66571g) && this.f66572h == comboCardOrdering.f66572h && Intrinsics.f(this.i, comboCardOrdering.i) && Intrinsics.f(this.f66573j, comboCardOrdering.f66573j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.i, j6.a.c(this.f66571g.hashCode() * 31, 31, this.f66572h), 31);
            ActivityAnimation activityAnimation = this.f66573j;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66571g, i);
            dest.writeInt(this.f66572h ? 1 : 0);
            this.i.writeToParcel(dest, i);
            dest.writeParcelable(this.f66573j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Confirmation;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "ConfirmationNavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66577g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ConfirmationPromptScreenConfig f66578h;
        public final ActivityAnimation i;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Confirmation$ConfirmationNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ConfirmationNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<ConfirmationNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66579a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ConfirmationPromptScreenConfig f66580b;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ConfirmationNavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), ConfirmationPromptScreenConfig.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ConfirmationNavigationDestination[i];
                }
            }

            public ConfirmationNavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ConfirmationPromptScreenConfig screenConfig) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                this.f66579a = pluginConfiguration;
                this.f66580b = screenConfig;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ConfirmationNavigationDestination)) {
                    return false;
                }
                ConfirmationNavigationDestination confirmationNavigationDestination = (ConfirmationNavigationDestination) obj2;
                return Intrinsics.f(this.f66579a, confirmationNavigationDestination.f66579a) && Intrinsics.f(this.f66580b, confirmationNavigationDestination.f66580b);
            }

            public final int hashCode() {
                return this.f66580b.hashCode() + (this.f66579a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66579a.writeToParcel(dest, i);
                this.f66580b.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), ConfirmationPromptScreenConfig.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Confirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Confirmation(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ConfirmationPromptScreenConfig screenConfig, ActivityAnimation activityAnimation) {
            super(activityAnimation, new ConfirmationNavigationDestination(pluginConfiguration, screenConfig), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f66577g = pluginConfiguration;
            this.f66578h = screenConfig;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) obj2;
            return Intrinsics.f(this.f66577g, confirmation.f66577g) && Intrinsics.f(this.f66578h, confirmation.f66578h) && Intrinsics.f(this.i, confirmation.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.f66578h.hashCode() + (this.f66577g.hashCode() * 31)) * 31;
            ActivityAnimation activityAnimation = this.i;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66577g.writeToParcel(dest, i);
            this.f66578h.writeToParcel(dest, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Congratulations;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Congratulations extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Congratulations> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66581g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CongratulationsScreenConfig f66582h;
        public final ActivityAnimation i;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Congratulations$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66583a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CongratulationsScreenConfig f66584b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (CongratulationsScreenConfig) parcel.readParcelable(NavigationDestination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, CongratulationsScreenConfig screenConfig) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                this.f66583a = pluginConfiguration;
                this.f66584b = screenConfig;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66583a, navigationDestination.f66583a) && Intrinsics.f(this.f66584b, navigationDestination.f66584b);
            }

            public final int hashCode() {
                return this.f66584b.hashCode() + (this.f66583a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66583a.writeToParcel(dest, i);
                dest.writeParcelable(this.f66584b, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Congratulations(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (CongratulationsScreenConfig) parcel.readParcelable(Congratulations.class.getClassLoader()), (ActivityAnimation) parcel.readParcelable(Congratulations.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Congratulations[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Congratulations(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, CongratulationsScreenConfig screenConfig, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration, screenConfig), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f66581g = pluginConfiguration;
            this.f66582h = screenConfig;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Congratulations)) {
                return false;
            }
            Congratulations congratulations = (Congratulations) obj2;
            return Intrinsics.f(this.f66581g, congratulations.f66581g) && Intrinsics.f(this.f66582h, congratulations.f66582h) && Intrinsics.f(this.i, congratulations.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.f66582h.hashCode() + (this.f66581g.hashCode() * 31)) * 31;
            ActivityAnimation activityAnimation = this.i;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66581g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66582h, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Consents;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Consents extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Consents> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66585g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66586h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Consents$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66587a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66587a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66587a, ((NavigationDestination) obj2).f66587a);
            }

            public final int hashCode() {
                return this.f66587a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66587a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Consents(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Consents.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Consents[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Consents(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66585g = pluginConfiguration;
            this.f66586h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66586h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Consents)) {
                return false;
            }
            Consents consents = (Consents) obj2;
            return Intrinsics.f(this.f66585g, consents.f66585g) && Intrinsics.f(this.f66586h, consents.f66586h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66585g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66586h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66585g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66586h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ConsentsV1;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "ConsentsV1NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConsentsV1 extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ConsentsV1> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f66588g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final su3.a f66589h;
        public final DocumentViewerScreenConfig i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66590j;
        public final ActivityAnimation k;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ConsentsV1$ConsentsV1NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ConsentsV1NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<ConsentsV1NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66591a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final su3.a f66592b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final DocumentViewerScreenConfig f66593c;
            public final CreditApplicationPluginFlowContract$Configuration d;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ConsentsV1NavigationDestination(parcel.readString(), (su3.a) parcel.readSerializable(), DocumentViewerScreenConfig.CREATOR.createFromParcel(parcel), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ConsentsV1NavigationDestination[i];
                }
            }

            public ConsentsV1NavigationDestination(String documentId, su3.a document, DocumentViewerScreenConfig screenConfig, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(document, "document");
                Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66591a = documentId;
                this.f66592b = document;
                this.f66593c = screenConfig;
                this.d = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ConsentsV1NavigationDestination)) {
                    return false;
                }
                ConsentsV1NavigationDestination consentsV1NavigationDestination = (ConsentsV1NavigationDestination) obj2;
                return Intrinsics.f(this.f66591a, consentsV1NavigationDestination.f66591a) && Intrinsics.f(this.f66592b, consentsV1NavigationDestination.f66592b) && Intrinsics.f(this.f66593c, consentsV1NavigationDestination.f66593c) && Intrinsics.f(this.d, consentsV1NavigationDestination.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.f66593c.hashCode() + ((this.f66592b.hashCode() + (this.f66591a.hashCode() * 31)) * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f66591a);
                dest.writeSerializable(this.f66592b);
                this.f66593c.writeToParcel(dest, i);
                this.d.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConsentsV1(parcel.readString(), (su3.a) parcel.readSerializable(), DocumentViewerScreenConfig.CREATOR.createFromParcel(parcel), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(ConsentsV1.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConsentsV1[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConsentsV1(String documentId, su3.a document, DocumentViewerScreenConfig screenConfig, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new ConsentsV1NavigationDestination(documentId, document, screenConfig, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(document, "document");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66588g = documentId;
            this.f66589h = document;
            this.i = screenConfig;
            this.f66590j = pluginConfiguration;
            this.k = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.k;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConsentsV1)) {
                return false;
            }
            ConsentsV1 consentsV1 = (ConsentsV1) obj2;
            return Intrinsics.f(this.f66588g, consentsV1.f66588g) && Intrinsics.f(this.f66589h, consentsV1.f66589h) && Intrinsics.f(this.i, consentsV1.i) && Intrinsics.f(this.f66590j, consentsV1.f66590j) && Intrinsics.f(this.k, consentsV1.k);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f66590j, (this.i.hashCode() + ((this.f66589h.hashCode() + (this.f66588g.hashCode() * 31)) * 31)) * 31, 31);
            ActivityAnimation activityAnimation = this.k;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66588g);
            dest.writeSerializable(this.f66589h);
            this.i.writeToParcel(dest, i);
            this.f66590j.writeToParcel(dest, i);
            dest.writeParcelable(this.k, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ConveyancingAppointmentScheduling;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConveyancingAppointmentScheduling extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ConveyancingAppointmentScheduling> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66594g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66595h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ConveyancingAppointmentScheduling$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66596a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66596a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66596a, ((NavigationDestination) obj2).f66596a);
            }

            public final int hashCode() {
                return this.f66596a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66596a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConveyancingAppointmentScheduling(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(ConveyancingAppointmentScheduling.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConveyancingAppointmentScheduling[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConveyancingAppointmentScheduling(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66594g = pluginConfiguration;
            this.f66595h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66595h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConveyancingAppointmentScheduling)) {
                return false;
            }
            ConveyancingAppointmentScheduling conveyancingAppointmentScheduling = (ConveyancingAppointmentScheduling) obj2;
            return Intrinsics.f(this.f66594g, conveyancingAppointmentScheduling.f66594g) && Intrinsics.f(this.f66595h, conveyancingAppointmentScheduling.f66595h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66594g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66595h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66594g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66595h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditCardAutoPay;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "AutoPayDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditCardAutoPay extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CreditCardAutoPay> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f66597g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AutoPayPromptScreenConfig f66598h;
        public final CreditApplicationPluginFlowContract$Configuration i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f66599j;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditCardAutoPay$AutoPayDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AutoPayDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<AutoPayDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66600a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AutoPayPromptScreenConfig f66601b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66602c;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AutoPayDestination(parcel.readString(), AutoPayPromptScreenConfig.CREATOR.createFromParcel(parcel), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AutoPayDestination[i];
                }
            }

            public AutoPayDestination(String facilityId, AutoPayPromptScreenConfig promptConfig, CreditApplicationPluginFlowContract$Configuration pluginConfig) {
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(promptConfig, "promptConfig");
                Intrinsics.checkNotNullParameter(pluginConfig, "pluginConfig");
                this.f66600a = facilityId;
                this.f66601b = promptConfig;
                this.f66602c = pluginConfig;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AutoPayDestination)) {
                    return false;
                }
                AutoPayDestination autoPayDestination = (AutoPayDestination) obj2;
                return Intrinsics.f(this.f66600a, autoPayDestination.f66600a) && Intrinsics.f(this.f66601b, autoPayDestination.f66601b) && Intrinsics.f(this.f66602c, autoPayDestination.f66602c);
            }

            public final int hashCode() {
                return this.f66602c.hashCode() + ((this.f66601b.hashCode() + (this.f66600a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f66600a);
                this.f66601b.writeToParcel(dest, i);
                this.f66602c.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditCardAutoPay(parcel.readString(), AutoPayPromptScreenConfig.CREATOR.createFromParcel(parcel), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(CreditCardAutoPay.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCardAutoPay[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreditCardAutoPay(String facilityId, AutoPayPromptScreenConfig promptConfig, CreditApplicationPluginFlowContract$Configuration pluginConfig, ActivityAnimation activityAnimation) {
            super(activityAnimation, new AutoPayDestination(facilityId, promptConfig, pluginConfig), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(promptConfig, "promptConfig");
            Intrinsics.checkNotNullParameter(pluginConfig, "pluginConfig");
            this.f66597g = facilityId;
            this.f66598h = promptConfig;
            this.i = pluginConfig;
            this.f66599j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66599j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditCardAutoPay)) {
                return false;
            }
            CreditCardAutoPay creditCardAutoPay = (CreditCardAutoPay) obj2;
            return Intrinsics.f(this.f66597g, creditCardAutoPay.f66597g) && Intrinsics.f(this.f66598h, creditCardAutoPay.f66598h) && Intrinsics.f(this.i, creditCardAutoPay.i) && Intrinsics.f(this.f66599j, creditCardAutoPay.f66599j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.i, (this.f66598h.hashCode() + (this.f66597g.hashCode() * 31)) * 31, 31);
            ActivityAnimation activityAnimation = this.f66599j;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66597g);
            this.f66598h.writeToParcel(dest, i);
            this.i.writeToParcel(dest, i);
            dest.writeParcelable(this.f66599j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditCardOffer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "CreditOfferConfig", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditCardOffer extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CreditCardOffer> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditOfferConfig f66603g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66604h;
        public final ActivityAnimation i;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditCardOffer$CreditOfferConfig;", "Landroid/os/Parcelable;", "RegularOffer", "PromoOffer", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditCardOffer$CreditOfferConfig$PromoOffer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditCardOffer$CreditOfferConfig$RegularOffer;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface CreditOfferConfig extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditCardOffer$CreditOfferConfig$PromoOffer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditCardOffer$CreditOfferConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class PromoOffer implements CreditOfferConfig {

                @NotNull
                public static final Parcelable.Creator<PromoOffer> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final i f66605a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new PromoOffer((i) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new PromoOffer[i];
                    }
                }

                public PromoOffer(i creditCardPromoOffer) {
                    Intrinsics.checkNotNullParameter(creditCardPromoOffer, "creditCardPromoOffer");
                    this.f66605a = creditCardPromoOffer;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof PromoOffer) && Intrinsics.f(this.f66605a, ((PromoOffer) obj2).f66605a);
                }

                public final int hashCode() {
                    return this.f66605a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f66605a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditCardOffer$CreditOfferConfig$RegularOffer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditCardOffer$CreditOfferConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class RegularOffer implements CreditOfferConfig {

                @NotNull
                public static final Parcelable.Creator<RegularOffer> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AnimatedBackgroundType f66606a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new RegularOffer((AnimatedBackgroundType) parcel.readParcelable(RegularOffer.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new RegularOffer[i];
                    }
                }

                public RegularOffer(AnimatedBackgroundType animatedBackgroundType) {
                    Intrinsics.checkNotNullParameter(animatedBackgroundType, "animatedBackgroundType");
                    this.f66606a = animatedBackgroundType;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof RegularOffer) && Intrinsics.f(this.f66606a, ((RegularOffer) obj2).f66606a);
                }

                public final int hashCode() {
                    return this.f66606a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f66606a, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditCardOffer$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditOfferConfig f66607a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66608b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination((CreditOfferConfig) parcel.readParcelable(NavigationDestination.class.getClassLoader()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditOfferConfig config, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66607a = config;
                this.f66608b = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66607a, navigationDestination.f66607a) && Intrinsics.f(this.f66608b, navigationDestination.f66608b);
            }

            public final int hashCode() {
                return this.f66608b.hashCode() + (this.f66607a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f66607a, i);
                this.f66608b.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditCardOffer((CreditOfferConfig) parcel.readParcelable(CreditCardOffer.class.getClassLoader()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(CreditCardOffer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCardOffer[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreditCardOffer(CreditOfferConfig config, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(config, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66603g = config;
            this.f66604h = pluginConfiguration;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditCardOffer)) {
                return false;
            }
            CreditCardOffer creditCardOffer = (CreditCardOffer) obj2;
            return Intrinsics.f(this.f66603g, creditCardOffer.f66603g) && Intrinsics.f(this.f66604h, creditCardOffer.f66604h) && Intrinsics.f(this.i, creditCardOffer.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f66604h, this.f66603g.hashCode() * 31, 31);
            ActivityAnimation activityAnimation = this.i;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66603g, i);
            this.f66604h.writeToParcel(dest, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditInsuranceOffer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditInsuranceOffer extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CreditInsuranceOffer> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f66611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66612h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditInsuranceOffer$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66613a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66613a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66613a, ((NavigationDestination) obj2).f66613a);
            }

            public final int hashCode() {
                return this.f66613a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66613a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditInsuranceOffer(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(CreditInsuranceOffer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditInsuranceOffer[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreditInsuranceOffer(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66611g = activityAnimation;
            this.f66612h = pluginConfiguration;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66611g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditInsuranceOffer)) {
                return false;
            }
            CreditInsuranceOffer creditInsuranceOffer = (CreditInsuranceOffer) obj2;
            return Intrinsics.f(this.f66611g, creditInsuranceOffer.f66611g) && Intrinsics.f(this.f66612h, creditInsuranceOffer.f66612h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f66611g;
            return this.f66612h.hashCode() + ((activityAnimation == null ? 0 : activityAnimation.hashCode()) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66611g, i);
            this.f66612h.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DeclineInvitationPopup;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclineInvitationPopup extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<DeclineInvitationPopup> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f66615g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final c f66616h;
        public final ActivityAnimation i;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DeclineInvitationPopup$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66617a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final c f66618b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(parcel.readString(), (c) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(String invitationId, c configuration) {
                Intrinsics.checkNotNullParameter(invitationId, "invitationId");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.f66617a = invitationId;
                this.f66618b = configuration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66617a, navigationDestination.f66617a) && Intrinsics.f(this.f66618b, navigationDestination.f66618b);
            }

            public final int hashCode() {
                return this.f66618b.hashCode() + (this.f66617a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f66617a);
                dest.writeSerializable(this.f66618b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeclineInvitationPopup(parcel.readString(), (c) parcel.readSerializable(), (ActivityAnimation) parcel.readParcelable(DeclineInvitationPopup.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclineInvitationPopup[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeclineInvitationPopup(String invitationId, c configuration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(invitationId, configuration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(invitationId, "invitationId");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f66615g = invitationId;
            this.f66616h = configuration;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeclineInvitationPopup)) {
                return false;
            }
            DeclineInvitationPopup declineInvitationPopup = (DeclineInvitationPopup) obj2;
            return Intrinsics.f(this.f66615g, declineInvitationPopup.f66615g) && Intrinsics.f(this.f66616h, declineInvitationPopup.f66616h) && Intrinsics.f(this.i, declineInvitationPopup.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.f66616h.hashCode() + (this.f66615g.hashCode() * 31)) * 31;
            ActivityAnimation activityAnimation = this.i;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66615g);
            dest.writeSerializable(this.f66616h);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DirectDebitAccountConfirmation;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DirectDebitAccountConfirmation extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<DirectDebitAccountConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e f66619g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66620h;
        public final ActivityAnimation i;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DirectDebitAccountConfirmation$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f66621a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66622b;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination((e) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(e autoPayInfo, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(autoPayInfo, "autoPayInfo");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66621a = autoPayInfo;
                this.f66622b = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f66621a);
                this.f66622b.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectDebitAccountConfirmation((e) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(DirectDebitAccountConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DirectDebitAccountConfirmation[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectDebitAccountConfirmation(e autoPayInfo, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(autoPayInfo, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(autoPayInfo, "autoPayInfo");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66619g = autoPayInfo;
            this.f66620h = pluginConfiguration;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DirectDebitAccountConfirmation)) {
                return false;
            }
            DirectDebitAccountConfirmation directDebitAccountConfirmation = (DirectDebitAccountConfirmation) obj2;
            return Intrinsics.f(this.f66619g, directDebitAccountConfirmation.f66619g) && Intrinsics.f(this.f66620h, directDebitAccountConfirmation.f66620h) && Intrinsics.f(this.i, directDebitAccountConfirmation.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f66620h, this.f66619g.hashCode() * 31, 31);
            ActivityAnimation activityAnimation = this.i;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66619g);
            this.f66620h.writeToParcel(dest, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DirectDebitAccountSelection;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DirectDebitAccountSelection extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<DirectDebitAccountSelection> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66623g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66624h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DirectDebitAccountSelection$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66625a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66625a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66625a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectDebitAccountSelection(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(DirectDebitAccountSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DirectDebitAccountSelection[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectDebitAccountSelection(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66623g = pluginConfiguration;
            this.f66624h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66624h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DirectDebitAccountSelection)) {
                return false;
            }
            DirectDebitAccountSelection directDebitAccountSelection = (DirectDebitAccountSelection) obj2;
            return Intrinsics.f(this.f66623g, directDebitAccountSelection.f66623g) && Intrinsics.f(this.f66624h, directDebitAccountSelection.f66624h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66623g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66624h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66623g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66624h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DirectDebitFailed;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DirectDebitFailed extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<DirectDebitFailed> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66626g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66627h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DirectDebitFailed$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66628a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66628a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66628a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectDebitFailed(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(DirectDebitFailed.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DirectDebitFailed[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectDebitFailed(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66626g = pluginConfiguration;
            this.f66627h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66627h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DirectDebitFailed)) {
                return false;
            }
            DirectDebitFailed directDebitFailed = (DirectDebitFailed) obj2;
            return Intrinsics.f(this.f66626g, directDebitFailed.f66626g) && Intrinsics.f(this.f66627h, directDebitFailed.f66627h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66626g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66627h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66626g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66627h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DocumentsRemediation;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentsRemediation extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<DocumentsRemediation> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66629g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final x f66630h;
        public final ActivityAnimation i;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DocumentsRemediation$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66631a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final x f66632b;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (x) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, x xVar) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66631a = pluginConfiguration;
                this.f66632b = xVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66631a, navigationDestination.f66631a) && Intrinsics.f(this.f66632b, navigationDestination.f66632b);
            }

            public final int hashCode() {
                int iHashCode = this.f66631a.hashCode() * 31;
                x xVar = this.f66632b;
                return iHashCode + (xVar == null ? 0 : xVar.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66631a.writeToParcel(dest, i);
                dest.writeSerializable(this.f66632b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentsRemediation(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (x) parcel.readSerializable(), (ActivityAnimation) parcel.readParcelable(DocumentsRemediation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsRemediation[i];
            }
        }

        public /* synthetic */ DocumentsRemediation(CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration, x xVar, int i) {
            this(creditApplicationPluginFlowContract$Configuration, (i & 2) != 0 ? null : xVar, (ActivityAnimation) null);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentsRemediation)) {
                return false;
            }
            DocumentsRemediation documentsRemediation = (DocumentsRemediation) obj2;
            return Intrinsics.f(this.f66629g, documentsRemediation.f66629g) && Intrinsics.f(this.f66630h, documentsRemediation.f66630h) && Intrinsics.f(this.i, documentsRemediation.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66629g.hashCode() * 31;
            x xVar = this.f66630h;
            int iHashCode2 = (iHashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
            ActivityAnimation activityAnimation = this.i;
            return iHashCode2 + (activityAnimation != null ? activityAnimation.hashCode() : 0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66629g.writeToParcel(dest, i);
            dest.writeSerializable(this.f66630h);
            dest.writeParcelable(this.i, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentsRemediation(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, x xVar, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration, xVar), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66629g = pluginConfiguration;
            this.f66630h = xVar;
            this.i = activityAnimation;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DocumentsUpload;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentsUpload extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<DocumentsUpload> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66633g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66634h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DocumentsUpload$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66635a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66635a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66635a, ((NavigationDestination) obj2).f66635a);
            }

            public final int hashCode() {
                return this.f66635a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66635a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentsUpload(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(DocumentsUpload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsUpload[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentsUpload(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66633g = pluginConfiguration;
            this.f66634h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66634h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentsUpload)) {
                return false;
            }
            DocumentsUpload documentsUpload = (DocumentsUpload) obj2;
            return Intrinsics.f(this.f66633g, documentsUpload.f66633g) && Intrinsics.f(this.f66634h, documentsUpload.f66634h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66633g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66634h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66633g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66634h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DownPaymentSource;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DownPaymentSource extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<DownPaymentSource> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f66636g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66637h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DownPaymentSource$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66638a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66638a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66638a, ((NavigationDestination) obj2).f66638a);
            }

            public final int hashCode() {
                return this.f66638a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66638a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DownPaymentSource(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(DownPaymentSource.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DownPaymentSource[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownPaymentSource(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66636g = activityAnimation;
            this.f66637h = pluginConfiguration;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66636g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DownPaymentSource)) {
                return false;
            }
            DownPaymentSource downPaymentSource = (DownPaymentSource) obj2;
            return Intrinsics.f(this.f66636g, downPaymentSource.f66636g) && Intrinsics.f(this.f66637h, downPaymentSource.f66637h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f66636g;
            return this.f66637h.hashCode() + ((activityAnimation == null ? 0 : activityAnimation.hashCode()) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66636g, i);
            this.f66637h.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DropOutForm;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DropOutForm extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<DropOutForm> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66639g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final DropOutConfig.FeedbackForm f66640h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f66641j;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$DropOutForm$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66642a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DropOutConfig.FeedbackForm f66643b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f66644c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), DropOutConfig.FeedbackForm.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, DropOutConfig.FeedbackForm feedbackForm, boolean z) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(feedbackForm, "feedbackForm");
                this.f66642a = pluginConfiguration;
                this.f66643b = feedbackForm;
                this.f66644c = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66642a, navigationDestination.f66642a) && Intrinsics.f(this.f66643b, navigationDestination.f66643b) && this.f66644c == navigationDestination.f66644c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f66644c) + ((this.f66643b.hashCode() + (this.f66642a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66642a.writeToParcel(dest, i);
                this.f66643b.writeToParcel(dest, i);
                dest.writeInt(this.f66644c ? 1 : 0);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DropOutForm(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), DropOutConfig.FeedbackForm.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (ActivityAnimation) parcel.readParcelable(DropOutForm.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DropOutForm[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DropOutForm(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, DropOutConfig.FeedbackForm feedbackForm, boolean z, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration, feedbackForm, z), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            Intrinsics.checkNotNullParameter(feedbackForm, "feedbackForm");
            this.f66639g = pluginConfiguration;
            this.f66640h = feedbackForm;
            this.i = z;
            this.f66641j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66641j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DropOutForm)) {
                return false;
            }
            DropOutForm dropOutForm = (DropOutForm) obj2;
            return Intrinsics.f(this.f66639g, dropOutForm.f66639g) && Intrinsics.f(this.f66640h, dropOutForm.f66640h) && this.i == dropOutForm.i && Intrinsics.f(this.f66641j, dropOutForm.f66641j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = j6.a.c((this.f66640h.hashCode() + (this.f66639g.hashCode() * 31)) * 31, 31, this.i);
            ActivityAnimation activityAnimation = this.f66641j;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66639g.writeToParcel(dest, i);
            this.f66640h.writeToParcel(dest, i);
            dest.writeInt(this.i ? 1 : 0);
            dest.writeParcelable(this.f66641j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ESignature;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Config", "ESignatureNavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ESignature extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ESignature> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66645g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Config f66646h;
        public final ActivityAnimation i;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ESignature$Config;", "Landroid/os/Parcelable;", "Documents", "Otp", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ESignature$Config$Documents;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ESignature$Config$Otp;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Config extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ESignature$Config$Documents;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ESignature$Config;", "<init>", "()V", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Documents implements Config {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Documents f66647a = new Documents();

                @NotNull
                public static final Parcelable.Creator<Documents> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Documents.f66647a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Documents[i];
                    }
                }

                private Documents() {
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ESignature$Config$Otp;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ESignature$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Otp implements Config {

                @NotNull
                public static final Parcelable.Creator<Otp> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ESignTask f66648a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f66649b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f66650c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Otp(ESignTask.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Otp[i];
                    }
                }

                public Otp(ESignTask task, String phoneNumber, boolean z) {
                    Intrinsics.checkNotNullParameter(task, "task");
                    Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                    this.f66648a = task;
                    this.f66649b = phoneNumber;
                    this.f66650c = z;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Otp)) {
                        return false;
                    }
                    Otp otp = (Otp) obj2;
                    return this.f66648a == otp.f66648a && Intrinsics.f(this.f66649b, otp.f66649b) && this.f66650c == otp.f66650c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f66650c) + p.a.c(this.f66648a.hashCode() * 31, 31, this.f66649b);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    this.f66648a.writeToParcel(dest, i);
                    dest.writeString(this.f66649b);
                    dest.writeInt(this.f66650c ? 1 : 0);
                }
            }
        }

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ESignature$ESignatureNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ESignatureNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<ESignatureNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66651a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Config f66652b;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ESignatureNavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (Config) parcel.readParcelable(ESignatureNavigationDestination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ESignatureNavigationDestination[i];
                }
            }

            public ESignatureNavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, Config config) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(config, "config");
                this.f66651a = pluginConfiguration;
                this.f66652b = config;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ESignatureNavigationDestination)) {
                    return false;
                }
                ESignatureNavigationDestination eSignatureNavigationDestination = (ESignatureNavigationDestination) obj2;
                return Intrinsics.f(this.f66651a, eSignatureNavigationDestination.f66651a) && Intrinsics.f(this.f66652b, eSignatureNavigationDestination.f66652b);
            }

            public final int hashCode() {
                return this.f66652b.hashCode() + (this.f66651a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66651a.writeToParcel(dest, i);
                dest.writeParcelable(this.f66652b, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ESignature(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (Config) parcel.readParcelable(ESignature.class.getClassLoader()), (ActivityAnimation) parcel.readParcelable(ESignature.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ESignature[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ESignature(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, Config config, ActivityAnimation activityAnimation) {
            super(activityAnimation, new ESignatureNavigationDestination(pluginConfiguration, config), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            Intrinsics.checkNotNullParameter(config, "config");
            this.f66645g = pluginConfiguration;
            this.f66646h = config;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ESignature)) {
                return false;
            }
            ESignature eSignature = (ESignature) obj2;
            return Intrinsics.f(this.f66645g, eSignature.f66645g) && Intrinsics.f(this.f66646h, eSignature.f66646h) && Intrinsics.f(this.i, eSignature.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.f66646h.hashCode() + (this.f66645g.hashCode() * 31)) * 31;
            ActivityAnimation activityAnimation = this.i;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66645g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66646h, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$EmailVerification;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailVerification extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<EmailVerification> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66653g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66654h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$EmailVerification$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66655a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66655a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66655a, ((NavigationDestination) obj2).f66655a);
            }

            public final int hashCode() {
                return this.f66655a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66655a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmailVerification(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(EmailVerification.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailVerification[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmailVerification(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66653g = pluginConfiguration;
            this.f66654h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66654h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EmailVerification)) {
                return false;
            }
            EmailVerification emailVerification = (EmailVerification) obj2;
            return Intrinsics.f(this.f66653g, emailVerification.f66653g) && Intrinsics.f(this.f66654h, emailVerification.f66654h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66653g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66654h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66653g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66654h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$EmailVerificationContinue;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailVerificationContinue extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<EmailVerificationContinue> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f66656g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final PluginPayload f66657h;
        public final ActivityAnimation i;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$EmailVerificationContinue$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66658a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66659b;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, String confirmationCode) {
                Intrinsics.checkNotNullParameter(confirmationCode, "confirmationCode");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66658a = confirmationCode;
                this.f66659b = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66658a, navigationDestination.f66658a) && Intrinsics.f(this.f66659b, navigationDestination.f66659b);
            }

            public final int hashCode() {
                return this.f66659b.hashCode() + (this.f66658a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f66658a);
                this.f66659b.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmailVerificationContinue(parcel.readString(), (PluginPayload) parcel.readParcelable(EmailVerificationContinue.class.getClassLoader()), (ActivityAnimation) parcel.readParcelable(EmailVerificationContinue.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailVerificationContinue[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmailVerificationContinue(String confirmationCode, PluginPayload pluginPayload, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(h.R(pluginPayload, ""), confirmationCode), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(confirmationCode, "confirmationCode");
            Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
            this.f66656g = confirmationCode;
            this.f66657h = pluginPayload;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EmailVerificationContinue)) {
                return false;
            }
            EmailVerificationContinue emailVerificationContinue = (EmailVerificationContinue) obj2;
            return Intrinsics.f(this.f66656g, emailVerificationContinue.f66656g) && Intrinsics.f(this.f66657h, emailVerificationContinue.f66657h) && Intrinsics.f(this.i, emailVerificationContinue.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.f66657h.hashCode() + (this.f66656g.hashCode() * 31)) * 31;
            ActivityAnimation activityAnimation = this.i;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66656g);
            dest.writeParcelable(this.f66657h, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$EmergencyPayment;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "EmergencyPaymentNavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmergencyPayment extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<EmergencyPayment> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final x0 f66660g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66661h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f66662j;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$EmergencyPayment$EmergencyPaymentNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EmergencyPaymentNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<EmergencyPaymentNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final x0 f66663a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66664b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f66665c;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new EmergencyPaymentNavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (x0) parcel.readSerializable(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new EmergencyPaymentNavigationDestination[i];
                }
            }

            public EmergencyPaymentNavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, x0 promptMetadata, String creditId) {
                Intrinsics.checkNotNullParameter(promptMetadata, "promptMetadata");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(creditId, "creditId");
                this.f66663a = promptMetadata;
                this.f66664b = pluginConfiguration;
                this.f66665c = creditId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof EmergencyPaymentNavigationDestination)) {
                    return false;
                }
                EmergencyPaymentNavigationDestination emergencyPaymentNavigationDestination = (EmergencyPaymentNavigationDestination) obj2;
                return Intrinsics.f(this.f66663a, emergencyPaymentNavigationDestination.f66663a) && Intrinsics.f(this.f66664b, emergencyPaymentNavigationDestination.f66664b) && Intrinsics.f(this.f66665c, emergencyPaymentNavigationDestination.f66665c);
            }

            public final int hashCode() {
                return this.f66665c.hashCode() + org.bouncycastle.jcajce.provider.digest.a.c(this.f66664b, this.f66663a.hashCode() * 31, 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f66663a);
                this.f66664b.writeToParcel(dest, i);
                dest.writeString(this.f66665c);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmergencyPayment((x0) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), parcel.readString(), (ActivityAnimation) parcel.readParcelable(EmergencyPayment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmergencyPayment[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmergencyPayment(x0 promptMetadata, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, String creditId, ActivityAnimation activityAnimation) {
            super(activityAnimation, new EmergencyPaymentNavigationDestination(pluginConfiguration, promptMetadata, creditId), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(promptMetadata, "promptMetadata");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            Intrinsics.checkNotNullParameter(creditId, "creditId");
            this.f66660g = promptMetadata;
            this.f66661h = pluginConfiguration;
            this.i = creditId;
            this.f66662j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66662j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EmergencyPayment)) {
                return false;
            }
            EmergencyPayment emergencyPayment = (EmergencyPayment) obj2;
            return Intrinsics.f(this.f66660g, emergencyPayment.f66660g) && Intrinsics.f(this.f66661h, emergencyPayment.f66661h) && Intrinsics.f(this.i, emergencyPayment.i) && Intrinsics.f(this.f66662j, emergencyPayment.f66662j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = p.a.c(org.bouncycastle.jcajce.provider.digest.a.c(this.f66661h, this.f66660g.hashCode() * 31, 31), 31, this.i);
            ActivityAnimation activityAnimation = this.f66662j;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66660g);
            this.f66661h.writeToParcel(dest, i);
            dest.writeString(this.i);
            dest.writeParcelable(this.f66662j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ExpiredPopup;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExpiredPopup extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ExpiredPopup> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66666g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66667h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ExpiredPopup$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66668a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66668a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66668a, ((NavigationDestination) obj2).f66668a);
            }

            public final int hashCode() {
                return this.f66668a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66668a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExpiredPopup(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(ExpiredPopup.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpiredPopup[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpiredPopup(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66666g = pluginConfiguration;
            this.f66667h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66667h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExpiredPopup)) {
                return false;
            }
            ExpiredPopup expiredPopup = (ExpiredPopup) obj2;
            return Intrinsics.f(this.f66666g, expiredPopup.f66666g) && Intrinsics.f(this.f66667h, expiredPopup.f66667h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66666g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66667h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66666g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66667h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Failure;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Failure extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Failure> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a0 f66669g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66670h;
        public final ActivityAnimation i;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Failure$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a0 f66671a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66672b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination((a0) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(a0 metadata, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66671a = metadata;
                this.f66672b = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66671a, navigationDestination.f66671a) && Intrinsics.f(this.f66672b, navigationDestination.f66672b);
            }

            public final int hashCode() {
                return this.f66672b.hashCode() + (this.f66671a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f66671a);
                this.f66672b.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failure((a0) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Failure.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Failure[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(a0 metadata, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(metadata, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66669g = metadata;
            this.f66670h = pluginConfiguration;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj2;
            return Intrinsics.f(this.f66669g, failure.f66669g) && Intrinsics.f(this.f66670h, failure.f66670h) && Intrinsics.f(this.i, failure.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f66670h, this.f66669g.hashCode() * 31, 31);
            ActivityAnimation activityAnimation = this.i;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66669g);
            this.f66670h.writeToParcel(dest, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$FamilyCreditCardSettings;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FamilyCreditCardSettings extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<FamilyCreditCardSettings> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66673g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66674h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$FamilyCreditCardSettings$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66675a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66675a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66675a, ((NavigationDestination) obj2).f66675a);
            }

            public final int hashCode() {
                return this.f66675a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66675a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FamilyCreditCardSettings(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(FamilyCreditCardSettings.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FamilyCreditCardSettings[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FamilyCreditCardSettings(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66673g = pluginConfiguration;
            this.f66674h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66674h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FamilyCreditCardSettings)) {
                return false;
            }
            FamilyCreditCardSettings familyCreditCardSettings = (FamilyCreditCardSettings) obj2;
            return Intrinsics.f(this.f66673g, familyCreditCardSettings.f66673g) && Intrinsics.f(this.f66674h, familyCreditCardSettings.f66674h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66673g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66674h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66673g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66674h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$FinancialEvidence;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FinancialEvidence extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<FinancialEvidence> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66676g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66677h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$FinancialEvidence$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66678a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66678a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66678a, ((NavigationDestination) obj2).f66678a);
            }

            public final int hashCode() {
                return this.f66678a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66678a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FinancialEvidence(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(FinancialEvidence.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FinancialEvidence[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinancialEvidence(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66676g = pluginConfiguration;
            this.f66677h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66677h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FinancialEvidence)) {
                return false;
            }
            FinancialEvidence financialEvidence = (FinancialEvidence) obj2;
            return Intrinsics.f(this.f66676g, financialEvidence.f66676g) && Intrinsics.f(this.f66677h, financialEvidence.f66677h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66676g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66677h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66676g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66677h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$FinancialSituationConfirmation;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FinancialSituationConfirmation extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<FinancialSituationConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66679g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66680h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$FinancialSituationConfirmation$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66681a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66681a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66681a, ((NavigationDestination) obj2).f66681a);
            }

            public final int hashCode() {
                return this.f66681a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66681a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FinancialSituationConfirmation(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(FinancialSituationConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FinancialSituationConfirmation[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinancialSituationConfirmation(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66679g = pluginConfiguration;
            this.f66680h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66680h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FinancialSituationConfirmation)) {
                return false;
            }
            FinancialSituationConfirmation financialSituationConfirmation = (FinancialSituationConfirmation) obj2;
            return Intrinsics.f(this.f66679g, financialSituationConfirmation.f66679g) && Intrinsics.f(this.f66680h, financialSituationConfirmation.f66680h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66679g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66680h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66679g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66680h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Form;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "FormNavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Form extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Form> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66682g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66683h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Form$FormNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FormNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<FormNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66684a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FormNavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FormNavigationDestination[i];
                }
            }

            public FormNavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66684a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof FormNavigationDestination) && Intrinsics.f(this.f66684a, ((FormNavigationDestination) obj2).f66684a);
            }

            public final int hashCode() {
                return this.f66684a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66684a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Form(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Form.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Form[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Form(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new FormNavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66682g = pluginConfiguration;
            this.f66683h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66683h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Form)) {
                return false;
            }
            Form form = (Form) obj2;
            return Intrinsics.f(this.f66682g, form.f66682g) && Intrinsics.f(this.f66683h, form.f66683h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66682g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66683h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66682g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66683h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$HomeInsurance;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HomeInsurance extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<HomeInsurance> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66685g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66686h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$HomeInsurance$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66687a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66687a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66687a, ((NavigationDestination) obj2).f66687a);
            }

            public final int hashCode() {
                return this.f66687a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66687a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HomeInsurance(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(HomeInsurance.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HomeInsurance[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeInsurance(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66685g = pluginConfiguration;
            this.f66686h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66686h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HomeInsurance)) {
                return false;
            }
            HomeInsurance homeInsurance = (HomeInsurance) obj2;
            return Intrinsics.f(this.f66685g, homeInsurance.f66685g) && Intrinsics.f(this.f66686h, homeInsurance.f66686h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66685g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66686h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66685g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66686h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$HowItWorks;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "HowItWorksNavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HowItWorks extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<HowItWorks> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66688g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66689h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$HowItWorks$HowItWorksNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class HowItWorksNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<HowItWorksNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66690a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new HowItWorksNavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new HowItWorksNavigationDestination[i];
                }
            }

            public HowItWorksNavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66690a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof HowItWorksNavigationDestination) && Intrinsics.f(this.f66690a, ((HowItWorksNavigationDestination) obj2).f66690a);
            }

            public final int hashCode() {
                return this.f66690a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66690a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HowItWorks(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(HowItWorks.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HowItWorks[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HowItWorks(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new HowItWorksNavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66688g = pluginConfiguration;
            this.f66689h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66689h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HowItWorks)) {
                return false;
            }
            HowItWorks howItWorks = (HowItWorks) obj2;
            return Intrinsics.f(this.f66688g, howItWorks.f66688g) && Intrinsics.f(this.f66689h, howItWorks.f66689h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66688g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66689h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66688g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66689h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$IllionBankStatement;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IllionBankStatement extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<IllionBankStatement> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66691g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66692h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$IllionBankStatement$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66693a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66693a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66693a, ((NavigationDestination) obj2).f66693a);
            }

            public final int hashCode() {
                return this.f66693a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66693a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IllionBankStatement(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(IllionBankStatement.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IllionBankStatement[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllionBankStatement(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66691g = pluginConfiguration;
            this.f66692h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66692h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IllionBankStatement)) {
                return false;
            }
            IllionBankStatement illionBankStatement = (IllionBankStatement) obj2;
            return Intrinsics.f(this.f66691g, illionBankStatement.f66691g) && Intrinsics.f(this.f66692h, illionBankStatement.f66692h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66691g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66692h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66691g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66692h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$KontomatikIncomeCheck;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "KontomatikIncomeCheckDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class KontomatikIncomeCheck extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<KontomatikIncomeCheck> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f66694g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66695h;
        public final KontomatikIncomeCheckEntryPoint i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f66696j;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$KontomatikIncomeCheck$KontomatikIncomeCheckDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class KontomatikIncomeCheckDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<KontomatikIncomeCheckDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f66697a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66698b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final KontomatikIncomeCheckEntryPoint f66699c;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new KontomatikIncomeCheckDestination(parcel.readInt() != 0, CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (KontomatikIncomeCheckEntryPoint) parcel.readParcelable(KontomatikIncomeCheckDestination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new KontomatikIncomeCheckDestination[i];
                }
            }

            public KontomatikIncomeCheckDestination(boolean z, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, KontomatikIncomeCheckEntryPoint entryPoint) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                this.f66697a = z;
                this.f66698b = pluginConfiguration;
                this.f66699c = entryPoint;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof KontomatikIncomeCheckDestination)) {
                    return false;
                }
                KontomatikIncomeCheckDestination kontomatikIncomeCheckDestination = (KontomatikIncomeCheckDestination) obj2;
                return this.f66697a == kontomatikIncomeCheckDestination.f66697a && Intrinsics.f(this.f66698b, kontomatikIncomeCheckDestination.f66698b) && Intrinsics.f(this.f66699c, kontomatikIncomeCheckDestination.f66699c);
            }

            public final int hashCode() {
                return this.f66699c.hashCode() + org.bouncycastle.jcajce.provider.digest.a.c(this.f66698b, Boolean.hashCode(this.f66697a) * 31, 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f66697a ? 1 : 0);
                this.f66698b.writeToParcel(dest, i);
                dest.writeParcelable(this.f66699c, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new KontomatikIncomeCheck(parcel.readInt() != 0, CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (KontomatikIncomeCheckEntryPoint) parcel.readParcelable(KontomatikIncomeCheck.class.getClassLoader()), (ActivityAnimation) parcel.readParcelable(KontomatikIncomeCheck.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KontomatikIncomeCheck[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KontomatikIncomeCheck(boolean z, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, KontomatikIncomeCheckEntryPoint entryPoint, ActivityAnimation activityAnimation) {
            super(activityAnimation, new KontomatikIncomeCheckDestination(z, pluginConfiguration, entryPoint), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.f66694g = z;
            this.f66695h = pluginConfiguration;
            this.i = entryPoint;
            this.f66696j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66696j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof KontomatikIncomeCheck)) {
                return false;
            }
            KontomatikIncomeCheck kontomatikIncomeCheck = (KontomatikIncomeCheck) obj2;
            return this.f66694g == kontomatikIncomeCheck.f66694g && Intrinsics.f(this.f66695h, kontomatikIncomeCheck.f66695h) && Intrinsics.f(this.i, kontomatikIncomeCheck.i) && Intrinsics.f(this.f66696j, kontomatikIncomeCheck.f66696j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.i.hashCode() + org.bouncycastle.jcajce.provider.digest.a.c(this.f66695h, Boolean.hashCode(this.f66694g) * 31, 31)) * 31;
            ActivityAnimation activityAnimation = this.f66696j;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f66694g ? 1 : 0);
            this.f66695h.writeToParcel(dest, i);
            dest.writeParcelable(this.i, i);
            dest.writeParcelable(this.f66696j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$LinkedAccountsV2;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedAccountsV2 extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<LinkedAccountsV2> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66700g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$LinkedAccountsV2$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66701a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66701a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66701a, ((NavigationDestination) obj2).f66701a);
            }

            public final int hashCode() {
                return this.f66701a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66701a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedAccountsV2(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccountsV2[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkedAccountsV2(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
            super(new NavigationDestination(pluginConfiguration));
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66700g = pluginConfiguration;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LinkedAccountsV2) && Intrinsics.f(this.f66700g, ((LinkedAccountsV2) obj2).f66700g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f66700g.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66700g.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$LinkedAccountsV3;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedAccountsV3 extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<LinkedAccountsV3> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66702g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f66703h;
        public final boolean i;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$LinkedAccountsV3$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66704a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f66705b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f66706c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, boolean z, boolean z3) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66704a = pluginConfiguration;
                this.f66705b = z;
                this.f66706c = z3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66704a, navigationDestination.f66704a) && this.f66705b == navigationDestination.f66705b && this.f66706c == navigationDestination.f66706c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f66706c) + j6.a.c(this.f66704a.hashCode() * 31, 31, this.f66705b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66704a.writeToParcel(dest, i);
                dest.writeInt(this.f66705b ? 1 : 0);
                dest.writeInt(this.f66706c ? 1 : 0);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedAccountsV3(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccountsV3[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkedAccountsV3(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, boolean z, boolean z3) {
            super(new NavigationDestination(pluginConfiguration, z, z3));
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66702g = pluginConfiguration;
            this.f66703h = z;
            this.i = z3;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkedAccountsV3)) {
                return false;
            }
            LinkedAccountsV3 linkedAccountsV3 = (LinkedAccountsV3) obj2;
            return Intrinsics.f(this.f66702g, linkedAccountsV3.f66702g) && this.f66703h == linkedAccountsV3.f66703h && this.i == linkedAccountsV3.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return Boolean.hashCode(this.i) + j6.a.c(this.f66702g.hashCode() * 31, 31, this.f66703h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66702g.writeToParcel(dest, i);
            dest.writeInt(this.f66703h ? 1 : 0);
            dest.writeInt(this.i ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$LoanSelection;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoanSelection extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<LoanSelection> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f66707g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66708h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$LoanSelection$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66709a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66709a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66709a, ((NavigationDestination) obj2).f66709a);
            }

            public final int hashCode() {
                return this.f66709a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66709a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoanSelection(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(LoanSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoanSelection[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoanSelection(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66707g = activityAnimation;
            this.f66708h = pluginConfiguration;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66707g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LoanSelection)) {
                return false;
            }
            LoanSelection loanSelection = (LoanSelection) obj2;
            return Intrinsics.f(this.f66707g, loanSelection.f66707g) && Intrinsics.f(this.f66708h, loanSelection.f66708h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f66707g;
            return this.f66708h.hashCode() + ((activityAnimation == null ? 0 : activityAnimation.hashCode()) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66707g, i);
            this.f66708h.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ManualUnderwriting;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "ManualUnderwritingNavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManualUnderwriting extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ManualUnderwriting> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ManualUnderwritingSummary f66710g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66711h;
        public final ManualUnderwritingScreenConfig i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f66712j;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ManualUnderwriting$ManualUnderwritingNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ManualUnderwritingNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<ManualUnderwritingNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ManualUnderwritingSummary f66713a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66714b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ManualUnderwritingScreenConfig f66715c;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ManualUnderwritingNavigationDestination(ManualUnderwritingSummary.CREATOR.createFromParcel(parcel), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), ManualUnderwritingScreenConfig.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ManualUnderwritingNavigationDestination[i];
                }
            }

            public ManualUnderwritingNavigationDestination(ManualUnderwritingSummary summary, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ManualUnderwritingScreenConfig screenConfig) {
                Intrinsics.checkNotNullParameter(summary, "summary");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                this.f66713a = summary;
                this.f66714b = pluginConfiguration;
                this.f66715c = screenConfig;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ManualUnderwritingNavigationDestination)) {
                    return false;
                }
                ManualUnderwritingNavigationDestination manualUnderwritingNavigationDestination = (ManualUnderwritingNavigationDestination) obj2;
                return Intrinsics.f(this.f66713a, manualUnderwritingNavigationDestination.f66713a) && Intrinsics.f(this.f66714b, manualUnderwritingNavigationDestination.f66714b) && Intrinsics.f(this.f66715c, manualUnderwritingNavigationDestination.f66715c);
            }

            public final int hashCode() {
                return this.f66715c.hashCode() + org.bouncycastle.jcajce.provider.digest.a.c(this.f66714b, this.f66713a.hashCode() * 31, 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66713a.writeToParcel(dest, i);
                this.f66714b.writeToParcel(dest, i);
                this.f66715c.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManualUnderwriting(ManualUnderwritingSummary.CREATOR.createFromParcel(parcel), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), ManualUnderwritingScreenConfig.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(ManualUnderwriting.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManualUnderwriting[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManualUnderwriting(ManualUnderwritingSummary summary, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ManualUnderwritingScreenConfig screenConfig, ActivityAnimation activityAnimation) {
            super(activityAnimation, new ManualUnderwritingNavigationDestination(summary, pluginConfiguration, screenConfig), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f66710g = summary;
            this.f66711h = pluginConfiguration;
            this.i = screenConfig;
            this.f66712j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66712j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ManualUnderwriting)) {
                return false;
            }
            ManualUnderwriting manualUnderwriting = (ManualUnderwriting) obj2;
            return Intrinsics.f(this.f66710g, manualUnderwriting.f66710g) && Intrinsics.f(this.f66711h, manualUnderwriting.f66711h) && Intrinsics.f(this.i, manualUnderwriting.i) && Intrinsics.f(this.f66712j, manualUnderwriting.f66712j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.i.hashCode() + org.bouncycastle.jcajce.provider.digest.a.c(this.f66711h, this.f66710g.hashCode() * 31, 31)) * 31;
            ActivityAnimation activityAnimation = this.f66712j;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66710g.writeToParcel(dest, i);
            this.f66711h.writeToParcel(dest, i);
            this.i.writeToParcel(dest, i);
            dest.writeParcelable(this.f66712j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ManualUnderwritingPopup;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManualUnderwritingPopup extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ManualUnderwritingPopup> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ManualUnderwritingSummary f66716g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66717h;
        public final ManualUnderwritingScreenConfig i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f66718j;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ManualUnderwritingPopup$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ManualUnderwritingSummary f66719a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66720b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ManualUnderwritingScreenConfig f66721c;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(ManualUnderwritingSummary.CREATOR.createFromParcel(parcel), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), ManualUnderwritingScreenConfig.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(ManualUnderwritingSummary summary, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ManualUnderwritingScreenConfig screenConfig) {
                Intrinsics.checkNotNullParameter(summary, "summary");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                this.f66719a = summary;
                this.f66720b = pluginConfiguration;
                this.f66721c = screenConfig;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66719a, navigationDestination.f66719a) && Intrinsics.f(this.f66720b, navigationDestination.f66720b) && Intrinsics.f(this.f66721c, navigationDestination.f66721c);
            }

            public final int hashCode() {
                return this.f66721c.hashCode() + org.bouncycastle.jcajce.provider.digest.a.c(this.f66720b, this.f66719a.hashCode() * 31, 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66719a.writeToParcel(dest, i);
                this.f66720b.writeToParcel(dest, i);
                this.f66721c.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManualUnderwritingPopup(ManualUnderwritingSummary.CREATOR.createFromParcel(parcel), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), ManualUnderwritingScreenConfig.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(ManualUnderwritingPopup.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManualUnderwritingPopup[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManualUnderwritingPopup(ManualUnderwritingSummary summary, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ManualUnderwritingScreenConfig screenConfig, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(summary, pluginConfiguration, screenConfig), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f66716g = summary;
            this.f66717h = pluginConfiguration;
            this.i = screenConfig;
            this.f66718j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66718j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ManualUnderwritingPopup)) {
                return false;
            }
            ManualUnderwritingPopup manualUnderwritingPopup = (ManualUnderwritingPopup) obj2;
            return Intrinsics.f(this.f66716g, manualUnderwritingPopup.f66716g) && Intrinsics.f(this.f66717h, manualUnderwritingPopup.f66717h) && Intrinsics.f(this.i, manualUnderwritingPopup.i) && Intrinsics.f(this.f66718j, manualUnderwritingPopup.f66718j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.i.hashCode() + org.bouncycastle.jcajce.provider.digest.a.c(this.f66717h, this.f66716g.hashCode() * 31, 31)) * 31;
            ActivityAnimation activityAnimation = this.f66718j;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66716g.writeToParcel(dest, i);
            this.f66717h.writeToParcel(dest, i);
            this.i.writeToParcel(dest, i);
            dest.writeParcelable(this.f66718j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ManualUnderwritingTicketor;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "ManualUnderwritingNavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManualUnderwritingTicketor extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ManualUnderwritingTicketor> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final z1 f66722g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66723h;
        public final ManualUnderwritingScreenConfig i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f66724j;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ManualUnderwritingTicketor$ManualUnderwritingNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ManualUnderwritingNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<ManualUnderwritingNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final z1 f66725a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66726b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ManualUnderwritingScreenConfig f66727c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ManualUnderwritingNavigationDestination((z1) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), ManualUnderwritingScreenConfig.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ManualUnderwritingNavigationDestination[i];
                }
            }

            public ManualUnderwritingNavigationDestination(z1 metadata, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ManualUnderwritingScreenConfig screenConfig) {
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                this.f66725a = metadata;
                this.f66726b = pluginConfiguration;
                this.f66727c = screenConfig;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ManualUnderwritingNavigationDestination)) {
                    return false;
                }
                ManualUnderwritingNavigationDestination manualUnderwritingNavigationDestination = (ManualUnderwritingNavigationDestination) obj2;
                return Intrinsics.f(this.f66725a, manualUnderwritingNavigationDestination.f66725a) && Intrinsics.f(this.f66726b, manualUnderwritingNavigationDestination.f66726b) && Intrinsics.f(this.f66727c, manualUnderwritingNavigationDestination.f66727c);
            }

            public final int hashCode() {
                return this.f66727c.hashCode() + org.bouncycastle.jcajce.provider.digest.a.c(this.f66726b, this.f66725a.hashCode() * 31, 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f66725a);
                this.f66726b.writeToParcel(dest, i);
                this.f66727c.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManualUnderwritingTicketor((z1) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), ManualUnderwritingScreenConfig.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(ManualUnderwritingTicketor.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManualUnderwritingTicketor[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManualUnderwritingTicketor(z1 metadata, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ManualUnderwritingScreenConfig screenConfig, ActivityAnimation activityAnimation) {
            super(activityAnimation, new ManualUnderwritingNavigationDestination(metadata, pluginConfiguration, screenConfig), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f66722g = metadata;
            this.f66723h = pluginConfiguration;
            this.i = screenConfig;
            this.f66724j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66724j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ManualUnderwritingTicketor)) {
                return false;
            }
            ManualUnderwritingTicketor manualUnderwritingTicketor = (ManualUnderwritingTicketor) obj2;
            return Intrinsics.f(this.f66722g, manualUnderwritingTicketor.f66722g) && Intrinsics.f(this.f66723h, manualUnderwritingTicketor.f66723h) && Intrinsics.f(this.i, manualUnderwritingTicketor.i) && Intrinsics.f(this.f66724j, manualUnderwritingTicketor.f66724j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.i.hashCode() + org.bouncycastle.jcajce.provider.digest.a.c(this.f66723h, this.f66722g.hashCode() * 31, 31)) * 31;
            ActivityAnimation activityAnimation = this.f66724j;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66722g);
            this.f66723h.writeToParcel(dest, i);
            this.i.writeToParcel(dest, i);
            dest.writeParcelable(this.f66724j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$MortgageOffer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MortgageOffer extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<MortgageOffer> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final hs3.c f66728g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66729h;
        public final hs3.j0 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f66730j;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$MortgageOffer$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final hs3.c f66731a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66732b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final hs3.j0 f66733c;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination((hs3.c) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), hs3.j0.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(hs3.c cVar, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, hs3.j0 initialOfferLayout) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(initialOfferLayout, "initialOfferLayout");
                this.f66731a = cVar;
                this.f66732b = pluginConfiguration;
                this.f66733c = initialOfferLayout;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66731a, navigationDestination.f66731a) && Intrinsics.f(this.f66732b, navigationDestination.f66732b) && this.f66733c == navigationDestination.f66733c;
            }

            public final int hashCode() {
                hs3.c cVar = this.f66731a;
                return this.f66733c.hashCode() + org.bouncycastle.jcajce.provider.digest.a.c(this.f66732b, (cVar == null ? 0 : cVar.hashCode()) * 31, 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f66731a);
                this.f66732b.writeToParcel(dest, i);
                dest.writeString(this.f66733c.name());
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MortgageOffer((hs3.c) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), hs3.j0.valueOf(parcel.readString()), (ActivityAnimation) parcel.readParcelable(MortgageOffer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MortgageOffer[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MortgageOffer(hs3.c cVar, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, hs3.j0 initialOfferLayout, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(cVar, pluginConfiguration, initialOfferLayout), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            Intrinsics.checkNotNullParameter(initialOfferLayout, "initialOfferLayout");
            this.f66728g = cVar;
            this.f66729h = pluginConfiguration;
            this.i = initialOfferLayout;
            this.f66730j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66730j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MortgageOffer)) {
                return false;
            }
            MortgageOffer mortgageOffer = (MortgageOffer) obj2;
            return Intrinsics.f(this.f66728g, mortgageOffer.f66728g) && Intrinsics.f(this.f66729h, mortgageOffer.f66729h) && this.i == mortgageOffer.i && Intrinsics.f(this.f66730j, mortgageOffer.f66730j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            hs3.c cVar = this.f66728g;
            int iHashCode = (this.i.hashCode() + org.bouncycastle.jcajce.provider.digest.a.c(this.f66729h, (cVar == null ? 0 : cVar.hashCode()) * 31, 31)) * 31;
            ActivityAnimation activityAnimation = this.f66730j;
            return iHashCode + (activityAnimation != null ? activityAnimation.hashCode() : 0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66728g);
            this.f66729h.writeToParcel(dest, i);
            dest.writeString(this.i.name());
            dest.writeParcelable(this.f66730j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$MortgageRefinancingDetailsV2;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MortgageRefinancingDetailsV2 extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<MortgageRefinancingDetailsV2> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66734g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66735h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$MortgageRefinancingDetailsV2$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66736a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66736a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66736a, ((NavigationDestination) obj2).f66736a);
            }

            public final int hashCode() {
                return this.f66736a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66736a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MortgageRefinancingDetailsV2(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(MortgageRefinancingDetailsV2.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MortgageRefinancingDetailsV2[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MortgageRefinancingDetailsV2(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66734g = pluginConfiguration;
            this.f66735h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66735h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MortgageRefinancingDetailsV2)) {
                return false;
            }
            MortgageRefinancingDetailsV2 mortgageRefinancingDetailsV2 = (MortgageRefinancingDetailsV2) obj2;
            return Intrinsics.f(this.f66734g, mortgageRefinancingDetailsV2.f66734g) && Intrinsics.f(this.f66735h, mortgageRefinancingDetailsV2.f66735h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66734g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66735h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66734g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66735h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$MortgageSignature;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MortgageSignature extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<MortgageSignature> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final r1 f66737g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66738h;
        public final ActivityAnimation i;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$MortgageSignature$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final r1 f66739a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66740b;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(r1.valueOf(parcel.readString()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(r1 signatureType, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(signatureType, "signatureType");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66739a = signatureType;
                this.f66740b = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return this.f66739a == navigationDestination.f66739a && Intrinsics.f(this.f66740b, navigationDestination.f66740b);
            }

            public final int hashCode() {
                return this.f66740b.hashCode() + (this.f66739a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f66739a.name());
                this.f66740b.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MortgageSignature(r1.valueOf(parcel.readString()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(MortgageSignature.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MortgageSignature[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MortgageSignature(r1 signatureType, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(signatureType, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(signatureType, "signatureType");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66737g = signatureType;
            this.f66738h = pluginConfiguration;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MortgageSignature)) {
                return false;
            }
            MortgageSignature mortgageSignature = (MortgageSignature) obj2;
            return this.f66737g == mortgageSignature.f66737g && Intrinsics.f(this.f66738h, mortgageSignature.f66738h) && Intrinsics.f(this.i, mortgageSignature.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f66738h, this.f66737g.hashCode() * 31, 31);
            ActivityAnimation activityAnimation = this.i;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66737g.name());
            this.f66738h.writeToParcel(dest, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$MortgageSignatureSigned;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MortgageSignatureSigned extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<MortgageSignatureSigned> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66741g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66742h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$MortgageSignatureSigned$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66743a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66743a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66743a, ((NavigationDestination) obj2).f66743a);
            }

            public final int hashCode() {
                return this.f66743a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66743a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MortgageSignatureSigned(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(MortgageSignatureSigned.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MortgageSignatureSigned[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MortgageSignatureSigned(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66741g = pluginConfiguration;
            this.f66742h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66742h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MortgageSignatureSigned)) {
                return false;
            }
            MortgageSignatureSigned mortgageSignatureSigned = (MortgageSignatureSigned) obj2;
            return Intrinsics.f(this.f66741g, mortgageSignatureSigned.f66741g) && Intrinsics.f(this.f66742h, mortgageSignatureSigned.f66742h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66741g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66742h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66741g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66742h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$MortgageValuation;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MortgageValuation extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<MortgageValuation> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f66744g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66745h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$MortgageValuation$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66746a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66746a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66746a, ((NavigationDestination) obj2).f66746a);
            }

            public final int hashCode() {
                return this.f66746a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66746a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MortgageValuation(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(MortgageValuation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MortgageValuation[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MortgageValuation(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66744g = activityAnimation;
            this.f66745h = pluginConfiguration;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66744g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MortgageValuation)) {
                return false;
            }
            MortgageValuation mortgageValuation = (MortgageValuation) obj2;
            return Intrinsics.f(this.f66744g, mortgageValuation.f66744g) && Intrinsics.f(this.f66745h, mortgageValuation.f66745h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f66744g;
            return this.f66745h.hashCode() + ((activityAnimation == null ? 0 : activityAnimation.hashCode()) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66744g, i);
            this.f66745h.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Offer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Offer extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Offer> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditOfferParcel f66747g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final k0 f66748h;
        public final CreditApplicationPluginFlowContract$Configuration i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f66749j;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Offer$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditOfferParcel f66750a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final k0 f66751b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66752c;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditOfferParcel.CREATOR.createFromParcel(parcel), (k0) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditOfferParcel parcel, k0 metadata, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66750a = parcel;
                this.f66751b = metadata;
                this.f66752c = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66750a, navigationDestination.f66750a) && Intrinsics.f(this.f66751b, navigationDestination.f66751b) && Intrinsics.f(this.f66752c, navigationDestination.f66752c);
            }

            public final int hashCode() {
                return this.f66752c.hashCode() + ((this.f66751b.hashCode() + (this.f66750a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66750a.writeToParcel(dest, i);
                dest.writeSerializable(this.f66751b);
                this.f66752c.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Offer(CreditOfferParcel.CREATOR.createFromParcel(parcel), (k0) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Offer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Offer[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Offer(CreditOfferParcel parcel, k0 metadata, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(parcel, metadata, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66747g = parcel;
            this.f66748h = metadata;
            this.i = pluginConfiguration;
            this.f66749j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66749j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Offer)) {
                return false;
            }
            Offer offer = (Offer) obj2;
            return Intrinsics.f(this.f66747g, offer.f66747g) && Intrinsics.f(this.f66748h, offer.f66748h) && Intrinsics.f(this.i, offer.i) && Intrinsics.f(this.f66749j, offer.f66749j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.i, (this.f66748h.hashCode() + (Boolean.hashCode(this.f66747g.f66285a) * 31)) * 31, 31);
            ActivityAnimation activityAnimation = this.f66749j;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66747g.writeToParcel(dest, i);
            dest.writeSerializable(this.f66748h);
            this.i.writeToParcel(dest, i);
            dest.writeParcelable(this.f66749j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OfferV2;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Config", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OfferV2 extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<OfferV2> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Config f66753g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66754h;
        public final ActivityAnimation i;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OfferV2$Config;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "Intro", "Insurance", "Summary", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OfferV2$Config$Insurance;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OfferV2$Config$Intro;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OfferV2$Config$Summary;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Config extends Parcelable, Serializable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OfferV2$Config$Insurance;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OfferV2$Config;", "<init>", "()V", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Insurance implements Config {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Insurance f66755a = new Insurance();

                @NotNull
                public static final Parcelable.Creator<Insurance> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Insurance.f66755a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Insurance[i];
                    }
                }

                private Insurance() {
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OfferV2$Config$Intro;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OfferV2$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Intro implements Config {

                @NotNull
                public static final Parcelable.Creator<Intro> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final m0 f66756a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Intro((m0) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Intro[i];
                    }
                }

                public Intro(m0 metadata) {
                    Intrinsics.checkNotNullParameter(metadata, "metadata");
                    this.f66756a = metadata;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Intro) && Intrinsics.f(this.f66756a, ((Intro) obj2).f66756a);
                }

                public final int hashCode() {
                    return this.f66756a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f66756a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OfferV2$Config$Summary;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OfferV2$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Summary implements Config {

                @NotNull
                public static final Parcelable.Creator<Summary> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final k0 f66757a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Summary((k0) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Summary[i];
                    }
                }

                public Summary(k0 metadata) {
                    Intrinsics.checkNotNullParameter(metadata, "metadata");
                    this.f66757a = metadata;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Summary) && Intrinsics.f(this.f66757a, ((Summary) obj2).f66757a);
                }

                public final int hashCode() {
                    return this.f66757a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f66757a);
                }
            }
        }

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OfferV2$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Config f66758a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66759b;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination((Config) parcel.readParcelable(NavigationDestination.class.getClassLoader()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(Config config, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66758a = config;
                this.f66759b = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66758a, navigationDestination.f66758a) && Intrinsics.f(this.f66759b, navigationDestination.f66759b);
            }

            public final int hashCode() {
                return this.f66759b.hashCode() + (this.f66758a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f66758a, i);
                this.f66759b.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OfferV2((Config) parcel.readParcelable(OfferV2.class.getClassLoader()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(OfferV2.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OfferV2[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OfferV2(Config config, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(config, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66753g = config;
            this.f66754h = pluginConfiguration;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OfferV2)) {
                return false;
            }
            OfferV2 offerV2 = (OfferV2) obj2;
            return Intrinsics.f(this.f66753g, offerV2.f66753g) && Intrinsics.f(this.f66754h, offerV2.f66754h) && Intrinsics.f(this.i, offerV2.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f66754h, this.f66753g.hashCode() * 31, 31);
            ActivityAnimation activityAnimation = this.i;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66753g, i);
            this.f66754h.writeToParcel(dest, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebts;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "OutstandingDebtsNavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OutstandingDebts extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<OutstandingDebts> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66760g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66761h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebts$OutstandingDebtsNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OutstandingDebtsNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<OutstandingDebtsNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66762a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OutstandingDebtsNavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OutstandingDebtsNavigationDestination[i];
                }
            }

            public OutstandingDebtsNavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66762a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OutstandingDebtsNavigationDestination) && Intrinsics.f(this.f66762a, ((OutstandingDebtsNavigationDestination) obj2).f66762a);
            }

            public final int hashCode() {
                return this.f66762a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66762a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OutstandingDebts(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(OutstandingDebts.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OutstandingDebts[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OutstandingDebts(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new OutstandingDebtsNavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66760g = pluginConfiguration;
            this.f66761h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66761h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OutstandingDebts)) {
                return false;
            }
            OutstandingDebts outstandingDebts = (OutstandingDebts) obj2;
            return Intrinsics.f(this.f66760g, outstandingDebts.f66760g) && Intrinsics.f(this.f66761h, outstandingDebts.f66761h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66760g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66761h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66760g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66761h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebtsV2;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Config", "OutstandingDebtsV2NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OutstandingDebtsV2 extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<OutstandingDebtsV2> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66763g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Config f66764h;
        public final ActivityAnimation i;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebtsV2$Config;", "Landroid/os/Parcelable;", "Intro", "DebtsHub", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebtsV2$Config$DebtsHub;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebtsV2$Config$Intro;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Config extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebtsV2$Config$DebtsHub;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebtsV2$Config;", "<init>", "()V", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class DebtsHub implements Config {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final DebtsHub f66765a = new DebtsHub();

                @NotNull
                public static final Parcelable.Creator<DebtsHub> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return DebtsHub.f66765a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new DebtsHub[i];
                    }
                }

                private DebtsHub() {
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebtsV2$Config$Intro;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebtsV2$Config;", "<init>", "()V", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Intro implements Config {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Intro f66766a = new Intro();

                @NotNull
                public static final Parcelable.Creator<Intro> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Intro.f66766a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Intro[i];
                    }
                }

                private Intro() {
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebtsV2$OutstandingDebtsV2NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OutstandingDebtsV2NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<OutstandingDebtsV2NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66767a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Config f66768b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OutstandingDebtsV2NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (Config) parcel.readParcelable(OutstandingDebtsV2NavigationDestination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OutstandingDebtsV2NavigationDestination[i];
                }
            }

            public OutstandingDebtsV2NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, Config config) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(config, "config");
                this.f66767a = pluginConfiguration;
                this.f66768b = config;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OutstandingDebtsV2NavigationDestination)) {
                    return false;
                }
                OutstandingDebtsV2NavigationDestination outstandingDebtsV2NavigationDestination = (OutstandingDebtsV2NavigationDestination) obj2;
                return Intrinsics.f(this.f66767a, outstandingDebtsV2NavigationDestination.f66767a) && Intrinsics.f(this.f66768b, outstandingDebtsV2NavigationDestination.f66768b);
            }

            public final int hashCode() {
                return this.f66768b.hashCode() + (this.f66767a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66767a.writeToParcel(dest, i);
                dest.writeParcelable(this.f66768b, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OutstandingDebtsV2(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (Config) parcel.readParcelable(OutstandingDebtsV2.class.getClassLoader()), (ActivityAnimation) parcel.readParcelable(OutstandingDebtsV2.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OutstandingDebtsV2[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OutstandingDebtsV2(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, Config destinationConfig, ActivityAnimation activityAnimation) {
            super(activityAnimation, new OutstandingDebtsV2NavigationDestination(pluginConfiguration, destinationConfig), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            Intrinsics.checkNotNullParameter(destinationConfig, "destinationConfig");
            this.f66763g = pluginConfiguration;
            this.f66764h = destinationConfig;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OutstandingDebtsV2)) {
                return false;
            }
            OutstandingDebtsV2 outstandingDebtsV2 = (OutstandingDebtsV2) obj2;
            return Intrinsics.f(this.f66763g, outstandingDebtsV2.f66763g) && Intrinsics.f(this.f66764h, outstandingDebtsV2.f66764h) && Intrinsics.f(this.i, outstandingDebtsV2.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.f66764h.hashCode() + (this.f66763g.hashCode() * 31)) * 31;
            ActivityAnimation activityAnimation = this.i;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66763g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66764h, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebtsV3;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OutstandingDebtsV3 extends CreditApplicationKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66769g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OutstandingDebtsV3$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66770a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66770a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66770a, ((NavigationDestination) obj2).f66770a);
            }

            public final int hashCode() {
                return this.f66770a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66770a.writeToParcel(dest, i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OutstandingDebtsV3(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
            super(null, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66769g = pluginConfiguration;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF101813h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OutstandingDebtsV3) && Intrinsics.f(this.f66769g, ((OutstandingDebtsV3) obj2).f66769g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f66769g.hashCode() * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OverdraftOffer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OverdraftOffer extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<OverdraftOffer> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66771g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66772h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$OverdraftOffer$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66773a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66773a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66773a, ((NavigationDestination) obj2).f66773a);
            }

            public final int hashCode() {
                return this.f66773a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66773a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OverdraftOffer(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(OverdraftOffer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OverdraftOffer[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OverdraftOffer(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66771g = pluginConfiguration;
            this.f66772h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66772h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OverdraftOffer)) {
                return false;
            }
            OverdraftOffer overdraftOffer = (OverdraftOffer) obj2;
            return Intrinsics.f(this.f66771g, overdraftOffer.f66771g) && Intrinsics.f(this.f66772h, overdraftOffer.f66772h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66771g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66772h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66771g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66772h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Payment;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Payment extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Payment> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f66774g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66775h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Payment$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66776a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66776a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66776a, ((NavigationDestination) obj2).f66776a);
            }

            public final int hashCode() {
                return this.f66776a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66776a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Payment(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Payment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Payment[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Payment(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66774g = activityAnimation;
            this.f66775h = pluginConfiguration;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66774g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) obj2;
            return Intrinsics.f(this.f66774g, payment.f66774g) && Intrinsics.f(this.f66775h, payment.f66775h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f66774g;
            return this.f66775h.hashCode() + ((activityAnimation == null ? 0 : activityAnimation.hashCode()) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66774g, i);
            this.f66775h.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$PersonalDetails;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonalDetails extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PersonalDetails> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66777g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66778h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$PersonalDetails$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66779a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66779a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66779a, ((NavigationDestination) obj2).f66779a);
            }

            public final int hashCode() {
                return this.f66779a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66779a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PersonalDetails(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(PersonalDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalDetails[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PersonalDetails(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66777g = pluginConfiguration;
            this.f66778h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66778h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PersonalDetails)) {
                return false;
            }
            PersonalDetails personalDetails = (PersonalDetails) obj2;
            return Intrinsics.f(this.f66777g, personalDetails.f66777g) && Intrinsics.f(this.f66778h, personalDetails.f66778h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66777g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66778h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66777g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66778h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$PhotosUpload;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhotosUpload extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PhotosUpload> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66780g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66781h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$PhotosUpload$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66782a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66782a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66782a, ((NavigationDestination) obj2).f66782a);
            }

            public final int hashCode() {
                return this.f66782a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66782a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhotosUpload(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(PhotosUpload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhotosUpload[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhotosUpload(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66780g = pluginConfiguration;
            this.f66781h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66781h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PhotosUpload)) {
                return false;
            }
            PhotosUpload photosUpload = (PhotosUpload) obj2;
            return Intrinsics.f(this.f66780g, photosUpload.f66780g) && Intrinsics.f(this.f66781h, photosUpload.f66781h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66780g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66781h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66780g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66781h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$PlanSelection;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanSelection extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PlanSelection> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f66783g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f66784h;
        public final CreditApplicationPluginFlowContract$Configuration i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f66785j;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$PlanSelection$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66786a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f66787b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66788c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(parcel.readString(), parcel.readString(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(String planDashboardSource, String title, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(planDashboardSource, "planDashboardSource");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66786a = planDashboardSource;
                this.f66787b = title;
                this.f66788c = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66786a, navigationDestination.f66786a) && Intrinsics.f(this.f66787b, navigationDestination.f66787b) && Intrinsics.f(this.f66788c, navigationDestination.f66788c);
            }

            public final int hashCode() {
                return this.f66788c.hashCode() + p.a.c(this.f66786a.hashCode() * 31, 31, this.f66787b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f66786a);
                dest.writeString(this.f66787b);
                this.f66788c.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanSelection(parcel.readString(), parcel.readString(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(PlanSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSelection[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlanSelection(String planDashboardSource, String title, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(planDashboardSource, title, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(planDashboardSource, "planDashboardSource");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66783g = planDashboardSource;
            this.f66784h = title;
            this.i = pluginConfiguration;
            this.f66785j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66785j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanSelection)) {
                return false;
            }
            PlanSelection planSelection = (PlanSelection) obj2;
            return Intrinsics.f(this.f66783g, planSelection.f66783g) && Intrinsics.f(this.f66784h, planSelection.f66784h) && Intrinsics.f(this.i, planSelection.i) && Intrinsics.f(this.f66785j, planSelection.f66785j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.i, p.a.c(this.f66783g.hashCode() * 31, 31, this.f66784h), 31);
            ActivityAnimation activityAnimation = this.f66785j;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66783g);
            dest.writeString(this.f66784h);
            this.i.writeToParcel(dest, i);
            dest.writeParcelable(this.f66785j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$PlanSubscribe;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanSubscribe extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PlanSubscribe> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final IntendedPricingPlan f66789g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66790h;
        public final ActivityAnimation i;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$PlanSubscribe$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IntendedPricingPlan f66791a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66792b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination((IntendedPricingPlan) parcel.readParcelable(NavigationDestination.class.getClassLoader()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(IntendedPricingPlan intendedPricingPlan, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(intendedPricingPlan, "intendedPricingPlan");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66791a = intendedPricingPlan;
                this.f66792b = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66791a, navigationDestination.f66791a) && Intrinsics.f(this.f66792b, navigationDestination.f66792b);
            }

            public final int hashCode() {
                return this.f66792b.hashCode() + (this.f66791a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f66791a, i);
                this.f66792b.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanSubscribe((IntendedPricingPlan) parcel.readParcelable(PlanSubscribe.class.getClassLoader()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(PlanSubscribe.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSubscribe[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlanSubscribe(IntendedPricingPlan intendedPricingPlan, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(intendedPricingPlan, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(intendedPricingPlan, "intendedPricingPlan");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66789g = intendedPricingPlan;
            this.f66790h = pluginConfiguration;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanSubscribe)) {
                return false;
            }
            PlanSubscribe planSubscribe = (PlanSubscribe) obj2;
            return Intrinsics.f(this.f66789g, planSubscribe.f66789g) && Intrinsics.f(this.f66790h, planSubscribe.f66790h) && Intrinsics.f(this.i, planSubscribe.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f66790h, this.f66789g.hashCode() * 31, 31);
            ActivityAnimation activityAnimation = this.i;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66789g, i);
            this.f66790h.writeToParcel(dest, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ProductArticles;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticles extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ProductArticles> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f66793g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f66794h;
        public final w0 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66795j;
        public final ActivityAnimation k;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$ProductArticles$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66796a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f66797b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final w0 f66798c;
            public final CreditApplicationPluginFlowContract$Configuration d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(parcel.readString(), parcel.readString(), (w0) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(String articleName, String str, w0 metadata, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(articleName, "articleName");
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66796a = articleName;
                this.f66797b = str;
                this.f66798c = metadata;
                this.d = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66796a, navigationDestination.f66796a) && Intrinsics.f(this.f66797b, navigationDestination.f66797b) && Intrinsics.f(this.f66798c, navigationDestination.f66798c) && Intrinsics.f(this.d, navigationDestination.d);
            }

            public final int hashCode() {
                int iHashCode = this.f66796a.hashCode() * 31;
                String str = this.f66797b;
                return this.d.hashCode() + ((this.f66798c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f66796a);
                dest.writeString(this.f66797b);
                dest.writeSerializable(this.f66798c);
                this.d.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticles(parcel.readString(), parcel.readString(), (w0) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(ProductArticles.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticles[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductArticles(String articleName, String str, w0 metadata, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(articleName, str, metadata, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(articleName, "articleName");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66793g = articleName;
            this.f66794h = str;
            this.i = metadata;
            this.f66795j = pluginConfiguration;
            this.k = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.k;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductArticles)) {
                return false;
            }
            ProductArticles productArticles = (ProductArticles) obj2;
            return Intrinsics.f(this.f66793g, productArticles.f66793g) && Intrinsics.f(this.f66794h, productArticles.f66794h) && Intrinsics.f(this.i, productArticles.i) && Intrinsics.f(this.f66795j, productArticles.f66795j) && Intrinsics.f(this.k, productArticles.k);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66793g.hashCode() * 31;
            String str = this.f66794h;
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f66795j, (this.i.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
            ActivityAnimation activityAnimation = this.k;
            return iC + (activityAnimation != null ? activityAnimation.hashCode() : 0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66793g);
            dest.writeString(this.f66794h);
            dest.writeSerializable(this.i);
            this.f66795j.writeToParcel(dest, i);
            dest.writeParcelable(this.k, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$RefinancingAccountDetails;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RefinancingAccountDetails extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<RefinancingAccountDetails> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66800g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66801h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$RefinancingAccountDetails$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66802a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66802a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66802a, ((NavigationDestination) obj2).f66802a);
            }

            public final int hashCode() {
                return this.f66802a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66802a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RefinancingAccountDetails(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(RefinancingAccountDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RefinancingAccountDetails[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefinancingAccountDetails(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66800g = pluginConfiguration;
            this.f66801h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66801h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RefinancingAccountDetails)) {
                return false;
            }
            RefinancingAccountDetails refinancingAccountDetails = (RefinancingAccountDetails) obj2;
            return Intrinsics.f(this.f66800g, refinancingAccountDetails.f66800g) && Intrinsics.f(this.f66801h, refinancingAccountDetails.f66801h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66800g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66801h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66800g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66801h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$RefinancingOffer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Config", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RefinancingOffer extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<RefinancingOffer> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66803g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Config f66804h;
        public final ActivityAnimation i;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$RefinancingOffer$Config;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "Setup", "FinalOffer", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$RefinancingOffer$Config$FinalOffer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$RefinancingOffer$Config$Setup;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Config extends Parcelable, Serializable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$RefinancingOffer$Config$FinalOffer;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$RefinancingOffer$Config;", "<init>", "()V", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class FinalOffer implements Config {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final FinalOffer f66805a = new FinalOffer();

                @NotNull
                public static final Parcelable.Creator<FinalOffer> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return FinalOffer.f66805a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new FinalOffer[i];
                    }
                }

                private FinalOffer() {
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$RefinancingOffer$Config$Setup;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$RefinancingOffer$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Setup implements Config {

                @NotNull
                public static final Parcelable.Creator<Setup> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f66806a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Setup(parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Setup[i];
                    }
                }

                public Setup(boolean z) {
                    this.f66806a = z;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Setup) && this.f66806a == ((Setup) obj2).f66806a;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f66806a);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(this.f66806a ? 1 : 0);
                }
            }
        }

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$RefinancingOffer$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66807a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Config f66808b;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (Config) parcel.readParcelable(NavigationDestination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, Config config) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(config, "config");
                this.f66807a = pluginConfiguration;
                this.f66808b = config;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66807a, navigationDestination.f66807a) && Intrinsics.f(this.f66808b, navigationDestination.f66808b);
            }

            public final int hashCode() {
                return this.f66808b.hashCode() + (this.f66807a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66807a.writeToParcel(dest, i);
                dest.writeParcelable(this.f66808b, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RefinancingOffer(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (Config) parcel.readParcelable(RefinancingOffer.class.getClassLoader()), (ActivityAnimation) parcel.readParcelable(RefinancingOffer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RefinancingOffer[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefinancingOffer(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, Config config, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration, config), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            Intrinsics.checkNotNullParameter(config, "config");
            this.f66803g = pluginConfiguration;
            this.f66804h = config;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RefinancingOffer)) {
                return false;
            }
            RefinancingOffer refinancingOffer = (RefinancingOffer) obj2;
            return Intrinsics.f(this.f66803g, refinancingOffer.f66803g) && Intrinsics.f(this.f66804h, refinancingOffer.f66804h) && Intrinsics.f(this.i, refinancingOffer.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.f66804h.hashCode() + (this.f66803g.hashCode() * 31)) * 31;
            ActivityAnimation activityAnimation = this.i;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66803g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66804h, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Rejected;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Rejected extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Rejected> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final l1 f66809g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final g f66810h;
        public final CreditApplicationPluginFlowContract$Configuration i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f66811j;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Rejected$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final l1 f66812a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final g f66813b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66814c;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination((l1) parcel.readSerializable(), g.valueOf(parcel.readString()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(l1 rejectionData, g popupType, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(rejectionData, "rejectionData");
                Intrinsics.checkNotNullParameter(popupType, "popupType");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66812a = rejectionData;
                this.f66813b = popupType;
                this.f66814c = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66812a, navigationDestination.f66812a) && this.f66813b == navigationDestination.f66813b && Intrinsics.f(this.f66814c, navigationDestination.f66814c);
            }

            public final int hashCode() {
                return this.f66814c.hashCode() + ((this.f66813b.hashCode() + (this.f66812a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f66812a);
                dest.writeString(this.f66813b.name());
                this.f66814c.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Rejected((l1) parcel.readSerializable(), g.valueOf(parcel.readString()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Rejected.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Rejected[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rejected(l1 rejectionData, g popupType, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(rejectionData, popupType, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(rejectionData, "rejectionData");
            Intrinsics.checkNotNullParameter(popupType, "popupType");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66809g = rejectionData;
            this.f66810h = popupType;
            this.i = pluginConfiguration;
            this.f66811j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66811j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Rejected)) {
                return false;
            }
            Rejected rejected = (Rejected) obj2;
            return Intrinsics.f(this.f66809g, rejected.f66809g) && this.f66810h == rejected.f66810h && Intrinsics.f(this.i, rejected.i) && Intrinsics.f(this.f66811j, rejected.f66811j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.i, (this.f66810h.hashCode() + (this.f66809g.hashCode() * 31)) * 31, 31);
            ActivityAnimation activityAnimation = this.f66811j;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66809g);
            dest.writeString(this.f66810h.name());
            this.i.writeToParcel(dest, i);
            dest.writeParcelable(this.f66811j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Rollee;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Rollee extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Rollee> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final RolleeSession f66815g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final l0 f66816h;
        public final CreditApplicationPluginFlowContract$Configuration i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f66817j;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Rollee$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RolleeSession f66818a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final l0 f66819b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66820c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(RolleeSession.CREATOR.createFromParcel(parcel), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (l0) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(RolleeSession session, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, l0 l0Var) {
                Intrinsics.checkNotNullParameter(session, "session");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66818a = session;
                this.f66819b = l0Var;
                this.f66820c = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66818a, navigationDestination.f66818a) && Intrinsics.f(this.f66819b, navigationDestination.f66819b) && Intrinsics.f(this.f66820c, navigationDestination.f66820c);
            }

            public final int hashCode() {
                int iHashCode = this.f66818a.hashCode() * 31;
                l0 l0Var = this.f66819b;
                return this.f66820c.hashCode() + ((iHashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66818a.writeToParcel(dest, i);
                dest.writeSerializable(this.f66819b);
                this.f66820c.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Rollee(RolleeSession.CREATOR.createFromParcel(parcel), (l0) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Rollee.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Rollee[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rollee(RolleeSession session, l0 l0Var, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(session, pluginConfiguration, l0Var), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66815g = session;
            this.f66816h = l0Var;
            this.i = pluginConfiguration;
            this.f66817j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66817j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Rollee)) {
                return false;
            }
            Rollee rollee = (Rollee) obj2;
            return Intrinsics.f(this.f66815g, rollee.f66815g) && Intrinsics.f(this.f66816h, rollee.f66816h) && Intrinsics.f(this.i, rollee.i) && Intrinsics.f(this.f66817j, rollee.f66817j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66815g.hashCode() * 31;
            l0 l0Var = this.f66816h;
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.i, (iHashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31, 31);
            ActivityAnimation activityAnimation = this.f66817j;
            return iC + (activityAnimation != null ? activityAnimation.hashCode() : 0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66815g.writeToParcel(dest, i);
            dest.writeSerializable(this.f66816h);
            this.i.writeToParcel(dest, i);
            dest.writeParcelable(this.f66817j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SecurityDeposit;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SecurityDeposit extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<SecurityDeposit> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f66821g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f66822h;
        public final CreditApplicationPluginFlowContract$Configuration i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f66823j;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SecurityDeposit$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f66824a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f66825b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66826c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(parcel.readInt() != 0, parcel.readString(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(boolean z, String facilityId, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66824a = z;
                this.f66825b = facilityId;
                this.f66826c = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return this.f66824a == navigationDestination.f66824a && Intrinsics.f(this.f66825b, navigationDestination.f66825b) && Intrinsics.f(this.f66826c, navigationDestination.f66826c);
            }

            public final int hashCode() {
                return this.f66826c.hashCode() + p.a.c(Boolean.hashCode(this.f66824a) * 31, 31, this.f66825b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f66824a ? 1 : 0);
                dest.writeString(this.f66825b);
                this.f66826c.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SecurityDeposit(parcel.readInt() != 0, parcel.readString(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(SecurityDeposit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SecurityDeposit[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecurityDeposit(boolean z, String facilityId, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(z, facilityId, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66821g = z;
            this.f66822h = facilityId;
            this.i = pluginConfiguration;
            this.f66823j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66823j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SecurityDeposit)) {
                return false;
            }
            SecurityDeposit securityDeposit = (SecurityDeposit) obj2;
            return this.f66821g == securityDeposit.f66821g && Intrinsics.f(this.f66822h, securityDeposit.f66822h) && Intrinsics.f(this.i, securityDeposit.i) && Intrinsics.f(this.f66823j, securityDeposit.f66823j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.i, p.a.c(Boolean.hashCode(this.f66821g) * 31, 31, this.f66822h), 31);
            ActivityAnimation activityAnimation = this.f66823j;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f66821g ? 1 : 0);
            dest.writeString(this.f66822h);
            this.i.writeToParcel(dest, i);
            dest.writeParcelable(this.f66823j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SepaDirectDebit;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SepaDirectDebit extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<SepaDirectDebit> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66827g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66828h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SepaDirectDebit$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66829a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66829a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66829a, ((NavigationDestination) obj2).f66829a);
            }

            public final int hashCode() {
                return this.f66829a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66829a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SepaDirectDebit(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(SepaDirectDebit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SepaDirectDebit[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SepaDirectDebit(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66827g = pluginConfiguration;
            this.f66828h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66828h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SepaDirectDebit)) {
                return false;
            }
            SepaDirectDebit sepaDirectDebit = (SepaDirectDebit) obj2;
            return Intrinsics.f(this.f66827g, sepaDirectDebit.f66827g) && Intrinsics.f(this.f66828h, sepaDirectDebit.f66828h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66827g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66828h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66827g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66828h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SolicitorSelection;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SolicitorSelection extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<SolicitorSelection> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66830g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66831h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SolicitorSelection$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66832a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66832a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66832a, ((NavigationDestination) obj2).f66832a);
            }

            public final int hashCode() {
                return this.f66832a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66832a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SolicitorSelection(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(SolicitorSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SolicitorSelection[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SolicitorSelection(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66830g = pluginConfiguration;
            this.f66831h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66831h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SolicitorSelection)) {
                return false;
            }
            SolicitorSelection solicitorSelection = (SolicitorSelection) obj2;
            return Intrinsics.f(this.f66830g, solicitorSelection.f66830g) && Intrinsics.f(this.f66831h, solicitorSelection.f66831h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66830g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66831h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66830g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66831h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Spinner;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "SpinnerNavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Spinner extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Spinner> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SpinnerConfiguration f66833g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f66834h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66835j;
        public final ActivityAnimation k;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Spinner$SpinnerNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SpinnerNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<SpinnerNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SpinnerConfiguration f66836a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f66837b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f66838c;
            public final CreditApplicationPluginFlowContract$Configuration d;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SpinnerNavigationDestination((SpinnerConfiguration) parcel.readParcelable(SpinnerNavigationDestination.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SpinnerNavigationDestination[i];
                }
            }

            public SpinnerNavigationDestination(SpinnerConfiguration configuration, boolean z, boolean z3, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66836a = configuration;
                this.f66837b = z;
                this.f66838c = z3;
                this.d = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof SpinnerNavigationDestination)) {
                    return false;
                }
                SpinnerNavigationDestination spinnerNavigationDestination = (SpinnerNavigationDestination) obj2;
                return Intrinsics.f(this.f66836a, spinnerNavigationDestination.f66836a) && this.f66837b == spinnerNavigationDestination.f66837b && this.f66838c == spinnerNavigationDestination.f66838c && Intrinsics.f(this.d, spinnerNavigationDestination.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + j6.a.c(j6.a.c(this.f66836a.hashCode() * 31, 31, this.f66837b), 31, this.f66838c);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f66836a, i);
                dest.writeInt(this.f66837b ? 1 : 0);
                dest.writeInt(this.f66838c ? 1 : 0);
                this.d.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Spinner((SpinnerConfiguration) parcel.readParcelable(Spinner.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Spinner.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Spinner[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Spinner(SpinnerConfiguration configuration, boolean z, boolean z3, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new SpinnerNavigationDestination(configuration, z, z3, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66833g = configuration;
            this.f66834h = z;
            this.i = z3;
            this.f66835j = pluginConfiguration;
            this.k = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.k;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Spinner)) {
                return false;
            }
            Spinner spinner = (Spinner) obj2;
            return Intrinsics.f(this.f66833g, spinner.f66833g) && this.f66834h == spinner.f66834h && this.i == spinner.i && Intrinsics.f(this.f66835j, spinner.f66835j) && Intrinsics.f(this.k, spinner.k);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f66835j, j6.a.c(j6.a.c(this.f66833g.hashCode() * 31, 31, this.f66834h), 31, this.i), 31);
            ActivityAnimation activityAnimation = this.k;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66833g, i);
            dest.writeInt(this.f66834h ? 1 : 0);
            dest.writeInt(this.i ? 1 : 0);
            this.f66835j.writeToParcel(dest, i);
            dest.writeParcelable(this.k, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SpousalConsentInitiator;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "SpousalConsentInitiatorNavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SpousalConsentInitiator extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<SpousalConsentInitiator> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66839g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final SpousalConsentInitiatorIntroScreenConfig f66840h;
        public final ActivityAnimation i;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SpousalConsentInitiator$SpousalConsentInitiatorNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SpousalConsentInitiatorNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<SpousalConsentInitiatorNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66841a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SpousalConsentInitiatorIntroScreenConfig f66842b;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SpousalConsentInitiatorNavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (SpousalConsentInitiatorIntroScreenConfig) parcel.readParcelable(SpousalConsentInitiatorNavigationDestination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SpousalConsentInitiatorNavigationDestination[i];
                }
            }

            public SpousalConsentInitiatorNavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, SpousalConsentInitiatorIntroScreenConfig introConfig) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                Intrinsics.checkNotNullParameter(introConfig, "introConfig");
                this.f66841a = pluginConfiguration;
                this.f66842b = introConfig;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof SpousalConsentInitiatorNavigationDestination)) {
                    return false;
                }
                SpousalConsentInitiatorNavigationDestination spousalConsentInitiatorNavigationDestination = (SpousalConsentInitiatorNavigationDestination) obj2;
                return Intrinsics.f(this.f66841a, spousalConsentInitiatorNavigationDestination.f66841a) && Intrinsics.f(this.f66842b, spousalConsentInitiatorNavigationDestination.f66842b);
            }

            public final int hashCode() {
                return this.f66842b.hashCode() + (this.f66841a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66841a.writeToParcel(dest, i);
                dest.writeParcelable(this.f66842b, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SpousalConsentInitiator(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (SpousalConsentInitiatorIntroScreenConfig) parcel.readParcelable(SpousalConsentInitiator.class.getClassLoader()), (ActivityAnimation) parcel.readParcelable(SpousalConsentInitiator.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpousalConsentInitiator[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpousalConsentInitiator(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, SpousalConsentInitiatorIntroScreenConfig introConfig, ActivityAnimation activityAnimation) {
            super(activityAnimation, new SpousalConsentInitiatorNavigationDestination(pluginConfiguration, introConfig), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            Intrinsics.checkNotNullParameter(introConfig, "introConfig");
            this.f66839g = pluginConfiguration;
            this.f66840h = introConfig;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SpousalConsentInitiator)) {
                return false;
            }
            SpousalConsentInitiator spousalConsentInitiator = (SpousalConsentInitiator) obj2;
            return Intrinsics.f(this.f66839g, spousalConsentInitiator.f66839g) && Intrinsics.f(this.f66840h, spousalConsentInitiator.f66840h) && Intrinsics.f(this.i, spousalConsentInitiator.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.f66840h.hashCode() + (this.f66839g.hashCode() * 31)) * 31;
            ActivityAnimation activityAnimation = this.i;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66839g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66840h, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SpousalConsentInitiatorPopup;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SpousalConsentInitiatorPopup extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<SpousalConsentInitiatorPopup> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SpousalConsentInitiatorPopupScreenConfig f66843g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final g f66844h;
        public final CreditApplicationPluginFlowContract$Configuration i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f66845j;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SpousalConsentInitiatorPopup$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SpousalConsentInitiatorPopupScreenConfig f66846a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final g f66847b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66848c;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(SpousalConsentInitiatorPopupScreenConfig.CREATOR.createFromParcel(parcel), g.valueOf(parcel.readString()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(SpousalConsentInitiatorPopupScreenConfig configuration, g popupType, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(popupType, "popupType");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66846a = configuration;
                this.f66847b = popupType;
                this.f66848c = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66846a, navigationDestination.f66846a) && this.f66847b == navigationDestination.f66847b && Intrinsics.f(this.f66848c, navigationDestination.f66848c);
            }

            public final int hashCode() {
                return this.f66848c.hashCode() + ((this.f66847b.hashCode() + (this.f66846a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66846a.writeToParcel(dest, i);
                dest.writeString(this.f66847b.name());
                this.f66848c.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SpousalConsentInitiatorPopup(SpousalConsentInitiatorPopupScreenConfig.CREATOR.createFromParcel(parcel), g.valueOf(parcel.readString()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(SpousalConsentInitiatorPopup.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpousalConsentInitiatorPopup[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpousalConsentInitiatorPopup(SpousalConsentInitiatorPopupScreenConfig configuration, g popupType, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(configuration, popupType, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(popupType, "popupType");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66843g = configuration;
            this.f66844h = popupType;
            this.i = pluginConfiguration;
            this.f66845j = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66845j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SpousalConsentInitiatorPopup)) {
                return false;
            }
            SpousalConsentInitiatorPopup spousalConsentInitiatorPopup = (SpousalConsentInitiatorPopup) obj2;
            return Intrinsics.f(this.f66843g, spousalConsentInitiatorPopup.f66843g) && this.f66844h == spousalConsentInitiatorPopup.f66844h && Intrinsics.f(this.i, spousalConsentInitiatorPopup.i) && Intrinsics.f(this.f66845j, spousalConsentInitiatorPopup.f66845j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.i, (this.f66844h.hashCode() + (this.f66843g.hashCode() * 31)) * 31, 31);
            ActivityAnimation activityAnimation = this.f66845j;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66843g.writeToParcel(dest, i);
            dest.writeString(this.f66844h.name());
            this.i.writeToParcel(dest, i);
            dest.writeParcelable(this.f66845j, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SpousalConsentPartnerPopup;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SpousalConsentPartnerPopup extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<SpousalConsentPartnerPopup> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SpousalConsentPartnerPopupScreenConfig f66850g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66851h;
        public final ActivityAnimation i;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$SpousalConsentPartnerPopup$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SpousalConsentPartnerPopupScreenConfig f66852a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66853b;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination((SpousalConsentPartnerPopupScreenConfig) parcel.readParcelable(NavigationDestination.class.getClassLoader()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(SpousalConsentPartnerPopupScreenConfig configuration, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66852a = configuration;
                this.f66853b = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66852a, navigationDestination.f66852a) && Intrinsics.f(this.f66853b, navigationDestination.f66853b);
            }

            public final int hashCode() {
                return this.f66853b.hashCode() + (this.f66852a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f66852a, i);
                this.f66853b.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SpousalConsentPartnerPopup((SpousalConsentPartnerPopupScreenConfig) parcel.readParcelable(SpousalConsentPartnerPopup.class.getClassLoader()), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(SpousalConsentPartnerPopup.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpousalConsentPartnerPopup[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpousalConsentPartnerPopup(SpousalConsentPartnerPopupScreenConfig configuration, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(configuration, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66850g = configuration;
            this.f66851h = pluginConfiguration;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SpousalConsentPartnerPopup)) {
                return false;
            }
            SpousalConsentPartnerPopup spousalConsentPartnerPopup = (SpousalConsentPartnerPopup) obj2;
            return Intrinsics.f(this.f66850g, spousalConsentPartnerPopup.f66850g) && Intrinsics.f(this.f66851h, spousalConsentPartnerPopup.f66851h) && Intrinsics.f(this.i, spousalConsentPartnerPopup.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f66851h, this.f66850g.hashCode() * 31, 31);
            ActivityAnimation activityAnimation = this.i;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66850g, i);
            this.f66851h.writeToParcel(dest, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$StatusDialog;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatusDialog extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<StatusDialog> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final y1 f66871g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66872h;
        public final ActivityAnimation i;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$StatusDialog$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final y1 f66873a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66874b;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination((y1) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(y1 statusDialogMetadata, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(statusDialogMetadata, "statusDialogMetadata");
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66873a = statusDialogMetadata;
                this.f66874b = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return Intrinsics.f(this.f66873a, navigationDestination.f66873a) && Intrinsics.f(this.f66874b, navigationDestination.f66874b);
            }

            public final int hashCode() {
                return this.f66874b.hashCode() + (this.f66873a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f66873a);
                this.f66874b.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StatusDialog((y1) parcel.readSerializable(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(StatusDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatusDialog[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StatusDialog(y1 statusDialogMetadata, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(statusDialogMetadata, pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(statusDialogMetadata, "statusDialogMetadata");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66871g = statusDialogMetadata;
            this.f66872h = pluginConfiguration;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StatusDialog)) {
                return false;
            }
            StatusDialog statusDialog = (StatusDialog) obj2;
            return Intrinsics.f(this.f66871g, statusDialog.f66871g) && Intrinsics.f(this.f66872h, statusDialog.f66872h) && Intrinsics.f(this.i, statusDialog.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f66872h, this.f66871g.hashCode() * 31, 31);
            ActivityAnimation activityAnimation = this.i;
            return iC + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66871g);
            this.f66872h.writeToParcel(dest, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$UserSelection;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserSelection extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<UserSelection> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66875g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66876h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$UserSelection$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66877a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66877a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66877a, ((NavigationDestination) obj2).f66877a);
            }

            public final int hashCode() {
                return this.f66877a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66877a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UserSelection(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(UserSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UserSelection[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserSelection(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66875g = pluginConfiguration;
            this.f66876h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66876h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UserSelection)) {
                return false;
            }
            UserSelection userSelection = (UserSelection) obj2;
            return Intrinsics.f(this.f66875g, userSelection.f66875g) && Intrinsics.f(this.f66876h, userSelection.f66876h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66875g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66876h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66875g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66876h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$VisiblePrequalification;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VisiblePrequalification extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<VisiblePrequalification> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66878g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66879h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$VisiblePrequalification$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66880a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66880a = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66880a, ((NavigationDestination) obj2).f66880a);
            }

            public final int hashCode() {
                return this.f66880a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66880a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VisiblePrequalification(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(VisiblePrequalification.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VisiblePrequalification[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VisiblePrequalification(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(pluginConfiguration), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66878g = pluginConfiguration;
            this.f66879h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66879h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof VisiblePrequalification)) {
                return false;
            }
            VisiblePrequalification visiblePrequalification = (VisiblePrequalification) obj2;
            return Intrinsics.f(this.f66878g, visiblePrequalification.f66878g) && Intrinsics.f(this.f66879h, visiblePrequalification.f66879h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66878g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66879h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66878g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66879h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$WaitingPopup;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WaitingPopup extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<WaitingPopup> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final WaitingPopupScreenConfig f66881g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f66882h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$WaitingPopup$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WaitingPopupScreenConfig f66883a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(WaitingPopupScreenConfig.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(WaitingPopupScreenConfig screenConfig) {
                Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                this.f66883a = screenConfig;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NavigationDestination) && Intrinsics.f(this.f66883a, ((NavigationDestination) obj2).f66883a);
            }

            public final int hashCode() {
                return this.f66883a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66883a.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WaitingPopup(WaitingPopupScreenConfig.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(WaitingPopup.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WaitingPopup[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitingPopup(WaitingPopupScreenConfig screenConfig, ActivityAnimation activityAnimation) {
            super(activityAnimation, new NavigationDestination(screenConfig), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f66881g = screenConfig;
            this.f66882h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f66882h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WaitingPopup)) {
                return false;
            }
            WaitingPopup waitingPopup = (WaitingPopup) obj2;
            return Intrinsics.f(this.f66881g, waitingPopup.f66881g) && Intrinsics.f(this.f66882h, waitingPopup.f66882h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66881g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f66882h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66881g.writeToParcel(dest, i);
            dest.writeParcelable(this.f66882h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Workflow;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "WorkflowNavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f66884g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f66885h;
        public final ActivityAnimation i;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$Workflow$WorkflowNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class WorkflowNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<WorkflowNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66886a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditApplicationPluginFlowContract$Configuration f66887b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new WorkflowNavigationDestination(CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WorkflowNavigationDestination[i];
                }
            }

            public WorkflowNavigationDestination(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, String str) {
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                this.f66886a = str;
                this.f66887b = pluginConfiguration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof WorkflowNavigationDestination)) {
                    return false;
                }
                WorkflowNavigationDestination workflowNavigationDestination = (WorkflowNavigationDestination) obj2;
                return Intrinsics.f(this.f66886a, workflowNavigationDestination.f66886a) && Intrinsics.f(this.f66887b, workflowNavigationDestination.f66887b);
            }

            public final int hashCode() {
                String str = this.f66886a;
                return this.f66887b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f66886a);
                this.f66887b.writeToParcel(dest, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Workflow(parcel.readString(), CreditApplicationPluginFlowContract$Configuration.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(Workflow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Workflow(String str, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ActivityAnimation activityAnimation) {
            super(activityAnimation, new WorkflowNavigationDestination(pluginConfiguration, str), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f66884g = str;
            this.f66885h = pluginConfiguration;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Workflow)) {
                return false;
            }
            Workflow workflow = (Workflow) obj2;
            return Intrinsics.f(this.f66884g, workflow.f66884g) && Intrinsics.f(this.f66885h, workflow.f66885h) && Intrinsics.f(this.i, workflow.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            String str = this.f66884g;
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f66885h, (str == null ? 0 : str.hashCode()) * 31, 31);
            ActivityAnimation activityAnimation = this.i;
            return iC + (activityAnimation != null ? activityAnimation.hashCode() : 0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66884g);
            this.f66885h.writeToParcel(dest, i);
            dest.writeParcelable(this.i, i);
        }
    }

    public CreditApplicationKompotFeatureConfig(KompotDestination kompotDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 60);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$StartApplication;", "Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "NavigationDestination", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartApplication extends CreditApplicationKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<StartApplication> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final j1 f66854g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final f f66855h;
        public final a1 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final wp3.a f66856j;
        public final d k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f66857l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final yp3.f f66858m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final yp3.c f66859n;
        public final yp3.e o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final b f66860p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f66861q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final IntendedPricingPlan f66862r;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$StartApplication$NavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<NavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final j1 f66863a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final f f66864b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final a1 f66865c;
            public final wp3.a d;
            public final d e;
            public final String f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final yp3.f f66866g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final yp3.c f66867h;
            public final yp3.e i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final b f66868j;
            public final String k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final IntendedPricingPlan f66869l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final String f66870m;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NavigationDestination(j1.valueOf(parcel.readString()), (f) parcel.readSerializable(), (a1) parcel.readSerializable(), wp3.a.valueOf(parcel.readString()), d.valueOf(parcel.readString()), parcel.readString(), yp3.f.valueOf(parcel.readString()), yp3.c.valueOf(parcel.readString()), yp3.e.valueOf(parcel.readString()), b.valueOf(parcel.readString()), parcel.readString(), (IntendedPricingPlan) parcel.readParcelable(NavigationDestination.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NavigationDestination[i];
                }
            }

            public NavigationDestination(j1 productType, f fVar, a1 entryPointPayload, wp3.a activeApplicationStrategy, d productArticleStrategy, String str, yp3.f productIntroStrategy, yp3.c planSelectionStrategy, yp3.e eligibilityStrategy, b kycStrategy, String str2, IntendedPricingPlan intendedPricingPlan, String str3) {
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
                Intrinsics.checkNotNullParameter(activeApplicationStrategy, "activeApplicationStrategy");
                Intrinsics.checkNotNullParameter(productArticleStrategy, "productArticleStrategy");
                Intrinsics.checkNotNullParameter(productIntroStrategy, "productIntroStrategy");
                Intrinsics.checkNotNullParameter(planSelectionStrategy, "planSelectionStrategy");
                Intrinsics.checkNotNullParameter(eligibilityStrategy, "eligibilityStrategy");
                Intrinsics.checkNotNullParameter(kycStrategy, "kycStrategy");
                this.f66863a = productType;
                this.f66864b = fVar;
                this.f66865c = entryPointPayload;
                this.d = activeApplicationStrategy;
                this.e = productArticleStrategy;
                this.f = str;
                this.f66866g = productIntroStrategy;
                this.f66867h = planSelectionStrategy;
                this.i = eligibilityStrategy;
                this.f66868j = kycStrategy;
                this.k = str2;
                this.f66869l = intendedPricingPlan;
                this.f66870m = str3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NavigationDestination)) {
                    return false;
                }
                NavigationDestination navigationDestination = (NavigationDestination) obj2;
                return this.f66863a == navigationDestination.f66863a && Intrinsics.f(this.f66864b, navigationDestination.f66864b) && Intrinsics.f(this.f66865c, navigationDestination.f66865c) && this.d == navigationDestination.d && this.e == navigationDestination.e && Intrinsics.f(this.f, navigationDestination.f) && this.f66866g == navigationDestination.f66866g && this.f66867h == navigationDestination.f66867h && this.i == navigationDestination.i && this.f66868j == navigationDestination.f66868j && Intrinsics.f(this.k, navigationDestination.k) && Intrinsics.f(this.f66869l, navigationDestination.f66869l) && Intrinsics.f(this.f66870m, navigationDestination.f66870m);
            }

            public final int hashCode() {
                int iHashCode = this.f66863a.hashCode() * 31;
                f fVar = this.f66864b;
                int iHashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((this.f66865c.hashCode() + ((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31)) * 31)) * 31;
                String str = this.f;
                int iHashCode3 = (this.f66868j.hashCode() + ((this.i.hashCode() + ((this.f66867h.hashCode() + ((this.f66866g.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
                String str2 = this.k;
                int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                IntendedPricingPlan intendedPricingPlan = this.f66869l;
                int iHashCode5 = (iHashCode4 + (intendedPricingPlan == null ? 0 : intendedPricingPlan.hashCode())) * 31;
                String str3 = this.f66870m;
                return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f66863a.name());
                dest.writeSerializable(this.f66864b);
                dest.writeSerializable(this.f66865c);
                dest.writeString(this.d.name());
                dest.writeString(this.e.name());
                dest.writeString(this.f);
                dest.writeString(this.f66866g.name());
                dest.writeString(this.f66867h.name());
                dest.writeString(this.i.name());
                dest.writeString(this.f66868j.name());
                dest.writeString(this.k);
                dest.writeParcelable(this.f66869l, i);
                dest.writeString(this.f66870m);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StartApplication(j1.valueOf(parcel.readString()), (f) parcel.readSerializable(), (a1) parcel.readSerializable(), wp3.a.valueOf(parcel.readString()), d.valueOf(parcel.readString()), parcel.readString(), yp3.f.valueOf(parcel.readString()), yp3.c.valueOf(parcel.readString()), yp3.e.valueOf(parcel.readString()), b.valueOf(parcel.readString()), parcel.readString(), (IntendedPricingPlan) parcel.readParcelable(StartApplication.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StartApplication[i];
            }
        }

        public /* synthetic */ StartApplication(j1 j1Var, f fVar, a1 a1Var, wp3.a aVar, d dVar, yp3.f fVar2, yp3.c cVar, b bVar, String str, int i) {
            this(j1Var, fVar, a1Var, aVar, dVar, null, (i & 64) != 0 ? yp3.f.SHOW_ALL : fVar2, (i & 128) != 0 ? yp3.c.DEFAULT : cVar, yp3.e.SKIP_ON_TOGGLE_DISABLED, (i & 512) != 0 ? b.DEFAULT : bVar, (i & 1024) != 0 ? null : str, null);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StartApplication)) {
                return false;
            }
            StartApplication startApplication = (StartApplication) obj2;
            return this.f66854g == startApplication.f66854g && Intrinsics.f(this.f66855h, startApplication.f66855h) && Intrinsics.f(this.i, startApplication.i) && this.f66856j == startApplication.f66856j && this.k == startApplication.k && Intrinsics.f(this.f66857l, startApplication.f66857l) && this.f66858m == startApplication.f66858m && this.f66859n == startApplication.f66859n && this.o == startApplication.o && this.f66860p == startApplication.f66860p && Intrinsics.f(this.f66861q, startApplication.f66861q) && Intrinsics.f(this.f66862r, startApplication.f66862r);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f66854g.hashCode() * 31;
            f fVar = this.f66855h;
            int iHashCode2 = (this.k.hashCode() + ((this.f66856j.hashCode() + ((this.i.hashCode() + ((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31)) * 31)) * 31;
            String str = this.f66857l;
            int iHashCode3 = (this.f66860p.hashCode() + ((this.o.hashCode() + ((this.f66859n.hashCode() + ((this.f66858m.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
            String str2 = this.f66861q;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            IntendedPricingPlan intendedPricingPlan = this.f66862r;
            return iHashCode4 + (intendedPricingPlan != null ? intendedPricingPlan.hashCode() : 0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66854g.name());
            dest.writeSerializable(this.f66855h);
            dest.writeSerializable(this.i);
            dest.writeString(this.f66856j.name());
            dest.writeString(this.k.name());
            dest.writeString(this.f66857l);
            dest.writeString(this.f66858m.name());
            dest.writeString(this.f66859n.name());
            dest.writeString(this.o.name());
            dest.writeString(this.f66860p.name());
            dest.writeString(this.f66861q);
            dest.writeParcelable(this.f66862r, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartApplication(j1 productType, f fVar, a1 entryPointPayload, wp3.a activeApplicationStrategy, d productArticleStrategy, String str, yp3.f productIntroStrategy, yp3.c planSelectionStrategy, yp3.e eligibilityStrategy, b kycStrategy, String str2, IntendedPricingPlan intendedPricingPlan) {
            super(new NavigationDestination(productType, fVar, entryPointPayload, activeApplicationStrategy, productArticleStrategy, str, productIntroStrategy, planSelectionStrategy, eligibilityStrategy, kycStrategy, str2, intendedPricingPlan, null));
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
            Intrinsics.checkNotNullParameter(activeApplicationStrategy, "activeApplicationStrategy");
            Intrinsics.checkNotNullParameter(productArticleStrategy, "productArticleStrategy");
            Intrinsics.checkNotNullParameter(productIntroStrategy, "productIntroStrategy");
            Intrinsics.checkNotNullParameter(planSelectionStrategy, "planSelectionStrategy");
            Intrinsics.checkNotNullParameter(eligibilityStrategy, "eligibilityStrategy");
            Intrinsics.checkNotNullParameter(kycStrategy, "kycStrategy");
            this.f66854g = productType;
            this.f66855h = fVar;
            this.i = entryPointPayload;
            this.f66856j = activeApplicationStrategy;
            this.k = productArticleStrategy;
            this.f66857l = str;
            this.f66858m = productIntroStrategy;
            this.f66859n = planSelectionStrategy;
            this.o = eligibilityStrategy;
            this.f66860p = kycStrategy;
            this.f66861q = str2;
            this.f66862r = intendedPricingPlan;
        }
    }
}
