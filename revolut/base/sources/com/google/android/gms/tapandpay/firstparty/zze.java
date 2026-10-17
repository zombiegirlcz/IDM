package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "CardRewardsInfoCreator")
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final long f48557zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final String f48558zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final String f48559zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final String f48560zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    final String f48561zze;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(id = 1) long j2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4) {
        this.f48557zza = j2;
        this.f48558zzb = str;
        this.f48559zzc = str2;
        this.f48560zzd = str3;
        this.f48561zze = str4;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zze) {
            zze zzeVar = (zze) obj2;
            if (Objects.equal(Long.valueOf(this.f48557zza), Long.valueOf(zzeVar.f48557zza)) && Objects.equal(this.f48558zzb, zzeVar.f48558zzb) && Objects.equal(this.f48559zzc, zzeVar.f48559zzc) && Objects.equal(this.f48560zzd, zzeVar.f48560zzd) && Objects.equal(this.f48561zze, zzeVar.f48561zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f48557zza), this.f48558zzb, this.f48559zzc, this.f48560zzd, this.f48561zze);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("expirationTimestamp", Long.valueOf(this.f48557zza)).add("websiteUrl", this.f48558zzb).add("websiteRedirectText", this.f48559zzc).add("legalDisclaimer", this.f48560zzd).add("summary", this.f48561zze).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f48557zza);
        SafeParcelWriter.writeString(parcel, 2, this.f48558zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48559zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48560zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48561zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
