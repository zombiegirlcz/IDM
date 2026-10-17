package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "BleConnectivityInfoCreator")
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBleMacAddress", id = 1)
    private final byte[] f47860zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBleGattCharacteristic", id = 2)
    private final byte[] f47861zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getActions", id = 3)
    private final byte[] f47862zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPsm", id = 4)
    private final byte[] f47863zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceToken", id = 5)
    private final byte[] f47864zze;

    @SafeParcelable.Constructor
    public zzg(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) byte[] bArr2, @SafeParcelable.Param(id = 3) byte[] bArr3, @SafeParcelable.Param(id = 4) byte[] bArr4, @SafeParcelable.Param(id = 5) byte[] bArr5) {
        this.f47860zza = bArr;
        this.f47861zzb = bArr2;
        this.f47862zzc = bArr3;
        this.f47863zzd = bArr4;
        this.f47864zze = bArr5;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzg) {
            zzg zzgVar = (zzg) obj2;
            if (Arrays.equals(this.f47860zza, zzgVar.f47860zza) && Arrays.equals(this.f47861zzb, zzgVar.f47861zzb) && Arrays.equals(this.f47862zzc, zzgVar.f47862zzc) && Arrays.equals(this.f47863zzd, zzgVar.f47863zzd) && Arrays.equals(this.f47864zze, zzgVar.f47864zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f47860zza)), Integer.valueOf(Arrays.hashCode(this.f47861zzb)), Integer.valueOf(Arrays.hashCode(this.f47862zzc)), Integer.valueOf(Arrays.hashCode(this.f47863zzd)), Integer.valueOf(Arrays.hashCode(this.f47864zze)));
    }

    public final String toString() {
        byte[] bArr = this.f47860zza;
        Integer numValueOf = bArr == null ? null : Integer.valueOf(Arrays.hashCode(bArr));
        byte[] bArr2 = this.f47861zzb;
        Integer numValueOf2 = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        byte[] bArr3 = this.f47862zzc;
        Integer numValueOf3 = bArr3 == null ? null : Integer.valueOf(Arrays.hashCode(bArr3));
        byte[] bArr4 = this.f47863zzd;
        Integer numValueOf4 = bArr4 == null ? null : Integer.valueOf(Arrays.hashCode(bArr4));
        byte[] bArr5 = this.f47864zze;
        return "BleConnectivityInfo:<bleMacAddress hash: " + numValueOf + ", bleGattCharacteristic hash: " + numValueOf2 + ", actions hash: " + numValueOf3 + ", psm hash: " + numValueOf4 + ", deviceToken hash : " + (bArr5 != null ? Integer.valueOf(Arrays.hashCode(bArr5)) : null) + ">";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.f47860zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, bArr == null ? null : (byte[]) bArr.clone(), false);
        byte[] bArr2 = this.f47861zzb;
        SafeParcelWriter.writeByteArray(parcel, 2, bArr2 == null ? null : (byte[]) bArr2.clone(), false);
        byte[] bArr3 = this.f47862zzc;
        SafeParcelWriter.writeByteArray(parcel, 3, bArr3 == null ? null : (byte[]) bArr3.clone(), false);
        byte[] bArr4 = this.f47863zzd;
        SafeParcelWriter.writeByteArray(parcel, 4, bArr4 == null ? null : (byte[]) bArr4.clone(), false);
        byte[] bArr5 = this.f47864zze;
        SafeParcelWriter.writeByteArray(parcel, 5, bArr5 != null ? (byte[]) bArr5.clone() : null, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
