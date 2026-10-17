package com.revolut.feature.donations.impl.ui.kompot.screen.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/screen/recurring/DonationSchedule;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DonationSchedule implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DonationSchedule> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f72098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f72099b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DonationSchedule((Period) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DonationSchedule[i];
        }
    }

    public DonationSchedule(Period period, LocalDate startDate) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f72098a = period;
        this.f72099b = startDate;
    }

    public static DonationSchedule a(DonationSchedule donationSchedule, Period period, LocalDate startDate, int i) {
        if ((i & 1) != 0) {
            period = donationSchedule.f72098a;
        }
        if ((i & 2) != 0) {
            startDate = donationSchedule.f72099b;
        }
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        return new DonationSchedule(period, startDate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DonationSchedule)) {
            return false;
        }
        DonationSchedule donationSchedule = (DonationSchedule) obj2;
        return Intrinsics.f(this.f72098a, donationSchedule.f72098a) && Intrinsics.f(this.f72099b, donationSchedule.f72099b);
    }

    public final int hashCode() {
        return this.f72099b.hashCode() + (this.f72098a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f72098a);
        dest.writeSerializable(this.f72099b);
    }
}
