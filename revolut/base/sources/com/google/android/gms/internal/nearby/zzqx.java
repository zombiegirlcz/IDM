package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "RangingParametersParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzqx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqx> CREATOR = new zzqy();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUwbConfigId", id = 1)
    private int f45615zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSessionId", id = 2)
    private int f45616zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSessionKeyInfo", id = 3)
    private byte[] f45617zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getComplexChannel", id = 4)
    private zzsc f45618zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRangingUpdateRate", id = 5)
    private int f45619zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPeerDevices", id = 6)
    private zztf[] f45620zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSubSessionId", id = 7)
    private int f45621zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSubSessionKeyInfo", id = 8)
    private byte[] f45622zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLocalDevice", id = 9)
    private zztf f45623zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRangeDataNtfConfig", id = 10)
    private zzql f45624zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSlotDuration", id = 11)
    private int f45625zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRangingInterval", id = 12)
    private int f45626zzl;

    @SafeParcelable.Field(getter = "getIsAoaDisabled", id = 13)
    private boolean zzm;

    private zzqx() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzqx) {
            zzqx zzqxVar = (zzqx) obj2;
            if (Objects.equal(Integer.valueOf(this.f45615zza), Integer.valueOf(zzqxVar.f45615zza)) && Objects.equal(Integer.valueOf(this.f45616zzb), Integer.valueOf(zzqxVar.f45616zzb)) && Arrays.equals(this.f45617zzc, zzqxVar.f45617zzc) && Objects.equal(this.f45618zzd, zzqxVar.f45618zzd) && Objects.equal(Integer.valueOf(this.f45619zze), Integer.valueOf(zzqxVar.f45619zze)) && Arrays.equals(this.f45620zzf, zzqxVar.f45620zzf) && Objects.equal(Integer.valueOf(this.f45621zzg), Integer.valueOf(zzqxVar.f45621zzg)) && Arrays.equals(this.f45622zzh, zzqxVar.f45622zzh) && Objects.equal(this.f45623zzi, zzqxVar.f45623zzi) && Objects.equal(this.f45624zzj, zzqxVar.f45624zzj) && Objects.equal(Integer.valueOf(this.f45625zzk), Integer.valueOf(zzqxVar.f45625zzk)) && Objects.equal(Integer.valueOf(this.f45626zzl), Integer.valueOf(zzqxVar.f45626zzl)) && Objects.equal(Boolean.valueOf(this.zzm), Boolean.valueOf(zzqxVar.zzm))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f45615zza), Integer.valueOf(this.f45616zzb), Integer.valueOf(Arrays.hashCode(this.f45617zzc)), this.f45618zzd, Integer.valueOf(this.f45619zze), Integer.valueOf(Arrays.hashCode(this.f45620zzf)), Integer.valueOf(this.f45621zzg), Integer.valueOf(Arrays.hashCode(this.f45622zzh)), this.f45623zzi, this.f45624zzj, Integer.valueOf(this.f45625zzk), Integer.valueOf(this.f45626zzl), Boolean.valueOf(this.zzm));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45615zza);
        SafeParcelWriter.writeInt(parcel, 2, this.f45616zzb);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f45617zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f45618zzd, i, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f45619zze);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.f45620zzf, i, false);
        SafeParcelWriter.writeInt(parcel, 7, this.f45621zzg);
        SafeParcelWriter.writeByteArray(parcel, 8, this.f45622zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f45623zzi, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f45624zzj, i, false);
        SafeParcelWriter.writeInt(parcel, 11, this.f45625zzk);
        SafeParcelWriter.writeInt(parcel, 12, this.f45626zzl);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzm);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzqx(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) zzsc zzscVar, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) zztf[] zztfVarArr, @SafeParcelable.Param(id = 7) int i5, @SafeParcelable.Param(id = 8) byte[] bArr2, @SafeParcelable.Param(id = 9) zztf zztfVar, @SafeParcelable.Param(id = 10) zzql zzqlVar, @SafeParcelable.Param(id = 11) int i6, @SafeParcelable.Param(id = 12) int i21, @SafeParcelable.Param(id = 13) boolean z) {
        this.f45615zza = i;
        this.f45616zzb = i2;
        this.f45617zzc = bArr;
        this.f45618zzd = zzscVar;
        this.f45619zze = i3;
        this.f45620zzf = zztfVarArr;
        this.f45621zzg = i5;
        this.f45622zzh = bArr2;
        this.f45623zzi = zztfVar;
        this.f45624zzj = zzqlVar;
        this.f45625zzk = i6;
        this.f45626zzl = i21;
        this.zzm = z;
    }

    public /* synthetic */ zzqx(zzqw zzqwVar) {
    }
}
