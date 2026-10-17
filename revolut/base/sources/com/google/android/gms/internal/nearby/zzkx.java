package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "OnConnectionResponseParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzkx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkx> CREATOR = new zzky();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 1)
    private String f45379zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusCode", id = 2)
    private int f45380zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHandshakeData", id = 3)
    private byte[] f45381zzc;

    private zzkx() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzkx) {
            zzkx zzkxVar = (zzkx) obj2;
            if (Objects.equal(this.f45379zza, zzkxVar.f45379zza) && Objects.equal(Integer.valueOf(this.f45380zzb), Integer.valueOf(zzkxVar.f45380zzb)) && Arrays.equals(this.f45381zzc, zzkxVar.f45381zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45379zza, Integer.valueOf(this.f45380zzb), Integer.valueOf(Arrays.hashCode(this.f45381zzc)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f45379zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f45380zzb);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f45381zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f45380zzb;
    }

    public final String zzb() {
        return this.f45379zza;
    }

    public final byte[] zzc() {
        return this.f45381zzc;
    }

    @SafeParcelable.Constructor
    public zzkx(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) byte[] bArr) {
        this.f45379zza = str;
        this.f45380zzb = i;
        this.f45381zzc = bArr;
    }
}
