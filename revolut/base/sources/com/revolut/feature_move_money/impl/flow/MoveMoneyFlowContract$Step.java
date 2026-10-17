package com.revolut.feature_move_money.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_crypto_order_flow.api.navigation.FirmPriceDevianceBottomSheetControllerProvider$InputData;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$InputData;
import com.revolut.feature_move_money.impl.automation.flow.MoveMoneyAutomationFlowContract$InputData;
import com.revolut.feature_move_money.impl.flow.delegate.ValidationResult$ConfirmationModalRequired;
import com.revolut.feature_move_money.impl.topup.MoveMoneyTopupScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.move_money.api.model.MoveMoneyReasonConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"com/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Schedule", "MoveAmount", "Topup", "Review", "ScaPrompt", "Reason", "ExchangeGlobalAccessModal", "ConfirmationModal", "Automation", "FirmPriceDeviance", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$Automation;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$ConfirmationModal;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$ExchangeGlobalAccessModal;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$FirmPriceDeviance;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$MoveAmount;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$Reason;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$Review;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$ScaPrompt;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$Schedule;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$Topup;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MoveMoneyFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$Automation;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Automation extends MoveMoneyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Automation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveMoneyAutomationFlowContract$InputData f97350a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Automation(MoveMoneyAutomationFlowContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Automation[i];
            }
        }

        public Automation(MoveMoneyAutomationFlowContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f97350a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Automation) && Intrinsics.f(this.f97350a, ((Automation) obj2).f97350a);
        }

        public final int hashCode() {
            return this.f97350a.f97314a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97350a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$ConfirmationModal;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "ConfirmationModalState", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmationModal extends MoveMoneyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConfirmationModal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConfirmationModalState f97351a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$ConfirmationModal$ConfirmationModalState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ConfirmationModalState implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ConfirmationModalState> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ValidationResult$ConfirmationModalRequired f97352a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final MoveMoneyFlowContract$MoveMoneyProcessState f97353b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f97354c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ConfirmationModalState((ValidationResult$ConfirmationModalRequired) parcel.readParcelable(ConfirmationModalState.class.getClassLoader()), MoveMoneyFlowContract$MoveMoneyProcessState.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ConfirmationModalState[i];
                }
            }

            public ConfirmationModalState(ValidationResult$ConfirmationModalRequired validation, MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyProcessState, String baseScreenButtonTag) {
                Intrinsics.checkNotNullParameter(validation, "validation");
                Intrinsics.checkNotNullParameter(moveMoneyProcessState, "moveMoneyProcessState");
                Intrinsics.checkNotNullParameter(baseScreenButtonTag, "baseScreenButtonTag");
                this.f97352a = validation;
                this.f97353b = moveMoneyProcessState;
                this.f97354c = baseScreenButtonTag;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ConfirmationModalState)) {
                    return false;
                }
                ConfirmationModalState confirmationModalState = (ConfirmationModalState) obj2;
                return Intrinsics.f(this.f97352a, confirmationModalState.f97352a) && Intrinsics.f(this.f97353b, confirmationModalState.f97353b) && Intrinsics.f(this.f97354c, confirmationModalState.f97354c);
            }

            public final int hashCode() {
                return this.f97354c.hashCode() + ((this.f97353b.hashCode() + (this.f97352a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f97352a, i);
                this.f97353b.writeToParcel(dest, i);
                dest.writeString(this.f97354c);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmationModal(ConfirmationModalState.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmationModal[i];
            }
        }

        public ConfirmationModal(ConfirmationModalState confirmationModalState) {
            Intrinsics.checkNotNullParameter(confirmationModalState, "confirmationModalState");
            this.f97351a = confirmationModalState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConfirmationModal) && Intrinsics.f(this.f97351a, ((ConfirmationModal) obj2).f97351a);
        }

        public final int hashCode() {
            return this.f97351a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97351a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$ExchangeGlobalAccessModal;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExchangeGlobalAccessModal extends MoveMoneyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ExchangeGlobalAccessModal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bla.c f97355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MoveMoneyFlowContract$MoveMoneyProcessState f97356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f97357c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExchangeGlobalAccessModal(bla.c.valueOf(parcel.readString()), MoveMoneyFlowContract$MoveMoneyProcessState.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExchangeGlobalAccessModal[i];
            }
        }

        public ExchangeGlobalAccessModal(bla.c predefinedFeatureState, MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyProcessState, String baseScreenButtonTag) {
            Intrinsics.checkNotNullParameter(predefinedFeatureState, "predefinedFeatureState");
            Intrinsics.checkNotNullParameter(moveMoneyProcessState, "moveMoneyProcessState");
            Intrinsics.checkNotNullParameter(baseScreenButtonTag, "baseScreenButtonTag");
            this.f97355a = predefinedFeatureState;
            this.f97356b = moveMoneyProcessState;
            this.f97357c = baseScreenButtonTag;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExchangeGlobalAccessModal)) {
                return false;
            }
            ExchangeGlobalAccessModal exchangeGlobalAccessModal = (ExchangeGlobalAccessModal) obj2;
            return this.f97355a == exchangeGlobalAccessModal.f97355a && Intrinsics.f(this.f97356b, exchangeGlobalAccessModal.f97356b) && Intrinsics.f(this.f97357c, exchangeGlobalAccessModal.f97357c);
        }

        public final int hashCode() {
            return this.f97357c.hashCode() + ((this.f97356b.hashCode() + (this.f97355a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97355a.name());
            this.f97356b.writeToParcel(dest, i);
            dest.writeString(this.f97357c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$FirmPriceDeviance;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FirmPriceDeviance extends MoveMoneyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FirmPriceDeviance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FirmPriceDevianceBottomSheetControllerProvider$InputData f97358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MoveMoneyFlowContract$MoveMoneyProcessState f97359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f97360c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FirmPriceDeviance((FirmPriceDevianceBottomSheetControllerProvider$InputData) parcel.readParcelable(FirmPriceDeviance.class.getClassLoader()), MoveMoneyFlowContract$MoveMoneyProcessState.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FirmPriceDeviance[i];
            }
        }

        public FirmPriceDeviance(FirmPriceDevianceBottomSheetControllerProvider$InputData inputData, MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyProcessState, String baseScreenButtonTag) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(moveMoneyProcessState, "moveMoneyProcessState");
            Intrinsics.checkNotNullParameter(baseScreenButtonTag, "baseScreenButtonTag");
            this.f97358a = inputData;
            this.f97359b = moveMoneyProcessState;
            this.f97360c = baseScreenButtonTag;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FirmPriceDeviance)) {
                return false;
            }
            FirmPriceDeviance firmPriceDeviance = (FirmPriceDeviance) obj2;
            return Intrinsics.f(this.f97358a, firmPriceDeviance.f97358a) && Intrinsics.f(this.f97359b, firmPriceDeviance.f97359b) && Intrinsics.f(this.f97360c, firmPriceDeviance.f97360c);
        }

        public final int hashCode() {
            return this.f97360c.hashCode() + ((this.f97359b.hashCode() + (this.f97358a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97358a, i);
            this.f97359b.writeToParcel(dest, i);
            dest.writeString(this.f97360c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$MoveAmount;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveAmount extends MoveMoneyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MoveAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveAmountScreenContract$InputData f97361a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveAmount((MoveAmountScreenContract$InputData) parcel.readParcelable(MoveAmount.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveAmount[i];
            }
        }

        public MoveAmount(MoveAmountScreenContract$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f97361a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MoveAmount) && Intrinsics.f(this.f97361a, ((MoveAmount) obj2).f97361a);
        }

        public final int hashCode() {
            return this.f97361a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97361a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$Reason;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Reason extends MoveMoneyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Reason> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveMoneyFlowContract$MoveMoneyProcessState f97362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MoveMoneyReasonConfig f97363b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Reason(MoveMoneyFlowContract$MoveMoneyProcessState.CREATOR.createFromParcel(parcel), (MoveMoneyReasonConfig) parcel.readParcelable(Reason.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reason[i];
            }
        }

        public Reason(MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyProcessState, MoveMoneyReasonConfig moveMoneyReasonConfig) {
            Intrinsics.checkNotNullParameter(moveMoneyProcessState, "moveMoneyProcessState");
            Intrinsics.checkNotNullParameter(moveMoneyReasonConfig, "moveMoneyReasonConfig");
            this.f97362a = moveMoneyProcessState;
            this.f97363b = moveMoneyReasonConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Reason)) {
                return false;
            }
            Reason reason = (Reason) obj2;
            return Intrinsics.f(this.f97362a, reason.f97362a) && Intrinsics.f(this.f97363b, reason.f97363b);
        }

        public final int hashCode() {
            return this.f97363b.hashCode() + (this.f97362a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97362a.writeToParcel(dest, i);
            dest.writeParcelable(this.f97363b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$Review;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review extends MoveMoneyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveMoneyFlowContract$MoveMoneyProcessState f97364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OrderQuote f97365b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(MoveMoneyFlowContract$MoveMoneyProcessState.CREATOR.createFromParcel(parcel), (OrderQuote) parcel.readParcelable(Review.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyProcessState, OrderQuote lastQuote) {
            Intrinsics.checkNotNullParameter(moveMoneyProcessState, "moveMoneyProcessState");
            Intrinsics.checkNotNullParameter(lastQuote, "lastQuote");
            this.f97364a = moveMoneyProcessState;
            this.f97365b = lastQuote;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Review)) {
                return false;
            }
            Review review = (Review) obj2;
            return Intrinsics.f(this.f97364a, review.f97364a) && Intrinsics.f(this.f97365b, review.f97365b);
        }

        public final int hashCode() {
            return this.f97365b.hashCode() + (this.f97364a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97364a.writeToParcel(dest, i);
            dest.writeParcelable(this.f97365b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$ScaPrompt;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScaPrompt extends MoveMoneyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ScaPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MoveMoneyFlowContract$MoveMoneyProcessState f97367b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScaPrompt(parcel.readString(), MoveMoneyFlowContract$MoveMoneyProcessState.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScaPrompt[i];
            }
        }

        public ScaPrompt(String legalEntityId, MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyProcessState) {
            Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
            Intrinsics.checkNotNullParameter(moveMoneyProcessState, "moveMoneyProcessState");
            this.f97366a = legalEntityId;
            this.f97367b = moveMoneyProcessState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ScaPrompt)) {
                return false;
            }
            ScaPrompt scaPrompt = (ScaPrompt) obj2;
            return Intrinsics.f(this.f97366a, scaPrompt.f97366a) && Intrinsics.f(this.f97367b, scaPrompt.f97367b);
        }

        public final int hashCode() {
            return this.f97367b.hashCode() + (this.f97366a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97366a);
            this.f97367b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$Schedule;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step;", "<init>", "()V", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Schedule extends MoveMoneyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Schedule f97368a = new Schedule();

        @NotNull
        public static final Parcelable.Creator<Schedule> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Schedule.f97368a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Schedule[i];
            }
        }

        private Schedule() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step$Topup;", "Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Topup extends MoveMoneyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Topup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveMoneyTopupScreenContract$InputData f97369a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Topup(MoveMoneyTopupScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Topup[i];
            }
        }

        public Topup(MoveMoneyTopupScreenContract$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f97369a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Topup) && Intrinsics.f(this.f97369a, ((Topup) obj2).f97369a);
        }

        public final int hashCode() {
            return this.f97369a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97369a.writeToParcel(dest, i);
        }
    }

    private MoveMoneyFlowContract$Step() {
    }
}
