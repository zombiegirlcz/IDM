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
@SafeParcelable.Class(creator = "AddControleeWithSessionParamsParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzoo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoo> CREATOR = new zzop();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzps f45563zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getParams", id = 2)
    private zzqr f45564zzb;

    private zzoo() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzoo) {
            zzoo zzooVar = (zzoo) obj2;
            if (Objects.equal(this.f45563zza, zzooVar.f45563zza) && Objects.equal(this.f45564zzb, zzooVar.f45564zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45563zza, this.f45564zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzps zzpsVar = this.f45563zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzpsVar == null ? null : zzpsVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f45564zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzoo(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) zzqr zzqrVar) {
        zzps zzpqVar;
        if (iBinder == null) {
            zzpqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            zzpqVar = iInterfaceQueryLocalInterface instanceof zzps ? (zzps) iInterfaceQueryLocalInterface : new zzpq(iBinder);
        }
        this.f45563zza = zzpqVar;
        this.f45564zzb = zzqrVar;
    }

    public /* synthetic */ zzoo(zzon zzonVar) {
    }
}
