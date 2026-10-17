package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker;

import android.os.Parcel;
import android.os.Parcelable;
import cli.j;
import com.revolut.data.model.Data;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n47.g;
import n47.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TaxHubTransactionExportPeriodPickerScreenContract$DomainState implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f74402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f74403b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/period_picker/TaxHubTransactionExportPeriodPickerScreenContract$DomainState$Period;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Period implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Period> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f74404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f74405b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Period((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Period[i];
            }
        }

        public Period(LocalDate startDate, LocalDate endDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            this.f74404a = startDate;
            this.f74405b = endDate;
        }

        public static Period a(Period period, LocalDate startDate, LocalDate endDate, int i) {
            if ((i & 1) != 0) {
                startDate = period.f74404a;
            }
            if ((i & 2) != 0) {
                endDate = period.f74405b;
            }
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            return new Period(startDate, endDate);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Period)) {
                return false;
            }
            Period period = (Period) obj2;
            return Intrinsics.f(this.f74404a, period.f74404a) && Intrinsics.f(this.f74405b, period.f74405b);
        }

        public final int hashCode() {
            return this.f74405b.hashCode() + (this.f74404a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f74404a);
            dest.writeSerializable(this.f74405b);
        }
    }

    public TaxHubTransactionExportPeriodPickerScreenContract$DomainState() {
        this(0);
    }

    public static TaxHubTransactionExportPeriodPickerScreenContract$DomainState a(TaxHubTransactionExportPeriodPickerScreenContract$DomainState taxHubTransactionExportPeriodPickerScreenContract$DomainState, i periodSelection) {
        Data periodInfo = taxHubTransactionExportPeriodPickerScreenContract$DomainState.f74402a;
        taxHubTransactionExportPeriodPickerScreenContract$DomainState.getClass();
        Intrinsics.checkNotNullParameter(periodInfo, "periodInfo");
        Intrinsics.checkNotNullParameter(periodSelection, "periodSelection");
        return new TaxHubTransactionExportPeriodPickerScreenContract$DomainState(periodInfo, periodSelection);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxHubTransactionExportPeriodPickerScreenContract$DomainState)) {
            return false;
        }
        TaxHubTransactionExportPeriodPickerScreenContract$DomainState taxHubTransactionExportPeriodPickerScreenContract$DomainState = (TaxHubTransactionExportPeriodPickerScreenContract$DomainState) obj2;
        return Intrinsics.f(this.f74402a, taxHubTransactionExportPeriodPickerScreenContract$DomainState.f74402a) && Intrinsics.f(this.f74403b, taxHubTransactionExportPeriodPickerScreenContract$DomainState.f74403b);
    }

    public final int hashCode() {
        return this.f74403b.hashCode() + (this.f74402a.hashCode() * 31);
    }

    public TaxHubTransactionExportPeriodPickerScreenContract$DomainState(Data periodInfo, i periodSelection) {
        Intrinsics.checkNotNullParameter(periodInfo, "periodInfo");
        Intrinsics.checkNotNullParameter(periodSelection, "periodSelection");
        this.f74402a = periodInfo;
        this.f74403b = periodSelection;
    }

    public /* synthetic */ TaxHubTransactionExportPeriodPickerScreenContract$DomainState(int i) {
        this(new Data(null, null, true, 3, null), g.f212316a);
    }
}
