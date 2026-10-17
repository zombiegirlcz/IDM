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
@SafeParcelable.Class(creator = "BluetoothConnectivityInfoCreator")
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBluetoothMacAddress", id = 1)
    private final byte[] f47865zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBluetoothUuid", id = 2)
    private final byte[] f47866zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getActions", id = 3)
    private final byte[] f47867zzc;

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) byte[] bArr2, @SafeParcelable.Param(id = 3) byte[] bArr3) {
        this.f47865zza = bArr;
        this.f47866zzb = bArr2;
        this.f47867zzc = bArr3;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzi) {
            zzi zziVar = (zzi) obj2;
            if (Arrays.equals(this.f47865zza, zziVar.f47865zza) && Arrays.equals(this.f47866zzb, zziVar.f47866zzb) && Arrays.equals(this.f47867zzc, zziVar.f47867zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f47865zza)), Integer.valueOf(Arrays.hashCode(this.f47866zzb)), Integer.valueOf(Arrays.hashCode(this.f47867zzc)));
    }

    public final String toString() {
        byte[] bArr = this.f47865zza;
        Integer numValueOf = bArr == null ? null : Integer.valueOf(Arrays.hashCode(bArr));
        byte[] bArr2 = this.f47866zzb;
        Integer numValueOf2 = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        byte[] bArr3 = this.f47867zzc;
        return "BluetoothConnectivityInfo:<bluetoothMacAddress hash: " + numValueOf + ", bluetoothUuid hash: " + numValueOf2 + ", actions hash: " + (bArr3 != null ? Integer.valueOf(Arrays.hashCode(bArr3)) : null) + ">";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.f47865zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, bArr == null ? null : (byte[]) bArr.clone(), false);
        byte[] bArr2 = this.f47866zzb;
        SafeParcelWriter.writeByteArray(parcel, 2, bArr2 == null ? null : (byte[]) bArr2.clone(), false);
        byte[] bArr3 = this.f47867zzc;
        SafeParcelWriter.writeByteArray(parcel, 3, bArr3 != null ? (byte[]) bArr3.clone() : null, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
