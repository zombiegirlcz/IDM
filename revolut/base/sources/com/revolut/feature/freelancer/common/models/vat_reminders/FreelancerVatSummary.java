package com.revolut.feature.freelancer.common.models.vat_reminders;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import fs6.b;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/vat_reminders/FreelancerVatSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Summary", "TotalSalesSummary", "TaxRateSummary", "TotalTaxSummary", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerVatSummary implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerVatSummary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f73501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Summary f73502c;
    public final LocalDate d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/vat_reminders/FreelancerVatSummary$Summary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Summary implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Summary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TotalSalesSummary f73503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TaxRateSummary f73504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TotalTaxSummary f73505c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Summary(TotalSalesSummary.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TaxRateSummary.CREATOR.createFromParcel(parcel), TotalTaxSummary.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Summary[i];
            }
        }

        public Summary(TotalSalesSummary totalSales, TaxRateSummary taxRateSummary, TotalTaxSummary totalTax) {
            Intrinsics.checkNotNullParameter(totalSales, "totalSales");
            Intrinsics.checkNotNullParameter(totalTax, "totalTax");
            this.f73503a = totalSales;
            this.f73504b = taxRateSummary;
            this.f73505c = totalTax;
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
            return Intrinsics.f(this.f73503a, summary.f73503a) && Intrinsics.f(this.f73504b, summary.f73504b) && Intrinsics.f(this.f73505c, summary.f73505c);
        }

        public final int hashCode() {
            int iHashCode = this.f73503a.f73508a.hashCode() * 31;
            TaxRateSummary taxRateSummary = this.f73504b;
            return this.f73505c.f73509a.hashCode() + ((iHashCode + (taxRateSummary == null ? 0 : taxRateSummary.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f73503a.writeToParcel(dest, i);
            TaxRateSummary taxRateSummary = this.f73504b;
            if (taxRateSummary == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                taxRateSummary.writeToParcel(dest, i);
            }
            this.f73505c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/vat_reminders/FreelancerVatSummary$TaxRateSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/freelancer/common/models/vat_reminders/a", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxRateSummary implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TaxRateSummary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.feature.freelancer.common.models.vat_reminders.a f73506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f73507b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxRateSummary(com.revolut.feature.freelancer.common.models.vat_reminders.a.valueOf(parcel.readString()), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxRateSummary[i];
            }
        }

        public TaxRateSummary(com.revolut.feature.freelancer.common.models.vat_reminders.a type, double d) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f73506a = type;
            this.f73507b = d;
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
            return this.f73506a == taxRateSummary.f73506a && Double.compare(this.f73507b, taxRateSummary.f73507b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f73507b) + (this.f73506a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73506a.name());
            dest.writeDouble(this.f73507b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/vat_reminders/FreelancerVatSummary$TotalSalesSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TotalSalesSummary implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TotalSalesSummary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f73508a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TotalSalesSummary((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TotalSalesSummary[i];
            }
        }

        public TotalSalesSummary(d money) {
            Intrinsics.checkNotNullParameter(money, "money");
            this.f73508a = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TotalSalesSummary) && Intrinsics.f(this.f73508a, ((TotalSalesSummary) obj2).f73508a);
        }

        public final int hashCode() {
            return this.f73508a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f73508a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/vat_reminders/FreelancerVatSummary$TotalTaxSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TotalTaxSummary implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TotalTaxSummary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f73509a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TotalTaxSummary((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TotalTaxSummary[i];
            }
        }

        public TotalTaxSummary(d money) {
            Intrinsics.checkNotNullParameter(money, "money");
            this.f73509a = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TotalTaxSummary) && Intrinsics.f(this.f73509a, ((TotalTaxSummary) obj2).f73509a);
        }

        public final int hashCode() {
            return this.f73509a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f73509a);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerVatSummary(parcel.readString(), b.valueOf(parcel.readString()), Summary.CREATOR.createFromParcel(parcel), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerVatSummary[i];
        }
    }

    public FreelancerVatSummary(String vatReminderId, b assessmentPeriod, Summary summary, LocalDate nextVatReturnDueDate) {
        Intrinsics.checkNotNullParameter(vatReminderId, "vatReminderId");
        Intrinsics.checkNotNullParameter(assessmentPeriod, "assessmentPeriod");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(nextVatReturnDueDate, "nextVatReturnDueDate");
        this.f73500a = vatReminderId;
        this.f73501b = assessmentPeriod;
        this.f73502c = summary;
        this.d = nextVatReturnDueDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerVatSummary)) {
            return false;
        }
        FreelancerVatSummary freelancerVatSummary = (FreelancerVatSummary) obj2;
        return Intrinsics.f(this.f73500a, freelancerVatSummary.f73500a) && this.f73501b == freelancerVatSummary.f73501b && Intrinsics.f(this.f73502c, freelancerVatSummary.f73502c) && Intrinsics.f(this.d, freelancerVatSummary.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f73502c.hashCode() + ((this.f73501b.hashCode() + (this.f73500a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73500a);
        dest.writeString(this.f73501b.name());
        this.f73502c.writeToParcel(dest, i);
        dest.writeSerializable(this.d);
    }
}
