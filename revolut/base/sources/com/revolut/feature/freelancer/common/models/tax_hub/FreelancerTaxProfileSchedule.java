package com.revolut.feature.freelancer.common.models.tax_hub;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import java.time.Month;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/tax_hub/FreelancerTaxProfileSchedule;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerTaxProfileSchedule implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds6.a f73477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f73478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Month f73479c;

    @NotNull
    public static final Parcelable.Creator<FreelancerTaxProfileSchedule> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerTaxProfileSchedule(ds6.a.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? null : Month.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerTaxProfileSchedule[i];
        }
    }

    public FreelancerTaxProfileSchedule(ds6.a period, LocalDate localDate, Month month) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f73477a = period;
        this.f73478b = localDate;
        this.f73479c = month;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerTaxProfileSchedule)) {
            return false;
        }
        FreelancerTaxProfileSchedule freelancerTaxProfileSchedule = (FreelancerTaxProfileSchedule) obj2;
        return this.f73477a == freelancerTaxProfileSchedule.f73477a && Intrinsics.f(this.f73478b, freelancerTaxProfileSchedule.f73478b) && this.f73479c == freelancerTaxProfileSchedule.f73479c;
    }

    public final int hashCode() {
        int iHashCode = this.f73477a.hashCode() * 31;
        LocalDate localDate = this.f73478b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Month month = this.f73479c;
        return iHashCode2 + (month != null ? month.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73477a.name());
        dest.writeSerializable(this.f73478b);
        Month month = this.f73479c;
        if (month == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(month.name());
        }
    }
}
