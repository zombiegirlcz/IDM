package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "NetworkLocationStatusCreator")
@Deprecated
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new zzam();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 1)
    public final int f46549zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 2)
    public final int f46550zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 3)
    public final long f46551zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 4)
    public final long f46552zzd;

    @SafeParcelable.Constructor
    public zzal(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) long j3) {
        this.f46549zza = i;
        this.f46550zzb = i2;
        this.f46551zzc = j2;
        this.f46552zzd = j3;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzal) {
            zzal zzalVar = (zzal) obj2;
            if (this.f46549zza == zzalVar.f46549zza && this.f46550zzb == zzalVar.f46550zzb && this.f46551zzc == zzalVar.f46551zzc && this.f46552zzd == zzalVar.f46552zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f46550zzb), Integer.valueOf(this.f46549zza), Long.valueOf(this.f46552zzd), Long.valueOf(this.f46551zzc));
    }

    public final String toString() {
        int i = this.f46549zza;
        int length = String.valueOf(i).length();
        int i2 = this.f46550zzb;
        int length2 = String.valueOf(i2).length();
        long j2 = this.f46552zzd;
        int length3 = String.valueOf(j2).length();
        long j3 = this.f46551zzc;
        StringBuilder sb6 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j3).length());
        sb6.append("NetworkLocationStatus: Wifi status: ");
        sb6.append(i);
        sb6.append(" Cell status: ");
        sb6.append(i2);
        sb6.append(" elapsed time NS: ");
        sb6.append(j2);
        sb6.append(" system time ms: ");
        sb6.append(j3);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f46549zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.f46550zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.f46551zzc);
        SafeParcelWriter.writeLong(parcel, 4, this.f46552zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
