package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesRate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelMilesRate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f94112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f94113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelMilesRateDisplay f94114c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesRate(parcel.readDouble(), (d) parcel.readSerializable(), TravelMilesRateDisplay.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesRate[i];
        }
    }

    public TravelMilesRate(double d, d fee2, TravelMilesRateDisplay display) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(display, "display");
        this.f94112a = d;
        this.f94113b = fee2;
        this.f94114c = display;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesRate)) {
            return false;
        }
        TravelMilesRate travelMilesRate = (TravelMilesRate) obj2;
        return Double.compare(this.f94112a, travelMilesRate.f94112a) == 0 && Intrinsics.f(this.f94113b, travelMilesRate.f94113b) && Intrinsics.f(this.f94114c, travelMilesRate.f94114c);
    }

    public final int hashCode() {
        return this.f94114c.hashCode() + v7.c(Double.hashCode(this.f94112a) * 31, 31, this.f94113b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f94112a);
        dest.writeSerializable(this.f94113b);
        this.f94114c.writeToParcel(dest, i);
    }
}
