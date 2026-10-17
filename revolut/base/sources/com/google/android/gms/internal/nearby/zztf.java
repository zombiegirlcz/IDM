package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "UwbDeviceParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zztf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztf> CREATOR = new zztg();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAddress", id = 1)
    private zzrx f45707zza;

    private zztf() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zztf) {
            return Objects.equal(this.f45707zza, ((zztf) obj2).f45707zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45707zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f45707zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzrx zza() {
        return this.f45707zza;
    }

    @SafeParcelable.Constructor
    public zztf(@SafeParcelable.Param(id = 1) zzrx zzrxVar) {
        this.f45707zza = zzrxVar;
    }

    public /* synthetic */ zztf(zzte zzteVar) {
    }
}
