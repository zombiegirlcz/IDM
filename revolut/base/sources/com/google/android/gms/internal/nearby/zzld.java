package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "OnEndpointDistanceChangedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzld extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzld> CREATOR = new zzle();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndpointId", id = 1)
    private String f45394zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDistance", id = 2)
    private int f45395zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUwbRangingData", id = 3)
    private com.google.android.gms.nearby.connection.zzz f45396zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", id = 4)
    private final int f45397zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 5)
    private com.google.android.gms.nearby.connection.zzo f45398zze;

    private zzld() {
        this.f45397zzd = 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzld) {
            zzld zzldVar = (zzld) obj2;
            if (Objects.equal(this.f45394zza, zzldVar.f45394zza) && Objects.equal(Integer.valueOf(this.f45395zzb), Integer.valueOf(zzldVar.f45395zzb)) && Objects.equal(this.f45396zzc, zzldVar.f45396zzc) && Objects.equal(Integer.valueOf(this.f45397zzd), Integer.valueOf(zzldVar.f45397zzd)) && Objects.equal(this.f45398zze, zzldVar.f45398zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45394zza, Integer.valueOf(this.f45395zzb), this.f45396zzc, Integer.valueOf(this.f45397zzd), this.f45398zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f45394zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f45395zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f45396zzc, i, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f45397zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f45398zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f45395zzb;
    }

    public final com.google.android.gms.nearby.connection.zzz zzb() {
        return this.f45396zzc;
    }

    public final String zzc() {
        return this.f45394zza;
    }

    @SafeParcelable.Constructor
    public zzld(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) com.google.android.gms.nearby.connection.zzz zzzVar, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.f45394zza = str;
        this.f45395zzb = i;
        this.f45396zzc = zzzVar;
        this.f45397zzd = i2;
        this.f45398zze = zzoVar;
    }
}
