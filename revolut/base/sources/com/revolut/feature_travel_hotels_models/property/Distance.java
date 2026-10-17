package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/Distance;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Distance implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Distance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f97971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ufi.a f97972b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Distance(parcel.readDouble(), ufi.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Distance[i];
        }
    }

    public Distance(double d, ufi.a unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f97971a = d;
        this.f97972b = unit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Distance)) {
            return false;
        }
        Distance distance = (Distance) obj2;
        return Double.compare(this.f97971a, distance.f97971a) == 0 && this.f97972b == distance.f97972b;
    }

    public final int hashCode() {
        return this.f97972b.hashCode() + (Double.hashCode(this.f97971a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f97971a);
        dest.writeString(this.f97972b.name());
    }
}
