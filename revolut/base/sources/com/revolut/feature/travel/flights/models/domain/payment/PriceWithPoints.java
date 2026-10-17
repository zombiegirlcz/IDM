package com.revolut.feature.travel.flights.models.domain.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/payment/PriceWithPoints;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PriceWithPoints implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PriceWithPoints> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f93542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPoints f93543b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PriceWithPoints((RevPoints) parcel.readParcelable(PriceWithPoints.class.getClassLoader()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PriceWithPoints[i];
        }
    }

    public PriceWithPoints(RevPoints points, d fiat) {
        Intrinsics.checkNotNullParameter(fiat, "fiat");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f93542a = fiat;
        this.f93543b = points;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PriceWithPoints)) {
            return false;
        }
        PriceWithPoints priceWithPoints = (PriceWithPoints) obj2;
        return Intrinsics.f(this.f93542a, priceWithPoints.f93542a) && Intrinsics.f(this.f93543b, priceWithPoints.f93543b);
    }

    public final int hashCode() {
        return this.f93543b.f83960a.hashCode() + (this.f93542a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f93542a);
        dest.writeParcelable(this.f93543b, i);
    }
}
