package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "TicketOptionCreator")
public final class zzcv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcv> CREATOR = new zzcw();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBannerLogoImage", id = 1)
    private zza f48371zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSummaryText", id = 2)
    private String f48372zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPaymentOptionsPrimaryText", id = 3)
    private String f48373zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCtaLogoImage", id = 4)
    private zza f48374zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCtaPendingIntent", id = 5)
    private PendingIntent f48375zze;

    private zzcv() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzcv) {
            zzcv zzcvVar = (zzcv) obj2;
            if (Objects.equal(this.f48371zza, zzcvVar.f48371zza) && Objects.equal(this.f48372zzb, zzcvVar.f48372zzb) && Objects.equal(this.f48373zzc, zzcvVar.f48373zzc) && Objects.equal(this.f48374zzd, zzcvVar.f48374zzd) && Objects.equal(this.f48375zze, zzcvVar.f48375zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48371zza, this.f48372zzb, this.f48373zzc, this.f48374zzd, this.f48375zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f48371zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.f48372zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48373zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48374zzd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f48375zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzcv(@SafeParcelable.Param(id = 1) zza zzaVar, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zza zzaVar2, @SafeParcelable.Param(id = 5) PendingIntent pendingIntent) {
        this.f48371zza = zzaVar;
        this.f48372zzb = str;
        this.f48373zzc = str2;
        this.f48374zzd = zzaVar2;
        this.f48375zze = pendingIntent;
    }
}
