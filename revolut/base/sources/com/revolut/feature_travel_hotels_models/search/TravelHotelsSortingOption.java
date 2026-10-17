package com.revolut.feature_travel_hotels_models.search;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/search/TravelHotelsSortingOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsSortingOption implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98142b;

    @NotNull
    public static final Parcelable.Creator<TravelHotelsSortingOption> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsSortingOption(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsSortingOption[i];
        }
    }

    public TravelHotelsSortingOption(String id10, String label) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f98141a = id10;
        this.f98142b = label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsSortingOption)) {
            return false;
        }
        TravelHotelsSortingOption travelHotelsSortingOption = (TravelHotelsSortingOption) obj2;
        return Intrinsics.f(this.f98141a, travelHotelsSortingOption.f98141a) && Intrinsics.f(this.f98142b, travelHotelsSortingOption.f98142b);
    }

    public final int hashCode() {
        return this.f98142b.hashCode() + (this.f98141a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98141a);
        dest.writeString(this.f98142b);
    }
}
