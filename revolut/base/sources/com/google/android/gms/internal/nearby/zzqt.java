package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "RangingMeasurementParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzqt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqt> CREATOR = new zzqu();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConfidence", id = 1)
    private int f45612zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getValue", id = 2)
    private float f45613zzb;

    private zzqt() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzqt) {
            zzqt zzqtVar = (zzqt) obj2;
            if (Objects.equal(Integer.valueOf(this.f45612zza), Integer.valueOf(zzqtVar.f45612zza)) && Objects.equal(Float.valueOf(this.f45613zzb), Float.valueOf(zzqtVar.f45613zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f45612zza), Float.valueOf(this.f45613zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45612zza);
        SafeParcelWriter.writeFloat(parcel, 2, this.f45613zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final float zza() {
        return this.f45613zzb;
    }

    public final int zzb() {
        return this.f45612zza;
    }

    @SafeParcelable.Constructor
    public zzqt(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) float f) {
        this.f45612zza = i;
        this.f45613zzb = f;
    }
}
