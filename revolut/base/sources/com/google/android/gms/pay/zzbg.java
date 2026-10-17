package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "PassInstanceCreator")
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new zzbh();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPassType", id = 1)
    private zzbi f48315zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPassId", id = 2)
    private String f48316zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIssuerName", id = 3)
    private String f48317zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPassName", id = 4)
    private String f48318zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardImage", id = 5)
    private Bitmap f48319zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getContentDescription", id = 6)
    private String f48320zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPendingIntent", id = 7)
    private PendingIntent f48321zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFallbackUrl", id = 8)
    private String f48322zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPassLogoImage", id = 9)
    private Bitmap f48323zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "14343392", getter = "getPassCardColor", id = 10)
    private final int f48324zzj;

    private zzbg() {
        this.f48324zzj = 14343392;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzbg) {
            zzbg zzbgVar = (zzbg) obj2;
            if (Objects.equal(this.f48315zza, zzbgVar.f48315zza) && Objects.equal(this.f48316zzb, zzbgVar.f48316zzb) && Objects.equal(this.f48317zzc, zzbgVar.f48317zzc) && Objects.equal(this.f48318zzd, zzbgVar.f48318zzd) && Objects.equal(this.f48319zze, zzbgVar.f48319zze) && Objects.equal(this.f48320zzf, zzbgVar.f48320zzf) && Objects.equal(this.f48321zzg, zzbgVar.f48321zzg) && Objects.equal(this.f48322zzh, zzbgVar.f48322zzh) && Objects.equal(this.f48323zzi, zzbgVar.f48323zzi) && Objects.equal(Integer.valueOf(this.f48324zzj), Integer.valueOf(zzbgVar.f48324zzj))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48315zza, this.f48316zzb, this.f48317zzc, this.f48318zzd, this.f48319zze, this.f48320zzf, this.f48321zzg, this.f48322zzh, this.f48323zzi, Integer.valueOf(this.f48324zzj));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f48315zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.f48316zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48317zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48318zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f48319zze, i, false);
        SafeParcelWriter.writeString(parcel, 6, this.f48320zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f48321zzg, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.f48322zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f48323zzi, i, false);
        SafeParcelWriter.writeInt(parcel, 10, this.f48324zzj);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbg(@SafeParcelable.Param(id = 1) zzbi zzbiVar, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) Bitmap bitmap, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) PendingIntent pendingIntent, @SafeParcelable.Param(id = 8) String str5, @SafeParcelable.Param(id = 9) Bitmap bitmap2, @SafeParcelable.Param(id = 10) int i) {
        this.f48315zza = zzbiVar;
        this.f48316zzb = str;
        this.f48317zzc = str2;
        this.f48318zzd = str3;
        this.f48319zze = bitmap;
        this.f48320zzf = str4;
        this.f48321zzg = pendingIntent;
        this.f48322zzh = str5;
        this.f48323zzi = bitmap2;
        this.f48324zzj = i;
    }
}
