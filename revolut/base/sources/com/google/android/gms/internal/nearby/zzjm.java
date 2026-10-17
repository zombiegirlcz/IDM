package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "DisconnectFromEndpointParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzjm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjm> CREATOR = new zzjn();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 1)
    private String f45344zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", id = 2)
    private final int f45345zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPresenceDevice", id = 3)
    private zzoc f45346zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 4)
    private com.google.android.gms.nearby.connection.zzo f45347zzd;

    private zzjm() {
        this.f45345zzb = 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzjm) {
            zzjm zzjmVar = (zzjm) obj2;
            if (Objects.equal(this.f45344zza, zzjmVar.f45344zza) && Objects.equal(Integer.valueOf(this.f45345zzb), Integer.valueOf(zzjmVar.f45345zzb)) && Objects.equal(this.f45346zzc, zzjmVar.f45346zzc) && Objects.equal(this.f45347zzd, zzjmVar.f45347zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45344zza, Integer.valueOf(this.f45345zzb), this.f45346zzc, this.f45347zzd);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f45344zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f45345zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f45346zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f45347zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzjm(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) zzoc zzocVar, @SafeParcelable.Param(id = 4) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.f45344zza = str;
        this.f45345zzb = i;
        this.f45346zzc = zzocVar;
        this.f45347zzd = zzoVar;
    }
}
