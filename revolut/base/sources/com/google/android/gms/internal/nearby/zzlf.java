package com.google.android.gms.internal.nearby;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "OnEndpointFoundParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzlf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlf> CREATOR = new zzlg();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndpointId", id = 1)
    private String f45399zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getServiceId", id = 2)
    private String f45400zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndpointName", id = 3)
    private String f45401zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBluetoothDevice", id = 4)
    private BluetoothDevice f45402zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndpointInfo", id = 5)
    private byte[] f45403zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", id = 6)
    private final int f45404zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 7)
    private com.google.android.gms.nearby.connection.zzo f45405zzg;

    private zzlf() {
        this.f45404zzf = 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzlf) {
            zzlf zzlfVar = (zzlf) obj2;
            if (Objects.equal(this.f45399zza, zzlfVar.f45399zza) && Objects.equal(this.f45400zzb, zzlfVar.f45400zzb) && Objects.equal(this.f45401zzc, zzlfVar.f45401zzc) && Objects.equal(this.f45402zzd, zzlfVar.f45402zzd) && Arrays.equals(this.f45403zze, zzlfVar.f45403zze) && Objects.equal(Integer.valueOf(this.f45404zzf), Integer.valueOf(zzlfVar.f45404zzf)) && Objects.equal(this.f45405zzg, zzlfVar.f45405zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45399zza, this.f45400zzb, this.f45401zzc, this.f45402zzd, Integer.valueOf(Arrays.hashCode(this.f45403zze)), Integer.valueOf(this.f45404zzf), this.f45405zzg);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f45399zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.f45400zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f45401zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f45402zzd, i, false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.f45403zze, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f45404zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f45405zzg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final BluetoothDevice zza() {
        return this.f45402zzd;
    }

    public final String zzb() {
        return this.f45399zza;
    }

    public final String zzc() {
        return this.f45401zzc;
    }

    public final String zzd() {
        return this.f45400zzb;
    }

    public final byte[] zze() {
        return this.f45403zze;
    }

    @SafeParcelable.Constructor
    public zzlf(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) BluetoothDevice bluetoothDevice, @SafeParcelable.Param(id = 5) byte[] bArr, @SafeParcelable.Param(id = 6) int i, @SafeParcelable.Param(id = 7) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.f45399zza = str;
        this.f45400zzb = str2;
        this.f45401zzc = str3;
        this.f45402zzd = bluetoothDevice;
        this.f45403zze = bArr;
        this.f45404zzf = i;
        this.f45405zzg = zzoVar;
    }
}
