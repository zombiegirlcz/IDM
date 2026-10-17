package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "OnConnectionResultParamsCreator")
public final class zzkz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkz> CREATOR = new zzla();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 1)
    private String f45382zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusCode", id = 2)
    private int f45383zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHandshakeData", id = 3)
    private byte[] f45384zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", id = 4)
    private final int f45385zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPresenceDevice", id = 5)
    private zzoc f45386zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 6)
    private com.google.android.gms.nearby.connection.zzo f45387zzf;

    private zzkz() {
        this.f45385zzd = 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzkz) {
            zzkz zzkzVar = (zzkz) obj2;
            if (Objects.equal(this.f45382zza, zzkzVar.f45382zza) && Objects.equal(Integer.valueOf(this.f45383zzb), Integer.valueOf(zzkzVar.f45383zzb)) && Arrays.equals(this.f45384zzc, zzkzVar.f45384zzc) && Objects.equal(Integer.valueOf(this.f45385zzd), Integer.valueOf(zzkzVar.f45385zzd)) && Objects.equal(this.f45386zze, zzkzVar.f45386zze) && Objects.equal(this.f45387zzf, zzkzVar.f45387zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45382zza, Integer.valueOf(this.f45383zzb), Integer.valueOf(Arrays.hashCode(this.f45384zzc)), Integer.valueOf(this.f45385zzd), this.f45386zze, this.f45387zzf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f45382zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f45383zzb);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f45384zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f45385zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f45386zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f45387zzf, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f45383zzb;
    }

    public final String zzb() {
        return this.f45382zza;
    }

    @SafeParcelable.Constructor
    public zzkz(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) zzoc zzocVar, @SafeParcelable.Param(id = 6) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.f45382zza = str;
        this.f45383zzb = i;
        this.f45384zzc = bArr;
        this.f45385zzd = i2;
        this.f45386zze = zzocVar;
        this.f45387zzf = zzoVar;
    }
}
