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
@SafeParcelable.Class(creator = "GetExposureSummaryParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbr();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExposureSummaryCallbackAsBinder", id = 2, type = "android.os.IBinder")
    private zzdf f45110zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getToken", id = 3)
    private String f45111zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExposureSummaryResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzdg f45112zzc;

    private zzbq() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzbq) {
            zzbq zzbqVar = (zzbq) obj2;
            if (Objects.equal(this.f45112zzc, zzbqVar.f45112zzc) && Objects.equal(this.f45110zza, zzbqVar.f45110zza) && Objects.equal(this.f45111zzb, zzbqVar.f45111zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45112zzc, this.f45110zza, this.f45111zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzdg zzdgVar = this.f45112zzc;
        SafeParcelWriter.writeIBinder(parcel, 1, zzdgVar == null ? null : zzdgVar.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f45110zza.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 3, this.f45111zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbq(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) IBinder iBinder2, @SafeParcelable.Param(id = 3) String str) {
        zzdg zzdgVar;
        zzdf zzddVar = null;
        if (iBinder == null) {
            zzdgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryResultListener");
            zzdgVar = iInterfaceQueryLocalInterface instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface : new zzdg(iBinder);
        }
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryCallback");
            zzddVar = iInterfaceQueryLocalInterface2 instanceof zzdf ? (zzdf) iInterfaceQueryLocalInterface2 : new zzdd(iBinder2);
        }
        this.f45112zzc = zzdgVar;
        this.f45110zza = zzddVar;
        this.f45111zzb = str;
    }

    public /* synthetic */ zzbq(zzbp zzbpVar) {
    }
}
