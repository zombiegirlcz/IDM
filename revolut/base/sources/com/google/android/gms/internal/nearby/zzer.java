package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeysDataMapping;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "SetDiagnosisKeysDataMappingParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzer extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzer> CREATOR = new zzes();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusCallbackAsBinder", id = 1, type = "android.os.IBinder")
    private IStatusCallback f45143zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDiagnosisKeysDataMapping", id = 2)
    private DiagnosisKeysDataMapping f45144zzb;

    private zzer() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzer) {
            zzer zzerVar = (zzer) obj2;
            if (Objects.equal(this.f45143zza, zzerVar.f45143zza) && Objects.equal(this.f45144zzb, zzerVar.f45144zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45143zza, this.f45144zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.f45143zza.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f45144zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzer(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) DiagnosisKeysDataMapping diagnosisKeysDataMapping) {
        this.f45143zza = IStatusCallback.Stub.asInterface(iBinder);
        this.f45144zzb = diagnosisKeysDataMapping;
    }

    public /* synthetic */ zzer(zzeq zzeqVar) {
    }
}
