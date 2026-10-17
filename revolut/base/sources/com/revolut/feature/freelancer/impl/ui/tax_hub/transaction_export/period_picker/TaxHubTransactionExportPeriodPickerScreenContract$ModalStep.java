package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreenContract$DomainState;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n47.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/period_picker/TaxHubTransactionExportPeriodPickerScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DatePickerFrom", "DatePickerTo", "PeriodPicker", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/period_picker/TaxHubTransactionExportPeriodPickerScreenContract$ModalStep$DatePickerFrom;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/period_picker/TaxHubTransactionExportPeriodPickerScreenContract$ModalStep$DatePickerTo;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/period_picker/TaxHubTransactionExportPeriodPickerScreenContract$ModalStep$PeriodPicker;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TaxHubTransactionExportPeriodPickerScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/period_picker/TaxHubTransactionExportPeriodPickerScreenContract$ModalStep$DatePickerFrom;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/period_picker/TaxHubTransactionExportPeriodPickerScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DatePickerFrom implements TaxHubTransactionExportPeriodPickerScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DatePickerFrom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period f74406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f74407b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DatePickerFrom(TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period.CREATOR.createFromParcel(parcel), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DatePickerFrom[i];
            }
        }

        public DatePickerFrom(TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period selectedPeriod, LocalDate minAvailableDate) {
            Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
            Intrinsics.checkNotNullParameter(minAvailableDate, "minAvailableDate");
            this.f74406a = selectedPeriod;
            this.f74407b = minAvailableDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DatePickerFrom)) {
                return false;
            }
            DatePickerFrom datePickerFrom = (DatePickerFrom) obj2;
            return Intrinsics.f(this.f74406a, datePickerFrom.f74406a) && Intrinsics.f(this.f74407b, datePickerFrom.f74407b);
        }

        public final int hashCode() {
            return this.f74407b.hashCode() + (this.f74406a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f74406a.writeToParcel(dest, i);
            dest.writeSerializable(this.f74407b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/period_picker/TaxHubTransactionExportPeriodPickerScreenContract$ModalStep$DatePickerTo;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/period_picker/TaxHubTransactionExportPeriodPickerScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DatePickerTo implements TaxHubTransactionExportPeriodPickerScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DatePickerTo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period f74408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f74409b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DatePickerTo(TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period.CREATOR.createFromParcel(parcel), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DatePickerTo[i];
            }
        }

        public DatePickerTo(TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period selectedPeriod, LocalDate maxAvailableDate) {
            Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
            Intrinsics.checkNotNullParameter(maxAvailableDate, "maxAvailableDate");
            this.f74408a = selectedPeriod;
            this.f74409b = maxAvailableDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DatePickerTo)) {
                return false;
            }
            DatePickerTo datePickerTo = (DatePickerTo) obj2;
            return Intrinsics.f(this.f74408a, datePickerTo.f74408a) && Intrinsics.f(this.f74409b, datePickerTo.f74409b);
        }

        public final int hashCode() {
            return this.f74409b.hashCode() + (this.f74408a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f74408a.writeToParcel(dest, i);
            dest.writeSerializable(this.f74409b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/period_picker/TaxHubTransactionExportPeriodPickerScreenContract$ModalStep$PeriodPicker;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/period_picker/TaxHubTransactionExportPeriodPickerScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PeriodPicker implements TaxHubTransactionExportPeriodPickerScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PeriodPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f74410a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PeriodPicker(j.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PeriodPicker[i];
            }
        }

        public PeriodPicker(j selectedPeriodType) {
            Intrinsics.checkNotNullParameter(selectedPeriodType, "selectedPeriodType");
            this.f74410a = selectedPeriodType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PeriodPicker) && this.f74410a == ((PeriodPicker) obj2).f74410a;
        }

        public final int hashCode() {
            return this.f74410a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74410a.name());
        }
    }
}
