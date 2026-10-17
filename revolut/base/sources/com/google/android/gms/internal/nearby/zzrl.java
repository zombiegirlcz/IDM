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
@SafeParcelable.Class(creator = "RemoveControleeParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzrl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrl> CREATOR = new zzrm();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzps f45641zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAddress", id = 2)
    private zzrx f45642zzb;

    private zzrl() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzrl) {
            zzrl zzrlVar = (zzrl) obj2;
            if (Objects.equal(this.f45641zza, zzrlVar.f45641zza) && Objects.equal(this.f45642zzb, zzrlVar.f45642zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45641zza, this.f45642zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzps zzpsVar = this.f45641zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzpsVar == null ? null : zzpsVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f45642zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzrl(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) zzrx zzrxVar) {
        zzps zzpqVar;
        if (iBinder == null) {
            zzpqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            zzpqVar = iInterfaceQueryLocalInterface instanceof zzps ? (zzps) iInterfaceQueryLocalInterface : new zzpq(iBinder);
        }
        this.f45641zza = zzpqVar;
        this.f45642zzb = zzrxVar;
    }

    public /* synthetic */ zzrl(zzrk zzrkVar) {
    }
}
