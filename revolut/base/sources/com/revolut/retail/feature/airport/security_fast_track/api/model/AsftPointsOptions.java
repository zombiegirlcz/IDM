package com.revolut.retail.feature.airport.security_fast_track.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/api/model/AsftPointsOptions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftPointsOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AsftPointsOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f98732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f98733b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AsftPointsOptions(parcel.readDouble(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftPointsOptions[i];
        }
    }

    public AsftPointsOptions(double d, d finalPrice) {
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        this.f98732a = d;
        this.f98733b = finalPrice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftPointsOptions)) {
            return false;
        }
        AsftPointsOptions asftPointsOptions = (AsftPointsOptions) obj2;
        return Double.compare(this.f98732a, asftPointsOptions.f98732a) == 0 && Intrinsics.f(this.f98733b, asftPointsOptions.f98733b);
    }

    public final int hashCode() {
        return this.f98733b.hashCode() + (Double.hashCode(this.f98732a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f98732a);
        dest.writeSerializable(this.f98733b);
    }
}
