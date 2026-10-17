package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "RequestPreAuthorizedTemporaryExposureKeyReleaseParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzen> CREATOR = new zzeo();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusCallbackAsBinder", id = 1, type = "android.os.IBinder")
    private IStatusCallback f45141zza;

    private zzen() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzen) {
            return Objects.equal(this.f45141zza, ((zzen) obj2).f45141zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45141zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.f45141zza.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzen(@SafeParcelable.Param(id = 1) IBinder iBinder) {
        this.f45141zza = IStatusCallback.Stub.asInterface(iBinder);
    }

    public /* synthetic */ zzen(zzem zzemVar) {
    }
}
