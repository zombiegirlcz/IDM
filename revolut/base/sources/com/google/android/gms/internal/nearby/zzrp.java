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
@SafeParcelable.Class(creator = "StartRangingParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzrp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrp> CREATOR = new zzrq();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzps f45644zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getParams", id = 2)
    private zzqx f45645zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallbackAsBinder", id = 3, type = "android.os.IBinder")
    private zzpp f45646zzc;

    private zzrp() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzrp) {
            zzrp zzrpVar = (zzrp) obj2;
            if (Objects.equal(this.f45644zza, zzrpVar.f45644zza) && Objects.equal(this.f45645zzb, zzrpVar.f45645zzb) && Objects.equal(this.f45646zzc, zzrpVar.f45646zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45644zza, this.f45645zzb, this.f45646zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzps zzpsVar = this.f45644zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzpsVar == null ? null : zzpsVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f45645zzb, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.f45646zzc.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzrp(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) zzqx zzqxVar, @SafeParcelable.Param(id = 3) IBinder iBinder2) {
        zzps zzpqVar;
        zzpp zzpnVar = null;
        if (iBinder == null) {
            zzpqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            zzpqVar = iInterfaceQueryLocalInterface instanceof zzps ? (zzps) iInterfaceQueryLocalInterface : new zzpq(iBinder);
        }
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback");
            zzpnVar = iInterfaceQueryLocalInterface2 instanceof zzpp ? (zzpp) iInterfaceQueryLocalInterface2 : new zzpn(iBinder2);
        }
        this.f45644zza = zzpqVar;
        this.f45645zzb = zzqxVar;
        this.f45646zzc = zzpnVar;
    }

    public /* synthetic */ zzrp(zzro zzroVar) {
    }
}
