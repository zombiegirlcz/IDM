package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "OnRangingResultParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzqf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqf> CREATOR = new zzqg();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDevice", id = 1)
    private zztf f45588zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPosition", id = 2)
    private zzqz f45589zzb;

    private zzqf() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzqf) {
            zzqf zzqfVar = (zzqf) obj2;
            if (Objects.equal(this.f45588zza, zzqfVar.f45588zza) && Objects.equal(this.f45589zzb, zzqfVar.f45589zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45588zza, this.f45589zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f45588zza, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f45589zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzqz zza() {
        return this.f45589zzb;
    }

    public final zztf zzb() {
        return this.f45588zza;
    }

    @SafeParcelable.Constructor
    public zzqf(@SafeParcelable.Param(id = 1) zztf zztfVar, @SafeParcelable.Param(id = 2) zzqz zzqzVar) {
        this.f45588zza = zztfVar;
        this.f45589zzb = zzqzVar;
    }
}
