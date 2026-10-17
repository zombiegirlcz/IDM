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
@SafeParcelable.Class(creator = "RequestPreAuthorizedTemporaryExposureKeyHistoryParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzej extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzej> CREATOR = new zzek();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusCallbackAsBinder", id = 1, type = "android.os.IBinder")
    private IStatusCallback f45138zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "getSelfReport", id = 2)
    private boolean f45139zzb;

    private zzej() {
        this.f45139zzb = false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzej) {
            zzej zzejVar = (zzej) obj2;
            if (Objects.equal(this.f45138zza, zzejVar.f45138zza) && Objects.equal(Boolean.valueOf(this.f45139zzb), Boolean.valueOf(zzejVar.f45139zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45138zza, Boolean.valueOf(this.f45139zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.f45138zza.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f45139zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzej(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) boolean z) {
        this.f45138zza = IStatusCallback.Stub.asInterface(iBinder);
        this.f45139zzb = z;
    }
}
