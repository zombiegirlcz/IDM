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
@SafeParcelable.Class(creator = "GetCalibrationConfidenceParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzba extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIntCallbackAsBinder", id = 1, type = "android.os.IBinder")
    private zzdm f45099zza;

    private zzba() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzba) {
            return Objects.equal(this.f45099zza, ((zzba) obj2).f45099zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45099zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.f45099zza.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzba(@SafeParcelable.Param(id = 1) IBinder iBinder) {
        zzdm zzdkVar;
        if (iBinder == null) {
            zzdkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IIntCallback");
            zzdkVar = iInterfaceQueryLocalInterface instanceof zzdm ? (zzdm) iInterfaceQueryLocalInterface : new zzdk(iBinder);
        }
        this.f45099zza = zzdkVar;
    }

    public /* synthetic */ zzba(zzaz zzazVar) {
    }
}
