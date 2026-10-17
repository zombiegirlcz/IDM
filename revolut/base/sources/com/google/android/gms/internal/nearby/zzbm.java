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
@SafeParcelable.Class(creator = "GetExposureInformationParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzbm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbm> CREATOR = new zzbn();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExposureInformationListCallbackAsBinder", id = 2, type = "android.os.IBinder")
    private zzdb f45106zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getToken", id = 3)
    private String f45107zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExposureInformationResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzdc f45108zzc;

    private zzbm() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzbm) {
            zzbm zzbmVar = (zzbm) obj2;
            if (Objects.equal(this.f45108zzc, zzbmVar.f45108zzc) && Objects.equal(this.f45106zza, zzbmVar.f45106zza) && Objects.equal(this.f45107zzb, zzbmVar.f45107zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45108zzc, this.f45106zza, this.f45107zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzdc zzdcVar = this.f45108zzc;
        SafeParcelWriter.writeIBinder(parcel, 1, zzdcVar == null ? null : zzdcVar.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f45106zza.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 3, this.f45107zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbm(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) IBinder iBinder2, @SafeParcelable.Param(id = 3) String str) {
        zzdc zzdcVar;
        zzdb zzczVar = null;
        if (iBinder == null) {
            zzdcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IExposureInformationResultListener");
            zzdcVar = iInterfaceQueryLocalInterface instanceof zzdc ? (zzdc) iInterfaceQueryLocalInterface : new zzdc(iBinder);
        }
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IExposureInformationListCallback");
            zzczVar = iInterfaceQueryLocalInterface2 instanceof zzdb ? (zzdb) iInterfaceQueryLocalInterface2 : new zzcz(iBinder2);
        }
        this.f45108zzc = zzdcVar;
        this.f45106zza = zzczVar;
        this.f45107zzb = str;
    }

    public /* synthetic */ zzbm(zzbl zzblVar) {
    }
}
