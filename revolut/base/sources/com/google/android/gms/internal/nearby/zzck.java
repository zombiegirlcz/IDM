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
@SafeParcelable.Class(creator = "GetVersionParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzck extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzck> CREATOR = new zzcl();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLongCallbackAsBinder", id = 1, type = "android.os.IBinder")
    private zzdp f45126zza;

    private zzck() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzck) {
            return Objects.equal(this.f45126zza, ((zzck) obj2).f45126zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45126zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.f45126zza.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzck(@SafeParcelable.Param(id = 1) IBinder iBinder) {
        zzdp zzdnVar;
        if (iBinder == null) {
            zzdnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.ILongCallback");
            zzdnVar = iInterfaceQueryLocalInterface instanceof zzdp ? (zzdp) iInterfaceQueryLocalInterface : new zzdn(iBinder);
        }
        this.f45126zza = zzdnVar;
    }

    public /* synthetic */ zzck(zzcj zzcjVar) {
    }
}
