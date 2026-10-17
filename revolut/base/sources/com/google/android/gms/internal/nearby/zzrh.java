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
@SafeParcelable.Class(creator = "ReconfigureRangingIntervalParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzrh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrh> CREATOR = new zzri();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzps f45638zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIntervalSkipCount", id = 2)
    private int f45639zzb;

    private zzrh() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzrh) {
            zzrh zzrhVar = (zzrh) obj2;
            if (Objects.equal(this.f45638zza, zzrhVar.f45638zza) && Objects.equal(Integer.valueOf(this.f45639zzb), Integer.valueOf(zzrhVar.f45639zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45638zza, Integer.valueOf(this.f45639zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.f45638zza.asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 2, this.f45639zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzrh(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) int i) {
        zzps zzpqVar;
        if (iBinder == null) {
            zzpqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            zzpqVar = iInterfaceQueryLocalInterface instanceof zzps ? (zzps) iInterfaceQueryLocalInterface : new zzpq(iBinder);
        }
        this.f45638zza = zzpqVar;
        this.f45639zzb = i;
    }

    public /* synthetic */ zzrh(zzrg zzrgVar) {
    }
}
