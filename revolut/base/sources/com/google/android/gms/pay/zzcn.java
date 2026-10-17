package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "SortItemCreator")
public final class zzcn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcn> CREATOR = new zzco();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSortItemId", id = 1)
    private String f48363zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getOrdering", id = 2)
    private long f48364zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAlternativeSortItemId", id = 3)
    private String f48365zzc;

    private zzcn() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzcn) {
            zzcn zzcnVar = (zzcn) obj2;
            if (Objects.equal(this.f48363zza, zzcnVar.f48363zza) && Objects.equal(Long.valueOf(this.f48364zzb), Long.valueOf(zzcnVar.f48364zzb)) && Objects.equal(this.f48365zzc, zzcnVar.f48365zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48363zza, Long.valueOf(this.f48364zzb), this.f48365zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48363zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.f48364zzb);
        SafeParcelWriter.writeString(parcel, 3, this.f48365zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzcn(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) String str2) {
        this.f48363zza = str;
        this.f48364zzb = j2;
        this.f48365zzc = str2;
    }
}
