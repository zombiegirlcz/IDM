package com.revolut.retail.feature.esim.impl.ui.screens.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimAutoRenewalTerms;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AutoRenewalInfo", "RevPayPocketSelection", "ExchangeBreakdown", "RevPointsBottomSheet", "EsimInstallation", "RefundBreakdown", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep$AutoRenewalInfo;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep$EsimInstallation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep$ExchangeBreakdown;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep$RefundBreakdown;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep$RevPayPocketSelection;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep$RevPointsBottomSheet;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimCheckoutScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep$AutoRenewalInfo;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoRenewalInfo implements EsimCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AutoRenewalInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimAutoRenewalTerms f100910a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoRenewalInfo((EsimAutoRenewalTerms) parcel.readParcelable(AutoRenewalInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoRenewalInfo[i];
            }
        }

        public AutoRenewalInfo(EsimAutoRenewalTerms terms) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            this.f100910a = terms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AutoRenewalInfo) && Intrinsics.f(this.f100910a, ((AutoRenewalInfo) obj2).f100910a);
        }

        public final int hashCode() {
            return this.f100910a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100910a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep$EsimInstallation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EsimInstallation implements EsimCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EsimInstallation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimProfile f100911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f100912b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EsimInstallation((EsimProfile) parcel.readParcelable(EsimInstallation.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EsimInstallation[i];
            }
        }

        public EsimInstallation(EsimProfile esimProfile, boolean z) {
            Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
            this.f100911a = esimProfile;
            this.f100912b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EsimInstallation)) {
                return false;
            }
            EsimInstallation esimInstallation = (EsimInstallation) obj2;
            return Intrinsics.f(this.f100911a, esimInstallation.f100911a) && this.f100912b == esimInstallation.f100912b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f100912b) + (this.f100911a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100911a, i);
            dest.writeInt(this.f100912b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep$ExchangeBreakdown;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExchangeBreakdown implements EsimCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ExchangeBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimCheckoutScreenContract$ExchangeBreakdownData f100913a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExchangeBreakdown(EsimCheckoutScreenContract$ExchangeBreakdownData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExchangeBreakdown[i];
            }
        }

        public ExchangeBreakdown(EsimCheckoutScreenContract$ExchangeBreakdownData breakdownData) {
            Intrinsics.checkNotNullParameter(breakdownData, "breakdownData");
            this.f100913a = breakdownData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExchangeBreakdown) && Intrinsics.f(this.f100913a, ((ExchangeBreakdown) obj2).f100913a);
        }

        public final int hashCode() {
            return this.f100913a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f100913a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep$RefundBreakdown;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RefundBreakdown implements EsimCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RefundBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimCheckoutScreenContract$PlanChangeRefundInfo f100914a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RefundBreakdown(EsimCheckoutScreenContract$PlanChangeRefundInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RefundBreakdown[i];
            }
        }

        public RefundBreakdown(EsimCheckoutScreenContract$PlanChangeRefundInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.f100914a = info;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RefundBreakdown) && Intrinsics.f(this.f100914a, ((RefundBreakdown) obj2).f100914a);
        }

        public final int hashCode() {
            return this.f100914a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f100914a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep$RevPayPocketSelection;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPayPocketSelection implements EsimCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevPayPocketSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f100915a;

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
            this.f100915a = originalPrice;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPayPocketSelection) && Intrinsics.f(this.f100915a, ((RevPayPocketSelection) obj2).f100915a);
        }

        public final int hashCode() {
            return this.f100915a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f100915a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep$RevPointsBottomSheet;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$ModalStep;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsBottomSheet implements EsimCheckoutScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsBottomSheet f100916a = new RevPointsBottomSheet();

        @NotNull
        public static final Parcelable.Creator<RevPointsBottomSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsBottomSheet.f100916a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsBottomSheet[i];
            }
        }

        private RevPointsBottomSheet() {
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
