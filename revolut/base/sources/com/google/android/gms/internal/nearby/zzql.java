package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "RangeDataNtfConfigParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzql extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzql> CREATOR = new zzqm();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRangeDataNtfConfigType", id = 1)
    private int f45593zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getNtfProximityNearInCm", id = 2)
    private int f45594zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getNtfProximityFarInCm", id = 3)
    private int f45595zzc;

    private zzql() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzql) {
            zzql zzqlVar = (zzql) obj2;
            if (Objects.equal(Integer.valueOf(this.f45593zza), Integer.valueOf(zzqlVar.f45593zza)) && Objects.equal(Integer.valueOf(this.f45594zzb), Integer.valueOf(zzqlVar.f45594zzb)) && Objects.equal(Integer.valueOf(this.f45595zzc), Integer.valueOf(zzqlVar.f45595zzc))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f45593zza), Integer.valueOf(this.f45594zzb), Integer.valueOf(this.f45595zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45593zza);
        SafeParcelWriter.writeInt(parcel, 2, this.f45594zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.f45595zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzql(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3) {
        this.f45593zza = i;
        this.f45594zzb = i2;
        this.f45595zzc = i3;
    }

    public /* synthetic */ zzql(zzqk zzqkVar) {
    }
}
