package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PresenceDeviceCreator")
public final class zzoc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoc> CREATOR = new zzod();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final String[] f45543zza = {"UNKNOWN", "PHONE", "TABLET", "DISPLAY", "LAPTOP", "TV", "WATCH", "CHROMEOS", "FOLDABLE", "AUTOMOTIVE", "SPEAKER"};

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceId", id = 1)
    private final long f45544zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceName", id = 2)
    private final String f45545zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceType", id = 3)
    private final int f45546zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceImageUrl", id = 4)
    private final String f45547zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDiscoveryTimestampMillis", id = 5)
    private final long f45548zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndpointId", id = 6)
    private final String f45549zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndpointInfo", id = 7)
    private final byte[] f45550zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBluetoothMacAddress", id = 8)
    private final byte[] f45551zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getActions", id = 9)
    private final List f45552zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.nearby.presence.PresenceIdentity.IdentityType.PRIVATE", getter = "getIdentityType", id = 10)
    private final int f45553zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectivityBytes", id = 11)
    private final byte[] f45554zzl;

    @SafeParcelable.Field(getter = "getDataElements", id = 12)
    private final zznw zzm;

    @SafeParcelable.Field(defaultValue = "0", getter = "getDiscoveryMedium", id = 13)
    private final int zzn;

    @SafeParcelable.Field(defaultValue = "0", getter = "getInstanceType", id = 14)
    private final int zzo;

    @SafeParcelable.Field(getter = "getDusi", id = 15)
    private final String zzp;

    @SafeParcelable.Constructor
    public zzoc(@SafeParcelable.Param(id = 1) long j2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j3, @SafeParcelable.Param(id = 6) String str3, @SafeParcelable.Param(id = 7) byte[] bArr, @SafeParcelable.Param(id = 8) byte[] bArr2, @SafeParcelable.Param(id = 9) List list, @SafeParcelable.Param(id = 10) int i2, @SafeParcelable.Param(id = 11) byte[] bArr3, @SafeParcelable.Param(id = 12) zznw zznwVar, @SafeParcelable.Param(id = 13) int i3, @SafeParcelable.Param(id = 14) int i5, @SafeParcelable.Param(id = 15) String str4) {
        this.f45544zzb = j2;
        this.f45545zzc = str;
        this.f45546zzd = i;
        this.f45547zze = str2;
        this.f45548zzf = j3;
        this.f45549zzg = str3;
        this.f45550zzh = bArr;
        this.f45551zzi = bArr2;
        this.f45552zzj = list;
        this.f45553zzk = i2;
        this.f45554zzl = bArr3;
        this.zzm = zznwVar;
        this.zzn = i3;
        this.zzo = i5;
        this.zzp = str4;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzoc) {
            zzoc zzocVar = (zzoc) obj2;
            if (Objects.equal(Long.valueOf(this.f45544zzb), Long.valueOf(zzocVar.f45544zzb)) && Objects.equal(this.f45545zzc, zzocVar.f45545zzc) && Objects.equal(Integer.valueOf(this.f45546zzd), Integer.valueOf(zzocVar.f45546zzd)) && Objects.equal(this.f45547zze, zzocVar.f45547zze) && Objects.equal(this.f45549zzg, zzocVar.f45549zzg) && Arrays.equals(this.f45550zzh, zzocVar.f45550zzh) && Arrays.equals(this.f45551zzi, zzocVar.f45551zzi) && Objects.equal(this.f45552zzj, zzocVar.f45552zzj) && Objects.equal(Integer.valueOf(this.f45553zzk), Integer.valueOf(zzocVar.f45553zzk)) && Arrays.equals(this.f45554zzl, zzocVar.f45554zzl) && Objects.equal(this.zzm, zzocVar.zzm) && Objects.equal(Integer.valueOf(this.zzn), Integer.valueOf(zzocVar.zzn)) && Objects.equal(Integer.valueOf(this.zzo), Integer.valueOf(zzocVar.zzo)) && Objects.equal(this.zzp, zzocVar.zzp)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f45544zzb), this.f45545zzc, Integer.valueOf(this.f45546zzd), this.f45547zze, this.f45549zzg, Integer.valueOf(Arrays.hashCode(this.f45550zzh)), Integer.valueOf(Arrays.hashCode(this.f45551zzi)), this.f45552zzj, Integer.valueOf(this.f45553zzk), Integer.valueOf(Arrays.hashCode(this.f45554zzl)), this.zzm, Integer.valueOf(this.zzn), Integer.valueOf(this.zzo), this.zzp);
    }

    public final String toString() {
        char c2;
        Long lValueOf = Long.valueOf(this.f45544zzb);
        String str = this.f45545zzc;
        switch (this.f45546zzd) {
            case 1:
                c2 = 1;
                break;
            case 2:
                c2 = 2;
                break;
            case 3:
                c2 = 3;
                break;
            case 4:
                c2 = 4;
                break;
            case 5:
                c2 = 5;
                break;
            case 6:
                c2 = 6;
                break;
            case 7:
                c2 = 7;
                break;
            case 8:
                c2 = '\b';
                break;
            case 9:
                c2 = '\t';
                break;
            case 10:
                c2 = '\n';
                break;
            default:
                c2 = 0;
                break;
        }
        String str2 = f45543zza[c2];
        String str3 = this.f45547zze;
        Long lValueOf2 = Long.valueOf(this.f45548zzf);
        String str4 = this.f45549zzg;
        byte[] bArr = this.f45550zzh;
        String string = bArr == null ? null : Arrays.toString(bArr);
        byte[] bArr2 = this.f45551zzi;
        Integer numValueOf = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        List list = this.f45552zzj;
        Integer numValueOf2 = Integer.valueOf(this.f45553zzk);
        byte[] bArr3 = this.f45554zzl;
        return String.format("PresenceDevice:<deviceId: %s, deviceName: %s, deviceType: %s, deviceImageUrl: %s, discoveryTimestampMillis: %s, endpointId: %s, endpointInfo: %s, bluetoothMacAddress hash: %s, actions: %s, identityType: %s, connectivityBytes hash: %s, dataElements: %s, discoveryMedium: %s, instance type %s>, Dusi: %s", lValueOf, str, str2, str3, lValueOf2, str4, string, numValueOf, list, numValueOf2, bArr3 != null ? Arrays.toString(bArr3) : null, this.zzm, Integer.valueOf(this.zzn), com.google.android.gms.nearby.connection.zzr.zza(this.zzo), this.zzp);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j2 = this.f45544zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j2);
        SafeParcelWriter.writeString(parcel, 2, this.f45545zzc, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f45546zzd);
        SafeParcelWriter.writeString(parcel, 4, this.f45547zze, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f45548zzf);
        SafeParcelWriter.writeString(parcel, 6, this.f45549zzg, false);
        byte[] bArr = this.f45550zzh;
        SafeParcelWriter.writeByteArray(parcel, 7, bArr == null ? null : (byte[]) bArr.clone(), false);
        byte[] bArr2 = this.f45551zzi;
        SafeParcelWriter.writeByteArray(parcel, 8, bArr2 != null ? (byte[]) bArr2.clone() : null, false);
        List list = this.f45552zzj;
        SafeParcelWriter.writeTypedList(parcel, 9, list == null ? zzua.zzk() : zzua.zzj(list), false);
        SafeParcelWriter.writeInt(parcel, 10, this.f45553zzk);
        SafeParcelWriter.writeByteArray(parcel, 11, this.f45554zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzm, i, false);
        SafeParcelWriter.writeInt(parcel, 13, this.zzn);
        SafeParcelWriter.writeInt(parcel, 14, this.zzo);
        SafeParcelWriter.writeString(parcel, 15, this.zzp, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
