package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "OnRangingSuspendedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzqh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqh> CREATOR = new zzqi();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDevice", id = 1)
    private zztf f45590zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getReason", id = 2)
    private int f45591zzb;

    private zzqh() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzqh) {
            zzqh zzqhVar = (zzqh) obj2;
            if (Objects.equal(this.f45590zza, zzqhVar.f45590zza) && Objects.equal(Integer.valueOf(this.f45591zzb), Integer.valueOf(zzqhVar.f45591zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45590zza, Integer.valueOf(this.f45591zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f45590zza, i, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f45591zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f45591zzb;
    }

    public final zztf zzb() {
        return this.f45590zza;
    }

    @SafeParcelable.Constructor
    public zzqh(@SafeParcelable.Param(id = 1) zztf zztfVar, @SafeParcelable.Param(id = 2) int i) {
        this.f45590zza = zztfVar;
        this.f45591zzb = i;
    }
}
