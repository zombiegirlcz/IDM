package com.revolut.feature_travel_hotels_models.booking.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/booking/details/PointsMonetaryValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PointsMonetaryValue implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PointsMonetaryValue> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPoints f97885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f97886b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PointsMonetaryValue((RevPoints) parcel.readParcelable(PointsMonetaryValue.class.getClassLoader()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PointsMonetaryValue[i];
        }
    }

    public PointsMonetaryValue(RevPoints points, d monetaryValue) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(monetaryValue, "monetaryValue");
        this.f97885a = points;
        this.f97886b = monetaryValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PointsMonetaryValue)) {
            return false;
        }
        PointsMonetaryValue pointsMonetaryValue = (PointsMonetaryValue) obj2;
        return Intrinsics.f(this.f97885a, pointsMonetaryValue.f97885a) && Intrinsics.f(this.f97886b, pointsMonetaryValue.f97886b);
    }

    public final int hashCode() {
        return this.f97886b.hashCode() + (this.f97885a.f83960a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97885a, i);
        dest.writeSerializable(this.f97886b);
    }
}
