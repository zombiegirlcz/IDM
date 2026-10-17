package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount;

import android.os.Parcel;
import android.os.Parcelable;
import b8k.e;
import bla.c;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CurrencyChooser", "DualCurrencyChooser", "FeesDisclaimerBottomDialog", "WarningBottomDialog", "ExchangeGlobalAccessStep", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep$CurrencyChooser;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep$DualCurrencyChooser;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep$ExchangeGlobalAccessStep;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep$FeesDisclaimerBottomDialog;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep$WarningBottomDialog;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentLinksAmountScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep$CurrencyChooser;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyChooser implements PaymentLinksAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CurrencyChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CurrencyChooserFlowDestination.InputData f102202a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencyChooser((CurrencyChooserFlowDestination.InputData) parcel.readParcelable(CurrencyChooser.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyChooser[i];
            }
        }

        public CurrencyChooser(CurrencyChooserFlowDestination.InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f102202a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CurrencyChooser) && Intrinsics.f(this.f102202a, ((CurrencyChooser) obj2).f102202a);
        }

        public final int hashCode() {
            return this.f102202a.f99473a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102202a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep$DualCurrencyChooser;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DualCurrencyChooser implements PaymentLinksAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DualCurrencyChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DualChooserContract$InputData f102203a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DualCurrencyChooser((DualChooserContract$InputData) parcel.readParcelable(DualCurrencyChooser.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DualCurrencyChooser[i];
            }
        }

        public DualCurrencyChooser(DualChooserContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f102203a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DualCurrencyChooser) && Intrinsics.f(this.f102203a, ((DualCurrencyChooser) obj2).f102203a);
        }

        public final int hashCode() {
            return this.f102203a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102203a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep$ExchangeGlobalAccessStep;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExchangeGlobalAccessStep implements PaymentLinksAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ExchangeGlobalAccessStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f102204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f102205b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExchangeGlobalAccessStep(e.valueOf(parcel.readString()), c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExchangeGlobalAccessStep[i];
            }
        }

        public ExchangeGlobalAccessStep(e version, c predefinedFeatureState) {
            Intrinsics.checkNotNullParameter(predefinedFeatureState, "predefinedFeatureState");
            Intrinsics.checkNotNullParameter(version, "version");
            this.f102204a = predefinedFeatureState;
            this.f102205b = version;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExchangeGlobalAccessStep)) {
                return false;
            }
            ExchangeGlobalAccessStep exchangeGlobalAccessStep = (ExchangeGlobalAccessStep) obj2;
            return this.f102204a == exchangeGlobalAccessStep.f102204a && this.f102205b == exchangeGlobalAccessStep.f102205b;
        }

        public final int hashCode() {
            return this.f102205b.hashCode() + (this.f102204a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102204a.name());
            dest.writeString(this.f102205b.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep$FeesDisclaimerBottomDialog;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep;", "<init>", "()V", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FeesDisclaimerBottomDialog implements PaymentLinksAmountScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FeesDisclaimerBottomDialog f102206a = new FeesDisclaimerBottomDialog();

        @NotNull
        public static final Parcelable.Creator<FeesDisclaimerBottomDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FeesDisclaimerBottomDialog.f102206a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeesDisclaimerBottomDialog[i];
            }
        }

        private FeesDisclaimerBottomDialog() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep$WarningBottomDialog;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/amount/PaymentLinksAmountScreenContract$ModalStep;", "<init>", "()V", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WarningBottomDialog implements PaymentLinksAmountScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WarningBottomDialog f102207a = new WarningBottomDialog();

        @NotNull
        public static final Parcelable.Creator<WarningBottomDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WarningBottomDialog.f102207a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WarningBottomDialog[i];
            }
        }

        private WarningBottomDialog() {
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
