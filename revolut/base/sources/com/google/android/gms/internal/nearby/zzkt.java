package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "OnConnectionInitiatedParamsCreator")
public final class zzkt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkt> CREATOR = new zzku();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 1)
    private String f45364zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointName", id = 2)
    private String f45365zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAuthenticationToken", id = 3)
    private String f45366zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIsIncomingConnection", id = 4)
    private boolean f45367zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHandshakeData", id = 5)
    private byte[] f45368zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRawAuthenticationToken", id = 6)
    private byte[] f45369zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointInfo", id = 7)
    private byte[] f45370zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIsConnectionVerified", id = 8)
    private boolean f45371zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", id = 9)
    private final int f45372zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPresenceDevice", id = 10)
    private zzoc f45373zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 11)
    private com.google.android.gms.nearby.connection.zzo f45374zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getAuthenticationResult", id = 12)
    private final int f45375zzl;

    private zzkt() {
        this.f45372zzi = 0;
        this.f45375zzl = 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzkt) {
            zzkt zzktVar = (zzkt) obj2;
            if (Objects.equal(this.f45364zza, zzktVar.f45364zza) && Objects.equal(this.f45365zzb, zzktVar.f45365zzb) && Objects.equal(this.f45366zzc, zzktVar.f45366zzc) && Objects.equal(Boolean.valueOf(this.f45367zzd), Boolean.valueOf(zzktVar.f45367zzd)) && Arrays.equals(this.f45368zze, zzktVar.f45368zze) && Arrays.equals(this.f45369zzf, zzktVar.f45369zzf) && Arrays.equals(this.f45370zzg, zzktVar.f45370zzg) && Objects.equal(Boolean.valueOf(this.f45371zzh), Boolean.valueOf(zzktVar.f45371zzh)) && Objects.equal(Integer.valueOf(this.f45372zzi), Integer.valueOf(zzktVar.f45372zzi)) && Objects.equal(this.f45373zzj, zzktVar.f45373zzj) && Objects.equal(this.f45374zzk, zzktVar.f45374zzk) && Objects.equal(Integer.valueOf(this.f45375zzl), Integer.valueOf(zzktVar.f45375zzl))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45364zza, this.f45365zzb, this.f45366zzc, Boolean.valueOf(this.f45367zzd), Integer.valueOf(Arrays.hashCode(this.f45368zze)), Integer.valueOf(Arrays.hashCode(this.f45369zzf)), Integer.valueOf(Arrays.hashCode(this.f45370zzg)), Boolean.valueOf(this.f45371zzh), Integer.valueOf(this.f45372zzi), this.f45373zzj, this.f45374zzk, Integer.valueOf(this.f45375zzl));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f45364zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.f45365zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f45366zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f45367zzd);
        SafeParcelWriter.writeByteArray(parcel, 5, this.f45368zze, false);
        SafeParcelWriter.writeByteArray(parcel, 6, this.f45369zzf, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.f45370zzg, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f45371zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.f45372zzi);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f45373zzj, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f45374zzk, i, false);
        SafeParcelWriter.writeInt(parcel, 12, this.f45375zzl);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f45375zzl;
    }

    public final String zzb() {
        return this.f45366zzc;
    }

    public final String zzc() {
        return this.f45364zza;
    }

    public final String zzd() {
        return this.f45365zzb;
    }

    public final boolean zze() {
        return this.f45371zzh;
    }

    public final boolean zzf() {
        return this.f45367zzd;
    }

    public final byte[] zzg() {
        return this.f45369zzf;
    }

    public final byte[] zzh() {
        return this.f45370zzg;
    }

    @SafeParcelable.Constructor
    public zzkt(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) byte[] bArr, @SafeParcelable.Param(id = 6) byte[] bArr2, @SafeParcelable.Param(id = 7) byte[] bArr3, @SafeParcelable.Param(id = 8) boolean z3, @SafeParcelable.Param(id = 9) int i, @SafeParcelable.Param(id = 10) zzoc zzocVar, @SafeParcelable.Param(id = 11) com.google.android.gms.nearby.connection.zzo zzoVar, @SafeParcelable.Param(id = 12) int i2) {
        this.f45364zza = str;
        this.f45365zzb = str2;
        this.f45366zzc = str3;
        this.f45367zzd = z;
        this.f45368zze = bArr;
        this.f45369zzf = bArr2;
        this.f45370zzg = bArr3;
        this.f45371zzh = z3;
        this.f45372zzi = i;
        this.f45373zzj = zzocVar;
        this.f45374zzk = zzoVar;
        this.f45375zzl = i2;
    }
}
