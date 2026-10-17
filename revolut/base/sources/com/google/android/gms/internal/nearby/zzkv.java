package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "OnConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzkv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkv> CREATOR = new zzkw();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 1)
    private String f45376zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointName", id = 2)
    private String f45377zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHandshakeData", id = 3)
    private byte[] f45378zzc;

    private zzkv() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzkv) {
            zzkv zzkvVar = (zzkv) obj2;
            if (Objects.equal(this.f45376zza, zzkvVar.f45376zza) && Objects.equal(this.f45377zzb, zzkvVar.f45377zzb) && Arrays.equals(this.f45378zzc, zzkvVar.f45378zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45376zza, this.f45377zzb, Integer.valueOf(Arrays.hashCode(this.f45378zzc)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f45376zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.f45377zzb, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f45378zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zza() {
        return this.f45376zza;
    }

    public final String zzb() {
        return this.f45377zzb;
    }

    public final byte[] zzc() {
        return this.f45378zzc;
    }

    @SafeParcelable.Constructor
    public zzkv(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) byte[] bArr) {
        this.f45376zza = str;
        this.f45377zzb = str2;
        this.f45378zzc = bArr;
    }
}
