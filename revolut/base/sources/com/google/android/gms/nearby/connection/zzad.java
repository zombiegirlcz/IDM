package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "WifiLanConnectivityInfoCreator")
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPort", id = 1)
    private final byte[] f47854zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIpAddress", id = 2)
    private final byte[] f47855zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBssid", id = 3)
    private final byte[] f47856zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getActions", id = 4)
    private final byte[] f47857zzd;

    @SafeParcelable.Constructor
    public zzad(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) byte[] bArr2, @SafeParcelable.Param(id = 3) byte[] bArr3, @SafeParcelable.Param(id = 4) byte[] bArr4) {
        this.f47854zza = bArr;
        this.f47855zzb = bArr2;
        this.f47856zzc = bArr3;
        this.f47857zzd = bArr4;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzad) {
            zzad zzadVar = (zzad) obj2;
            if (Arrays.equals(this.f47854zza, zzadVar.f47854zza) && Arrays.equals(this.f47855zzb, zzadVar.f47855zzb) && Arrays.equals(this.f47856zzc, zzadVar.f47856zzc) && Arrays.equals(this.f47857zzd, zzadVar.f47857zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f47854zza)), Integer.valueOf(Arrays.hashCode(this.f47855zzb)), Integer.valueOf(Arrays.hashCode(this.f47856zzc)), Integer.valueOf(Arrays.hashCode(this.f47857zzd)));
    }

    public final String toString() {
        int iHashCode = Arrays.hashCode(this.f47854zza);
        int iHashCode2 = Arrays.hashCode(this.f47855zzb);
        int iHashCode3 = Arrays.hashCode(this.f47856zzc);
        int iHashCode4 = Arrays.hashCode(this.f47857zzd);
        StringBuilder sbW = a.w("WifiLanConnectivityInfo:<wifiLanPort hash: ", iHashCode, iHashCode2, ">, <wifiLanIp hash: ", ">, <BSSID hash: ");
        sbW.append(iHashCode3);
        sbW.append(">, <actions hash: ");
        sbW.append(iHashCode4);
        sbW.append(">");
        return sbW.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.f47854zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, bArr == null ? null : (byte[]) bArr.clone(), false);
        byte[] bArr2 = this.f47855zzb;
        SafeParcelWriter.writeByteArray(parcel, 2, bArr2 == null ? null : (byte[]) bArr2.clone(), false);
        byte[] bArr3 = this.f47856zzc;
        SafeParcelWriter.writeByteArray(parcel, 3, bArr3 == null ? null : (byte[]) bArr3.clone(), false);
        byte[] bArr4 = this.f47857zzd;
        SafeParcelWriter.writeByteArray(parcel, 4, bArr4 != null ? (byte[]) bArr4.clone() : null, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
