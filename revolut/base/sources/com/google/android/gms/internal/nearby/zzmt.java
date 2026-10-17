package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "StartAdvertisingParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzmt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmt> CREATOR = new zzmu();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzkn f45479zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallbackAsBinder", id = 2, type = "android.os.IBinder")
    private zzjq f45480zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getName", id = 3)
    private String f45481zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getServiceId", id = 4)
    private String f45482zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDurationMillis", id = 5)
    private long f45483zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getOptions", id = 6)
    private AdvertisingOptions f45484zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionLifecycleListenerAsBinder", id = 7, type = "android.os.IBinder")
    private zzjw f45485zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndpointInfo", id = 8)
    private byte[] f45486zzh;

    private zzmt() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzmt) {
            zzmt zzmtVar = (zzmt) obj2;
            if (Objects.equal(this.f45479zza, zzmtVar.f45479zza) && Objects.equal(this.f45480zzb, zzmtVar.f45480zzb) && Objects.equal(this.f45481zzc, zzmtVar.f45481zzc) && Objects.equal(this.f45482zzd, zzmtVar.f45482zzd) && Objects.equal(Long.valueOf(this.f45483zze), Long.valueOf(zzmtVar.f45483zze)) && Objects.equal(this.f45484zzf, zzmtVar.f45484zzf) && Objects.equal(this.f45485zzg, zzmtVar.f45485zzg) && Arrays.equals(this.f45486zzh, zzmtVar.f45486zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45479zza, this.f45480zzb, this.f45481zzc, this.f45482zzd, Long.valueOf(this.f45483zze), this.f45484zzf, this.f45485zzg, Integer.valueOf(Arrays.hashCode(this.f45486zzh)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkn zzknVar = this.f45479zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzknVar == null ? null : zzknVar.asBinder(), false);
        zzjq zzjqVar = this.f45480zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, zzjqVar == null ? null : zzjqVar.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 3, this.f45481zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.f45482zzd, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f45483zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f45484zzf, i, false);
        zzjw zzjwVar = this.f45485zzg;
        SafeParcelWriter.writeIBinder(parcel, 7, zzjwVar != null ? zzjwVar.asBinder() : null, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.f45486zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzmt(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) IBinder iBinder2, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j2, @SafeParcelable.Param(id = 6) AdvertisingOptions advertisingOptions, @SafeParcelable.Param(id = 7) IBinder iBinder3, @SafeParcelable.Param(id = 8) byte[] bArr) {
        zzkn zzklVar;
        zzjq zzjoVar;
        zzjw zzjuVar = null;
        if (iBinder == null) {
            zzklVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
            zzklVar = iInterfaceQueryLocalInterface instanceof zzkn ? (zzkn) iInterfaceQueryLocalInterface : new zzkl(iBinder);
        }
        if (iBinder2 == null) {
            zzjoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
            zzjoVar = iInterfaceQueryLocalInterface2 instanceof zzjq ? (zzjq) iInterfaceQueryLocalInterface2 : new zzjo(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            zzjuVar = iInterfaceQueryLocalInterface3 instanceof zzjw ? (zzjw) iInterfaceQueryLocalInterface3 : new zzju(iBinder3);
        }
        this.f45479zza = zzklVar;
        this.f45480zzb = zzjoVar;
        this.f45481zzc = str;
        this.f45482zzd = str2;
        this.f45483zze = j2;
        this.f45484zzf = advertisingOptions;
        this.f45485zzg = zzjuVar;
        this.f45486zzh = bArr;
    }

    public /* synthetic */ zzmt(zzms zzmsVar) {
    }
}
