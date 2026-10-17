package com.revolut.feature.topup_screen.impl.flows.topup.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.GooglePayFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.TopupWithNewCardFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.topup_limits.TopUpV2LimitUiModel;
import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.cash_deposit.CashDepositTopupFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.IdealTopUpFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate.MandateTopupFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import io3.o;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we6.k;
import yte.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:$\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001$()*+,-./0123456789:;<=>?@ABCDEFGHIJK¨\u0006L"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Amount", "SelectTopupMethod", "CurrencyPicker", "StoredMethodTopUp", "GooglePayTopup", "CashDepositTopup", "MandateTopup", "CreateMandate", "CardTopup", "ExpiredCardDetails", "TopupWithNewCard", "MoveMoney", "IdealTopUp", "JapaneseRestrictionsDialog", "CashDepositWarningDialog", "ZeroFeeWithInfoDialog", "TopUpLimitsDialog", "UnverifiedCardTopUpDelayDialog", "TopUpLimitsVerificationDialog", "TopUpMultiLimitsVerificationDialog", "CardVerificationRequiredDialog", "UaeCountryLimitsDialog", "BrazilCountryLimitDialog", "NzAkahuLimitDialog", "JapanEasyBankRelinkDialog", "JapanEasyBankAuthorization", "PreselectedInstitutionEasyBankTransfer", "JapanEasyBankTransfer", "CrossBorderEasyBankTransfer", "McyFlow", "CardVerificationWorkflow", "PayNowTopUp", "ExchangeGlobalAccess", "PixSmartTransfer", "PixSmartTransferMandateConfirmation", "BeDrivenFeesBottomSheet", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$Amount;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$BeDrivenFeesBottomSheet;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$BrazilCountryLimitDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CardTopup;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CardVerificationRequiredDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CardVerificationWorkflow;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CashDepositTopup;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CashDepositWarningDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CreateMandate;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CrossBorderEasyBankTransfer;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CurrencyPicker;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$ExchangeGlobalAccess;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$ExpiredCardDetails;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$GooglePayTopup;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$IdealTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$JapanEasyBankAuthorization;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$JapanEasyBankRelinkDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$JapanEasyBankTransfer;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$JapaneseRestrictionsDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$MandateTopup;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$McyFlow;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$MoveMoney;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$NzAkahuLimitDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$PayNowTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$PixSmartTransfer;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$PixSmartTransferMandateConfirmation;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$PreselectedInstitutionEasyBankTransfer;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$SelectTopupMethod;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$StoredMethodTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$TopUpLimitsDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$TopUpLimitsVerificationDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$TopUpMultiLimitsVerificationDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$TopupWithNewCard;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$UaeCountryLimitsDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$UnverifiedCardTopUpDelayDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$ZeroFeeWithInfoDialog;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TopupFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$Amount;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Amount extends TopupFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Amount f90829a = new Amount();

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Amount.f90829a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        private Amount() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$BeDrivenFeesBottomSheet;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BeDrivenFeesBottomSheet extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BeDrivenFeesBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qte.c f90830a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BeDrivenFeesBottomSheet((qte.c) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BeDrivenFeesBottomSheet[i];
            }
        }

        public BeDrivenFeesBottomSheet(qte.c fee2) {
            Intrinsics.checkNotNullParameter(fee2, "fee");
            this.f90830a = fee2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BeDrivenFeesBottomSheet) && Intrinsics.f(this.f90830a, ((BeDrivenFeesBottomSheet) obj2).f90830a);
        }

        public final int hashCode() {
            return this.f90830a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90830a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$BrazilCountryLimitDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BrazilCountryLimitDialog extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BrazilCountryLimitDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f90831a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BrazilCountryLimitDialog.class, parcel, arrayList, iE, 1);
                }
                return new BrazilCountryLimitDialog(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BrazilCountryLimitDialog[i];
            }
        }

        public BrazilCountryLimitDialog(ArrayList limits) {
            Intrinsics.checkNotNullParameter(limits, "limits");
            this.f90831a = limits;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BrazilCountryLimitDialog) && this.f90831a.equals(((BrazilCountryLimitDialog) obj2).f90831a);
        }

        public final int hashCode() {
            return this.f90831a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f90831a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CardTopup;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardTopup extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardTopup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FacadeCardTopupFlowDescriptor$InputData f90832a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardTopup((FacadeCardTopupFlowDescriptor$InputData) parcel.readParcelable(CardTopup.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardTopup[i];
            }
        }

        public CardTopup(FacadeCardTopupFlowDescriptor$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90832a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardTopup) && Intrinsics.f(this.f90832a, ((CardTopup) obj2).f90832a);
        }

        public final int hashCode() {
            return this.f90832a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90832a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CardVerificationRequiredDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardVerificationRequiredDialog extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardVerificationRequiredDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CardDetails f90835c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardVerificationRequiredDialog(parcel.readString(), parcel.readString(), (CardDetails) parcel.readParcelable(CardVerificationRequiredDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardVerificationRequiredDialog[i];
            }
        }

        public CardVerificationRequiredDialog(String cardId, String currencyCode, CardDetails cardDetails) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.f90833a = cardId;
            this.f90834b = currencyCode;
            this.f90835c = cardDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardVerificationRequiredDialog)) {
                return false;
            }
            CardVerificationRequiredDialog cardVerificationRequiredDialog = (CardVerificationRequiredDialog) obj2;
            return Intrinsics.f(this.f90833a, cardVerificationRequiredDialog.f90833a) && Intrinsics.f(this.f90834b, cardVerificationRequiredDialog.f90834b) && Intrinsics.f(this.f90835c, cardVerificationRequiredDialog.f90835c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f90833a.hashCode() * 31, 31, this.f90834b);
            CardDetails cardDetails = this.f90835c;
            return iC + (cardDetails == null ? 0 : cardDetails.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90833a);
            dest.writeString(this.f90834b);
            dest.writeParcelable(this.f90835c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CardVerificationWorkflow;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardVerificationWorkflow extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardVerificationWorkflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f90838c;
        public final CardDetails d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardVerificationWorkflow(parcel.readString(), parcel.readString(), parcel.readString(), (CardDetails) parcel.readParcelable(CardVerificationWorkflow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardVerificationWorkflow[i];
            }
        }

        public CardVerificationWorkflow(String workflowId, String cardId, String currencyCode, CardDetails cardDetails) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.f90836a = workflowId;
            this.f90837b = cardId;
            this.f90838c = currencyCode;
            this.d = cardDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardVerificationWorkflow)) {
                return false;
            }
            CardVerificationWorkflow cardVerificationWorkflow = (CardVerificationWorkflow) obj2;
            return Intrinsics.f(this.f90836a, cardVerificationWorkflow.f90836a) && Intrinsics.f(this.f90837b, cardVerificationWorkflow.f90837b) && Intrinsics.f(this.f90838c, cardVerificationWorkflow.f90838c) && Intrinsics.f(this.d, cardVerificationWorkflow.d);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.f90836a.hashCode() * 31, 31, this.f90837b), 31, this.f90838c);
            CardDetails cardDetails = this.d;
            return iC + (cardDetails == null ? 0 : cardDetails.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90836a);
            dest.writeString(this.f90837b);
            dest.writeString(this.f90838c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CashDepositTopup;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CashDepositTopup extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CashDepositTopup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CashDepositTopupFlowContract$InputData f90839a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashDepositTopup(CashDepositTopupFlowContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashDepositTopup[i];
            }
        }

        public CashDepositTopup(CashDepositTopupFlowContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90839a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CashDepositTopup) && Intrinsics.f(this.f90839a, ((CashDepositTopup) obj2).f90839a);
        }

        public final int hashCode() {
            return this.f90839a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f90839a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CashDepositWarningDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CashDepositWarningDialog extends TopupFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CashDepositWarningDialog f90840a = new CashDepositWarningDialog();

        @NotNull
        public static final Parcelable.Creator<CashDepositWarningDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CashDepositWarningDialog.f90840a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashDepositWarningDialog[i];
            }
        }

        private CashDepositWarningDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CreateMandate;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateMandate extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateMandate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StoredMethodTopUpFlowContract$InputData f90842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o f90843c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateMandate(parcel.readString(), StoredMethodTopUpFlowContract$InputData.CREATOR.createFromParcel(parcel), (o) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateMandate[i];
            }
        }

        public CreateMandate(String institutionId, StoredMethodTopUpFlowContract$InputData storedMethodTopUpInputData, o oVar) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(storedMethodTopUpInputData, "storedMethodTopUpInputData");
            this.f90841a = institutionId;
            this.f90842b = storedMethodTopUpInputData;
            this.f90843c = oVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreateMandate)) {
                return false;
            }
            CreateMandate createMandate = (CreateMandate) obj2;
            return Intrinsics.f(this.f90841a, createMandate.f90841a) && Intrinsics.f(this.f90842b, createMandate.f90842b) && Intrinsics.f(this.f90843c, createMandate.f90843c);
        }

        public final int hashCode() {
            int iHashCode = (this.f90842b.hashCode() + (this.f90841a.hashCode() * 31)) * 31;
            o oVar = this.f90843c;
            return iHashCode + (oVar == null ? 0 : oVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90841a);
            this.f90842b.writeToParcel(dest, i);
            dest.writeSerializable(this.f90843c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CrossBorderEasyBankTransfer;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CrossBorderEasyBankTransfer extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CrossBorderEasyBankTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData f90845b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CrossBorderEasyBankTransfer((dj0.d) parcel.readSerializable(), (CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData) parcel.readParcelable(CrossBorderEasyBankTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CrossBorderEasyBankTransfer[i];
            }
        }

        public CrossBorderEasyBankTransfer(dj0.d amountMoney, CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData) {
            Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
            this.f90844a = amountMoney;
            this.f90845b = crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CrossBorderEasyBankTransfer)) {
                return false;
            }
            CrossBorderEasyBankTransfer crossBorderEasyBankTransfer = (CrossBorderEasyBankTransfer) obj2;
            return Intrinsics.f(this.f90844a, crossBorderEasyBankTransfer.f90844a) && Intrinsics.f(this.f90845b, crossBorderEasyBankTransfer.f90845b);
        }

        public final int hashCode() {
            int iHashCode = this.f90844a.hashCode() * 31;
            CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData = this.f90845b;
            return iHashCode + (crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData == null ? 0 : crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90844a);
            dest.writeParcelable(this.f90845b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$CurrencyPicker;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyPicker extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CurrencyPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f90847b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencyPicker(parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyPicker[i];
            }
        }

        public CurrencyPicker(String currency, List topUpCurrencies) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(topUpCurrencies, "topUpCurrencies");
            this.f90846a = currency;
            this.f90847b = topUpCurrencies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrencyPicker)) {
                return false;
            }
            CurrencyPicker currencyPicker = (CurrencyPicker) obj2;
            return Intrinsics.f(this.f90846a, currencyPicker.f90846a) && Intrinsics.f(this.f90847b, currencyPicker.f90847b);
        }

        public final int hashCode() {
            return this.f90847b.hashCode() + (this.f90846a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90846a);
            dest.writeStringList(this.f90847b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$ExchangeGlobalAccess;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExchangeGlobalAccess extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ExchangeGlobalAccess> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f90848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bla.c f90849b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExchangeGlobalAccess((xi0.b) parcel.readSerializable(), bla.c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExchangeGlobalAccess[i];
            }
        }

        public ExchangeGlobalAccess(xi0.b currency, bla.c predefinedFeatureState) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(predefinedFeatureState, "predefinedFeatureState");
            this.f90848a = currency;
            this.f90849b = predefinedFeatureState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExchangeGlobalAccess)) {
                return false;
            }
            ExchangeGlobalAccess exchangeGlobalAccess = (ExchangeGlobalAccess) obj2;
            return Intrinsics.f(this.f90848a, exchangeGlobalAccess.f90848a) && this.f90849b == exchangeGlobalAccess.f90849b;
        }

        public final int hashCode() {
            return this.f90849b.hashCode() + (this.f90848a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90848a);
            dest.writeString(this.f90849b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$GooglePayTopup;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GooglePayTopup extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<GooglePayTopup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GooglePayFlowDescriptor$InputData f90851a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GooglePayTopup((GooglePayFlowDescriptor$InputData) parcel.readParcelable(GooglePayTopup.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GooglePayTopup[i];
            }
        }

        public GooglePayTopup(GooglePayFlowDescriptor$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90851a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GooglePayTopup) && Intrinsics.f(this.f90851a, ((GooglePayTopup) obj2).f90851a);
        }

        public final int hashCode() {
            return this.f90851a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90851a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$IdealTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IdealTopUp extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<IdealTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IdealTopUpFlowContract$InputData f90852a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IdealTopUp(IdealTopUpFlowContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IdealTopUp[i];
            }
        }

        public IdealTopUp(IdealTopUpFlowContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90852a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IdealTopUp) && Intrinsics.f(this.f90852a, ((IdealTopUp) obj2).f90852a);
        }

        public final int hashCode() {
            return this.f90852a.f90997a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f90852a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$JapanEasyBankAuthorization;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JapanEasyBankAuthorization extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<JapanEasyBankAuthorization> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f90855c;
        public final dj0.d d;
        public final TopUpTarget e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JapanEasyBankAuthorization(parcel.readString(), parcel.readString(), parcel.readString(), (dj0.d) parcel.readSerializable(), (TopUpTarget) parcel.readParcelable(JapanEasyBankAuthorization.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JapanEasyBankAuthorization[i];
            }
        }

        public JapanEasyBankAuthorization(String institutionId, String str, String institutionName, dj0.d topUpAmount, TopUpTarget topUpTarget) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            Intrinsics.checkNotNullParameter(topUpAmount, "topUpAmount");
            Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
            this.f90853a = institutionId;
            this.f90854b = str;
            this.f90855c = institutionName;
            this.d = topUpAmount;
            this.e = topUpTarget;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JapanEasyBankAuthorization)) {
                return false;
            }
            JapanEasyBankAuthorization japanEasyBankAuthorization = (JapanEasyBankAuthorization) obj2;
            return Intrinsics.f(this.f90853a, japanEasyBankAuthorization.f90853a) && Intrinsics.f(this.f90854b, japanEasyBankAuthorization.f90854b) && Intrinsics.f(this.f90855c, japanEasyBankAuthorization.f90855c) && Intrinsics.f(this.d, japanEasyBankAuthorization.d) && Intrinsics.f(this.e, japanEasyBankAuthorization.e);
        }

        public final int hashCode() {
            int iHashCode = this.f90853a.hashCode() * 31;
            String str = this.f90854b;
            return this.e.hashCode() + v7.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f90855c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90853a);
            dest.writeString(this.f90854b);
            dest.writeString(this.f90855c);
            dest.writeSerializable(this.d);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$JapanEasyBankRelinkDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JapanEasyBankRelinkDialog extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<JapanEasyBankRelinkDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dj0.d f90858c;
        public final TopUpTarget d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                return new JapanEasyBankRelinkDialog((TopUpTarget) parcel.readParcelable(JapanEasyBankRelinkDialog.class.getClassLoader()), (dj0.d) parcel.readSerializable(), string, string2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JapanEasyBankRelinkDialog[i];
            }
        }

        public JapanEasyBankRelinkDialog(TopUpTarget topUpTarget, dj0.d topUpAmount, String institutionId, String institutionName) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            Intrinsics.checkNotNullParameter(topUpAmount, "topUpAmount");
            Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
            this.f90856a = institutionId;
            this.f90857b = institutionName;
            this.f90858c = topUpAmount;
            this.d = topUpTarget;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JapanEasyBankRelinkDialog)) {
                return false;
            }
            JapanEasyBankRelinkDialog japanEasyBankRelinkDialog = (JapanEasyBankRelinkDialog) obj2;
            return Intrinsics.f(this.f90856a, japanEasyBankRelinkDialog.f90856a) && Intrinsics.f(this.f90857b, japanEasyBankRelinkDialog.f90857b) && Intrinsics.f(this.f90858c, japanEasyBankRelinkDialog.f90858c) && Intrinsics.f(this.d, japanEasyBankRelinkDialog.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + v7.c(p.a.c(this.f90856a.hashCode() * 31, 31, this.f90857b), 31, this.f90858c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90856a);
            dest.writeString(this.f90857b);
            dest.writeSerializable(this.f90858c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$JapanEasyBankTransfer;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JapanEasyBankTransfer extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<JapanEasyBankTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TopUpContext f90860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data f90861c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JapanEasyBankTransfer((dj0.d) parcel.readSerializable(), (TopUpContext) parcel.readParcelable(JapanEasyBankTransfer.class.getClassLoader()), (EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data) parcel.readParcelable(JapanEasyBankTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JapanEasyBankTransfer[i];
            }
        }

        public JapanEasyBankTransfer(dj0.d amountMoney, TopUpContext topUpContext, EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data preselectedInstitutionData) {
            Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
            Intrinsics.checkNotNullParameter(topUpContext, "topUpContext");
            Intrinsics.checkNotNullParameter(preselectedInstitutionData, "preselectedInstitutionData");
            this.f90859a = amountMoney;
            this.f90860b = topUpContext;
            this.f90861c = preselectedInstitutionData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JapanEasyBankTransfer)) {
                return false;
            }
            JapanEasyBankTransfer japanEasyBankTransfer = (JapanEasyBankTransfer) obj2;
            return Intrinsics.f(this.f90859a, japanEasyBankTransfer.f90859a) && Intrinsics.f(this.f90860b, japanEasyBankTransfer.f90860b) && Intrinsics.f(this.f90861c, japanEasyBankTransfer.f90861c);
        }

        public final int hashCode() {
            return this.f90861c.hashCode() + ((this.f90860b.hashCode() + (this.f90859a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90859a);
            dest.writeParcelable(this.f90860b, i);
            dest.writeParcelable(this.f90861c, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$JapaneseRestrictionsDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class JapaneseRestrictionsDialog extends TopupFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final JapaneseRestrictionsDialog f90862a = new JapaneseRestrictionsDialog();

        @NotNull
        public static final Parcelable.Creator<JapaneseRestrictionsDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return JapaneseRestrictionsDialog.f90862a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JapaneseRestrictionsDialog[i];
            }
        }

        private JapaneseRestrictionsDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$MandateTopup;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MandateTopup extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MandateTopup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MandateTopupFlowContract$InputData f90863a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MandateTopup(MandateTopupFlowContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MandateTopup[i];
            }
        }

        public MandateTopup(MandateTopupFlowContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90863a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MandateTopup) && Intrinsics.f(this.f90863a, ((MandateTopup) obj2).f90863a);
        }

        public final int hashCode() {
            return this.f90863a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f90863a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$McyFlow;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class McyFlow extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<McyFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final McyTopupFlowContract$InputData f90864a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new McyFlow((McyTopupFlowContract$InputData) parcel.readParcelable(McyFlow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new McyFlow[i];
            }
        }

        public McyFlow(McyTopupFlowContract$InputData mcyInputData) {
            Intrinsics.checkNotNullParameter(mcyInputData, "mcyInputData");
            this.f90864a = mcyInputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof McyFlow) && Intrinsics.f(this.f90864a, ((McyFlow) obj2).f90864a);
        }

        public final int hashCode() {
            return this.f90864a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90864a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$MoveMoney;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoney extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MoveMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveMoneyInputData f90865a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoney((MoveMoneyInputData) parcel.readParcelable(MoveMoney.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoney[i];
            }
        }

        public MoveMoney(MoveMoneyInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90865a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MoveMoney) && Intrinsics.f(this.f90865a, ((MoveMoney) obj2).f90865a);
        }

        public final int hashCode() {
            return this.f90865a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90865a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$NzAkahuLimitDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NzAkahuLimitDialog extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NzAkahuLimitDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f90866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90867b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(NzAkahuLimitDialog.class, parcel, arrayList, iE, 1);
                }
                return new NzAkahuLimitDialog(parcel.readString(), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NzAkahuLimitDialog[i];
            }
        }

        public NzAkahuLimitDialog(String methodName, ArrayList limits) {
            Intrinsics.checkNotNullParameter(limits, "limits");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            this.f90866a = limits;
            this.f90867b = methodName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NzAkahuLimitDialog)) {
                return false;
            }
            NzAkahuLimitDialog nzAkahuLimitDialog = (NzAkahuLimitDialog) obj2;
            return this.f90866a.equals(nzAkahuLimitDialog.f90866a) && Intrinsics.f(this.f90867b, nzAkahuLimitDialog.f90867b);
        }

        public final int hashCode() {
            return this.f90867b.hashCode() + (this.f90866a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f90866a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeString(this.f90867b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$PixSmartTransfer;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PixSmartTransfer extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PixSmartTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90869a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PixSmartTransfer((dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PixSmartTransfer[i];
            }
        }

        public PixSmartTransfer(dj0.d amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f90869a = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PixSmartTransfer) && Intrinsics.f(this.f90869a, ((PixSmartTransfer) obj2).f90869a);
        }

        public final int hashCode() {
            return this.f90869a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90869a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$PixSmartTransferMandateConfirmation;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PixSmartTransferMandateConfirmation extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PixSmartTransferMandateConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f90871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f90872c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PixSmartTransferMandateConfirmation((dj0.d) parcel.readSerializable(), k.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PixSmartTransferMandateConfirmation[i];
            }
        }

        public PixSmartTransferMandateConfirmation(dj0.d amount, k context, String institutionId, String institutionName, String str) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.f90870a = amount;
            this.f90871b = context;
            this.f90872c = institutionId;
            this.d = institutionName;
            this.e = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PixSmartTransferMandateConfirmation)) {
                return false;
            }
            PixSmartTransferMandateConfirmation pixSmartTransferMandateConfirmation = (PixSmartTransferMandateConfirmation) obj2;
            return Intrinsics.f(this.f90870a, pixSmartTransferMandateConfirmation.f90870a) && this.f90871b == pixSmartTransferMandateConfirmation.f90871b && Intrinsics.f(this.f90872c, pixSmartTransferMandateConfirmation.f90872c) && Intrinsics.f(this.d, pixSmartTransferMandateConfirmation.d) && Intrinsics.f(this.e, pixSmartTransferMandateConfirmation.e);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c((this.f90871b.hashCode() + (this.f90870a.hashCode() * 31)) * 31, 31, this.f90872c), 31, this.d);
            String str = this.e;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90870a);
            dest.writeString(this.f90871b.name());
            dest.writeString(this.f90872c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$PreselectedInstitutionEasyBankTransfer;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreselectedInstitutionEasyBankTransfer extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PreselectedInstitutionEasyBankTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TopUpContext f90874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EasyBankTransferDescriptor$PreselectedInstitutionInfo f90875c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreselectedInstitutionEasyBankTransfer((dj0.d) parcel.readSerializable(), (TopUpContext) parcel.readParcelable(PreselectedInstitutionEasyBankTransfer.class.getClassLoader()), (EasyBankTransferDescriptor$PreselectedInstitutionInfo) parcel.readParcelable(PreselectedInstitutionEasyBankTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreselectedInstitutionEasyBankTransfer[i];
            }
        }

        public PreselectedInstitutionEasyBankTransfer(dj0.d amountMoney, TopUpContext topUpContext, EasyBankTransferDescriptor$PreselectedInstitutionInfo easyBankTransferDescriptor$PreselectedInstitutionInfo) {
            Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
            Intrinsics.checkNotNullParameter(topUpContext, "topUpContext");
            this.f90873a = amountMoney;
            this.f90874b = topUpContext;
            this.f90875c = easyBankTransferDescriptor$PreselectedInstitutionInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PreselectedInstitutionEasyBankTransfer)) {
                return false;
            }
            PreselectedInstitutionEasyBankTransfer preselectedInstitutionEasyBankTransfer = (PreselectedInstitutionEasyBankTransfer) obj2;
            return Intrinsics.f(this.f90873a, preselectedInstitutionEasyBankTransfer.f90873a) && Intrinsics.f(this.f90874b, preselectedInstitutionEasyBankTransfer.f90874b) && Intrinsics.f(this.f90875c, preselectedInstitutionEasyBankTransfer.f90875c);
        }

        public final int hashCode() {
            int iHashCode = (this.f90874b.hashCode() + (this.f90873a.hashCode() * 31)) * 31;
            EasyBankTransferDescriptor$PreselectedInstitutionInfo easyBankTransferDescriptor$PreselectedInstitutionInfo = this.f90875c;
            return iHashCode + (easyBankTransferDescriptor$PreselectedInstitutionInfo == null ? 0 : easyBankTransferDescriptor$PreselectedInstitutionInfo.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90873a);
            dest.writeParcelable(this.f90874b, i);
            dest.writeParcelable(this.f90875c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$SelectTopupMethod;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectTopupMethod extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectTopupMethod> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f90877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dj0.d f90878c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectTopupMethod((dj0.d) parcel.readSerializable(), parcel.readString(), n.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectTopupMethod[i];
            }
        }

        public SelectTopupMethod(dj0.d dVar, String currency, n contextType) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(contextType, "contextType");
            this.f90876a = currency;
            this.f90877b = contextType;
            this.f90878c = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectTopupMethod)) {
                return false;
            }
            SelectTopupMethod selectTopupMethod = (SelectTopupMethod) obj2;
            return Intrinsics.f(this.f90876a, selectTopupMethod.f90876a) && this.f90877b == selectTopupMethod.f90877b && Intrinsics.f(this.f90878c, selectTopupMethod.f90878c);
        }

        public final int hashCode() {
            int iHashCode = (this.f90877b.hashCode() + (this.f90876a.hashCode() * 31)) * 31;
            dj0.d dVar = this.f90878c;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90876a);
            dest.writeString(this.f90877b.name());
            dest.writeSerializable(this.f90878c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$StoredMethodTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StoredMethodTopUp extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StoredMethodTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StoredMethodTopUpFlowContract$InputData f90879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f90880b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StoredMethodTopUp(StoredMethodTopUpFlowContract$InputData.CREATOR.createFromParcel(parcel), (o) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StoredMethodTopUp[i];
            }
        }

        public StoredMethodTopUp(StoredMethodTopUpFlowContract$InputData inputData, o oVar) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f90879a = inputData;
            this.f90880b = oVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StoredMethodTopUp)) {
                return false;
            }
            StoredMethodTopUp storedMethodTopUp = (StoredMethodTopUp) obj2;
            return Intrinsics.f(this.f90879a, storedMethodTopUp.f90879a) && Intrinsics.f(this.f90880b, storedMethodTopUp.f90880b);
        }

        public final int hashCode() {
            int iHashCode = this.f90879a.hashCode() * 31;
            o oVar = this.f90880b;
            return iHashCode + (oVar == null ? 0 : oVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f90879a.writeToParcel(dest, i);
            dest.writeSerializable(this.f90880b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$TopUpLimitsDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopUpLimitsDialog extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TopUpLimitsDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dj0.d f90882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xi0.b f90883c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TopUpLimitsDialog((dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopUpLimitsDialog[i];
            }
        }

        public TopUpLimitsDialog(dj0.d limitUsedMoney, dj0.d limitMoney, xi0.b currency) {
            Intrinsics.checkNotNullParameter(limitUsedMoney, "limitUsedMoney");
            Intrinsics.checkNotNullParameter(limitMoney, "limitMoney");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f90881a = limitUsedMoney;
            this.f90882b = limitMoney;
            this.f90883c = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TopUpLimitsDialog)) {
                return false;
            }
            TopUpLimitsDialog topUpLimitsDialog = (TopUpLimitsDialog) obj2;
            return Intrinsics.f(this.f90881a, topUpLimitsDialog.f90881a) && Intrinsics.f(this.f90882b, topUpLimitsDialog.f90882b) && Intrinsics.f(this.f90883c, topUpLimitsDialog.f90883c);
        }

        public final int hashCode() {
            return this.f90883c.hashCode() + v7.c(this.f90881a.hashCode() * 31, 31, this.f90882b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90881a);
            dest.writeSerializable(this.f90882b);
            dest.writeSerializable(this.f90883c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$TopUpLimitsVerificationDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopUpLimitsVerificationDialog extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TopUpLimitsVerificationDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dj0.d f90885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xi0.b f90886c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TopUpLimitsVerificationDialog((dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopUpLimitsVerificationDialog[i];
            }
        }

        public TopUpLimitsVerificationDialog(dj0.d limitUsedMoney, dj0.d limitMoney, xi0.b currency) {
            Intrinsics.checkNotNullParameter(limitUsedMoney, "limitUsedMoney");
            Intrinsics.checkNotNullParameter(limitMoney, "limitMoney");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f90884a = limitUsedMoney;
            this.f90885b = limitMoney;
            this.f90886c = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TopUpLimitsVerificationDialog)) {
                return false;
            }
            TopUpLimitsVerificationDialog topUpLimitsVerificationDialog = (TopUpLimitsVerificationDialog) obj2;
            return Intrinsics.f(this.f90884a, topUpLimitsVerificationDialog.f90884a) && Intrinsics.f(this.f90885b, topUpLimitsVerificationDialog.f90885b) && Intrinsics.f(this.f90886c, topUpLimitsVerificationDialog.f90886c);
        }

        public final int hashCode() {
            return this.f90886c.hashCode() + v7.c(this.f90884a.hashCode() * 31, 31, this.f90885b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90884a);
            dest.writeSerializable(this.f90885b);
            dest.writeSerializable(this.f90886c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$TopUpMultiLimitsVerificationDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopUpMultiLimitsVerificationDialog extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TopUpMultiLimitsVerificationDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f90888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f90889c;
        public final CardDetails d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(TopUpMultiLimitsVerificationDialog.class, parcel, arrayList, iE, 1);
                }
                return new TopUpMultiLimitsVerificationDialog(string, arrayList, parcel.readString(), (CardDetails) parcel.readParcelable(TopUpMultiLimitsVerificationDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopUpMultiLimitsVerificationDialog[i];
            }
        }

        public TopUpMultiLimitsVerificationDialog(String cardId, ArrayList appliedLimits, String currencyCode, CardDetails cardDetails) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(appliedLimits, "appliedLimits");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.f90887a = cardId;
            this.f90888b = appliedLimits;
            this.f90889c = currencyCode;
            this.d = cardDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TopUpMultiLimitsVerificationDialog)) {
                return false;
            }
            TopUpMultiLimitsVerificationDialog topUpMultiLimitsVerificationDialog = (TopUpMultiLimitsVerificationDialog) obj2;
            return Intrinsics.f(this.f90887a, topUpMultiLimitsVerificationDialog.f90887a) && this.f90888b.equals(topUpMultiLimitsVerificationDialog.f90888b) && Intrinsics.f(this.f90889c, topUpMultiLimitsVerificationDialog.f90889c) && Intrinsics.f(this.d, topUpMultiLimitsVerificationDialog.d);
        }

        public final int hashCode() {
            int iC = p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f90888b, this.f90887a.hashCode() * 31, 31), 31, this.f90889c);
            CardDetails cardDetails = this.d;
            return iC + (cardDetails == null ? 0 : cardDetails.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90887a);
            Iterator itY = j6.a.y(this.f90888b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeString(this.f90889c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$TopupWithNewCard;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopupWithNewCard extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TopupWithNewCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopupWithNewCardFlowDescriptor$InputData f90890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dj0.d f90891b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TopupWithNewCard((TopupWithNewCardFlowDescriptor$InputData) parcel.readParcelable(TopupWithNewCard.class.getClassLoader()), (dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopupWithNewCard[i];
            }
        }

        public TopupWithNewCard(TopupWithNewCardFlowDescriptor$InputData inputData, dj0.d topUpAmount) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(topUpAmount, "topUpAmount");
            this.f90890a = inputData;
            this.f90891b = topUpAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TopupWithNewCard)) {
                return false;
            }
            TopupWithNewCard topupWithNewCard = (TopupWithNewCard) obj2;
            return Intrinsics.f(this.f90890a, topupWithNewCard.f90890a) && Intrinsics.f(this.f90891b, topupWithNewCard.f90891b);
        }

        public final int hashCode() {
            return this.f90891b.hashCode() + (this.f90890a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90890a, i);
            dest.writeSerializable(this.f90891b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$UaeCountryLimitsDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UaeCountryLimitsDialog extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UaeCountryLimitsDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopUpV2LimitUiModel f90892a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UaeCountryLimitsDialog((TopUpV2LimitUiModel) parcel.readParcelable(UaeCountryLimitsDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UaeCountryLimitsDialog[i];
            }
        }

        public UaeCountryLimitsDialog(TopUpV2LimitUiModel limit) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            this.f90892a = limit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UaeCountryLimitsDialog) && Intrinsics.f(this.f90892a, ((UaeCountryLimitsDialog) obj2).f90892a);
        }

        public final int hashCode() {
            return this.f90892a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90892a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$UnverifiedCardTopUpDelayDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnverifiedCardTopUpDelayDialog extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UnverifiedCardTopUpDelayDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SelectedMethod.StoredMethod.Card f90893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dj0.d f90894b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnverifiedCardTopUpDelayDialog(SelectedMethod.StoredMethod.Card.CREATOR.createFromParcel(parcel), (dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnverifiedCardTopUpDelayDialog[i];
            }
        }

        public UnverifiedCardTopUpDelayDialog(SelectedMethod.StoredMethod.Card selectedCard, dj0.d amount) {
            Intrinsics.checkNotNullParameter(selectedCard, "selectedCard");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f90893a = selectedCard;
            this.f90894b = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UnverifiedCardTopUpDelayDialog)) {
                return false;
            }
            UnverifiedCardTopUpDelayDialog unverifiedCardTopUpDelayDialog = (UnverifiedCardTopUpDelayDialog) obj2;
            return Intrinsics.f(this.f90893a, unverifiedCardTopUpDelayDialog.f90893a) && Intrinsics.f(this.f90894b, unverifiedCardTopUpDelayDialog.f90894b);
        }

        public final int hashCode() {
            return this.f90894b.hashCode() + (this.f90893a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f90893a.writeToParcel(dest, i);
            dest.writeSerializable(this.f90894b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$ZeroFeeWithInfoDialog;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ZeroFeeWithInfoDialog extends TopupFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ZeroFeeWithInfoDialog f90895a = new ZeroFeeWithInfoDialog();

        @NotNull
        public static final Parcelable.Creator<ZeroFeeWithInfoDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ZeroFeeWithInfoDialog.f90895a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ZeroFeeWithInfoDialog[i];
            }
        }

        private ZeroFeeWithInfoDialog() {
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

    private TopupFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$ExpiredCardDetails;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExpiredCardDetails extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ExpiredCardDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90850a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExpiredCardDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpiredCardDetails[i];
            }
        }

        public ExpiredCardDetails(String str) {
            this.f90850a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExpiredCardDetails) && Intrinsics.f(this.f90850a, ((ExpiredCardDetails) obj2).f90850a);
        }

        public final int hashCode() {
            String str = this.f90850a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90850a);
        }

        public ExpiredCardDetails() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step$PayNowTopUp;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PayNowTopUp extends TopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PayNowTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f90868a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PayNowTopUp((dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayNowTopUp[i];
            }
        }

        public PayNowTopUp(dj0.d dVar) {
            this.f90868a = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PayNowTopUp) && Intrinsics.f(this.f90868a, ((PayNowTopUp) obj2).f90868a);
        }

        public final int hashCode() {
            dj0.d dVar = this.f90868a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90868a);
        }

        public PayNowTopUp() {
            this(null);
        }
    }
}
