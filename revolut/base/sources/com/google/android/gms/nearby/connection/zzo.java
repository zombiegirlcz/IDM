package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j6.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "ConnectionsDeviceCreator")
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final byte[] f47875zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndpointId", id = 1)
    private final String f47876zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndpointInfo", id = 2)
    private final byte[] f47877zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBluetoothMacAddress", id = 3)
    private final byte[] f47878zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getInstanceType", id = 5)
    private final int f47879zze;

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) byte[] bArr2, @SafeParcelable.Param(id = 4) byte[] bArr3, @SafeParcelable.Param(id = 5) int i) {
        this.f47876zzb = str;
        this.f47877zzc = bArr;
        this.f47878zzd = bArr2;
        this.f47875zza = bArr3;
        this.f47879zze = i;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzo) {
            zzo zzoVar = (zzo) obj2;
            if (Objects.equal(this.f47876zzb, zzoVar.f47876zzb) && Arrays.equals(this.f47877zzc, zzoVar.f47877zzc) && Arrays.equals(this.f47878zzd, zzoVar.f47878zzd) && Arrays.equals(this.f47875zza, zzoVar.f47875zza) && this.f47879zze == zzoVar.f47879zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f47876zzb, Integer.valueOf(Arrays.hashCode(this.f47877zzc)), Integer.valueOf(Arrays.hashCode(this.f47878zzd)), Integer.valueOf(Arrays.hashCode(this.f47875zza)), Integer.valueOf(this.f47879zze));
    }

    public final String toString() {
        String str = this.f47876zzb;
        byte[] bArr = this.f47877zzc;
        String string = bArr == null ? null : Arrays.toString(bArr);
        byte[] bArr2 = this.f47875zza;
        return a.w(v0.a.m("ConnectionsDevice:<endpointId: ", str, ", endpointInfo: ", string, ", connectivityBytes: "), bArr2 != null ? Arrays.toString(bArr2) : null, ", instanceType : ", zzr.zza(this.f47879zze), ">");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f47876zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        byte[] bArr = this.f47877zzc;
        SafeParcelWriter.writeByteArray(parcel, 2, bArr == null ? null : (byte[]) bArr.clone(), false);
        byte[] bArr2 = this.f47878zzd;
        SafeParcelWriter.writeByteArray(parcel, 3, bArr2 != null ? (byte[]) bArr2.clone() : null, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f47875zza, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f47879zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
