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
@SafeParcelable.Class(creator = "GetRangingCapabilitiesParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzpe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpe> CREATOR = new zzpf();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzpm f45583zza;

    private zzpe() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzpe) {
            return Objects.equal(this.f45583zza, ((zzpe) obj2).f45583zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45583zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.f45583zza.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzpe(@SafeParcelable.Param(id = 1) IBinder iBinder) {
        zzpm zzpkVar;
        if (iBinder == null) {
            zzpkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IRangingCapabilitiesResultListener");
            zzpkVar = iInterfaceQueryLocalInterface instanceof zzpm ? (zzpm) iInterfaceQueryLocalInterface : new zzpk(iBinder);
        }
        this.f45583zza = zzpkVar;
    }

    public /* synthetic */ zzpe(zzpd zzpdVar) {
    }
}
