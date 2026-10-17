package com.revolut.feature.freelancer.common.models.tax_hub;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/tax_hub/TaxHubVatSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Summary", "TaxRateSummary", "a", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxHubVatSummary implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds6.a f73489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Summary f73490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f73491c;

    @NotNull
    public static final Parcelable.Creator<TaxHubVatSummary> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/tax_hub/TaxHubVatSummary$Summary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Summary implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Summary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f73492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TaxRateSummary f73493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f73494c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Summary((d) parcel.readSerializable(), parcel.readInt() == 0 ? null : TaxRateSummary.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Summary[i];
            }
        }

        public Summary(d totalSales, TaxRateSummary taxRateSummary, d totalTax) {
            Intrinsics.checkNotNullParameter(totalSales, "totalSales");
            Intrinsics.checkNotNullParameter(totalTax, "totalTax");
            this.f73492a = totalSales;
            this.f73493b = taxRateSummary;
            this.f73494c = totalTax;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) obj2;
            return Intrinsics.f(this.f73492a, summary.f73492a) && Intrinsics.f(this.f73493b, summary.f73493b) && Intrinsics.f(this.f73494c, summary.f73494c);
        }

        public final int hashCode() {
            int iHashCode = this.f73492a.hashCode() * 31;
            TaxRateSummary taxRateSummary = this.f73493b;
            return this.f73494c.hashCode() + ((iHashCode + (taxRateSummary == null ? 0 : taxRateSummary.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f73492a);
            TaxRateSummary taxRateSummary = this.f73493b;
            if (taxRateSummary == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                taxRateSummary.writeToParcel(dest, i);
            }
            dest.writeSerializable(this.f73494c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/tax_hub/TaxHubVatSummary$TaxRateSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/freelancer/common/models/tax_hub/a", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxRateSummary implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TaxRateSummary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.feature.freelancer.common.models.tax_hub.a f73495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f73496b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxRateSummary(com.revolut.feature.freelancer.common.models.tax_hub.a.valueOf(parcel.readString()), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxRateSummary[i];
            }
        }

        public TaxRateSummary(com.revolut.feature.freelancer.common.models.tax_hub.a type, double d) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f73495a = type;
            this.f73496b = d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxRateSummary)) {
                return false;
            }
            TaxRateSummary taxRateSummary = (TaxRateSummary) obj2;
            return this.f73495a == taxRateSummary.f73495a && Double.compare(this.f73496b, taxRateSummary.f73496b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f73496b) + (this.f73495a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73495a.name());
            dest.writeDouble(this.f73496b);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxHubVatSummary(ds6.a.valueOf(parcel.readString()), Summary.CREATOR.createFromParcel(parcel), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxHubVatSummary[i];
        }
    }

    public TaxHubVatSummary(ds6.a period, Summary summary, LocalDate nextVatReturnDueDate) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(nextVatReturnDueDate, "nextVatReturnDueDate");
        this.f73489a = period;
        this.f73490b = summary;
        this.f73491c = nextVatReturnDueDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxHubVatSummary)) {
            return false;
        }
        TaxHubVatSummary taxHubVatSummary = (TaxHubVatSummary) obj2;
        return this.f73489a == taxHubVatSummary.f73489a && Intrinsics.f(this.f73490b, taxHubVatSummary.f73490b) && Intrinsics.f(this.f73491c, taxHubVatSummary.f73491c);
    }

    public final int hashCode() {
        return this.f73491c.hashCode() + ((this.f73490b.hashCode() + (this.f73489a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73489a.name());
        this.f73490b.writeToParcel(dest, i);
        dest.writeSerializable(this.f73491c);
    }
}
