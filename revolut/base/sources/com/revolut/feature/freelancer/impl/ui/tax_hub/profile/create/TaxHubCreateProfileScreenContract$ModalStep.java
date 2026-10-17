package com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/profile/create/TaxHubCreateProfileScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "TaxPeriodPicker", "NextPaymentDatePicker", "ClosingMonthPicker", "NotificationToggle", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/profile/create/TaxHubCreateProfileScreenContract$ModalStep$ClosingMonthPicker;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/profile/create/TaxHubCreateProfileScreenContract$ModalStep$NextPaymentDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/profile/create/TaxHubCreateProfileScreenContract$ModalStep$NotificationToggle;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/profile/create/TaxHubCreateProfileScreenContract$ModalStep$TaxPeriodPicker;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TaxHubCreateProfileScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/profile/create/TaxHubCreateProfileScreenContract$ModalStep$ClosingMonthPicker;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/profile/create/TaxHubCreateProfileScreenContract$ModalStep;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ClosingMonthPicker implements TaxHubCreateProfileScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ClosingMonthPicker f74341a = new ClosingMonthPicker();

        @NotNull
        public static final Parcelable.Creator<ClosingMonthPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ClosingMonthPicker.f74341a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClosingMonthPicker[i];
            }
        }

        private ClosingMonthPicker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/profile/create/TaxHubCreateProfileScreenContract$ModalStep$NextPaymentDatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/profile/create/TaxHubCreateProfileScreenContract$ModalStep;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NextPaymentDatePicker implements TaxHubCreateProfileScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NextPaymentDatePicker f74342a = new NextPaymentDatePicker();

        @NotNull
        public static final Parcelable.Creator<NextPaymentDatePicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NextPaymentDatePicker.f74342a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NextPaymentDatePicker[i];
            }
        }

        private NextPaymentDatePicker() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/profile/create/TaxHubCreateProfileScreenContract$ModalStep$NotificationToggle;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/profile/create/TaxHubCreateProfileScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotificationToggle implements TaxHubCreateProfileScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<NotificationToggle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74343a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NotificationToggle(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotificationToggle[i];
            }
        }

        public NotificationToggle(String taxProfileId) {
            Intrinsics.checkNotNullParameter(taxProfileId, "taxProfileId");
            this.f74343a = taxProfileId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NotificationToggle) && Intrinsics.f(this.f74343a, ((NotificationToggle) obj2).f74343a);
        }

        public final int hashCode() {
            return this.f74343a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74343a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/profile/create/TaxHubCreateProfileScreenContract$ModalStep$TaxPeriodPicker;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/profile/create/TaxHubCreateProfileScreenContract$ModalStep;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TaxPeriodPicker implements TaxHubCreateProfileScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TaxPeriodPicker f74344a = new TaxPeriodPicker();

        @NotNull
        public static final Parcelable.Creator<TaxPeriodPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TaxPeriodPicker.f74344a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxPeriodPicker[i];
            }
        }

        private TaxPeriodPicker() {
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
