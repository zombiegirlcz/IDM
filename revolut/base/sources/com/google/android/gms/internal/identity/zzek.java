package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
public final class zzek extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzek> CREATOR = new zzel();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRequestId", id = 1)
    private final String f39741zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExpirationTime", id = 2)
    private final long f39742zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getType", id = 3)
    private final short f39743zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLatitude", id = 4)
    private final double f39744zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLongitude", id = 5)
    private final double f39745zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRadius", id = 6)
    private final float f39746zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransitionTypes", id = 7)
    private final int f39747zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getNotificationResponsiveness", id = 8)
    private final int f39748zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLoiteringDelay", id = 9)
    private final int f39749zzi;

    @SafeParcelable.Constructor
    public zzek(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 7) int i, @SafeParcelable.Param(id = 3) short s2, @SafeParcelable.Param(id = 4) double d, @SafeParcelable.Param(id = 5) double d5, @SafeParcelable.Param(id = 6) float f, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 8) int i2, @SafeParcelable.Param(id = 9) int i3) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
        }
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb6 = new StringBuilder(String.valueOf(f).length() + 16);
            sb6.append("invalid radius: ");
            sb6.append(f);
            throw new IllegalArgumentException(sb6.toString());
        }
        if (d > 90.0d || d < -90.0d) {
            StringBuilder sb9 = new StringBuilder(String.valueOf(d).length() + 18);
            sb9.append("invalid latitude: ");
            sb9.append(d);
            throw new IllegalArgumentException(sb9.toString());
        }
        if (d5 > 180.0d || d5 < -180.0d) {
            StringBuilder sb10 = new StringBuilder(String.valueOf(d5).length() + 19);
            sb10.append("invalid longitude: ");
            sb10.append(d5);
            throw new IllegalArgumentException(sb10.toString());
        }
        int i5 = i & 7;
        if (i5 == 0) {
            throw new IllegalArgumentException(a.s(new StringBuilder(String.valueOf(i).length() + 35), "No supported transition specified: ", i));
        }
        this.f39743zzc = s2;
        this.f39741zza = str;
        this.f39744zzd = d;
        this.f39745zze = d5;
        this.f39746zzf = f;
        this.f39742zzb = j2;
        this.f39747zzg = i5;
        this.f39748zzh = i2;
        this.f39749zzi = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzek) {
            zzek zzekVar = (zzek) obj2;
            if (this.f39746zzf == zzekVar.f39746zzf && this.f39744zzd == zzekVar.f39744zzd && this.f39745zze == zzekVar.f39745zze && this.f39743zzc == zzekVar.f39743zzc && this.f39747zzg == zzekVar.f39747zzg) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final long getExpirationTime() {
        return this.f39742zzb;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLatitude() {
        return this.f39744zzd;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getLoiteringDelay() {
        return this.f39749zzi;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLongitude() {
        return this.f39745zze;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getNotificationResponsiveness() {
        return this.f39748zzh;
    }

    @Override // com.google.android.gms.location.Geofence
    public final float getRadius() {
        return this.f39746zzf;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.f39741zza;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getTransitionTypes() {
        return this.f39747zzg;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f39744zzd);
        long j2 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f39745zze);
        return ((((Float.floatToIntBits(this.f39746zzf) + ((((((int) j2) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31)) * 31) + this.f39743zzc) * 31) + this.f39747zzg;
    }

    public final String toString() {
        short s2 = this.f39743zzc;
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s2 != -1 ? s2 != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.f39741zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.f39747zzg), Double.valueOf(this.f39744zzd), Double.valueOf(this.f39745zze), Float.valueOf(this.f39746zzf), Integer.valueOf(this.f39748zzh / 1000), Integer.valueOf(this.f39749zzi), Long.valueOf(this.f39742zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f39741zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeLong(parcel, 2, this.f39742zzb);
        SafeParcelWriter.writeShort(parcel, 3, this.f39743zzc);
        SafeParcelWriter.writeDouble(parcel, 4, this.f39744zzd);
        SafeParcelWriter.writeDouble(parcel, 5, this.f39745zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.f39746zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.f39747zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.f39748zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.f39749zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
