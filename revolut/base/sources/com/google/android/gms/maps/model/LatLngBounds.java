package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "LatLngBoundsCreator")
@SafeParcelable.Reserved({1})
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new zzi();

    @NonNull
    @SafeParcelable.Field(id = 3)
    public final LatLng northeast;

    @NonNull
    @SafeParcelable.Field(id = 2)
    public final LatLng southwest;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private double f46659zza = Double.POSITIVE_INFINITY;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private double f46660zzb = Double.NEGATIVE_INFINITY;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private double f46661zzc = Double.NaN;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private double f46662zzd = Double.NaN;

        @NonNull
        public LatLngBounds build() {
            Preconditions.checkState(!Double.isNaN(this.f46661zzc), "no included points");
            return new LatLngBounds(new LatLng(this.f46659zza, this.f46661zzc), new LatLng(this.f46660zzb, this.f46662zzd));
        }

        @NonNull
        public Builder include(@NonNull LatLng latLng) {
            Preconditions.checkNotNull(latLng, "point must not be null");
            this.f46659zza = Math.min(this.f46659zza, latLng.latitude);
            this.f46660zzb = Math.max(this.f46660zzb, latLng.latitude);
            double d = latLng.longitude;
            if (Double.isNaN(this.f46661zzc)) {
                this.f46661zzc = d;
                this.f46662zzd = d;
                return this;
            }
            double d5 = this.f46661zzc;
            double d6 = this.f46662zzd;
            if (d5 > d6 ? !(d5 <= d || d <= d6) : !(d5 <= d && d <= d6)) {
                Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                if (((d5 - d) + 360.0d) % 360.0d < ((d - d6) + 360.0d) % 360.0d) {
                    this.f46661zzc = d;
                    return this;
                }
                this.f46662zzd = d;
            }
            return this;
        }
    }

    @SafeParcelable.Constructor
    public LatLngBounds(@NonNull @SafeParcelable.Param(id = 2) LatLng latLng, @NonNull @SafeParcelable.Param(id = 3) LatLng latLng2) {
        Preconditions.checkNotNull(latLng, "southwest must not be null.");
        Preconditions.checkNotNull(latLng2, "northeast must not be null.");
        double d = latLng2.latitude;
        double d5 = latLng.latitude;
        Preconditions.checkArgument(d >= d5, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d5), Double.valueOf(latLng2.latitude));
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    public static LatLngBounds createFromAttributes(Context context, AttributeSet attributeSet) {
        return GoogleMapOptions.zzb(context, attributeSet);
    }

    private final boolean zza(double d) {
        LatLng latLng = this.northeast;
        double d5 = this.southwest.longitude;
        double d6 = latLng.longitude;
        return d5 <= d6 ? d5 <= d && d <= d6 : d5 <= d || d <= d6;
    }

    public boolean contains(@NonNull LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double d = latLng2.latitude;
        return this.southwest.latitude <= d && d <= this.northeast.latitude && zza(latLng2.longitude);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj2;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    @NonNull
    public LatLng getCenter() {
        LatLng latLng = this.northeast;
        LatLng latLng2 = this.southwest;
        double d = latLng2.latitude + latLng.latitude;
        double d5 = latLng.longitude;
        double d6 = latLng2.longitude;
        if (d6 > d5) {
            d5 += 360.0d;
        }
        return new LatLng(d / 2.0d, (d5 + d6) / 2.0d);
    }

    public int hashCode() {
        return Objects.hashCode(this.southwest, this.northeast);
    }

    @NonNull
    public LatLngBounds including(@NonNull LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double dMin = Math.min(this.southwest.latitude, latLng2.latitude);
        double dMax = Math.max(this.northeast.latitude, latLng2.latitude);
        double d = this.northeast.longitude;
        double d5 = this.southwest.longitude;
        double d6 = latLng2.longitude;
        if (!zza(d6)) {
            if (((d5 - d6) + 360.0d) % 360.0d < ((d6 - d) + 360.0d) % 360.0d) {
                d5 = d6;
            } else {
                d = d6;
            }
        }
        return new LatLngBounds(new LatLng(dMin, d5), new LatLng(dMax, d));
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("southwest", this.southwest).add("northeast", this.northeast).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        LatLng latLng = this.southwest;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, latLng, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.northeast, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
