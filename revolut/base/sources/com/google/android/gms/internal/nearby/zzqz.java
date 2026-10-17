package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.uwb.RangingPosition;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "RangingPositionParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzqz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqz> CREATOR = new zzra();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDistance", id = 1)
    private zzqt f45627zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAzimuth", id = 2)
    private zzqt f45628zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getElevation", id = 3)
    private zzqt f45629zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getElapsedRealtimeNanos", id = 4)
    private long f45630zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "-128", getter = "getRssi", id = 5)
    private final int f45631zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDlTdoaMeasurement", id = 6)
    private zzos f45632zzf;

    private zzqz() {
        this.f45631zze = RangingPosition.RSSI_UNKNOWN;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzqz) {
            zzqz zzqzVar = (zzqz) obj2;
            if (Objects.equal(this.f45627zza, zzqzVar.f45627zza) && Objects.equal(this.f45628zzb, zzqzVar.f45628zzb) && Objects.equal(this.f45629zzc, zzqzVar.f45629zzc) && Objects.equal(Long.valueOf(this.f45630zzd), Long.valueOf(zzqzVar.f45630zzd)) && Objects.equal(Integer.valueOf(this.f45631zze), Integer.valueOf(zzqzVar.f45631zze)) && Objects.equal(this.f45632zzf, zzqzVar.f45632zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45627zza, this.f45628zzb, this.f45629zzc, Long.valueOf(this.f45630zzd), Integer.valueOf(this.f45631zze), this.f45632zzf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f45627zza, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f45628zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f45629zzc, i, false);
        SafeParcelWriter.writeLong(parcel, 4, this.f45630zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.f45631zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f45632zzf, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f45631zze;
    }

    public final long zzb() {
        return this.f45630zzd;
    }

    public final zzqt zzc() {
        return this.f45628zzb;
    }

    public final zzqt zzd() {
        return this.f45627zza;
    }

    public final zzqt zze() {
        return this.f45629zzc;
    }

    @SafeParcelable.Constructor
    public zzqz(@SafeParcelable.Param(id = 1) zzqt zzqtVar, @SafeParcelable.Param(id = 2) zzqt zzqtVar2, @SafeParcelable.Param(id = 3) zzqt zzqtVar3, @SafeParcelable.Param(id = 4) long j2, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) zzos zzosVar) {
        this.f45627zza = zzqtVar;
        this.f45628zzb = zzqtVar2;
        this.f45629zzc = zzqtVar3;
        this.f45630zzd = j2;
        this.f45631zze = i;
        this.f45632zzf = zzosVar;
    }
}
