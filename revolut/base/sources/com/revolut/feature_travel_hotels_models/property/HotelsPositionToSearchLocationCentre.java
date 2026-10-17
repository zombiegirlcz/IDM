package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPositionToSearchLocationCentre;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPositionToSearchLocationCentre implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPositionToSearchLocationCentre> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Distance f97978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97980c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsPositionToSearchLocationCentre(Distance.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPositionToSearchLocationCentre[i];
        }
    }

    public HotelsPositionToSearchLocationCentre(Distance distance, String propertyLocation, boolean z) {
        Intrinsics.checkNotNullParameter(distance, "distance");
        Intrinsics.checkNotNullParameter(propertyLocation, "propertyLocation");
        this.f97978a = distance;
        this.f97979b = propertyLocation;
        this.f97980c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPositionToSearchLocationCentre)) {
            return false;
        }
        HotelsPositionToSearchLocationCentre hotelsPositionToSearchLocationCentre = (HotelsPositionToSearchLocationCentre) obj2;
        return Intrinsics.f(this.f97978a, hotelsPositionToSearchLocationCentre.f97978a) && Intrinsics.f(this.f97979b, hotelsPositionToSearchLocationCentre.f97979b) && this.f97980c == hotelsPositionToSearchLocationCentre.f97980c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f97980c) + p.a.c(this.f97978a.hashCode() * 31, 31, this.f97979b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f97978a.writeToParcel(dest, i);
        dest.writeString(this.f97979b);
        dest.writeInt(this.f97980c ? 1 : 0);
    }
}
