package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "BleFilterCreator")
public final class zznf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznf> CREATOR = new zzng();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int f45494zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getServiceUuid", id = 4)
    private final ParcelUuid f45495zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getServiceUuidMask", id = 5)
    private final ParcelUuid f45496zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getServiceDataUuid", id = 6)
    private final ParcelUuid f45497zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getServiceData", id = 7)
    private final byte[] f45498zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getServiceDataMask", id = 8)
    private final byte[] f45499zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getManufacturerId", id = 9)
    private final int f45500zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getManufacturerData", id = 10)
    private final byte[] f45501zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getManufacturerDataMask", id = 11)
    private final byte[] f45502zzi;

    @SafeParcelable.Constructor
    public zznf(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 4) ParcelUuid parcelUuid, @SafeParcelable.Param(id = 5) ParcelUuid parcelUuid2, @SafeParcelable.Param(id = 6) ParcelUuid parcelUuid3, @SafeParcelable.Param(id = 7) byte[] bArr, @SafeParcelable.Param(id = 8) byte[] bArr2, @SafeParcelable.Param(id = 9) int i2, @SafeParcelable.Param(id = 10) byte[] bArr3, @SafeParcelable.Param(id = 11) byte[] bArr4) {
        this.f45494zza = i;
        this.f45495zzb = parcelUuid;
        this.f45496zzc = parcelUuid2;
        this.f45497zzd = parcelUuid3;
        this.f45498zze = bArr;
        this.f45499zzf = bArr2;
        this.f45500zzg = i2;
        this.f45501zzh = bArr3;
        this.f45502zzi = bArr4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && zznf.class == obj2.getClass()) {
            zznf zznfVar = (zznf) obj2;
            if (this.f45500zzg == zznfVar.f45500zzg && Arrays.equals(this.f45501zzh, zznfVar.f45501zzh) && Arrays.equals(this.f45502zzi, zznfVar.f45502zzi) && Objects.equal(this.f45497zzd, zznfVar.f45497zzd) && Arrays.equals(this.f45498zze, zznfVar.f45498zze) && Arrays.equals(this.f45499zzf, zznfVar.f45499zzf) && Objects.equal(this.f45495zzb, zznfVar.f45495zzb) && Objects.equal(this.f45496zzc, zznfVar.f45496zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f45500zzg), Integer.valueOf(Arrays.hashCode(this.f45501zzh)), Integer.valueOf(Arrays.hashCode(this.f45502zzi)), this.f45497zzd, Integer.valueOf(Arrays.hashCode(this.f45498zze)), Integer.valueOf(Arrays.hashCode(this.f45499zzf)), this.f45495zzb, this.f45496zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f45494zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f45495zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f45496zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f45497zzd, i, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.f45498zze, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.f45499zzf, false);
        SafeParcelWriter.writeInt(parcel, 9, this.f45500zzg);
        SafeParcelWriter.writeByteArray(parcel, 10, this.f45501zzh, false);
        SafeParcelWriter.writeByteArray(parcel, 11, this.f45502zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
