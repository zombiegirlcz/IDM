package com.revolut.feature_travel_hotels_models.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.property.Distance;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/location/Coordinates;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Coordinates implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Coordinates> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f97948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f97949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Distance f97950c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Coordinates(parcel.readDouble(), parcel.readDouble(), parcel.readInt() == 0 ? null : Distance.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Coordinates[i];
        }
    }

    public Coordinates(double d, double d5, Distance distance) {
        this.f97948a = d;
        this.f97949b = d5;
        this.f97950c = distance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Coordinates)) {
            return false;
        }
        Coordinates coordinates = (Coordinates) obj2;
        return Double.compare(this.f97948a, coordinates.f97948a) == 0 && Double.compare(this.f97949b, coordinates.f97949b) == 0 && Intrinsics.f(this.f97950c, coordinates.f97950c);
    }

    public final int hashCode() {
        int iC = b.c(Double.hashCode(this.f97948a) * 31, this.f97949b, 31);
        Distance distance = this.f97950c;
        return iC + (distance == null ? 0 : distance.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f97948a);
        dest.writeDouble(this.f97949b);
        Distance distance = this.f97950c;
        if (distance == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            distance.writeToParcel(dest, i);
        }
    }
}
