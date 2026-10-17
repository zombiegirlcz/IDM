package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "DataChangeListenerResponseCreator")
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getListenerType", id = 1)
    private zzk f48404zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSmartTapTransmissionData", id = 2)
    private zzcl f48405zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSeCardLoadingStateData", id = 3)
    private zzcf f48406zzc;

    private zzi() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzi) {
            zzi zziVar = (zzi) obj2;
            if (Objects.equal(this.f48404zza, zziVar.f48404zza) && Objects.equal(this.f48405zzb, zziVar.f48405zzb) && Objects.equal(this.f48406zzc, zziVar.f48406zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48404zza, this.f48405zzb, this.f48406zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f48404zza, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f48405zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48406zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param(id = 1) zzk zzkVar, @SafeParcelable.Param(id = 2) zzcl zzclVar, @SafeParcelable.Param(id = 3) zzcf zzcfVar) {
        this.f48404zza = zzkVar;
        this.f48405zzb = zzclVar;
        this.f48406zzc = zzcfVar;
    }
}
