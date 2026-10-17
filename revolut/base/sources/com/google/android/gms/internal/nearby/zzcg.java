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
@SafeParcelable.Class(creator = "GetTemporaryExposureKeyHistoryParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzcg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcg> CREATOR = new zzch();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTemporaryExposureKeyListCallbackAsBinder", id = 2, type = "android.os.IBinder")
    private zzdy f45123zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTemporaryExposureKeyHistoryResultCallbackAsBinder", id = 1, type = "android.os.IBinder")
    private zzdv f45124zzb;

    private zzcg() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzcg) {
            zzcg zzcgVar = (zzcg) obj2;
            if (Objects.equal(this.f45124zzb, zzcgVar.f45124zzb) && Objects.equal(this.f45123zza, zzcgVar.f45123zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45124zzb, this.f45123zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzdv zzdvVar = this.f45124zzb;
        SafeParcelWriter.writeIBinder(parcel, 1, zzdvVar == null ? null : zzdvVar.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f45123zza.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzcg(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) IBinder iBinder2) {
        zzdv zzdvVar;
        zzdy zzdwVar = null;
        if (iBinder == null) {
            zzdvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.ITemporaryExposureKeyHistoryResultListener");
            zzdvVar = iInterfaceQueryLocalInterface instanceof zzdv ? (zzdv) iInterfaceQueryLocalInterface : new zzdv(iBinder);
        }
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.ITemporaryExposureKeyListCallback");
            zzdwVar = iInterfaceQueryLocalInterface2 instanceof zzdy ? (zzdy) iInterfaceQueryLocalInterface2 : new zzdw(iBinder2);
        }
        this.f45124zzb = zzdvVar;
        this.f45123zza = zzdwVar;
    }

    public /* synthetic */ zzcg(zzcf zzcfVar) {
    }
}
