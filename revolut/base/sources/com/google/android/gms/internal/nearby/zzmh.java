package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "RejectConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzmh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmh> CREATOR = new zzmi();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzkk f45452zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 2)
    private String f45453zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", id = 3)
    private final int f45454zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPresenceDevice", id = 4)
    private zzoc f45455zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 5)
    private com.google.android.gms.nearby.connection.zzo f45456zze;

    private zzmh() {
        this.f45454zzc = 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzmh) {
            zzmh zzmhVar = (zzmh) obj2;
            if (Objects.equal(this.f45452zza, zzmhVar.f45452zza) && Objects.equal(this.f45453zzb, zzmhVar.f45453zzb) && Objects.equal(Integer.valueOf(this.f45454zzc), Integer.valueOf(zzmhVar.f45454zzc)) && Objects.equal(this.f45455zzd, zzmhVar.f45455zzd) && Objects.equal(this.f45456zze, zzmhVar.f45456zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45452zza, this.f45453zzb, Integer.valueOf(this.f45454zzc), this.f45455zzd, this.f45456zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkk zzkkVar = this.f45452zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzkkVar == null ? null : zzkkVar.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 2, this.f45453zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f45454zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f45455zzd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f45456zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzmh(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) zzoc zzocVar, @SafeParcelable.Param(id = 5) com.google.android.gms.nearby.connection.zzo zzoVar) {
        zzkk zzkiVar;
        if (iBinder == null) {
            zzkiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzkiVar = iInterfaceQueryLocalInterface instanceof zzkk ? (zzkk) iInterfaceQueryLocalInterface : new zzki(iBinder);
        }
        this.f45452zza = zzkiVar;
        this.f45453zzb = str;
        this.f45454zzc = i;
        this.f45455zzd = zzocVar;
        this.f45456zze = zzoVar;
    }
}
