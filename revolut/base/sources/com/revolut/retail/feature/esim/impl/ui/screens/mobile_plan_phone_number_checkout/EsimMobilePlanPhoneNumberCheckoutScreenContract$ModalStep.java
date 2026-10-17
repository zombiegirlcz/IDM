package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPriceBreakdown;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RevPayPocketSelection", "ExchangeBreakdown", "RevPointsInfo", "PhoneNumberPriceBreakdown", "PayNowInfo", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep$ExchangeBreakdown;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep$PayNowInfo;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep$PhoneNumberPriceBreakdown;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep$RevPayPocketSelection;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep$RevPointsInfo;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep$ExchangeBreakdown;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExchangeBreakdown implements EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ExchangeBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimMobilePlanPhoneNumberCheckoutScreenContract$ExchangeBreakdownData f101373a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExchangeBreakdown(EsimMobilePlanPhoneNumberCheckoutScreenContract$ExchangeBreakdownData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExchangeBreakdown[i];
            }
        }

        public ExchangeBreakdown(EsimMobilePlanPhoneNumberCheckoutScreenContract$ExchangeBreakdownData breakdownData) {
            Intrinsics.checkNotNullParameter(breakdownData, "breakdownData");
            this.f101373a = breakdownData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExchangeBreakdown) && Intrinsics.f(this.f101373a, ((ExchangeBreakdown) obj2).f101373a);
        }

        public final int hashCode() {
            return this.f101373a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f101373a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep$PayNowInfo;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PayNowInfo implements EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayNowInfo f101374a = new PayNowInfo();

        @NotNull
        public static final Parcelable.Creator<PayNowInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PayNowInfo.f101374a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayNowInfo[i];
            }
        }

        private PayNowInfo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep$PhoneNumberPriceBreakdown;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneNumberPriceBreakdown implements EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PhoneNumberPriceBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimPhoneNumberPriceBreakdown f101375a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhoneNumberPriceBreakdown((EsimPhoneNumberPriceBreakdown) parcel.readParcelable(PhoneNumberPriceBreakdown.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneNumberPriceBreakdown[i];
            }
        }

        public PhoneNumberPriceBreakdown(EsimPhoneNumberPriceBreakdown phoneNumberPriceBreakdown) {
            Intrinsics.checkNotNullParameter(phoneNumberPriceBreakdown, "phoneNumberPriceBreakdown");
            this.f101375a = phoneNumberPriceBreakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PhoneNumberPriceBreakdown) && Intrinsics.f(this.f101375a, ((PhoneNumberPriceBreakdown) obj2).f101375a);
        }

        public final int hashCode() {
            return this.f101375a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101375a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep$RevPayPocketSelection;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPayPocketSelection implements EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevPayPocketSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f101376a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPayPocketSelection((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPayPocketSelection[i];
            }
        }

        public RevPayPocketSelection(d originalPrice) {
            Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
            this.f101376a = originalPrice;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPayPocketSelection) && Intrinsics.f(this.f101376a, ((RevPayPocketSelection) obj2).f101376a);
        }

        public final int hashCode() {
            return this.f101376a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f101376a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep$RevPointsInfo;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsInfo implements EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsInfo f101377a = new RevPointsInfo();

        @NotNull
        public static final Parcelable.Creator<RevPointsInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsInfo.f101377a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsInfo[i];
            }
        }

        private RevPointsInfo() {
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
