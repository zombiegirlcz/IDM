package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertyAvailabilityDates;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyAvailabilityDates implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyAvailabilityDates> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f98003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f98004b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsPropertyAvailabilityDates((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyAvailabilityDates[i];
        }
    }

    public HotelsPropertyAvailabilityDates(LocalDate checkIn, LocalDate checkOut) {
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        this.f98003a = checkIn;
        this.f98004b = checkOut;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyAvailabilityDates)) {
            return false;
        }
        HotelsPropertyAvailabilityDates hotelsPropertyAvailabilityDates = (HotelsPropertyAvailabilityDates) obj2;
        return Intrinsics.f(this.f98003a, hotelsPropertyAvailabilityDates.f98003a) && Intrinsics.f(this.f98004b, hotelsPropertyAvailabilityDates.f98004b);
    }

    public final int hashCode() {
        return this.f98004b.hashCode() + (this.f98003a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f98003a);
        dest.writeSerializable(this.f98004b);
    }
}
