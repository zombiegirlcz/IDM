package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "LocationAvailabilityCreator")
@SafeParcelable.Reserved({1000})
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNSUCCESSFUL", id = 4)
    final int f46481zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", getter = "getCellStatus", id = 1)
    private final int f46482zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", getter = "getWifiStatus", id = 2)
    private final int f46483zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "0", getter = "getElapsedRealtimeNs", id = 3)
    private final long f46484zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBatchedStatus", id = 5)
    private final zzal[] f46485zzg;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    public static final LocationAvailability f46479zza = new LocationAvailability(0, 1, 1, 0, null, true);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @NonNull
    public static final LocationAvailability f46480zzb = new LocationAvailability(1000, 1, 1, 0, null, false);

    @NonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzab();

    @SafeParcelable.Constructor
    public LocationAvailability(@SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 5) zzal[] zzalVarArr, @SafeParcelable.Param(id = 6) boolean z) {
        this.f46481zzc = i < 1000 ? 0 : 1000;
        this.f46482zzd = i2;
        this.f46483zze = i3;
        this.f46484zzf = j2;
        this.f46485zzg = zzalVarArr;
    }

    public static LocationAvailability extractLocationAvailability(@NonNull Intent intent) {
        if (!hasLocationAvailability(intent)) {
            return null;
        }
        try {
            return (LocationAvailability) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static boolean hasLocationAvailability(Intent intent) {
        return intent != null && intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj2;
            if (this.f46482zzd == locationAvailability.f46482zzd && this.f46483zze == locationAvailability.f46483zze && this.f46484zzf == locationAvailability.f46484zzf && this.f46481zzc == locationAvailability.f46481zzc && Arrays.equals(this.f46485zzg, locationAvailability.f46485zzg)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f46481zzc));
    }

    public boolean isLocationAvailable() {
        return this.f46481zzc < 1000;
    }

    @NonNull
    public String toString() {
        boolean zIsLocationAvailable = isLocationAvailable();
        StringBuilder sb6 = new StringBuilder(String.valueOf(zIsLocationAvailable).length() + 22);
        sb6.append("LocationAvailability[");
        sb6.append(zIsLocationAvailable);
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.f46482zzd;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.f46483zze);
        SafeParcelWriter.writeLong(parcel, 3, this.f46484zzf);
        SafeParcelWriter.writeInt(parcel, 4, this.f46481zzc);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f46485zzg, i, false);
        SafeParcelWriter.writeBoolean(parcel, 6, isLocationAvailable());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
