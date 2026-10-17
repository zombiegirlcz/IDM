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
@SafeParcelable.Class(creator = "StopRangingParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzrt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrt> CREATOR = new zzru();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzps f45648zza;

    private zzrt() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzrt) {
            return Objects.equal(this.f45648zza, ((zzrt) obj2).f45648zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45648zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzps zzpsVar = this.f45648zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzpsVar == null ? null : zzpsVar.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzrt(@SafeParcelable.Param(id = 1) IBinder iBinder) {
        zzps zzpqVar;
        if (iBinder == null) {
            zzpqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            zzpqVar = iInterfaceQueryLocalInterface instanceof zzps ? (zzps) iInterfaceQueryLocalInterface : new zzpq(iBinder);
        }
        this.f45648zza = zzpqVar;
    }

    public /* synthetic */ zzrt(zzrs zzrsVar) {
    }
}
