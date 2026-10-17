package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "OnRangingInitializedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzqd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqd> CREATOR = new zzqe();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDevice", id = 1)
    private zztf f45587zza;

    private zzqd() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzqd) {
            return Objects.equal(this.f45587zza, ((zzqd) obj2).f45587zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45587zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f45587zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zztf zza() {
        return this.f45587zza;
    }

    @SafeParcelable.Constructor
    public zzqd(@SafeParcelable.Param(id = 1) zztf zztfVar) {
        this.f45587zza = zztfVar;
    }
}
