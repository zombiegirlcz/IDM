package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "OnPayloadTransferUpdateParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzll extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzll> CREATOR = new zzlm();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 1)
    private String f45415zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUpdate", id = 2)
    private PayloadTransferUpdate f45416zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", id = 3)
    private final int f45417zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPresenceDevice", id = 4)
    private zzoc f45418zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 5)
    private com.google.android.gms.nearby.connection.zzo f45419zze;

    private zzll() {
        this.f45417zzc = 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzll) {
            zzll zzllVar = (zzll) obj2;
            if (Objects.equal(this.f45415zza, zzllVar.f45415zza) && Objects.equal(this.f45416zzb, zzllVar.f45416zzb) && Objects.equal(Integer.valueOf(this.f45417zzc), Integer.valueOf(zzllVar.f45417zzc)) && Objects.equal(this.f45418zzd, zzllVar.f45418zzd) && Objects.equal(this.f45419zze, zzllVar.f45419zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45415zza, this.f45416zzb, Integer.valueOf(this.f45417zzc), this.f45418zzd, this.f45419zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f45415zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f45416zzb, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f45417zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f45418zzd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f45419zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final PayloadTransferUpdate zza() {
        return this.f45416zzb;
    }

    public final String zzb() {
        return this.f45415zza;
    }

    @SafeParcelable.Constructor
    public zzll(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) PayloadTransferUpdate payloadTransferUpdate, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) zzoc zzocVar, @SafeParcelable.Param(id = 5) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.f45415zza = str;
        this.f45416zzb = payloadTransferUpdate;
        this.f45417zzc = i;
        this.f45418zzd = zzocVar;
        this.f45419zze = zzoVar;
    }
}
