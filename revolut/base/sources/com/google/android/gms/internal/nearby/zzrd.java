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
@SafeParcelable.Class(creator = "ReconfigureRangeDataNtfParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzrd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrd> CREATOR = new zzre();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzps f45635zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRangeDataNtfConfig", id = 2)
    private zzql f45636zzb;

    private zzrd() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzrd) {
            zzrd zzrdVar = (zzrd) obj2;
            if (Objects.equal(this.f45635zza, zzrdVar.f45635zza) && Objects.equal(this.f45636zzb, zzrdVar.f45636zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45635zza, this.f45636zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.f45635zza.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f45636zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzrd(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) zzql zzqlVar) {
        zzps zzpqVar;
        if (iBinder == null) {
            zzpqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            zzpqVar = iInterfaceQueryLocalInterface instanceof zzps ? (zzps) iInterfaceQueryLocalInterface : new zzpq(iBinder);
        }
        this.f45635zza = zzpqVar;
        this.f45636zzb = zzqlVar;
    }

    public /* synthetic */ zzrd(zzrc zzrcVar) {
    }
}
