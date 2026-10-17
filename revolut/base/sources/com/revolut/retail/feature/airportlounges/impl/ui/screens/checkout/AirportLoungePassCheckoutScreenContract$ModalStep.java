package com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.revpay.CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import svi.i0;
import svi.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RevPointsInfo", "RevPayPocketSelection", "ExchangeBreakdown", "Entries", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ModalStep$Entries;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ModalStep$ExchangeBreakdown;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ModalStep$RevPayPocketSelection;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ModalStep$RevPointsInfo;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AirportLoungePassCheckoutScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ModalStep$Entries;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Entries implements AirportLoungePassCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Entries> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f99049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i0 f99050b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Entries(y.valueOf(parcel.readString()), (i0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Entries[i];
            }
        }

        public Entries(y passType, i0 pricing) {
            Intrinsics.checkNotNullParameter(passType, "passType");
            Intrinsics.checkNotNullParameter(pricing, "pricing");
            this.f99049a = passType;
            this.f99050b = pricing;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Entries)) {
                return false;
            }
            Entries entries = (Entries) obj2;
            return this.f99049a == entries.f99049a && Intrinsics.f(this.f99050b, entries.f99050b);
        }

        public final int hashCode() {
            return this.f99050b.hashCode() + (this.f99049a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99049a.name());
            dest.writeSerializable(this.f99050b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ModalStep$ExchangeBreakdown;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExchangeBreakdown implements AirportLoungePassCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ExchangeBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData f99051a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExchangeBreakdown(CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExchangeBreakdown[i];
            }
        }

        public ExchangeBreakdown(CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData breakdownData) {
            Intrinsics.checkNotNullParameter(breakdownData, "breakdownData");
            this.f99051a = breakdownData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExchangeBreakdown) && Intrinsics.f(this.f99051a, ((ExchangeBreakdown) obj2).f99051a);
        }

        public final int hashCode() {
            return this.f99051a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99051a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ModalStep$RevPayPocketSelection;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPayPocketSelection implements AirportLoungePassCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevPayPocketSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f99052a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPayPocketSelection((dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPayPocketSelection[i];
            }
        }

        public RevPayPocketSelection(dj0.d originalPrice) {
            Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
            this.f99052a = originalPrice;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPayPocketSelection) && Intrinsics.f(this.f99052a, ((RevPayPocketSelection) obj2).f99052a);
        }

        public final int hashCode() {
            return this.f99052a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99052a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ModalStep$RevPointsInfo;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreenContract$ModalStep;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsInfo implements AirportLoungePassCheckoutScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsInfo f99053a = new RevPointsInfo();

        @NotNull
        public static final Parcelable.Creator<RevPointsInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsInfo.f99053a;
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
