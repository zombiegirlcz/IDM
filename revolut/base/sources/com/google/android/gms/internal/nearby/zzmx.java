package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "StartDiscoveryParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzmx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmx> CREATOR = new zzmy();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzkk f45488zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getServiceId", id = 3)
    private String f45489zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDurationMillis", id = 4)
    private long f45490zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getOptions", id = 5)
    private DiscoveryOptions f45491zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDiscoveryListenerAsBinder", id = 6, type = "android.os.IBinder")
    private zzkd f45492zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallbackAsBinder", id = 2, type = "android.os.IBinder")
    private zzka f45493zzf;

    private zzmx() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzmx) {
            zzmx zzmxVar = (zzmx) obj2;
            if (Objects.equal(this.f45488zza, zzmxVar.f45488zza) && Objects.equal(this.f45493zzf, zzmxVar.f45493zzf) && Objects.equal(this.f45489zzb, zzmxVar.f45489zzb) && Objects.equal(Long.valueOf(this.f45490zzc), Long.valueOf(zzmxVar.f45490zzc)) && Objects.equal(this.f45491zzd, zzmxVar.f45491zzd) && Objects.equal(this.f45492zze, zzmxVar.f45492zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45488zza, this.f45493zzf, this.f45489zzb, Long.valueOf(this.f45490zzc), this.f45491zzd, this.f45492zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkk zzkkVar = this.f45488zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzkkVar == null ? null : zzkkVar.asBinder(), false);
        zzka zzkaVar = this.f45493zzf;
        SafeParcelWriter.writeIBinder(parcel, 2, zzkaVar == null ? null : zzkaVar.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 3, this.f45489zzb, false);
        SafeParcelWriter.writeLong(parcel, 4, this.f45490zzc);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f45491zzd, i, false);
        zzkd zzkdVar = this.f45492zze;
        SafeParcelWriter.writeIBinder(parcel, 6, zzkdVar != null ? zzkdVar.asBinder() : null, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzmx(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) IBinder iBinder2, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) long j2, @SafeParcelable.Param(id = 5) DiscoveryOptions discoveryOptions, @SafeParcelable.Param(id = 6) IBinder iBinder3) {
        zzkk zzkiVar;
        zzka zzkaVar;
        zzkd zzkbVar = null;
        if (iBinder == null) {
            zzkiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzkiVar = iInterfaceQueryLocalInterface instanceof zzkk ? (zzkk) iInterfaceQueryLocalInterface : new zzki(iBinder);
        }
        if (iBinder2 == null) {
            zzkaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
            zzkaVar = iInterfaceQueryLocalInterface2 instanceof zzka ? (zzka) iInterfaceQueryLocalInterface2 : new zzka(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
            zzkbVar = iInterfaceQueryLocalInterface3 instanceof zzkd ? (zzkd) iInterfaceQueryLocalInterface3 : new zzkb(iBinder3);
        }
        this.f45488zza = zzkiVar;
        this.f45493zzf = zzkaVar;
        this.f45489zzb = str;
        this.f45490zzc = j2;
        this.f45491zzd = discoveryOptions;
        this.f45492zze = zzkbVar;
    }

    public /* synthetic */ zzmx(zzmw zzmwVar) {
    }
}
