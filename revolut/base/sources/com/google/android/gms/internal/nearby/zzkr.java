package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "OnBandwidthChangedParamsCreator")
public final class zzkr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkr> CREATOR = new zzks();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 1)
    private String f45358zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getQuality", id = 2)
    private int f45359zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getMedium", id = 3)
    private final int f45360zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", id = 4)
    private final int f45361zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPresenceDevice", id = 5)
    private zzoc f45362zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 6)
    private com.google.android.gms.nearby.connection.zzo f45363zzf;

    private zzkr() {
        this.f45360zzc = 0;
        this.f45361zzd = 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzkr) {
            zzkr zzkrVar = (zzkr) obj2;
            if (Objects.equal(this.f45358zza, zzkrVar.f45358zza) && Objects.equal(Integer.valueOf(this.f45359zzb), Integer.valueOf(zzkrVar.f45359zzb)) && Objects.equal(Integer.valueOf(this.f45360zzc), Integer.valueOf(zzkrVar.f45360zzc)) && Objects.equal(Integer.valueOf(this.f45361zzd), Integer.valueOf(zzkrVar.f45361zzd)) && Objects.equal(this.f45362zze, zzkrVar.f45362zze) && Objects.equal(this.f45363zzf, zzkrVar.f45363zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45358zza, Integer.valueOf(this.f45359zzb), Integer.valueOf(this.f45360zzc), Integer.valueOf(this.f45361zzd), this.f45362zze, this.f45363zzf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f45358zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f45359zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.f45360zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.f45361zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f45362zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f45363zzf, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f45360zzc;
    }

    public final int zzb() {
        return this.f45359zzb;
    }

    public final String zzc() {
        return this.f45358zza;
    }

    @SafeParcelable.Constructor
    public zzkr(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) zzoc zzocVar, @SafeParcelable.Param(id = 6) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.f45358zza = str;
        this.f45359zzb = i;
        this.f45360zzc = i2;
        this.f45361zzd = i3;
        this.f45362zze = zzocVar;
        this.f45363zzf = zzoVar;
    }
}
