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
@SafeParcelable.Class(creator = "GetLocalAddressParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzpa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpa> CREATOR = new zzpb();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzpv f45581zza;

    private zzpa() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzpa) {
            return Objects.equal(this.f45581zza, ((zzpa) obj2).f45581zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45581zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.f45581zza.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzpa(@SafeParcelable.Param(id = 1) IBinder iBinder) {
        zzpv zzptVar;
        if (iBinder == null) {
            zzptVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IUwbAddressResultListener");
            zzptVar = iInterfaceQueryLocalInterface instanceof zzpv ? (zzpv) iInterfaceQueryLocalInterface : new zzpt(iBinder);
        }
        this.f45581zza = zzptVar;
    }

    public /* synthetic */ zzpa(zzoz zzozVar) {
    }
}
