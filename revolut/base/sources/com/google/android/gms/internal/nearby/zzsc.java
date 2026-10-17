package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "UwbComplexChannelParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzsc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsc> CREATOR = new zzsd();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getChannel", id = 1)
    private int f45655zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPreambleIndex", id = 2)
    private int f45656zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private int f45657zzc;

    private zzsc() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzsc) {
            zzsc zzscVar = (zzsc) obj2;
            if (Objects.equal(Integer.valueOf(this.f45655zza), Integer.valueOf(zzscVar.f45655zza)) && Objects.equal(Integer.valueOf(this.f45656zzb), Integer.valueOf(zzscVar.f45656zzb)) && Objects.equal(Integer.valueOf(this.f45657zzc), Integer.valueOf(zzscVar.f45657zzc))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f45655zza), Integer.valueOf(this.f45656zzb), Integer.valueOf(this.f45657zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45655zza);
        SafeParcelWriter.writeInt(parcel, 2, this.f45656zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.f45657zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f45655zza;
    }

    public final int zzb() {
        return this.f45656zzb;
    }

    @SafeParcelable.Constructor
    public zzsc(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3) {
        this.f45655zza = i;
        this.f45656zzb = i2;
        this.f45657zzc = i3;
    }

    public /* synthetic */ zzsc(zzsb zzsbVar) {
    }
}
