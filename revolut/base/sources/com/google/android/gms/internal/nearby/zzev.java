package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "StartParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzev extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzev> CREATOR = new zzew();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusCallbackAsBinder", id = 3, type = "android.os.IBinder")
    private IStatusCallback f45146zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExposureConfiguration", id = 4)
    private ExposureConfiguration f45147zzb;

    private zzev() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzev) {
            zzev zzevVar = (zzev) obj2;
            if (Objects.equal(this.f45146zza, zzevVar.f45146zza) && Objects.equal(this.f45147zzb, zzevVar.f45147zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45146zza, this.f45147zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 3, this.f45146zza.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f45147zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzev(@SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) ExposureConfiguration exposureConfiguration) {
        this.f45146zza = IStatusCallback.Stub.asInterface(iBinder);
        this.f45147zzb = exposureConfiguration;
    }

    public /* synthetic */ zzev(zzeu zzeuVar) {
    }
}
