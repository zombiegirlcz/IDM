package com.revolut.feature.freelancer.common.models.invoices;

import android.os.Parcel;
import android.os.Parcelable;
import j6.a;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/invoices/FreelancerRecurringSchedule;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerRecurringSchedule implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f73435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerInvoiceRecurringPeriod f73436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f73437c;
    public final Integer d;
    public final Integer e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f73438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f73439h;
    public final LocalDate i;

    @NotNull
    public static final Parcelable.Creator<FreelancerRecurringSchedule> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerRecurringSchedule((LocalDate) parcel.readSerializable(), FreelancerInvoiceRecurringPeriod.CREATOR.createFromParcel(parcel), (LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt(), parcel.readInt(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerRecurringSchedule[i];
        }
    }

    public FreelancerRecurringSchedule(LocalDate startDate, FreelancerInvoiceRecurringPeriod period, LocalDate localDate, Integer num, Integer num2, int i, int i2, LocalDate localDate2, LocalDate localDate3) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f73435a = startDate;
        this.f73436b = period;
        this.f73437c = localDate;
        this.d = num;
        this.e = num2;
        this.f = i;
        this.f73438g = i2;
        this.f73439h = localDate2;
        this.i = localDate3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerRecurringSchedule)) {
            return false;
        }
        FreelancerRecurringSchedule freelancerRecurringSchedule = (FreelancerRecurringSchedule) obj2;
        return Intrinsics.f(this.f73435a, freelancerRecurringSchedule.f73435a) && Intrinsics.f(this.f73436b, freelancerRecurringSchedule.f73436b) && Intrinsics.f(this.f73437c, freelancerRecurringSchedule.f73437c) && Intrinsics.f(this.d, freelancerRecurringSchedule.d) && Intrinsics.f(this.e, freelancerRecurringSchedule.e) && this.f == freelancerRecurringSchedule.f && this.f73438g == freelancerRecurringSchedule.f73438g && Intrinsics.f(this.f73439h, freelancerRecurringSchedule.f73439h) && Intrinsics.f(this.i, freelancerRecurringSchedule.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f73436b.hashCode() + (this.f73435a.hashCode() * 31)) * 31;
        LocalDate localDate = this.f73437c;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iB = a.b(this.f73438g, a.b(this.f, (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31);
        LocalDate localDate2 = this.f73439h;
        int iHashCode4 = (iB + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.i;
        return iHashCode4 + (localDate3 != null ? localDate3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f73435a);
        this.f73436b.writeToParcel(dest, i);
        dest.writeSerializable(this.f73437c);
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.e;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        dest.writeInt(this.f);
        dest.writeInt(this.f73438g);
        dest.writeSerializable(this.f73439h);
        dest.writeSerializable(this.i);
    }
}
