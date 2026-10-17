package com.revolut.feature.retail.restaurants.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import java.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xdb.z;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/domain/model/TimeSlot;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "xdb/z", "a", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TimeSlot implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f82829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalTime f82830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f82831c;
    public final boolean d;

    @NotNull
    public static final Parcelable.Creator<TimeSlot> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TimeSlot((LocalDate) parcel.readSerializable(), (LocalTime) parcel.readSerializable(), z.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TimeSlot[i];
        }
    }

    public TimeSlot(LocalDate date, LocalTime time, z state) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f82829a = date;
        this.f82830b = time;
        this.f82831c = state;
        this.d = state == z.AVAILABLE;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TimeSlot)) {
            return false;
        }
        TimeSlot timeSlot = (TimeSlot) obj2;
        return Intrinsics.f(this.f82829a, timeSlot.f82829a) && Intrinsics.f(this.f82830b, timeSlot.f82830b) && this.f82831c == timeSlot.f82831c;
    }

    public final int hashCode() {
        return this.f82831c.hashCode() + ((this.f82830b.hashCode() + (this.f82829a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f82829a);
        dest.writeSerializable(this.f82830b);
        dest.writeString(this.f82831c.name());
    }
}
